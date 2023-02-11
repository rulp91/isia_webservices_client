package es.uma.galvez.isia;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LetraDNITest {


    @Test
    void testLetraDniTest(){
        Serviciosweb_Service service = new Serviciosweb_Service();
        Serviciosweb sw = service.getServicioswebPort();
        Assertions.assertEquals('E',(char)sw.getLetraDNI(26969316));
    }

    @Test
    void testLetraDniFalloTest(){
        Serviciosweb_Service service = new Serviciosweb_Service();
        Serviciosweb sw = service.getServicioswebPort();
        Assertions.assertNotEquals('A',(char)sw.getLetraDNI(26969316));
    }

    @Test
    void testLetraDniPosicionTest(){
        Serviciosweb_Service service = new Serviciosweb_Service();
        Serviciosweb sw = service.getServicioswebPort();
        int pos = sw.getLetraDNI(26969316);
        Assertions.assertTrue(pos <= 23);
        Assertions.assertTrue(pos >= 0);
    }

    @Test
    void testLetraDniNoPosicionTest(){
        Serviciosweb_Service service = new Serviciosweb_Service();
        Serviciosweb sw = service.getServicioswebPort();
        int pos = sw.getLetraDNI(0);
        Assertions.assertTrue(pos > 23);
    }

    @Test()
    public void testDniExceptionTest() {
        Serviciosweb_Service service = new Serviciosweb_Service();
        Serviciosweb sw = service.getServicioswebPort();
        Assertions.assertThrows(Exception.class, () -> {
            sw.getLetraDNI(-1);
        });
    }


}