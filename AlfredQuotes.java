import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        String cadenaDeSaludo = String.format("Hola %s, encantado de verte.", name);
        return cadenaDeSaludo;
    }
    
    public String guestGreeting(String name, String periodoDelDia){
        String cadenaDeSaludo = "";
        String saludo = "";
        if(periodoDelDia=="mañana"){
            saludo = "Buenos días";
        }
        else if(periodoDelDia=="tarde"){
            saludo = "Buenas tardes";
        }
        else if(periodoDelDia=="noche"){
            saludo = "Buenas Noches";
        }
        else{
            saludo = "Hola";
        }
        cadenaDeSaludo = String.format("%s %s, encantado de verte.",saludo, name);

        return cadenaDeSaludo;
    }

    public String guestGreeting(){
        Date fechaHoy = new Date();
        DateFormat formato = new SimpleDateFormat("h:mm a");
        String horaEnString = formato.format(fechaHoy);
        if(horaEnString.indexOf("AM")!=-1){
            return "Buenos días, encantado de verte. ¿Cómo estás?";
        }
        else{
            return "Buenas Tardes, encantado de verte. ¿Cómo estás?";
        }
    }

    public String dateAnnouncement() {
        Date fechaHoy = new Date();
        String fechaEnString = fechaHoy.toString();
        String cadenaDeRetorno = String.format("Actualmente es %s", fechaEnString);
        return cadenaDeRetorno;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String cadenaSarcastica = "";
        if(conversation.indexOf("Alexis")!=-1){
            cadenaSarcastica = "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso.";
        }
        if(conversation.indexOf("Alfred")!=-1){
            cadenaSarcastica = "A su servicio. Como desee, naturalmente.";
        }
        if(conversation.indexOf("Alexis")==-1 && conversation.indexOf("Alfred")==-1){
            cadenaSarcastica = "Bien. Y con eso, me retirare.";
        }
        return cadenaSarcastica;
    }
    
	public String responderConMolestia(String conversation){
        String cadenaDeMolestia = "";

        Date fechaHoy = new Date();
        DateFormat formato = new SimpleDateFormat("h:mm a");
        String horaEnString = formato.format(fechaHoy);

        if(conversation.toLowerCase().indexOf("alfred")!= -1 && conversation.toLowerCase().indexOf("cambiado")!=-1){
            cadenaDeMolestia = String.format("Quizá debería marcharme y dejarlos solos, provecho. Por último son las: %s, y esta es la hora en la que me ven por ultima vez, ADIOS!",horaEnString);
        }
        return cadenaDeMolestia;
    }
}
