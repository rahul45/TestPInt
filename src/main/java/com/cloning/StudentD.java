package com.cloning;

class StudentD implements Cloneable
{
    int id;

    String name;

   CourseD course;

    public StudentD(int id, String name, CourseD course)
    {
        this.id = id;

        this.name = name;

        this.course = course;
    }

    //Overriding clone() method to create a deep copy of an object.

    protected Object clone() throws CloneNotSupportedException
    {
        StudentD student = (com.cloning.StudentD) super.clone();

        student.course = (com.cloning.CourseD) course.clone();

        return student;
    }
}