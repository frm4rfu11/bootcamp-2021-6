package pom.mentoria.equipo3.test;

import org.junit.Test;
import pom.mentoria.base.TestBase;
import pom.mentoria.equipo3.pages.act09HomePage;

public class atc09_TrasladosDesdeAeropuertoConRegreso extends TestBase {

    @Test
    public void atc09_TrasladosDesdeAeropuertoConReg(){

        act09HomePage traslado_conReg = new act09HomePage(driver);
        traslado_conReg.act09_TrasladoConRegreso();

    }

}
