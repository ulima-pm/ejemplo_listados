package pe.edu.ulima.ejerciciolistados;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import pe.edu.ulima.ejerciciolistados.model.Alumno;

public class ListadoAlumnosAdapter extends BaseAdapter{
    private List<Alumno> mAlumnos;
    private LayoutInflater mInflater;

    public ListadoAlumnosAdapter(Context context,
                                 List<Alumno> alumnos){
        mAlumnos = alumnos;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mAlumnos.size();
    }

    @Override
    public Object getItem(int i) {
        return mAlumnos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null){
            view = mInflater.inflate(
                    R.layout.item_alumnos,
                    viewGroup,
                    false);

            viewHolder = new ViewHolder();
            viewHolder.tviNombreAlumno =
                    (TextView) view.findViewById(R.id.tviNombreAlumno);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        Alumno alumno = mAlumnos.get(i);
        viewHolder.tviNombreAlumno.setText(alumno.getNombre());

        return view;
    }

    class ViewHolder{
        TextView tviNombreAlumno;
    }

}
