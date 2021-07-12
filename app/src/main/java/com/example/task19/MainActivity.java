package com.example.task19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Project project = new Project();
    private Button addProjectByNameAndDescription;
    private Button addProjectByName;
    private Button addEmptyProject;
    private Button viewAllProjects;
    private EditText nameOnly;
    private EditText name;
    private EditText description;
    private final Portfolio portfolio = new Portfolio();
    private EditText portfolioText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindUI();

        addProjectByNameAndDescription.setOnClickListener(v -> {
            project = new Project(name.getText().toString(), description.getText().toString());
            portfolio.addToPortfolio(project);
            Log.e("", portfolio.toString());
            Toast.makeText(getApplicationContext(), "Created", Toast.LENGTH_LONG).show();

        });
        addProjectByName.setOnClickListener(v -> {
            project = new Project(nameOnly.getText().toString());
            portfolio.addToPortfolio(project);
            Toast.makeText(getApplicationContext(), "Created", Toast.LENGTH_LONG).show();


        });
        addEmptyProject.setOnClickListener(v -> {
            project = new Project();
            portfolio.addToPortfolio(project);
            Toast.makeText(getApplicationContext(), "Created", Toast.LENGTH_LONG).show();


        });
        viewAllProjects.setOnClickListener(v -> {
            Log.e("", portfolio.printProjects());

            portfolioText.setText(portfolio.printProjects());


       /*     Intent intent = new Intent(this, Portfolio.class);
            intent.getStringExtra("Projects' List ");
            startActivity(intent);*/

        });
    }

    private void bindUI() {
        addProjectByNameAndDescription = findViewById(R.id.bothParametersButton);
        addProjectByName = findViewById(R.id.nameButton);
        addEmptyProject = findViewById(R.id.NoParametersButton);
        viewAllProjects = findViewById(R.id.goToAllProjects);
        nameOnly = findViewById(R.id.onlyNameEditText);
        name = findViewById(R.id.nameEditText);
        description = findViewById(R.id.descriptionEditText);
        portfolioText = findViewById(R.id.showAll);
    }
}