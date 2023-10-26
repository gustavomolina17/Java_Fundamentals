public class TestaVingadores{

   public static void main(String[] args) {

    // Criação dos nossos heróis

    Vingadores HomemdeFerro = new Vingadores();
    HomemdeFerro.nome = "Tony Stark";
    HomemdeFerro.idade = 24;
    HomemdeFerro.peso = 88.5;
    HomemdeFerro.altura = 1.92;
    HomemdeFerro.poder = "Lançar Misseis";
    HomemdeFerro.uniforme = "Mark III";


    Vingadores Hulk = new Vingadores();
    Hulk.nome = "Bruce Banner";
    Hulk.idade = 35;
    Hulk.peso = 90.8;
    Hulk.altura = 2.15;
    Hulk.poder = "Esmagar os Inimigos";
    Hulk.uniforme = "Shorts Roxo";

   System.out.println("====HOMEM DE FERRO ====");
    System.out.println("\nNome: "+HomemdeFerro.nome+
    "\n"+"Idade: "+HomemdeFerro.idade+
    "\n"+"Peso: "+HomemdeFerro.peso+
    "\n"+"Altura: "+HomemdeFerro.altura+
    "\n"+"Poder: "+HomemdeFerro.poder+
    "\n"+"Uniforme: "+HomemdeFerro.uniforme);
    System.out.println("\nMétodos: ");
    HomemdeFerro.lutar();
    HomemdeFerro.salvar();
    HomemdeFerro.voar();

    System.out.println("\n");
    System.out.println("====HULK====");
    System.out.println("\nNome: "+Hulk.nome+
    "\n"+"Idade: "+Hulk.idade+
    "\n"+"Peso: "+Hulk.peso+
    "\n"+"Altura: "+Hulk.altura+
    "\n"+"Poder: "+Hulk.poder+
    "\n"+"Uniforme: "+Hulk.uniforme);
    System.out.println("\nMétodos: ");
    Hulk.lutar();
    Hulk.salvar();
    Hulk.voar();


   }


}