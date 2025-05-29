package com.example.mrmoveisAPP.app.Repository;

import android.provider.ContactsContract;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mrmoveisAPP.app.Domain.CategoriasDomain;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class MainRepository {
    private final FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

    private LiveData<ArrayList<CategoriasDomain>> loadCategorias() {
        MutableLiveData<ArrayList<CategoriasDomain>> mutableLiveData = new MutableLiveData<>();
        DatabaseReference ref=firebaseDatabase.getReference("categorias");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                ArrayList<CategoriasDomain> list = new ArrayList<>();
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    CategoriasDomain item=childSnapshot.getValue(CategoriasDomain.class);
                    if (item != null) list.add(item);
                }
                listData.setValue(list);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        return listData;
    }
}
