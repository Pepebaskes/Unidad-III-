package retos.reto1;

public class Pregunta12 {

    public static void main(String[] args) {
        int nm=0;

        System.out.println(getNumeroMenor(10,11,9,nm));

    }
    public static int getNumeroMenor(int n1, int n2, int n3, int nMenor){

        if(n1<n2 && n1<n3){
            return nMenor=n1;
        }
        else if(n2<n3){
            return nMenor=n2;
        }
        else {
            return nMenor=n3;
        }

    }
}
