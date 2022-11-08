package tddstart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class DictionaryTest extends AppTest{

    Dictionary dict = new Dictionary("");

    @Test public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }

    //@Test public void testOneTranslation() {
      //  dict.addTranslation("contre", "against");
        //assertThat(dict.getTranslation("contre"), equalsTo("against"));
    //}

    //7
    @Test public void testIsEmpty() {
        assertThat(dict.isEmpty(), equalTo(true));
    }


    @Test public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
    }

    //Triangulation 2
    @Test public void testOneTranslation2() {
        assertThat(dict.getTranslation("contre"), equalTo("against"));
    }

    //Triangulation 4
    @Test public void testOneTranslation4() {
        assertThat(dict.getTranslation("contrre"), equalTo("against"));

    }






}
