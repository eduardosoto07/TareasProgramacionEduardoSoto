package hn.calcular.calcular_junit_app;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App
{
    public static void main( String[] args )
    {
    	 MetodoCal calculator = new MetodoCal();

         boolean continuar = true;

         while (continuar) {
             String opcionMenuStr = JOptionPane.showInputDialog(null,
                     "Elige la opción a realizar:\n" +
                            "1. Calcular el área de un círculo\n" +
                           "2. Calcular el área de un cuadrado\n" +
                            "3. Calcular el área de un rectángulo\n" +
                            "4. Calcular el área de un triángulo\n" +
                            "5. Salir",
                  "Menú de Opciones", JOptionPane.QUESTION_MESSAGE);

             int opcionMenu;
             
             try {
                 opcionMenu = Integer.parseInt(opcionMenuStr);
             } catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(null, "Por favor, ingrese un número para poder seguir", "Error", JOptionPane.ERROR_MESSAGE);
                 continue;
             }
             
             
             

             switch (opcionMenu) {
                 case 1:
                     String radioStr = JOptionPane.showInputDialog(null, "Ingrese el radio del círculo:", "Área del Círculo", JOptionPane.QUESTION_MESSAGE);
                     try {
                         double radio = Double.parseDouble(radioStr);
                         double areaCirculo = calculator.calcularAreaCirculo(radio);
                         JOptionPane.showMessageDialog(null, "Área del círculo: " + areaCirculo);
                     } catch (NumberFormatException e) {
                         JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                     break;
                     
                 case 2:
                     String ladoStr = JOptionPane.showInputDialog(null, "Ingrese el lado del cuadrado:", "Área del Cuadrado", JOptionPane.QUESTION_MESSAGE);
                     try {
                         double lado = Double.parseDouble(ladoStr);
                         double areaCuadrado = calculator.calcularAreaCuadrado(lado);
                         JOptionPane.showMessageDialog(null, "Área del cuadrado: " + areaCuadrado);
                     } catch (NumberFormatException e) {
                         JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                     break;
                     
                     
                 case 3:
                     String baseRectStr = JOptionPane.showInputDialog(null, "Ingrese la base del rectángulo:", "Área del Rectángulo", JOptionPane.QUESTION_MESSAGE);
                     String alturaRectStr = JOptionPane.showInputDialog(null, "Ingrese la altura del rectángulo:", "Área del Rectángulo", JOptionPane.QUESTION_MESSAGE);
                     try {
                         double baseRect = Double.parseDouble(baseRectStr);
                         double alturaRect = Double.parseDouble(alturaRectStr);
                         double areaRectangulo = calculator.calcularAreaRectangulo(baseRect, alturaRect);
                         JOptionPane.showMessageDialog(null, "Área del rectángulo: " + areaRectangulo);
                     } catch (NumberFormatException e) {
                         JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                     break;
                     
                 case 4:
                     String baseTriStr = JOptionPane.showInputDialog(null, "Ingrese la base del triángulo:", "Área del Triángulo", JOptionPane.QUESTION_MESSAGE);
                     String alturaTriStr = JOptionPane.showInputDialog(null, "Ingrese la altura del triángulo:", "Área del Triángulo", JOptionPane.QUESTION_MESSAGE);
                     try {
                         double baseTri = Double.parseDouble(baseTriStr);
                         double alturaTri = Double.parseDouble(alturaTriStr);
                         double areaTriangulo = calculator.calcularAreaTriangulo(baseTri, alturaTri);
                         JOptionPane.showMessageDialog(null, "Área del triángulo: " + areaTriangulo);
                     } catch (NumberFormatException e) {
                         JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
                     }
                     break;
                     
                     
                 case 5:
                     continuar = false;
                     break;
                     
                 default:
                     JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elija una opción del 1 al 5.", "Error", JOptionPane.ERROR_MESSAGE);
             }
         }
     }
 }
