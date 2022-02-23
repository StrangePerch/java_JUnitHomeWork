import com.company.StringUtils;
import junit.framework.TestCase;

public class StringUtilsTests extends TestCase {
    public void testPalindrome()
    {
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertTrue(StringUtils.isPalindrome("raceCAR"));
        assertTrue(StringUtils.isPalindrome("A"));
        assertFalse(StringUtils.isPalindrome("Melon"));
    }

    public void testCountVowels()
    {
        assertEquals(2, StringUtils.countVowels("apple"));
        assertEquals(3, StringUtils.countVowels("banana"));
        assertEquals(1, StringUtils.countVowels("E"));
        assertEquals(5, StringUtils.countVowels("aeiou"));
        assertEquals(0, StringUtils.countVowels(""));
    }

    public void testCountConsonants()
    {
        assertEquals(3, StringUtils.countConsonants("apple"));
        assertEquals(3, StringUtils.countConsonants("APPLE"));
        assertEquals(3, StringUtils.countConsonants("banana"));
        assertEquals(0, StringUtils.countConsonants("E"));
        assertEquals(0, StringUtils.countConsonants("aeiou"));
        assertEquals(0, StringUtils.countConsonants(""));
    }

    public void testCountWords()
    {
        assertEquals(2, StringUtils.countSubstring("apple banana banana", "banana"));
        assertEquals(2, StringUtils.countSubstring("banana", "an"));
        assertEquals(4, StringUtils.countSubstring("asdfasdfasdfasdf", "as"));
    }
}
