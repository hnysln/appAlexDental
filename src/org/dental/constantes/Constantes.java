/**
 * Constantes.java
 * 09/12/2015
 */
package org.dental.constantes;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.Insets;
import java.awt.Toolkit;

/**
 *
 * @author Henry Salinas A.
 * @version: 1.0
 */
public final class Constantes {

    public static final Font FONT_COPPERPLATE_TYPE = new Font(ConstantesTipoLetra.COPPERPLATE_TYPE, ConstantesTipoLetra.COPPERPLATE_STYLE, 12);
    public static final Font FONT_CENTURY_TYPE = new Font(ConstantesTipoLetra.CENTURY_GOTHIC_TYPE, ConstantesTipoLetra.CENTURY_GOTHIC_STYLE, 12);

    public static Dimension dimensionScreen(GraphicsConfiguration graphicsConfiguration) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Insets screenMax = Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration);
        int taskBarSize = screenMax.bottom;
        screenSize.height = screenSize.height - taskBarSize;
        return screenSize;
    }
}
