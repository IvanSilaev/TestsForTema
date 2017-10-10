import akcom.agency.artem.tests.MyGreatestStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyGreatestStackTests {

    private MyGreatestStack<String> stringMyGreatestStack;

    @Before
    public void initTests() {
        stringMyGreatestStack = new MyGreatestStack<String>();

        addItemsForTests();
    }

    public void addItemsForTests() {
        stringMyGreatestStack.push_top("Hello");
        stringMyGreatestStack.push_top("World!");
        stringMyGreatestStack.push_top("This");
        stringMyGreatestStack.push_top("is");
        stringMyGreatestStack.push_top("GreatestStackClass");
        stringMyGreatestStack.push_top("In");
        stringMyGreatestStack.push_top("The");
        stringMyGreatestStack.push_top("World");
    }

    @Test
    public void testSize() {
        Assert.assertTrue(stringMyGreatestStack.getSize() == 8);
    }

    @Test
    public void testPush() {
        Assert.assertTrue(stringMyGreatestStack.push_top("An top item"));
    }

    @Test
    public void testGet() {
        Assert.assertTrue(stringMyGreatestStack.delete_top().equals("World"));
    }

    @Test
    public void testCopy() {
        MyGreatestStack<String> copyOfMyGreatestStack = new MyGreatestStack<String>(stringMyGreatestStack);

        int index = 0;

        for(Object s : copyOfMyGreatestStack) {
            Assert.assertEquals(s, stringMyGreatestStack.get(index));

            index++;
        }
    }
}
