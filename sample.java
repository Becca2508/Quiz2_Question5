
public class Colloboration
{
    private String name;
    private String major;
    private int age;
    private String RCSID;

    public Colloboration(String inputName, String inputMajor, String inputAge, String inputRCSID)
    {
        name = inputName;
        major = inputMajor;
        age = inputAge;
        RCSID = inputRCSID;
    }

    public void Introduction()
    {
        System.out.println("My name is " + this.name + "and I'm " + this.age + " years old. My major is " + this.major + "and my RCSID is " + this.RCSID);
    } 

    public static void main(String [] args)
    {
        System.out.println("Hello World!");

        Colloboration person1 = new Colloboration("Trivika", "CS", 19, "komatt");
        Colloboration person2 = new Colloboration("Rebecca", "CS", 19, "prasar2");
        person1.Introduction();
        person2.Introduction();

        System.out.println("We are excited to work with each other!! ");

    }
}


