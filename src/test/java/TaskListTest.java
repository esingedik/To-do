import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class TaskListTest {

    @Mock
    MyConsole console;

    @InjectMocks
    TaskList taskList;

    @Test
    void should_add_task() {
        // given
        taskList.addTask("example-task");

        // when & then
        Assertions.assertEquals(1, taskList.getTotalTaskSize());
    }

    @Test
    void should_complete_task() {
        // given
        taskList.addTask("example-task");
        taskList.addTask("example-task-2");

        // when
        taskList.completeTask("example-task");

        // then
        Assertions.assertEquals(1, taskList.getCompletedTaskSize());
    }

    @Test
    void should_show_tasks() {
        // given
        taskList.addTask("Boil eggs");

        // when
        taskList.showTasks();

        // then
        verify(console).printf("Task            | Completed");
        verify(console).printf("Boil eggs|");
    }
}
