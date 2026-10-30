/**
 *
 * @author Equipo PayClear
 */
import com.formdev.flatlaf.FlatLightLaf; 
import VistaPrincipal.VistaPrincipal;


public class Main {

    public static void main(String[] args) {
        // 2. Aplicas el tema plano antes de abrir cualquier ventana
        FlatLightLaf.setup();

        // 3. Inicias tu ventana normalmente
        java.awt.EventQueue.invokeLater(() -> {
            new VistaPrincipal().setVisible(true);
        });
    }
}
