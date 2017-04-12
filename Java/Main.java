import java.util.ArrayList;
import java.util.List;


public class Main {

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Family>list= new ArrayList<Family>();
		Family family = new Family();
		family.setId(1);
		family.setParentId(0);
		family.setDesignation("Sport 1");
		list.add(family);
		family = new Family();
		family.setId(2);
		family.setParentId(1);
		family.setDesignation("Sport 2");
		list.add(family);
		family = new Family();
		family.setId(3);
		family.setParentId(1);
		family.setDesignation("Sport 3");
		list.add(family);
		family = new Family();
		family.setId(4);
		family.setParentId(1);
		family.setDesignation("Sport 4");
		list.add(family);
		
		 List<Family> result = getNestedChildren(list,0);
		 System.out.println("---");
		 System.out.println(result);;
		 System.out.println("---");
		
	
	}
	 private static  List<Family> getNestedChildren(List<com.chiheb.main.Family> arr,
			int parent_id) {
		 List<Family> out = new ArrayList<Family>();	
		// TODO Auto-generated method stub
	 for (int i = 0; i < arr.size(); i++) {
			 // Retrives the Parents
		   
		  if(arr.get(i).getParentId() == parent_id ){
			  // Get Childrens
			    	  List<Family> children = getNestedChildren(arr, arr.get(i).getId());
						
					  if(children != null && children.size() > 0){
		    	         
		    	        	  arr.get(i).setChildren(children);
		    	       }  
					  out.add(arr.get(i));
			    
			 }
		 }
	return out;
	}
	


}