package fourte;

class User{
    private String name;

    User(){
        this.name = "noobie@123";
    }

    User(String name){
        if(name.isEmpty() || name.isBlank()){
            this.name = "noobie@123";
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}