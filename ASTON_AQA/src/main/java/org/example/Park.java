package org.example;

public class Park {
    public static void main(String[] args) {
        Att[] newAtt = new Att [1];
        newAtt[0] = new Att ("Go", "c 10 до 20", 20);
        for (Att Att : newAtt)
            System.out.println(Att);

    }
}
class Att {
    private String name;
    private String time;
    private int price;


    public Att (String name, String time, int price) {
        this.name = name;
        this.time = time;
        this.price = price;
    }

    public String toString(){
        return(name+ "\n"
                +time+ "\n"
                +price+ "\n"
        );
    }
}