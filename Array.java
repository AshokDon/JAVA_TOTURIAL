class Student{
    int roll;
    String name;
    int marks;
}
public class Array {
    public static void main(String args[]){
        int arr[]={1,2,3};
        // for(int i = 0 ; i < 3 ; i++){
        //     System.out.println(arr[i]);
        // }
        int A[] = new int[4];
        int B[] = new int[10];
        A[0]=2;
        A[1]=3;
        B[0]=100;
        B[1]=200;
        //multi Dimensional
        int matrix[][] = new int[3][4];
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                matrix[i][j] = (int)(Math.random()*100);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //enhanced for loop
        for(int n[] : matrix){
            for(int m : n){
             
                System.out.print(m+" ");
            }
            System.out.println();
        }
        //we can know the length of the array
        int nums[][] = new int[3][];//no need of mentioning row this type is called jagged array
        nums[0] = new int[4];
        nums[1] = new int[5];
        nums[2] = new int[10];
        //3d array 
        int grid[][][] = new int[2][3][4];
        grid[0][0][0]=1;

        //Arrays as an object
        //let as say we have multiple students 
        Student s1 = new Student();
        s1.roll = 110;
        s1.name = "Ashok";
        s1.marks = 90;

        Student s2 = new Student();
        s2.roll = 110;
        s2.name = "Ashok";
        s2.marks = 120;

        Student s3 = new Student();
        s3.roll = 110;
        s3.name = "Ashok";
        s3.marks = 90;

        //array of students
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2; 
        students[2] = s3;
        for(int i = 0 ; i < 3; i++){
            System.out.println(students[i].name);
        }
        for(Student stud : students){
            System.out.println(stud.roll);
        }





    }
    
}
