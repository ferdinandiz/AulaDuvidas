package com.fer.auladuvidas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

class ArrayCustom extends ArrayAdapter<CDZ> {
    private Context context;
    private  int resourceLista;

    public ArrayCustom(@NonNull Context context, int resource, @NonNull List<CDZ> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resourceLista = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String nome = getItem(position).getNome();
        String id = getItem(position).getId();
        String constelacao = getItem(position).getConstelacao();

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resourceLista,parent,false);
        TextView tvNome = convertView.findViewById(R.id.nome);
        TextView tvId = convertView.findViewById(R.id.id);
        TextView tvConstelacao = convertView.findViewById(R.id.constelacao);

        tvNome.setText(nome);
        tvId.setText(id);
        tvConstelacao.setText(constelacao);

        return convertView;

    }
}
