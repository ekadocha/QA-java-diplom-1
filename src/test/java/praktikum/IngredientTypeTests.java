package praktikum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IngredientTypeTests {

    @Test
    void colorEnumValuesAreAsExpected() {
        IngredientType[] values = IngredientType.values();
        assertArrayEquals(new IngredientType[]{IngredientType.SAUCE, IngredientType.FILLING}, values,"ENUM IngredientType должен содержать SAUCE и FILLING");
    }
}
