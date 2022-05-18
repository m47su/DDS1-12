package modificador_de_acesso_default_5_9;

public class DonoCachorro {

    void ensinarCachorroSentar(Cachorro  cachorro){  // o dono do cachorro so sabe ensinar o cachorro a sentar. mas ele precisa de um cachorro para ensinar, entao o metodo recebe "Cachorro"
        cachorro.sentar();


    }
}
