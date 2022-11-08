package tddstart;

import org.junit.*;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionaryTest extends AppTest{

    Dictionary dict = new Dictionary();

    @Before
    public void initialize () {
        dict = new Dictionary("Example");
    }
    @Test public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }

    @Test public void testIsEmpty() {
        assertThat(dict.isEmpty(), equalTo(true));
    }


    @Test public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
    }


    //Triangulation 4
    @Test public void testOneTranslation4() {
        Map<String, String> d = new HashMap<>();
        Dictionary dict4 = new Dictionary(d);
        dict4.addTranslation("contrre", "against");
        assertThat(dict4.getTranslation("contrre"), equalTo("against"));
    }






}
