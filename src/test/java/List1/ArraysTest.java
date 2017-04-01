package List1;

import com.sdajava.problems.ArrayExac;
import com.sdajava.problems.CollectionUtils;
import org.junit.Test;

import java.util.*;


import static java.util.Arrays.asList;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;


public class ArraysTest {

    @Test
    public void shouldFindLastElementFromAList(){
        assertThat(ArrayExac.last(asList("a","b","c")), equalTo("c"));   //metoda statyczna z klasy ArrayExac + prosta metoda tworząca liste
        assertEquals(ArrayExac.last(asList("a","b","c")), "c");
    }
    @Test
    public void shouldFindLastElementFromLList() {
        LinkedList<String> list = new LinkedList<String>(asList("a","b","c"));
        assertEquals(ArrayExac.lastLL(list), "c");
    }
    @Test
    public void shouldFindLastElementFromLinkedList() {
        LinkedList<String> list = CollectionUtils.linkedList("a","b","c", "c");
        assertEquals(ArrayExac.lastLL(list), "c");
    }
    @Test
    public void listOfEmptyListShouldBe0(){
        int length = ArrayExac.length(Collections.emptyList());
        assertThat(length, is(equalTo(0)));
    }
    @Test
    public void listFindListOfNonEmptyList(){
        assertThat(ArrayExac.length(asList(1,2,3,4,5,6)), is(equalTo(6)));
    }

    @Test
    public void listFindListOfNonEmptyListRecursion() {
        assertThat(ArrayExac.lastRecursion(asList(1, 2, 3, 4, 5, 6)), is(equalTo(6)));
    }
    @Test
    public void shouldReverseAList(){
        List<Integer> numbers = asList(1,2,3,4,5,6,7,8,9,10);
        assertThat(ArrayExac.reverse(numbers), is(equalTo( asList(10,9,8,7,6,5,4,3,2,1))));
    }
    @Test
    public void shouldReturnTrueWhenListIsPalindrome(){
        assertTrue(ArrayExac.isPalindrome(asList("a","b","a")));
    }
    @Test
    public void shouldRemoveConsecutiveDeuplicatesAList(){
        List<String> compressedList = ArrayExac.compress(asList("a","a","b","b"));
        assertThat(compressedList, contains("a","b"));
    }
    @Test
    public void shouldDuplicateElementsInAList() throws Exception{
        List<String> duplicates = ArrayExac.duplicates(Arrays.asList("a","b","c"),3);
        assertThat(duplicates, contains("a","a","a", "b","b","b" , "c","c","c"));
    }
    @Test
    public void shouldDuplicateElementsInAListStream() throws Exception{
        List<String> duplicates = ArrayExac.duplicatesStream(Arrays.asList("a","b","c"),3);
        assertThat(duplicates, contains("a","a","a", "b","b","b" , "c","c","c"));
    }
    @Test
    public void shouldDropEveryNthElement() throws Exception{
        List<String> result = ArrayExac.dropEveryNth(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k"),3);
        assertThat(result, contains("a","b","d", "e","g","h" , "j","k"));
    }
}
