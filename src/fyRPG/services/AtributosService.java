package fyRPG.services;

public class AtributosService {
    public int rolarAtributos() {
        int[] d6Rolados;
        d6Rolados = new int[3];
        d6Rolados[0] = (int) Math.floor(Math.random() * 10);
        d6Rolados[1] = (int) Math.floor(Math.random() * 10);
        d6Rolados[2] = (int) Math.floor(Math.random() * 10);

        int atributoFinal = 0;
        for(int i = 0; i < d6Rolados.length; i++) {
            int d6Rolado = d6Rolados[i];
            atributoFinal += d6Rolado;
        }
        return atributoFinal;
    }
}
