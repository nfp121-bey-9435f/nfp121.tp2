package question2;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author Sami Abou Karam 
 * @version Mai 2020
 */

public class FahrenheitCelsius {
    /**
     * Affiche la conversion en Celsius d'une liste de valeurs en Fahrenheit
     * @param args liste des temp�ratures en Fahrenheit a convertir en Celsius 
     * et affiche un message en cas d'erreur
     */
    public static void main(String[] args) {
        try {
            for (int i=0;i<args.length;i++){
            if(isNullOrEmpty(args[i])){
            System.out.println("Entr�e vide ou nul, veuillez retaper.");}
            else {
            int fahrenheit = Integer.parseInt(args[i]);
            float celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
            }
            }
            }
        catch(NumberFormatException nfe){
            System.out.println("Erreur Entr�e : " + nfe.getMessage());  // message affich� en cas d'erreur 
        }

    }

    /**
     * M�thode pour convertir Fahrenhiet en Celsius.
     * @param f la valeur en degr� Fahrenheit (�F)
     * @return la conversion en degr� Celsius (�C)
     */
    public static float fahrenheitEnCelsius(int f) {
        float value = (f - 32) * 5F/9F; // conversion implicite en float pour �viter une division enti�re et perdre les d�cimales
        return (int)(value * 10) / 10F; // troncation de la valeur � une decimale

    }
    
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty()){
            return false;}
        else return true;
    }
}