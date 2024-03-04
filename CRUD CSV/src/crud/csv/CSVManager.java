package crud.csv;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CSVManager {
    private static final String CSV_FILE_PATH = "C:\\Users\\mkpol\\OneDrive\\Documentos\\NetBeansProjects\\1.-Curso TodoCode\\CRUD CSV\\src\\crud\\csv\\datos.csv";

    public static ArrayList<Plantiilla> leerCSV() throws CsvValidationException {
        ArrayList<Plantiilla> listaplantillas = new ArrayList<>();

        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(CSV_FILE_PATH)).build()) {
            String[] nextRecord;
            int indice=0;
            while ((nextRecord = csvReader.readNext()) != null) {
                String nombre = nextRecord[0];
                String descripcion = nextRecord[1];

                Plantiilla plantilla = new Plantiilla();
                plantilla.setIdPlantilla(indice);
                plantilla.setNombre(nombre);
                plantilla.setDescripcion(descripcion);

                listaplantillas.add(plantilla);
                indice++;
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return listaplantillas;
    }

    public static void guardarCSV(ArrayList<Plantiilla> plantilla) {
        try (CSVWriter csvWriter = (CSVWriter) new CSVWriterBuilder(new FileWriter(CSV_FILE_PATH)).build()) {
            for (Plantiilla p1 : plantilla) {
                String[] data = {String.valueOf(p1.getIdPlantilla()),p1.getNombre(),p1.getDescripcion()};
                csvWriter.writeNext(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void modificarRegistro(ArrayList<Plantiilla> plantilla, int indice, Plantiilla nuevaPlantilla) {
        if (indice >= 0 && indice < plantilla.size()) {
            plantilla.set(indice, nuevaPlantilla);
            guardarCSV(plantilla);
            System.out.println("Registro modificado exitosamente.");
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public static void eliminarRegistro(ArrayList<Plantiilla> plantilla, int indice) {
        if (indice >= 0 && indice < plantilla.size()) {
            plantilla.remove(indice);
            guardarCSV(plantilla);
            System.out.println("Registro eliminado exitosamente.");
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }
}
