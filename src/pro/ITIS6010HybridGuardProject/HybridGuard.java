package pro.ITIS6010HybridGuardProject;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Calendar;
import javax.swing.*;

public class HybridGuard extends AnAction implements ToolWindowFactory{

    private JButton refreshToolWindowButton;
    private JButton hideToolWindowButton;
    private JLabel currentDate;
    private JLabel currentTime;
    private JLabel timeZone;
    private JPanel myToolWindowContent;

    private ToolWindow myToolWindow;
    public HybridGuard()
    {

        hideToolWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                myToolWindow.hide(null);
            }
        });
        refreshToolWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HybridGuard.this.currentDateTime();
            }
        });
    }

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        try {
            File core_flashJax = new File(project.getBasePath()+"\\assets\\www\\js\\core-flashjax.js");
            FileWriter fw = new FileWriter(core_flashJax);
            BufferedWriter bw = new BufferedWriter(fw);

            FileReader fr = new FileReader("/resources/core-flashjax.js");
            BufferedReader br = new BufferedReader(fr);

            if(!core_flashJax.exists())
            {
                core_flashJax.createNewFile();
            }
            String line ="";
            while((line =br.readLine())!=null)
            {
                bw.write(line);
            }
        }
        catch(IOException ioe)
        {

        }
        //createToolWindowContent(project,myToolWindow);
    }

    public  void createToolWindowContent(Project project, ToolWindow toolWindow)
    {
        myToolWindow = toolWindow;

        this.currentDateTime();
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(myToolWindowContent,"",false);
        toolWindow.getContentManager().addContent(content);
    }
    public void currentDateTime() {
        currentDate.setText("aa");
    }
    public void createGUIs(String message) {
        WelcomeWindow mp = new WelcomeWindow();


    }
}
