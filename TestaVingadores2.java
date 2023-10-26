public class TestaVingadores2 {

    public static void main(String[] args) {
        Vingadores2 v1 = new Vingadores2("Thor", "Fazer a dança da chuva", 500, 1.85, 0, "Cropped");
        System.out.println("\tMétodo Construtor");
        System.out.println("Vingador:"+ v1.nome+"\nPoder:"+v1.poder+"\nUniforme:"+v1.uniforme);
        v1.dormir();
        System.out.println("\n");
        Vingadores2 v2 = new Vingadores2("Hulk", " da fama");
        System.out.println(v2.nome+"\n"+v2.poder);
    
    }
    
}
