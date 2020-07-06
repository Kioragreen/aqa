package Fourth;

public class B extends A {
    public B (String name, int age, int id){
        super(name, age, id);
    }

    @Override
    public int getAge(){
        return 19;
    }

    @Override
    public String getName(){
        return "Your name: " + super.getName();
    }
}
