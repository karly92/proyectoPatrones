package com.example.gkstore;

import java.util.List;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ProductsListAdapter extends ArrayAdapter{

    private int resource;
    private LayoutInflater inflater;
    private Context context;

    public ProductsListAdapter ( Context ctx, int resourceId, List objects) {

        super( ctx, resourceId, objects );
        resource = resourceId;
        inflater = LayoutInflater.from( ctx );
        context=ctx;
    }

    @Override
    public View getView ( int position, View convertView, ViewGroup parent ) {

        /* create a new view of my layout and inflate it in the row */
        convertView = ( RelativeLayout ) inflater.inflate( resource, null );

        /* Extract the city's object to show */
        Ropa ropa = (Ropa) getItem( position );

        /* Take the TextView from layout and set the city's name */
        TextView txtDesc = (TextView) convertView.findViewById(R.id.desc);
        txtDesc.setText(ropa.leerdescripcion());
        String precio = String.valueOf(ropa.leerprecio());
        /* Take the TextView from layout and set the city's wiki link */
        TextView txtPrecio = (TextView) convertView.findViewById(R.id.precio);
        txtPrecio.setText(precio);

        /* Take the ImageView from layout and set the city's image */
        ImageView imageProducto = (ImageView) convertView.findViewById(R.id.ropa1);
        String uri = "drawable/" + ropa.getImage();
        int imageResource = context.getResources().getIdentifier(uri, null, context.getPackageName());
        Drawable image = context.getResources().getDrawable(imageResource);
        imageProducto.setImageDrawable(image);
        return convertView;
    }
}
