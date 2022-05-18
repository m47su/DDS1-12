package modificador_de_acesso_default_5_9;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(); //criei o cachorro
        cachorro.setNome("Charles"); //configurei o cachorro
        DonoCachorro donoCachorro = new DonoCachorro(); //invoquei um comportamento do dono
        donoCachorro.ensinarCachorroSentar(cachorro); //passei esse comportamento para o cachorro
    }
}
