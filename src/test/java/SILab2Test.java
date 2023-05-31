import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testEveryBranch() {
        assertThrows(RuntimeException.class, () -> SILab2.function(null ,null));

        User user1 = new User(null, "password", "stefan.batandjiev@gmail.com");
        List<User> users = List.of(user1);
        assertFalse(SILab2.function(user1, users));

        User user2 = new User("stefan", "pass", "stefan.batandjiev@gmail.com");
        assertFalse(SILab2.function(user2, users));

        User user3 = new User("stefan", "pass word", "stefan.batandjiev@gmail.com");
        User user4 = new User("stefan1", "password", "stefan1.batandjiev1@gmail.com");
        users = List.of(user4);
        assertFalse(SILab2.function(user3, users));

        User user5 = new User("stefan", "password123", "stefan.batandjiev@gmail.com");
        assertTrue(SILab2.function(user5, users));
    }

    @Test
    public void testMultipleConditionMissingInformation() {
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("stefan", "stefan123", null), new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("stefan", null, "stefan.batandjiev@gmail.com"), new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("stefan", null, null), new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

    }
}
