/**
 * ConstantesTipoLetra.java
 * 09/12/2015
 */
package org.dental.constantes;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
public final class ConstantesTipoLetra {

    public ConstantesTipoLetra() {
    }
    public static final String CENTURY_GOTHIC_TYPE = "Century Gothic";
    public static final Integer CENTURY_GOTHIC_STYLE = 0;
    public static final Integer CENTURY_GOTHIC_SIZE = 18;

    public static final String COPPERPLATE_TYPE = "Copperplate Gothic Light";
    public static final Integer COPPERPLATE_STYLE = 0;
    public static final Integer TAMANIO_LETRA_MENU = 22;

    /**
     * Clase para configurar el color seg&uacute;n RGB
     */
    public static enum ColorLetraToolTipTextMenu {
        RED(0), GREEN(0), BLUE(204);
        private final int codigo;

        private ColorLetraToolTipTextMenu(int code) {
            this.codigo = code;
        }

        public int toInt() {
            return codigo;
        }
    }

}
