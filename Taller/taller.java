import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class taller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ejercicio 1
        System.out.println("Bienvenido a la Calculadora Básica.");
        System.out.println("Ingresa un número: ");
        int number1 = scanner.nextInt();
        System.out.println("Ingresa otro número: ");
        int number2 = scanner.nextInt();


        System.out.println("La suma es: " + (number1 + number2));
        System.out.println("La resta es: " + (number1 - number2));
        System.out.println("La multiplicación es: " + (number1 * number2));
        if (number2 == 0) {
            System.out.println("ERORR: no se puede dividir entre 0");
        }else {
            System.out.println("La división es: " + (number1 / number2));
        }

        //ejercicio 2
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al verificador de edad.");
        System.out.println("Ingrese la edad del usuario: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("tu edad es: " + edad + " años. Eres MAYOR de edad.");
        } else {
            System.out.println("Tu edad es: " + edad + " años. Eres MENOR de edad.");
        }

        // ejercicio 3
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al conversor de unidades");
        System.out.println("Ingrese la distancia en kilometros");
        float km = scanner.nextFloat();

        System.out.println(km + " Kilometros, equivalen a " + (km * 0.621371) + " Millas");

        //ejercicio 4
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la calculadora de IMC");
        System.out.println("Ingrese su peso en kilosgramos: ");
        float kg = scanner.nextFloat();
        System.out.println("Ingrese su altura en metros: ");
        float m = scanner.nextFloat();
        System.out.println("Su IMC es: " + (kg / (m * m)) + " kg/m^2");

        //ejercicio 5
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al clasificador de numeros.");
        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num == 0) {
            System.out.println("El número es cero.");
        } else {
            System.out.println("El número es negativo.");
        }
        String parOImpar = (num % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(parOImpar);

        // ejercicio 6
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la calculadora de los dias de un mes");
        System.out.println("Ingrese el año: ");
        int ano = scanner.nextInt();
        boolean biciesto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        System.out.println("Ingrese un mes del año: ");
        int mes = scanner.nextInt();

        int dias;

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if (biciesto){
                    dias = 29;
                }else {
                    dias = 28;
                }
                break;
            default:
                dias = 0;
                System.out.println("Mes inválido.");

        }

        System.out.println("El mes "+ mes + " del año " + ano + " tiene " + dias + " dias");

        // ejercicio 7
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al menu interactivo");
        System.out.println("---------CALCULADORA ENTRE DOS NÚMEROS---------");
        System.out.println("¿qué desea realizar? (escriba el número de la acción que desea.)");
        System.out.println("1. Para suma.");
        System.out.println("2. Para restar.");
        System.out.println("3. Para multiplicar.");
        System.out.println("4. Para dividir.");
        int opciones = scanner.nextInt();
        switch (opciones){
            case 1:
                System.out.println("Ingrese un número");
                int num1 = scanner.nextInt();
                System.out.println("Ingrese un número");
                int num2 = scanner.nextInt();
                System.out.println("La suma es: " + (num1+num2));
                break;
            case 2:
                System.out.println("Ingrese un número");
                int num3 = scanner.nextInt();
                System.out.println("Ingrese un número");
                int num4 = scanner.nextInt();
                System.out.println("La resta es: " + (num3-num4));
                break;
            case 3:
                System.out.println("Ingrese un número");
                int num5 = scanner.nextInt();
                System.out.println("Ingrese un número");
                int num6 = scanner.nextInt();
                System.out.println("La multiplicación es: " + (num5*num6));
                break;
            case 4:
                System.out.println("Ingrese un número");
                int num7 = scanner.nextInt();
                System.out.println("Ingrese un número");
                int num8 = scanner.nextInt();
                if (num8 == 0){
                    System.out.println("ERROR: No es posible dividir por 0");
                } else {
                System.out.println("La suma es: " + (num7/num8));
                }
                break;
        }

        // ejercicio 8
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la calculadora de promedio.");
        System.out.println("Ingrese su primera calificación: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Ingrese su segunda calificación: ");
        float nota2 = scanner.nextFloat();
        System.out.println("Ingrese su tercera calificación: ");
        float nota3 = scanner.nextFloat();

        float prom = (nota1 + nota2 + nota3)/3;

        if (prom>=6){
            System.out.println("Su nota es de: " + prom + " Aprobó la asignatura.");
        } else {
            System.out.println("Su nota es de: " + prom + "Reprobó la asignatura.");
        }


        //ejercicio 9
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la calculadora del año biciesto.");
        System.out.println("Ingrese el año para saber si es biciesto o no: ");
        int ano1 = scanner.nextInt();

        if ((ano1 % 4 == 0 && ano1 % 100 != 0) || (ano1 % 400 == 0)){
            System.out.println("El año es biciesto.");
        }else {
            System.out.println("El año NO es biciesto");
        }

        //ejercicio 10
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la calculadora de propinas");
        System.out.println("Ingrese el total de su cuenta: ");
        float cuenta = scanner.nextFloat();
        System.out.println("Ingrese el porcentaje que desea dejar de propina: ");
        float porcentaje = scanner.nextFloat();
        float propina = (cuenta*(porcentaje/100));

        System.out.println("La propina que debe dejar es de: $ " + propina);

        //ejercicio 11
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al ordenamiento de tres numeros");
        System.out.println("Ingrese tres números: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        if (numero1>numero2 && numero2>numero3) {
            System.out.println(numero3 +","+ numero2 +","+numero1);
        } else if (numero2>numero1 && numero1>numero3) {
            System.out.println(numero3 +","+ numero1 +","+numero2);
        } else if (numero3>numero1 && numero1>numero2) {
            System.out.println(numero2 +","+ numero1 +","+numero3);
        }else if (numero2>numero3 && numero3>numero1) {
            System.out.println(numero1 +","+ numero3 +","+numero2);
        }else if (numero3>numero2 && numero2>numero1) {
            System.out.println(numero1 +","+ numero2 +","+numero3);
        }else {
            System.out.println(numero2 +","+ numero3 +","+numero1);
        }

        // ejercicio 11 con operador ternario
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al ordenamiento de numeros con operador ternario.");
        System.out.println("Ingrese tres numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int resultado = Integer.parseInt((num1>num2 && num2>num3) ? Integer.toString(num3) + Integer.toString(num2) + Integer.toString(num1) :
                (num2>num1 && num1>num3) ? Integer.toString(num3) + Integer.toString(num1) + Integer.toString(num2) :
                        (num3>num1 && num1>num2) ? Integer.toString(num2) + Integer.toString(num1) + Integer.toString(num3) :
                                (num2>num3 && num3>num1) ? Integer.toString(num1) + Integer.toString(num3) + Integer.toString(num2) :
                                        (num3>num2 && num2>num1) ? Integer.toString(num1) + Integer.toString(num2) + Integer.toString(num3) : Integer.toString(num2) + Integer.toString(num3) + Integer.toString(num1));

        System.out.println(resultado);

        //ejercicio 12
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al generador de horoscopo");
        System.out.println("Ingrese su día de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el número de su mes de nacimiento (1-12): ");
        int mess = scanner.nextInt();

        switch (mess){
            case 1:
                if (dia>=1 && dia<20){
                    System.out.println("Su signo zodical es: capricornio");
                }else if (dia>=20 && dia<=31){
                    System.out.println("Su signo zodical es: Acuario");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 2:
                if (dia>=1 && dia<19){
                    System.out.println("Su signo zodical es: Acuario");
                }else if (dia>=19 && dia<=29){
                    System.out.println("Su signo zodical es: Piscis");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 3:
                if (dia>=1 && dia<21){
                    System.out.println("Su signo zodical es: Piscis");
                }else if (dia>=21 && dia<=31){
                    System.out.println("Su signo zodical es: Aries");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 4:
                if (dia>=1 && dia<20){
                    System.out.println("Su signo zodical es: Aries");
                }else if (dia>=20 && dia<=30){
                    System.out.println("Su signo zodical es: Tauro");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 5:
                if (dia>=1 && dia<21){
                    System.out.println("Su signo zodical es: Tauro");
                }else if (dia>=21 && dia<=31){
                    System.out.println("Su signo zodical es: Geminis");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 6:
                if (dia>=1 && dia<21){
                    System.out.println("Su signo zodical es: Geminis");
                }else if (dia>=21 && dia<=30){
                    System.out.println("Su signo zodical es: Cancer");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 7:
                if (dia>=1 && dia<23){
                    System.out.println("Su signo zodical es: Cancer");
                }else if (dia>=23 && dia<=31){
                    System.out.println("Su signo zodical es: Leo");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 8:
                if (dia>=1 && dia<23){
                    System.out.println("Su signo zodical es: Leo");
                }else if (dia>=23 && dia<=31){
                    System.out.println("Su signo zodical es: Virgo");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 9:
                if (dia>=1 && dia<23){
                    System.out.println("Su signo zodical es: Virgo");
                }else if (dia>=23 && dia<=30){
                    System.out.println("Su signo zodical es: Libra");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 10:
                if (dia>=1 && dia<23){
                    System.out.println("Su signo zodical es: Libra");
                }else if (dia>=23 && dia<=31){
                    System.out.println("Su signo zodical es: Escorpio");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 11:
                if (dia>=1 && dia<22){
                    System.out.println("Su signo zodical es: Escorpio");
                }else if (dia>=22 && dia<=30){
                    System.out.println("Su signo zodical es: Sagitario");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
            case 12:
                if (dia>=1 && dia<22){
                    System.out.println("Su signo zodical es: Sagitario");
                }else if (dia>=22 && dia<=31){
                    System.out.println("Su signo zodical es: Capricornio");
                }else{
                    System.out.println("ERROR: Dia incorrecto");
                }
                break;
        }

        //ejerciocio 13
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al taximetro");
        System.out.println("La tarifa base es de: $ 6000");
        System.out.println("La tarifa por KM es de $ 2000");
        System.out.println("Ingrese su recorrido en KM: ");
        int recorridoKm = scanner.nextInt();
        System.out.println("Su tarifa por el viaje es de: " + ((2000*recorridoKm)+6000));

        // ejercicio 14
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al programa  de transformacion de temperatura.");
        System.out.println("Ingrese: 1. Para cambiar de Celcius a Fahrenheit");
        System.out.println("Ingrese: 2. Para cambiar de Fahrenheit a Celcius");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingrese la temperatura en grados celcius: ");
                float celcius = scanner.nextFloat();
                System.out.println(celcius + " Grados celcius, equivalen a " + ((celcius*(9/5))+32) + " grados fahrenheit");
                break;
            case 2:
                System.out.println("Ingrese la temperatura en grados fahrenheit: ");
                float fahrenheit = scanner.nextFloat();
                System.out.println(fahrenheit + " Grados fahrenheit, equivalen a " + ((fahrenheit-32)*5/9) + " Grados celcius");
                break;
        }

        //ejercicio 15
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al sistema de calificaiones.");
        System.out.println("Ingresa tu calificacion (0-100): ");
        int calificacion = scanner.nextInt();
        char nota = switch (calificacion) {
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> 'A';
            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 -> 'B';
            case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 -> 'C';
            case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 -> 'D';
            default -> 'F';
        };

        System.out.println("Tu nota es: " + nota);
    

        //Ejercicio 16
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Bienvenido al verificador de contraseñas.");
        System.out.println("Ingrese una Contraseña, recuerde que, debe tener minimo 8 caracteres con almenos una mayuscula, una minuscula y un caracter especiial: ");
        String contra = scanner.nextLine();

        boolean longitud = false;
        boolean minuscula = false;
        boolean mayuscula = false;
        boolean caracter = false;

        if(longitud == contra.length()<7){
            longitud = true;
        }
        String caracteres = "!@#$%^&*.,";
        for (int i = 0; i<contra.length();i++){
            char j = contra.charAt(i);

            if (Character.isLowerCase(j)){
                minuscula = true;
            }else if (Character.isUpperCase(j)){
                mayuscula = true;
            } else if (caracteres.indexOf(j) != -1) {
                caracter = true;
            }

        }
        boolean cumple = (longitud && minuscula && mayuscula && caracter);

        System.out.println("¿La contraseña cumple con los requisitos?: " + cumple);

        //Ejercicio 17
        System.out.println("---------------------------------------------------------");
        System.out.println("Bienvenido al identificador de caracter");
        System.out.println("Ingrese un solo caracter(Sí ingresa más solo se tendrá en cuenta el primero.): ");
        String entrada = scanner.nextLine();
        String entrada1 = entrada.toLowerCase();
        char c = entrada1.charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("El caracter es Vocal");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("El caracter es Consonante");
        } else {
            System.out.println("es caracter especial");
        };

        //Ejercicio 18
        System.out.println("------------------------------------------------------------");
        System.out.println("Bienvenido al juego de piedra papel o tijera");
        System.out.println("Ingrese piedra papel o tijera");
        String pptU = scanner.nextLine();
        String pptU1 = pptU.toLowerCase();
        int pptUn = 0;
        int pptM = (int) (Math.random() * 3) + 1;
        if(pptU1.equals("piedra")){
            pptUn = 1;
        } else if (pptU1.equals("papel")) {
            pptUn = 2;
        } else if (pptU1.equals("tijera")) {
            pptUn = 3;
        } else {
            System.out.println("ERROR: Entrada invalida. recuerda que debes elegir entre piedra, papel o tijera.");
        }
        if (pptM == 1 && pptUn == 1){
            System.out.println("El programa eligió PIEDRA. Elegiste PIEDRA: EMPATE.");
        } else if (pptM == 1 && pptUn == 2) {
            System.out.println("El programa eligió PIEDRA. Elegiste PAPEL: GANASTE.");
        }else if (pptM == 1 && pptUn == 3) {
            System.out.println("El programa eligió PIEDRA. Elegiste TIJERA: PERDISTE.");
        } else if (pptM == 2 && pptUn == 1){
            System.out.println("El programa eligió PAPEL. Elegiste PIEDRA: PERDISTE.");
        } else if (pptM == 2 && pptUn == 2) {
            System.out.println("El programa eligió PAPEL. Elegiste PAPEL: EMPATE.");
        }else if (pptM == 2 && pptUn == 3) {
            System.out.println("El programa eligió PAPEL. Elegiste TIJERA: GANASTE.");
        }else if (pptM == 3 && pptUn == 1){
            System.out.println("El programa eligió TIJERA. Elegiste PIEDRA: GANASTE.");
        } else if (pptM == 3 && pptUn == 2) {
            System.out.println("El programa eligió TIJERA. Elegiste PAPEL: PERDISTE.");
        }else if (pptM == 3 && pptUn == 3) {
            System.out.println("El programa eligió TIJERA. Elegiste TIJERA: EMPATE.");
        }


        //Ejercicio 19
        System.out.println("------------------------------------------------------------");
        System.out.println("Bienvenido a la calculadora de edad");
        System.out.println("Ingrese su año de nacimiento: ");
        int anoNacimiento = scanner.nextInt();
        System.out.println("Ingrese el número de su mes de nacimiento (1-12): ");
        int mesNacimiento = scanner.nextInt();
        System.out.println("Ingrese el dia de su nacimiento: ");
        int diaNacimiento = scanner.nextInt();

        LocalDateTime hoy = LocalDateTime.now();
        int anoHoy = hoy.getYear();
        int mesHoy = hoy.getMonthValue();
        int diaHoy = hoy.getDayOfMonth();

        int age;
        if((mesHoy == mesNacimiento && diaHoy >= diaNacimiento) || mesHoy > mesNacimiento ){
            age = anoHoy - anoNacimiento;
        }else{
            age = anoHoy - anoNacimiento - 1;

        }
        System.out.println("Su edad es: " + age );

        //Ejercicio 20
        System.out.println("-----------------------------------------------------");
        System.out.println("Bienvenido al encriptador/desencriptador de texto.");
        System.out.println("¿Qué desea realizar?");
        System.out.println("1. Para encriptar.");
        System.out.println("2. Para desencriptar.");

        int opc = scanner.nextInt();
        scanner.nextLine();
        switch (opc){
            case 1:
                System.out.println("Ingrese el desplazamiento: ");
                int desplazamiento = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese el texto que desea encriptar:");
                String encriptar = scanner.nextLine();

                StringBuilder textoCifrado = new StringBuilder();
                String encriptar1 = encriptar.toLowerCase();

                for (int q = 0; q < encriptar1.length(); q++) {
                    char t = encriptar1.charAt(q);

                    if (t >= 'a' && t <= 'z') {
                        t = (char) ('a' + (t - 'a' + desplazamiento) % 26);
                    }
                    textoCifrado.append(t);
                }

                System.out.println("Texto original: " + encriptar);
                System.out.println("Texto cifrado: " + textoCifrado.toString());
                break;
            case 2:
                System.out.println("Ingrese el texto que desea desencriptar:");
                String desencriptar = scanner.nextLine();
                System.out.println("Ingrese el desplazamiento: ");
                int desplazamiento1 = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                StringBuilder textoDescifrado = new StringBuilder();
                String desencriptar1 = desencriptar.toLowerCase();

                for (int q = 0; q < desencriptar1.length(); q++) {
                    char t = desencriptar1.charAt(q);

                    if (t >= 'a' && t <= 'z') {
                        t = (char) ('a' + (t - 'a' - desplazamiento1 + 26) % 26); // +26 para evitar números negativos
                    }
                    textoDescifrado.append(t);
                }

                System.out.println("Texto original: " + desencriptar);
                System.out.println("Texto descifrado: " + textoDescifrado.toString());
                break;
            default:
                System.out.println("Opción no válida.");
                break;

        }

    }


    }








