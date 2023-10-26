public class Vingadores2 {
    

    String nome, poder, uniforme;
    int idade;
    double peso, altura;

     //Construtor Padrão
    public Vingadores2(String nome,String poder,int idade,double altura, double peso, String uniforme){
    this.nome = nome;
    this.poder = poder;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
    this.uniforme = uniforme;
    }

    public Vingadores2(String nome,String poder){
        this.nome = nome;
        this.poder= poder;

    }

    void dormir(){
        System.out.println("zzzzzzzzz");
    }
    
}







