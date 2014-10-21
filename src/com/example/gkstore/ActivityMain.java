package com.example.gkstore;
import java.util.ArrayList;
import java.util.List;
import com.example.gkstore.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ActivityMain extends Activity {

    private ListView listViewPro;
    private Context ctx;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.articles_list);
        ctx=this;
        List productos = new ArrayList();
        productos.add(new camisa("Camisa Azul",150,"cam1"));
        productos.add(new camisa("Camisa Roja",200,"cam2"));
        productos.add(new camisa("Camisa Morada",200,"cam3"));

        listViewPro = ( ListView ) findViewById( R.id.ropa_list);
        listViewPro.setAdapter( new ProductsListAdapter(ctx, R.layout.articles, productos ) );
    }
}
