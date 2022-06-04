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
public class ID {

    //creamos la estructura para evaluar los casos 
    //o en esta ocasion evaluar los municipios
    public char municipios(String s) {
        char id = '+';
        switch (s) {
            case "Asuncion Mita":
                id = 'a';
                break;
            case "Jutiapa":
                id = 'b';
                break;
            case "El Progreso":
                id = 'c';
                break;
            case "Jalpatagua":
                id = 'd';
                break;
            case "Atescatempa":
                id = 'e';
                break;
            case "Comapa":
                id = 'f';
                break;
            case "Santa Catarina Mita":
                id = 'g';
                break;
            case "Agua Blanca":
                id = 'h';
                break;
            case "Quesada":
                id = 'i';
                break;
            case "Conguaco":
                id = 'j';
                break;
            case "Jerez":
                id = 'k';
                break;
            case "San Jose Acatempa":
                id = 'l';
                break;
            case "Moyuta":
                id = 'm';
                break;
            case "Pasaco":
                id = 'n';
                break;
            case "El Adelanto":
                id = 'o';
                break;
            case "Yupiltepeque":
                id = 'p';
                break;
            case "Zapotitlan":
                id = 'q';
                break;
        }
        return id;
    }
}
