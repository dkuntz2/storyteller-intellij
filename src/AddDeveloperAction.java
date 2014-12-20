import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class AddDeveloperAction extends AnAction {
  public AddDeveloperAction() {
    super("Add Developer");
  }

  @Override
  public void actionPerformed(AnActionEvent e) {
    Project project = e.getData(PlatformDataKeys.PROJECT);

    String developerName = Messages.showInputDialog(project,
                                                    "What is the name of the developer being "
                                                    + "added?", "Developer Name", Messages.getQuestionIcon());

    Messages.showMessageDialog(project, "Hello " + developerName + "!", "Information", Messages
        .getInformationIcon());
  }
}
