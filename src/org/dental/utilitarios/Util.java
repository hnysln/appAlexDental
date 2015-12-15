/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dental.utilitarios;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.dental.constantes.Constantes;

/**
 *
 * @author Henry Salinas A.
 */
public class Util {

    /**
     * M&eacute;todo que permite ingresar solo n&uacute;meros en una caja de
     * texto. Los dem&aacute;s caracteres los ignora.
     *
     * @param evt
     */
    public static void validarSoloNumeros(java.awt.event.KeyEvent evt) {
        if (evt.getKeyChar() != '0' && evt.getKeyChar() != '1' && evt.getKeyChar() != '2'
                && evt.getKeyChar() != '3' && evt.getKeyChar() != '4' && evt.getKeyChar() != '5'
                && evt.getKeyChar() != '6' && evt.getKeyChar() != '7' && evt.getKeyChar() != '8'
                && evt.getKeyChar() != '9') {
            evt.setKeyChar(KeyEvent.CHAR_UNDEFINED);
        }
    }

    /**
     * M&eacute;todo que permite ingresar solo n&uacute;meros flotantes en una
     * caja de texto. Los dem&aacute;s caracteres los ignora. Solo puede
     * ingresar un (".")
     *
     * @param evt
     * @param cadenaValidar
     */
    public static void validarSoloNumerosFlotantes(java.awt.event.KeyEvent evt, String cadenaValidar) {
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && cadenaValidar.contains(".")) {
            evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.')) {
            evt.consume();
        }
    }

    /**
     * M&eacute;todo que permite ingresar solo letras may&uacute;sculas y
     * min&uacute;ssculas, incluye letras con tilde y espacio en una caja de
     * texto. Los dem&aacute;s caracteres los ignora.
     *
     * @param evt
     */
    public static void validarSoloLetras(java.awt.event.KeyEvent evt) {
        if (evt.getKeyChar() != 'a' && evt.getKeyChar() != 'b' && evt.getKeyChar() != 'c'
                && evt.getKeyChar() != 'd' && evt.getKeyChar() != 'e' && evt.getKeyChar() != 'f'
                && evt.getKeyChar() != 'g' && evt.getKeyChar() != 'h' && evt.getKeyChar() != 'i'
                && evt.getKeyChar() != 'j' && evt.getKeyChar() != 'k' && evt.getKeyChar() != 'l'
                && evt.getKeyChar() != 'm' && evt.getKeyChar() != 'n' && evt.getKeyChar() != 'ñ'
                && evt.getKeyChar() != 'o' && evt.getKeyChar() != 'p' && evt.getKeyChar() != 'q'
                && evt.getKeyChar() != 'r' && evt.getKeyChar() != 's' && evt.getKeyChar() != 't'
                && evt.getKeyChar() != 'u' && evt.getKeyChar() != 'v' && evt.getKeyChar() != 'w'
                && evt.getKeyChar() != 'x' && evt.getKeyChar() != 'y' && evt.getKeyChar() != 'z'
                && evt.getKeyChar() != 'á' && evt.getKeyChar() != 'é' && evt.getKeyChar() != 'í'
                && evt.getKeyChar() != 'ó' && evt.getKeyChar() != 'ú' && evt.getKeyChar() != ' '
                && evt.getKeyChar() != 'A' && evt.getKeyChar() != 'B' && evt.getKeyChar() != 'C'
                && evt.getKeyChar() != 'D' && evt.getKeyChar() != 'E' && evt.getKeyChar() != 'F'
                && evt.getKeyChar() != 'G' && evt.getKeyChar() != 'H' && evt.getKeyChar() != 'I'
                && evt.getKeyChar() != 'J' && evt.getKeyChar() != 'K' && evt.getKeyChar() != 'L'
                && evt.getKeyChar() != 'M' && evt.getKeyChar() != 'N' && evt.getKeyChar() != 'Ñ'
                && evt.getKeyChar() != 'O' && evt.getKeyChar() != 'P' && evt.getKeyChar() != 'Q'
                && evt.getKeyChar() != 'R' && evt.getKeyChar() != 'S' && evt.getKeyChar() != 'T'
                && evt.getKeyChar() != 'U' && evt.getKeyChar() != 'V' && evt.getKeyChar() != 'W'
                && evt.getKeyChar() != 'X' && evt.getKeyChar() != 'Y' && evt.getKeyChar() != 'Z'
                && evt.getKeyChar() != 'Á' && evt.getKeyChar() != 'É' && evt.getKeyChar() != 'Í'
                && evt.getKeyChar() != 'Ó' && evt.getKeyChar() != 'Ú') {
            evt.setKeyChar(KeyEvent.CHAR_UNDEFINED);
        }
    }

    /**
     * M&eacute;todo para validar si es c&eacutedula o RUC v&aacute;lido,
     * independientemente si es un RUC de sociedades o EP.
     *
     * @param cedulaCliente
     * @return
     */
    public static boolean isCedulaRucValido(String cedulaCliente) {
        if (cedulaCliente.trim().length() != 13 && cedulaCliente.trim().length() != 10) {
            return false;
        } else if (ValidaCedula.isCedulaRucValido(cedulaCliente)) {
            return true;
        } else if (ValidaRucEP.validaRucEP(cedulaCliente)) {
            return true;
        } else {
            return ValidaRucSociedades.validacionRUC(cedulaCliente);
        }
    }

    public static JLabel mensajeShowOptionPanelNOUTILIZAR(String mensajeMostrar) {
        JLabel jLabel = new JLabel(mensajeMostrar);
        jLabel.setFont(Constantes.FONT_COPPERPLATE_TYPE);
        return jLabel;
    }

    public static JLabel mensajeHTMLShowOptionPanel(String mensaje) {
        StringBuilder mensajeBuffer = new StringBuilder();
        mensajeBuffer.append("<html>");
        mensajeBuffer.append("<body>");
        mensajeBuffer.append(mensaje);
        mensajeBuffer.append("</body>");
        mensajeBuffer.append("</html>");
        JLabel jLabel = new JLabel(mensajeBuffer.toString());
        jLabel.setFont(Constantes.FONT_COPPERPLATE_TYPE);
        return jLabel;
    }

    public static void seleccionarCampo(JTextField jTextField) {
        jTextField.setSelectionStart(0);
        jTextField.setSelectionEnd(jTextField.getText().length());
    }
}
