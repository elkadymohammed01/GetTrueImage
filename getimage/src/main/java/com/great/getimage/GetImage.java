package com.great.getimage;

import android.content.Context;
import android.widget.ImageView;

public class GetImage {
    public static void FireBase(Integer pos, ImageView imageView, Context context,String path){
        if(!GetTrueImage.map.containsKey(pos)){
        GetTrueImage trueImage=new GetTrueImage(pos,imageView,context);
        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference storageRef = storage.getReference();
        StorageReference islandRef = storageRef.child(path);
        islandRef.getDownloadUrl().addOnSuccessListener(trueImage);}
        else{
            Glide.with(context).load(GetTrueImage.map.get(pos)).into(imageView);
        }
    }
}
