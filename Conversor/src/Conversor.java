import javax.swing.JOptionPane;

public class Conversor  {
  public static void main(String[] args) {

    String[] opciones = { "Conversor de monedas", "Conversor de temperatura" };

    String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción",
            "Conversor de unidades", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

    switch (opcionSeleccionada) {
        case "Conversor de monedas":
            ConversorMonedas();
            break;
        case "Conversor de temperatura":
            ConversorTemperatura();
            break;
    }
}

private static void ConversorMonedas() {

  double cantidad, resultado;
        // Creamos un array de Strings llamado "opciones" que contiene los nombres de
        // las monedas que se pueden convertir.
        String[] opciones = { "Dólares", "Libras", "Euros", "Esterlinas", "Yen japonés", "Won surcoreano" };

        // Utilizamos JOptionPane para mostrar una ventana de diálogo que permite al
        // usuario seleccionar una de las monedas de origen. Utilizamos el método
        // "showInputDialog" y le pasamos como parámetros el título de la ventana, el
        // mensaje que se mostrará, el tipo de mensaje, el icono y el array de opciones.
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null,
                "Seleccione a que tipo de monedas deseas convertir", "Conversor de monedas", JOptionPane.PLAIN_MESSAGE,
                null, opciones, opciones[0]);

        // Utilizamos un switch para realizar la conversión correspondiente dependiendo
        // de la opción seleccionada por el usuario. Cada caso del switch corresponde a
        // una moneda de origen distinta. Dentro de cada caso, utilizamos JOptionPane
        // para solicitar al usuario la cantidad de la moneda de origen y realizamos la
        // conversión correspondiente. Finalmente, utilizamos JOptionPane para mostrar
        // el resultado al usuario.
        switch (opcionSeleccionada) {
            case "Dólares":
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos chilenos:"));
                resultado = cantidad * 0.0012; // Conversión a dólares
                JOptionPane.showMessageDialog(null, cantidad + " pesos chilenos son " + resultado + " dólares");
                break;
            case "Libras":
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos chilenos:"));
                resultado = cantidad * 0.0009; // Conversión a libras
                JOptionPane.showMessageDialog(null, cantidad + " pesos chilenos son " + resultado + " libras");
                break;
            case "Euros":
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos chilenos:"));
                resultado = cantidad * 0.0011; // Conversión a euros
                JOptionPane.showMessageDialog(null, cantidad + " pesos chilenos son " + resultado + " euros");
                break;
            case "Esterlinas":
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos chilenos:"));
                resultado = cantidad * 0.0008; // Conversión a esterlinas
                JOptionPane.showMessageDialog(null, cantidad + " pesos chilenos son " + resultado + " esterlinas");
                break;
            case "Yen japonés":
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos chilenos:"));
                resultado = cantidad * 0.14; // Conversión a yen japonés
                JOptionPane.showMessageDialog(null, cantidad + " pesos chilenos son " + resultado + " yen japonés");
                break;
            case "Won surcoreano":
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos chilenos:"));
                resultado = cantidad * 1.5; // Conversión a won surcoreano
                JOptionPane.showMessageDialog(null, cantidad + " pesos chilenos son " + resultado + " won surcoreano");
                break;

        }
    
}

  private static void ConversorTemperatura() {

    // Se utiliza JOptionPane.showInputDialog() para mostrar un menú de opciones en
    // una ventana de diálogo. Se utiliza Integer.parseInt() para convertir la
    // opción seleccionada a un número entero.
    int opcion = Integer.parseInt(JOptionPane.showInputDialog(
        "Selecciona una opción:\n1. Convertir de Celsius a Fahrenheit\n2. Convertir de Fahrenheit a Celsius"));

    // Se utiliza la estructura switch para seleccionar la conversión deseada. Si se
    // selecciona la opción 1, se pide al usuario que ingrese la temperatura en
    // grados Celsius utilizando JOptionPane.showInputDialog(). Se realiza el
    // cálculo correspondiente para convertir de Celsius a Fahrenheit y se muestra
    // el resultado en una ventana de mensaje utilizando
    // JOptionPane.showMessageDialog().
    switch (opcion) {
      case 1:
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Celsius: "));
        double fahrenheit = (celsius * 9 / 5) + 32;
        JOptionPane.showMessageDialog(null, celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
        break;

      // Si se selecciona la opción 2, se pide al usuario que ingrese la temperatura
      // en grados Fahrenheit utilizando JOptionPane.showInputDialog(). Se realiza el
      // cálculo correspondiente para convertir de Fahrenheit a Celsius y se muestra
      // el resultado en una ventana de mensaje utilizando
      // JOptionPane.showMessageDialog().
      case 2:
        double fahrenheit2 = Double
            .parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Fahrenheit: "));
        double celsius2 = (fahrenheit2 - 32) * 5 / 9;
        JOptionPane.showMessageDialog(null, fahrenheit2 + " grados Fahrenheit son " + celsius2 + " grados Celsius.");
        break;

      // Si se selecciona una opción que no está en el rango de 1 a 2, se muestra un
      // mensaje de error utilizando JOptionPane.showMessageDialog().
      default:
        JOptionPane.showMessageDialog(null, "Opción no válida.");
        break;
    }
  }

  
}
