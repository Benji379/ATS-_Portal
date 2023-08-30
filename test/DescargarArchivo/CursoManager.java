package DescargarArchivo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CursoManager {

    public static JSONObject crearCursoJSON(String nombreCurso, double creditos, ArrayList<String> horario, ArrayList<String> evaluaciones) {
        JSONObject cursoJSON = new JSONObject();
        cursoJSON.put("NombreCurso", nombreCurso);
        cursoJSON.put("Creditos", creditos);

        JSONArray horarioJSON = new JSONArray(horario);
        cursoJSON.put("Horario", horarioJSON);

        JSONArray evaluacionesJSON = new JSONArray(evaluaciones);
        cursoJSON.put("Evaluaciones", evaluacionesJSON);

        return cursoJSON;
    }

    public static void guardarArchivoJSON(JSONObject cursoJSON, String rutaCompleta) {
        try (FileWriter file = new FileWriter(rutaCompleta)) {
            file.write(cursoJSON.toString());
            System.out.println("Archivo JSON guardado exitosamente.");
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }

    public static JSONObject cargarArchivoJSON(String rutaCompleta) {
        try (FileReader fileReader = new FileReader(rutaCompleta)) {
            JSONTokener tokener = new JSONTokener(fileReader);
            return new JSONObject(tokener);
        } catch (IOException e) {
            System.out.println("ERROR");
        }
        return null;
    }

    public static void main(String[] args) {
        leer();
//        guardar();
    }

    private static void guardar() {
        ArrayList<String> horario = new ArrayList<>();
        horario.add("Lunes de 10:30 a 12:00");
        horario.add("Miercoles de 19:15 a 22:15");
        horario.add("Sabado de 18:00 a 20:30");

        ArrayList<String> evaluaciones = new ArrayList<>();
        evaluaciones.add("Practica1_Semana 2");
        evaluaciones.add("Practica2_Semana 5");
        evaluaciones.add("Practica3_Semana 9");

        JSONObject cursoJSON = crearCursoJSON("Algoritmos", 5.3, horario, evaluaciones);
        String archivoJSON = "src\\com\\data\\archivo.json";
        guardarArchivoJSON(cursoJSON, archivoJSON);
    }

    private static void leer() {
        String archivoJSON = "src\\com\\data\\archivo.json";
        // Cargar y leer el archivo JSON
        JSONObject loadedJSON = cargarArchivoJSON(archivoJSON);
        if (loadedJSON != null) {
            System.out.println("Nombre del curso: " + loadedJSON.getString("NombreCurso"));
            System.out.println("Creditos: " + loadedJSON.getDouble("Creditos"));

            JSONArray horarioArray = loadedJSON.getJSONArray("Horario");
            for (int i = 0; i < horarioArray.length(); i++) {
                System.out.println("Horario: " + horarioArray.getString(i));
            }

            JSONArray evaluacionesArray = loadedJSON.getJSONArray("Evaluaciones");
            for (int i = 0; i < evaluacionesArray.length(); i++) {
                System.out.println("Evaluacion: " + evaluacionesArray.getString(i));
            }
        }
    }

}
