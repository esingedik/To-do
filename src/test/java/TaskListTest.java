import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.Console;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class TaskListTest {

    @Mock
    MyConsole console;

    @Test
    public void should_print_statements()
    {
        verify(console).printf("Task            | Completed");
        verify(console).printf("Buy milk        |");
        verify(console).printf("Feed the dog    |   x");
        verify(console).printf("Boil eggs       |");
    }
}
