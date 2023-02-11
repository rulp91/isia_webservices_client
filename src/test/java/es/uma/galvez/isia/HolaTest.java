package es.uma.galvez.isia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolaTest {


    @Test()
    public void holaNullResultTest() {
        Serviciosweb_Service service = new Serviciosweb_Service();
        Serviciosweb sw = service.getServicioswebPort();
        String holaResult = sw.hola(null);
        Assertions.assertTrue(null != holaResult);
    }

    @Test()
    public void holaRaulResultTest() {
        Serviciosweb_Service service = new Serviciosweb_Service();
        Serviciosweb sw = service.getServicioswebPort();
        String holaResult = sw.hola("Raul");
        boolean equals = "¡Hola Raul!".toString().equals(holaResult);
        assertNotEquals("¡Hola Raul!".toString(), holaResult);
    }
}