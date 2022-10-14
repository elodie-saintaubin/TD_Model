package tddstart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class DictionaryTest extends AppTest{

    public static class Dictionary {
        String nom;
        Dictionary(String nom){
            this.nom = nom;
        }
        public String getName(){
            return nom;
        }

    }

    @Test public void testDictionaryName() {
        Dictionary dict = new Dictionary("Example");
        assertThat(dict.getName(), equalTo("Test"));
    }
}
