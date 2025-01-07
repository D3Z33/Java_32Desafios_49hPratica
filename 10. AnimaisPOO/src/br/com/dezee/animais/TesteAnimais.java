package br.com.dezee.animais;

public class TesteAnimais {
    public static void main(String[] args) {
        // Criando um objeto do tipo Cachorro
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rex";
        cachorro.idade = 3;

        // Criando um objeto do tipo Gato
        Gato gato = new Gato();
        gato.nome = "Mingau";
        gato.idade = 2;

        // Testando métodos herdados e sobrescritos
        cachorro.emitirSom();  // Rex está latindo
        gato.emitirSom();      // Mingau está miando

        // Testando métodos específicos de cada subclasse
        cachorro.abanarRabo();  // Rex abana o rabo
        gato.arranharMoveis();  // Mingau arranha móveis
    }
}
