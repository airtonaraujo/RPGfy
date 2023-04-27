
import fyRPG.services.MenuService;


public class Main {
    public static void main(String[] args) {

        MenuService menuService = new MenuService();

        menuService.definirNome();
        menuService.definirBackground();
        menuService.definirRace();
        menuService.definirAtributos();


        System.out.println("Essa é a sua ficha de personagem: ");
        menuService.personagem.showCharacterSheet();

        System.out.println("Vamos começar uma pequena jornada agora...");

        System.out.println("Aguarde o lançamento do restante... XD");
    }
}