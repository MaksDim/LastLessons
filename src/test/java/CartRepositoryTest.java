import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartRepositoryTest {

    @Test
    public void shouldAddIfAlreadyContains() {
        PurchaseItem first = new PurchaseItem(1111, 1, "first", 100,2);
        PurchaseItem second = new PurchaseItem(22, 2, "second", 10,1);
        PurchaseItem third = new PurchaseItem(333, 3, "third", 1, 2 );

        CartRepository repo = new CartRepository();
        repo.save(first);
        repo.save(second);
        repo.save(third);

        PurchaseItem[] expected = {first, second, third};
        PurchaseItem[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

}