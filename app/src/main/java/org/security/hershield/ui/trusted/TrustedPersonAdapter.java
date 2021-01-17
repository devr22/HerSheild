package org.security.hershield.ui.trusted;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.security.hershield.R;
import org.security.hershield.model.Trusted_person_model;

import java.util.List;

public class TrustedPersonAdapter extends RecyclerView.Adapter<TrustedPersonAdapter.MyHolder> {

    Context context;
    List<Trusted_person_model> trustedPersonModel;

    public TrustedPersonAdapter(Context context, List<Trusted_person_model> trustedPersonModel) {
        this.context = context;
        this.trustedPersonModel = trustedPersonModel;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.trusted_person_model, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        //get data
        String personName = trustedPersonModel.get(position).getName();
        String personRelation = trustedPersonModel.get(position).getRelation();
        String personcontact = trustedPersonModel.get(position).getContact();
        String personAddress = trustedPersonModel.get(position).getAddress();

        //set data
        holder.name.setText("Name: "+personName);
        holder.relation.setText("Relationship: "+personRelation);
        holder.contact.setText("Contact No: "+personcontact);
        holder.address.setText("Address: "+personAddress);

    }

    @Override
    public int getItemCount() {
        return trustedPersonModel.size();
    }

    //view holder class
    class MyHolder extends RecyclerView.ViewHolder {

        TextView name, relation, contact, address;
        ImageView callButton;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.trusted_person_name);
            relation = itemView.findViewById(R.id.trusted_person_relation);
            contact = itemView.findViewById(R.id.trusted_person_contact);
            address = itemView.findViewById(R.id.trusted_person_adress);
            callButton = itemView.findViewById(R.id.trusted_person_call);
        }
    }

}
