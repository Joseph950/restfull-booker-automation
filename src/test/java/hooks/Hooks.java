package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp() {
        System.out.println("🚀 Iniciando escenario...");
    }

    @After
    public void tearDown() {
        System.out.println("🧹 Limpiando después del escenario...");
    }
}
