package Test;

public class Cow extends Animals{
    private String breed;
    public Cow(String name,String breed){
        super.name = name;
        this.breed = breed;
    }
    public void getCowInfo(){
        super.getName();
        System.out.println("Cow breed is : "+this.breed);
    }

    public static void main(String[] args) {
        Cow c1 = new Cow("Ganga","Kangeyam");
        c1.getCowInfo();
    }
}

class Animals{
    protected String name;
    public Animals(){
        this.name ="";
    }
    public Animals(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println("Animal name is : "+name);
    }
}