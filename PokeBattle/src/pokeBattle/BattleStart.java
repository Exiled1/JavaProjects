package pokeBattle;

import java.util.*;

public class BattleStart {

    public static String attack = "Thunder Wave.";
    public static int HP = 100;
    public static int level = 10;
    public static int pokeAttack = 15;
    public static String specialMove = "Super WAVE";
    public static int movePower = 30;
    public static int defense = 10;
    public static double attackModifier = (.85 + (Math.random() * .15));
    public static int damage = (int) (((2 * level + 10) / 250.0) + ((pokeAttack / defense) * movePower + 2) * attackModifier);
    public static int damageStuff = HP - damage;

    public static void main(String[] args) {
        String name = battleStart();
        attackDamage(name, damageStuff);


    }


    public static String battleStart() {
        Scanner promptUser = new Scanner(System.in);
        System.out.println("Choose a pokemon :");
        String userPokemon = promptUser.nextLine();
        System.out.println("You chose: " + userPokemon);
        System.out.println("It's a battle between: " + userPokemon + " and Greninja."); //TODO: Change greninja to a constant.

        return userPokemon;
    }

    public static double attackDamage(String name, int damage) {

        System.out.println(name + " used " + attack);
        System.out.println("Greninja dodged!");
        System.out.println("Greninja used " + specialMove);
        System.out.println("It was super effective!!");

        System.out.println(name + " sustained " + damage + " damage");

        return damage;
    }

    public static void Table() {

    }
}
