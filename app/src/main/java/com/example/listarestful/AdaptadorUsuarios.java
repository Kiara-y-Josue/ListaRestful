package com.example.listarestful;

import static java.security.AccessController.getContext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class AdaptadorUsuarios extends ArrayAdapter<Usuario> {
    public AdaptadorUsuarios(Context context, Usuario[] datos) {
        super(context, R.layout.lyitem, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lyitem, null);

        TextView lblNombres = (TextView)item.findViewById(R.id.lblNombre);
        lblNombres.setText(getItem(position).getNombres());

        TextView lblEmail = (TextView)item.findViewById(R.id.lblEmail);
        lblEmail.setText(getItem(position).getEmail());

        TextView lblWebsite = (TextView)item.findViewById(R.id.lblweb);
        lblWebsite.setText(getItem(position).getWebsite());

        ImageView imageView = (ImageView)item.findViewById(R.id.imgUsr);
        Glide.with(this.getContext())
                .load(getItem(position).getUrlavatar())
                .into(imageView);
        return(item);
    }
}
