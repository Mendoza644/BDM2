package com.example.bdm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mrecyclerView;
    Myadapter myadapter;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecyclerView = findViewById(R.id.recyclerView);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myadapter = new Myadapter(this, getMylist());
        mrecyclerView.setAdapter(myadapter);
    }

    private ArrayList<Model> getMylist() {

        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();
        m.setName_Products("cocina1");
        m.setDescription("Es una cocina actualmente de la más actulizadas");
        m.setImg(R.drawable.cocina1);
        models.add(m);
        m.setName_Products("cocina2");
        m.setDescription("Es una cocina actualmente de la más actulizadas");
        m.setImg(R.drawable.cocina2);
        models.add(m);

        m.setName_Products("cocina3");
        m.setDescription("Es una cocina actualmente de la más actulizadas");
        m.setImg(R.drawable.cocina3);
        models.add(m);

        m.setName_Products("cocina4");
        m.setDescription("Es una cocina actualmente de la más actulizadas");
        m.setImg(R.drawable.cocina4);
        models.add(m);

        m.setName_Products("cocina5");
        m.setDescription("Es una cocina actualmente de la más actulizadas");
        m.setImg(R.drawable.cocina5);
        models.add(m);
return  models;

    }
}
