package Lib;

public class Penguin extends Bird implements Swimmable {
    public Penguin(String name){
        super(name);
    }
    public String makeSound(){
        return "Squawk!";
    }
     public String swim() {
        return "The penguin dives gracefully in the water.";
    }
    
}

