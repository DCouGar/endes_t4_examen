/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactor;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        // imprimir título
        titulo();

        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...

        // imprimir conclusión
        conclusión();

    }
    
    public static String titulo(){
        return "Título del Reporte";
    }
    
    public static String conclusión(){
        return "Conclusión del Reporte";
    }
}
