package game;

public class GAme {

    public static void main(String[] args) {
        //Buat Objek

        playerr hero = new playerr();
        playerr enemy = new playerr();

        hero.name = " Reno ";
        hero.speed = 60;
        hero.healthPoin = 0;
        hero.Damage = 100;
        hero.armor = 10;
        hero.attack = 200;
        hero.defend = 100;

        enemy.name = " Fawwaz ";
        enemy.speed = 20;
        enemy.armor = 10;
        enemy.Damage = 10;
        enemy.healthPoin = 90;

        //menjalankan program
        hero.run();
        hero.attack(enemy.name);

        if (hero.isDead()) {
            System.out.println("Game over");
        }
    }
}
