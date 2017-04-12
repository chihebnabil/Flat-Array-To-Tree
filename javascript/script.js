var arr  = [
    {id: 1, title: 'hello', parent_id: 0},
    {id: 2, title: 'hello', parent_id: 0},
    {id: 3, title: 'hello', parent_id: 1},
    {id: 4, title: 'hello', parent_id: 3},
    {id: 5, title: 'hello', parent_id: 4},
    {id: 6, title: 'hello', parent_id: 4},
    {id: 7, title: 'hello', parent_id: 3},
    {id: 8, title: 'hello', parent_id: 2}
];

function getNestedChildren(arr, parent_id) {
    var out = []
    for(var i in arr) {
        if(arr[i].parent_id == parent_id) {
            var children = getNestedChildren(arr, arr[i].id)

            if(children.length) {
                arr[i].children = children
            }
            out.push(arr[i])
        }
    }
    return out
}