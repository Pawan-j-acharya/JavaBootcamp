

class College {
    String collegeName;
    String location;
    int capacity;
    String principalName;
    Student s;

    College(String collegeName,String location,int capacity,String principalName)
    {
        this.collegeName=collegeName;
        this.location=location;
        this.capacity=capacity;
        this.principalName=principalName;
    }

    public void addStudent()
    {
        if(this.s==null) {
            this.s = new Student("Pawan", 21, "male");
            System.out.println("Object created successfully\n");
        }
        else
        {
            System.out.println("Object is alreay done");
        }
    }

    public void collegeDetails()
    {
        System.out.println("College Name:"+collegeName);
        System.out.println("College location:"+location);
        System.out.println("College capacity:"+capacity);
        System.out.println("College principal name:"+principalName);
    }

    public void studentDetails()
    {
       /* System.out.println("Student Name:"+s.name);
        System.out.println("Student age:"+s.age);
        System.out.println("student gender:"+s.gender);*/
	System.out.println(s);
    }

    public void removeStudent()
    {
        if(this.s!=null) {
            this.s = null;
            System.out.println("Student was removed  successfully");
        }
        else
        {
            System.out.println("NO object is present");
        }

    }



}
