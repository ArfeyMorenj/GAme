package game;

public class playerr {

    String name;
    int speed, healthPoin, Damage, armor, attack, defend;

    void run() {
        int speed = 0;
        System.out.println(name + " is running..");
        System.out.println("Speed: " + speed);
    }

    void attack(String a) {
        System.out.println(name + " attacking...."+ a);
        System.out.println(Damage + " Damage"+ a);
    }

    void deffend() {
        System.out.println(name + "defending....");
        System.out.println("defend" + armor);
    }

    boolean isDead() {
        if (healthPoin <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
