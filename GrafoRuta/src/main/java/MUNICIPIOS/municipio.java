/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MUNICIPIOS;

/**
 *
 * @author Iris Damian
 */
public class municipio {

    //evaluamos los municipios hasta encontrar el caso correspondiente
    public String MunicipiosJutiapa(char cr) {
        String municipio = "";
        switch (cr) {
            case 'a':
                municipio = "Asuncion Mita";
                break;
            case 'b':
                municipio = "Jutiapa";
                break;
            case 'c':
                municipio = "El Progreso";
                break;
            case 'd':
                municipio = "Jalpatagua";
                break;
            case 'e':
                municipio = "Atescatempa";
                break;
            case 'f':
                municipio = "Comapa";
                break;
            case 'g':
                municipio = "Santa Catarina Mita";
                break;
            case 'h':
                municipio = "Agua Blanca";
                break;
            case 'i':
                municipio = "Quesada";
                break;
            case 'j':
                municipio = "Conguaco";
                break;
            case 'k':
                municipio = "Jerez";
                break;
            case 'l':
                municipio = "San Jose Acatempa";
                break;
            case 'm':
                municipio = "Moyuta";
                break;
            case 'n':
                municipio = "Pasaco";
                break;
            case 'o':
                municipio = "El Adelanto";
                break;
            case 'p':
                municipio = "Yupiltepeque";
                break;
            case 'q':
                municipio = "Zapotitlan";
                break;
        }
        return municipio;
    }
}
