package es.uma.isia;

import es.uma.galvez.isia.Serviciosweb;
import es.uma.galvez.isia.Serviciosweb_Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        Serviciosweb_Service service = new Serviciosweb_Service();
        Serviciosweb sw = service.getServicioswebPort();
        System.out.println((char)sw.getLetraDNI(26969316));

        System.out.println(sw.hola("alumnos del master ISIA"));
        byte[] b = sw.nubeEtiquetas("https://www.coaat.es");
        BufferedImage img = ImageIO.read(new ByteArrayInputStream(b));
        ImageIO.write(img, "jpg", new FileOutputStream("F:/Master2022/02.opINFORMATICA_SOCIAL_TECNOLOGIAS_Y_METODOS/coaat.jpg"));

    }
}