package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * Affiche la conversion en Celsius d'une liste de valeurs en Fahrenheit
 * @param args liste des températures en Fahrenheit a convertir en Celsius
 *
 * @author Sami Abou Karam
 * @version Mai 2020
 */
public class FahrenheitCelsius {

    /**
      
     */
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            if(isNullOrEmpty(args[i])){
            System.out.println("Entrée vide ou nul, veuillez retaper.");}
            else {
            int fahrenheit = Integer.parseInt(args[i]);
            float celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
        }
        }
    }

    /**
     * Méthode pour convertir Fahrenhiet en Celsius.
     * @param f la valeur en degré Fahrenheit (°F)
     * @return la conversion en degré Celsius (°C)
     */
    public static float fahrenheitEnCelsius(int f) {
        float value = (f - 32) * 5F/9F; // conversion implicite en float pour éviter une division entière et perdre les décimales
        return (int)(value * 10) / 10F; // troncation de la valeur à une decimale

    }
    
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty()){
            return false;}
        else return true;
    }
    
}
