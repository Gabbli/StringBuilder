package Confronto;

public class ConfrontaStringhe {
    private String str1;
    private String str2;

    public ConfrontaStringhe(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String ConfrontoStringhe(){

        StringBuilder risultato = new StringBuilder();

        if(str1.equals(str2)){
            System.out.println("La prima parola: "+ str1 + " è UGUALE alla seconda parola: "+ str2);
        }else{
            System.out.println("La prima parola: "+ str1 + " è DIVERSA della seconda parola: "+ str2);
        }

        return risultato.toString();
    }
}
