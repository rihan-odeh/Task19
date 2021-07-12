package com.example.task19;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Portfolio extends AppCompatActivity {
    private ArrayList<Project> projects;



    public Portfolio(){
        projects = new ArrayList<>();
    }
    public Portfolio(ArrayList<Project> projects){
        this.projects= projects;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }
    public void addToPortfolio(Project project){
        if(projects == null){
                projects= new ArrayList<>();
        }

        projects.add(project);

    }
    public String printProjects(){
        String string= "";
        for(int i=0; i<projects.size(); i++){
            string+= projects.get(i).elevatorPitch()+"\n";
        }
    return string; }
}
