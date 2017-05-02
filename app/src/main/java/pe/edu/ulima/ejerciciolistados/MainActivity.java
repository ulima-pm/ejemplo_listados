package pe.edu.ulima.ejerciciolistados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import pe.edu.ulima.ejerciciolistados.model.Alumno;
import pe.edu.ulima.ejerciciolistados.model.AlumnosManager;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener{
    ListView lviAlumnos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lviAlumnos = (ListView) findViewById(R.id.lviAlumnos);
        AlumnosManager manager = new AlumnosManager();

        ListadoAlumnosAdapter adapter =
                new ListadoAlumnosAdapter(
                        this,
                        manager.obtenerAlumnos());
        lviAlumnos.setAdapter(adapter);

        lviAlumnos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView,
                            View view,
                            int i,
                            long l) {
        Alumno alumno = (Alumno) adapterView.getItemAtPosition(i);
        Toast.makeText(
                this,
                alumno.getNombre(),
                Toast.LENGTH_LONG).show();
    }
}
