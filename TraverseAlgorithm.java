System.out.println(“Input the array elements : “);
	for (int i = 0; i < n; i++){
		a[i] = s.nextInt();
	}
	int ele = s.nextInt();
	for (int i = 0; i < n; i++){
		if(a[i] == ele){
		System.out.println(“Element Found”);
		}
Full java programpublic class TraverseElements { 
   public static void main(String[] args) { 
	int arr[]={1,2,3,4,5}; 
	int length= arr.length; 	
	System.out.println("Array Elements are:-"); 	
	for(int i=0;  i<length;  i++) { 					     
  System.out.print(arr[i]+" "); 
	} 
    } 
}
