/**
 * Paquete que contiene las clases de persistencia del modelo.
 */
package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Clase utilitaria para el manejo de archivos, incluyendo lectura y escritura de archivos serializados y de texto plano.
 */
public class FileHandler {

    /** Scanner para lectura de archivos de texto. */
    private static Scanner sc;
    
    /** PrintWriter para escritura de archivos de texto. */
    private static PrintWriter pw;
    
    /** Archivo que se manipula en las operaciones de la clase. */
    private static File archivo;
    
    /** Nombre de la carpeta donde se almacenan los archivos de datos. */
    private static final String FOLDER_NAME = "data";
    
    /** Nombre de la carpeta de configuración. */
    private static final String CONFIG_FOLDER_NAME = "config";

    /** FileOutputStream para manejo de archivos serializados. */
    private static FileOutputStream fos;
    
    /** ObjectOutputStream para escritura de objetos serializados. */
    private static ObjectOutputStream oos;
    
    /** FileInputStream para lectura de archivos serializados. */
    private static FileInputStream fis;
    
    /** ObjectInputStream para lectura de objetos serializados. */
    private static ObjectInputStream ois;

    /**
     * Verifica si la carpeta de datos existe; si no, la crea.
     */
    public static void checkFolder() {
        archivo = new File(FOLDER_NAME);
        if (!archivo.exists() || !archivo.isDirectory()) {
            archivo.mkdir();
        }
    }

    /**
     * Escribe un objeto serializado en un archivo.
     * @param url Nombre del archivo.
     * @param content Objeto a serializar.
     */
    public static void writeSerialized(String url, Object content) {
        try {
            archivo = new File(FOLDER_NAME + "/" + url);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(content);
            fos.close();
            oos.close();
        } catch (IOException e) {
            System.out.println("ERROR EN CREAR ARCHIVO (Serialized)");
        }
    }

    /**
     * Lee un objeto serializado desde un archivo.
     * @param url Nombre del archivo.
     * @return Objeto leído o null en caso de error.
     */
    public static Object readSerialized(String url) {
        try {
            archivo = new File(FOLDER_NAME + "/" + url);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            Object content = ois.readObject();
            fis.close();
            ois.close();
            return content;
        } catch (IOException e) {
            System.out.println("ERROR EN LECTURA DE ARCHIVO (SERIALIZED)");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR AL LEER LOS DATOS DEL SERIALIZED (CLASS NOT FOUND)");
        }
        return null;
    }

    /**
     * Escribe un archivo de texto con el contenido especificado.
     * @param url Nombre del archivo.
     * @param content Contenido a escribir.
     */
    public static void writeFile(String url, String content) {
        try {
            archivo = new File(FOLDER_NAME + "/" + url);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            pw = new PrintWriter(archivo);
            pw.write(content);
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR EN LA ESCRITURA DEL ARCHIVO (PLAIN TEXT)");
        } catch (IOException e) {
            System.out.println("ERROR EN LA CREACION DEL ARCHIVO (PLAIN TEXT)");
        }
    }

    /**
     * Lee el contenido de un archivo de texto.
     * @param url Nombre del archivo.
     * @return Contenido del archivo como una cadena o null en caso de error.
     */
    public static String readFile(String url) {
        try {
            archivo = new File(FOLDER_NAME + "/" + url);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            sc = new Scanner(archivo);
            StringBuilder content = new StringBuilder();
            while (sc.hasNext()) {
                content.append(sc.nextLine()).append("\n");
            }
            return content.toString();
        } catch (IOException e) {
            System.out.println("ERROR EN LA LECTURA DEL ARCHIVO (PLAIN TEXT)");
        }
        return null;
    }
}
