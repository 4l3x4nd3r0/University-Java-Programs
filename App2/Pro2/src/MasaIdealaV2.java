import javax.swing.JOptionPane;

public class MasaIdealaV2 {
    public static void main(String[] args) {
        //declaratii de variabile locale
        float masa, inaltimea;
        int varsta;

        //afisarea pe ecran a ferestrei de dialog Ce varsta ai:
        String intrare = JOptionPane.showInputDialog("Ce varsta ai: ");
        //citirea unui numar real de la tastatura
        varsta = Integer.parseInt(intrare);

        intrare = JOptionPane.showInputDialog("Ce inaltime ai (in cm): ");
        inaltimea = Float.parseFloat(intrare);

        masa = 50F + 0.75F * (inaltimea - 150F) + 0.25F * (varsta - 20F);

        String masaideala = "Barbat = " + masa + " kg\n";
        masaideala = masaideala + "Femeie = " + 0.9F * masa + " kg";

        JOptionPane.showMessageDialog(null, masaideala, "Masa ideala", JOptionPane.INFORMATION_MESSAGE);
    }
}
