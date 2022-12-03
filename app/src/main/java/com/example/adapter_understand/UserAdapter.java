package com.example.adapter_understand;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.adapter_understand.databinding.RowUserLayoutBinding;

import java.util.List;

public class UserAdapter extends ArrayAdapter {

    private Context context;

    //if we need to pass obj from another screen we need to pass obj
//    public UserAdapter(@NonNull Context context, int resource, @NonNull List userList) {
//        super(context, resource, userList);
//    }

    //but this time we dont need it
    public UserAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = context;
    }

    @Override
    public int getCount() {
        return User.userList.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //This one is so simple not for recycle yet
        View view = convertView;


        if (convertView == null) {
//            for simple way
            view = LayoutInflater.from(context).inflate(R.layout.row_user_layout, parent, false);

//            for view binding
//            view = binding.getRoot();

            ((TextView)view.findViewById(R.id.nameTv)).setText(User.userList.get(position).getName());
            ((TextView)view.findViewById(R.id.emailTv)).setText(User.userList.get(position).getEmail());
            ((TextView)view.findViewById(R.id.programTv)).setText(User.userList.get(position).getProgram());


            return view;
        } else {
            return super.getView(position, convertView, parent);
        }

//        TextView nameTv = view.findViewById(R.id.nameTv);
//        TextView emailTv = view.findViewById(R.id.emailTv);



        //for view binding
//        RowUserLayoutBinding binding = RowUserLayoutBinding.inflate(LayoutInflater.from(context));
//
//        binding.nameTv.setText(User.userList.get(position).getName());
//        binding.emailTv.setText(User.userList.get(position).getEmail());
//        binding.programTv.setText(User.userList.get(position).getProgram());
//
//
//        return binding.getRoot();
    }
}
