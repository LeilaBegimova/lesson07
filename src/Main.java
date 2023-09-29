// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
         Medic medic = new Medic();
         Warrier warrier = new Warrier();
         Hero [] names = { magic, medic, warrier};
        for (int i = 0; i < names.length; i++) {
            names[i].applySuperAbility("CRITICAL DOMAGE");

        }

        }
    }
