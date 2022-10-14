package tddstart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class DictionaryTest extends AppTest{

    public static class Dictionary {
        private String nom;
        Dictionary(String nom){
            this.nom = nom;
        }
        Dictionary(){
            this.nom = "default";
        }

        public String getName(){
            return "Example";
        }

    }

    Dictionary dict = new Dictionary("Example");

    @Test public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }
}
