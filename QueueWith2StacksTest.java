import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class QueueWith2StacksTest {
    @Test
    public void test() {
        QueueWith2Stacks queueWith2Stacks = new QueueWith2Stacks();
        queueWith2Stacks.enqueue(1);
        queueWith2Stacks.enqueue(2);
        queueWith2Stacks.enqueue(3);

        assertEquals((Integer)1, queueWith2Stacks.dequeue());
        assertEquals((Integer)2, queueWith2Stacks.dequeue());

        queueWith2Stacks.enqueue(4);
        queueWith2Stacks.enqueue(5);

        assertEquals((Integer)3, queueWith2Stacks.dequeue());

        queueWith2Stacks.enqueue(6);

        assertEquals((Integer)4, queueWith2Stacks.dequeue());
        assertEquals((Integer)5, queueWith2Stacks.dequeue());
        assertEquals((Integer)6, queueWith2Stacks.dequeue());

        assertNull(queueWith2Stacks.dequeue());
    }
}
