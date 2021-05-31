package com.cloning;

    public class DeepClone
    {


        public static void main(String[] args)
        {
            CourseD science = new CourseD("Physics", "Chemistry", "Biology");

            StudentD student1 = new StudentD(111, "John", science);

            StudentD student2 = null;

            try
            {
                //Creating a clone of student1 and assigning it to student2

                student2 = (StudentD) student1.clone();
            }
            catch (CloneNotSupportedException e)
            {
                e.printStackTrace();
            }

            //Printing the subject3 of 'student1'

            System.out.println(student1.course.subject3);         //Output : Biology

            //Changing the subject3 of 'student2'

            student2.course.subject3 = "Maths";

            //This change will not be reflected in original student 'student1'

            System.out.println(student1.course.subject3);       //Output : Biology
        }

}
