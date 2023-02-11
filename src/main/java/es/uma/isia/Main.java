package es.uma.isia;

import es.uma.galvez.isia.Serviciosweb;
import es.uma.galvez.isia.Serviciosweb_Service;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.PetApi;
import io.swagger.client.model.Pet;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, ApiException {

        Serviciosweb_Service service = new Serviciosweb_Service();
        Serviciosweb sw = service.getServicioswebPort();
        System.out.println("Prueba de la letra del DNI");
        System.out.println("==============================");
        System.out.println((char)sw.getLetraDNI(26969316));
        System.out.println("\n");

        System.out.println("Prueba del hola");
        System.out.println("==============================");
        System.out.println(sw.hola("alumnos del master ISIA"));
        System.out.println("\n");

        System.out.println("Prueba de la nube de etiquetas");
        System.out.println("==============================");
        byte[] b = sw.nubeEtiquetas("https://www.coaat.es");
        BufferedImage img = ImageIO.read(new ByteArrayInputStream(b));
        ImageIO.write(img, "jpg", new FileOutputStream("F:/Master2022/02.opINFORMATICA_SOCIAL_TECNOLOGIAS_Y_METODOS/coaat.jpg"));
        File file = new File("F:/Master2022/02.opINFORMATICA_SOCIAL_TECNOLOGIAS_Y_METODOS/coaat.jpg");
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file);

        System.out.println("Prueba de consumo de servicio rest");
        System.out.println("==============================");
        PetApi api = new PetApi();
        List<Pet> pets = api.findPetsByStatus("available");
        for (Pet pet:pets) {
            System.out.println(pet.getName().toString());
        }
    }
}