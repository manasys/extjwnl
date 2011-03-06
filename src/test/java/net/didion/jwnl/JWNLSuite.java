package net.didion.jwnl;

import net.didion.jwnl.data.*;
import net.didion.jwnl.dictionary.TestCreateFileBackedDictionary;
import net.didion.jwnl.dictionary.TestCreateMapBackedDictionary;
import net.didion.jwnl.dictionary.TestFileBackedDictionary;
import net.didion.jwnl.dictionary.TestFileBackedDictionaryEdit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * All tests.
 *
 * @author Aliaksandr Autayeu avtaev@gmail.com
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestWord.class,
        TestSynset.class,
        TestExc.class,
        TestDictionaryElementType.class,
        TestSummary.class,
        TestFileBackedDictionary.class,
//        TestMapBackedDictionary.class,
//        TestDatabaseBackedDictionary.class,
        TestCreateFileBackedDictionary.class,
        TestCreateMapBackedDictionary.class,
        TestFileBackedDictionaryEdit.class
})
public class JWNLSuite {

    public static void main(String[] args) {
        Class[] classes = new Class[]{
                TestWord.class,
                TestSynset.class,
                TestExc.class,
                TestDictionaryElementType.class,
                TestSummary.class,
                TestFileBackedDictionary.class,
//                TestMapBackedDictionary.class,
//                TestDatabaseBackedDictionary.class,
                TestCreateFileBackedDictionary.class,
                TestCreateMapBackedDictionary.class,
                TestFileBackedDictionaryEdit.class
        };
        String[] names = new String[classes.length];
        for (int i = 0; i < classes.length; i++) {
            names[i] = classes[i].getName();
        }
        org.junit.runner.JUnitCore.main(names);
    }
}