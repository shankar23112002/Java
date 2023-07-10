package john;

class nuts{
    private  int sno;
    private String name;

    public nuts(int sno,String name){
        this.sno = sno;
        this.name = name;

    }
    public String toString(){
        //return sno+" "+name;
        //Here 3 types of methods are there . use one at a time
//        StringBuilder sb = new StringBuilder();
//        sb.append(sno).append(" ").append(name);
//
//        return sb.toString();
        return String.format("%-2d: %s",sno,name);
    }
}

public class tut25 {
    public static void main(String[] args) {

        nuts nut = new nuts(1,"cashew");
        nut.toString();
        System.out.println(nut);
    }
}
