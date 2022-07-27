import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PrintStatementTest {

    @Mock
    MyConsole console;

    @InjectMocks
    TaskList taskList;

    @Test
    void should_print_statements() {
        // given
        taskList.addTask("Buy milk");
        taskList.addTask("Feed the dog");
        taskList.addTask("Boil eggs");

        taskList.completeTask("Feed the dog");

        // when
        taskList.showTasks();

        // then
        verify(console).printf("Task            | Completed");
        verify(console).printf("Buy milk|");
        verify(console).printf("Feed the dog|x");
        verify(console).printf("Boil eggs|");
    }
}
