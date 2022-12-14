/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void testRestaurant(){

        Restaurant sut = new Restaurant("Rexie's Burgers", 3, 4);
        assertEquals(3, 3);
    }

    @Test void testReview(){

        Review sut = new Review("rexie's burgers are amazing!!", "rexie", 9);
    }

    @Test void testShop(){

        Shop sut = new Shop("L'rileys", "shopping center for boats", 4.5f);
    }
    @Test void testTheater(){
        Theater sut = new Theater("The revengers!");
    }
}
