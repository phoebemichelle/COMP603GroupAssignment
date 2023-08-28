/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoeb
 */
public class PetFactory {
    public static Animal createPet(int choice, String name) {
        switch(choice) {
            case 1:
                System.out.println(
                "-----------------------------------------------------------------------------------------------" +
                        "\nWelcome to parenthood! You are now the proud new owner of "  + name + "!" +
                        "                                  \n" +
                        "                            |' \\ \n" +
                        "         _                  ; : ; \n" +
                        "        / `-.              /: : | \n" +
                        "       |  ,-.`-.          ,': : | \n" +
                        "       \\  :  `. `.       ,'-. : | \n" +
                        "        \\ ;    ;  `-.__,'    `-.| \n" +
                        "         \\ ;   ;  :::  ,::'`:.  `. \n" +
                        "          \\ `-. :  `    :.    `.  \\ \n" +
                        "           \\   \\    ,   ;   ,:    (\\ \n" +
                        "            \\   :., :.    ,'o)): ` `-. \n" +
                        "           ,/,' ;' ,::\"'`.`---'   `.  `-._ \n" +
                        "         ,/  :  ; '\"      `;'          ,--`. \n" +
                        "        ;/   :; ;             ,:'     (   ,:) \n" +
                        "          ,.,:.    ; ,:.,  ,-._ `.     \\\"\"'/ \n" +
                        "          '::'     `:'`  ,'(  \\`._____.-'\"' \n" +
                        "             ;,   ;  `.  `. `._`-.  \\\\ \n" +
                        "             ;:.  ;:       `-._`-.\\  \\`. \n" +
                        "              '`:. :        |' `. `\\  ) \\ \n" +
                        "                ` ;:       |    `--\\__,' \n" +
                        "                   '`      ,' \n" +
                        "                        ,-' " +
                        "\n Remember, " + name + " has needs! Being a pet owner is a lot of work." +
                        "\n " + name + " needs food, sleep, playtime, and lot's of attention." +
                        "\n Good luck!" +
                        "\n-----------------------------------------------------------------------------------------------");
                return new Dog(name);
                case 2:
                System.out.println(
                "-----------------------------------------------------------------------------------------------" +
                        "\nWelcome to parenthood! You are now the proud new owner of "  + name + "!" +
                        " \n _ \n" +
                        " \\`*-. \n" +
                        "  )  _`-. \n" +
                        " .  : `. . \n" +
                        " : _   '  \\ \n" +
                        " ; o` _.   `*-._ \n" +
                        " `-.-'          `-. \n" +
                        "   ;       `       `. \n" +
                        "   :.       .        \\ \n" +
                        "   . \\  .   :   .-'   . \n" +
                        "   '  `+.;  ;  '      : \n" +
                        "   :  '  |    ;       ;-. \n" +
                        "   ; '   : :`-:     _.`* ;\n" +
                        "  /  .*' ; .*`- +'  `*' \n" +
                        " *-*   `*-*  `*-*'"+
                        "\n Remember, " + name + " has needs! Being a pet owner is a lot of work." +
                        "\n " + name + " needs food, sleep, playtime, and lot's of attention." +
                        "\n Good luck!" +
                        "\n-----------------------------------------------------------------------------------------------");
                return new Cat(name);
            case 3:
                System.out.println("-----------------------------------------------------------------------------------------------" +
                        "\nWelcome to parenthood! You are now the proud new owner of "  + name + "!" +
                "\n       __             /^\\ \n"+
                "     .'  \\           / :.\\ \n"+
                "    /     \\         |  :: \\ \n"+
                "   /   /.  \\       /  :::'| \n"+
                "  |    |::. \\     /  :::'/ \n"+
                "  |   / \\::. |   /  :::'/ \n"+
                "   --`   \'   ~~~  ':'/` \n"+
                "          /          ( \n"+
                "         /   0 _ 0    \\ \n"+
                "       \\/     \\_/      \\/ \n"+
                "     -== '.'   |    '.' ==-  \n"+
                "       /\\   ' -^- '    /\\ \n"+
                "        \\   _   _    / \n"+
                "        ,-`-((\\o/))-`-, \n"+
                "   _   /      //^\\     \\ \n"+
                " .\"o\".(     , .:::.  ,  ).\"o\".\n"+
                " |o  o\\\\     \\:::::/   //o  o| \n"+
                "  \\    \\\\    |:::::|   //    / \n"+
                "   \\    \\___/:::::\\___//    /  \n"+
                "    \\ .:.\\   `':::'`  /.:. /  \n"+
                "     \\':: |__       __| ::'/  \n"+
                "      `---`  `\"\"\"\"\"`  `---`  \n"+
                "\n Remember, " + name + " has needs! Being a pet owner is a lot of work." +
                "\n " + name + " needs food, sleep, playtime, and lot's of attention." +
                "\n Good luck!" +
                "\n-----------------------------------------------------------------------------------------------");
                return new Rabbit(name);
            default:
                throw new IllegalArgumentException("Invalid pet type choice"); 
        }
    }
}
