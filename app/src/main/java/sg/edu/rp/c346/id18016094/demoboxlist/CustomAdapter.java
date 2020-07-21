package sg.edu.rp.c346.id18016094.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Box> contactList;

    public CustomAdapter(Context context, int resource, ArrayList<Box> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView blue = rowView.findViewById(R.id.imageViewBlue);
        ImageView orange = rowView.findViewById(R.id.imageViewOrange);
        ImageView brown = rowView.findViewById(R.id.imageViewBrown);

        blue.setImageResource(R.drawable.blue_box);
        orange.setImageResource(R.drawable.orange_box);
        brown.setImageResource(R.drawable.brown_box);

        return rowView;
    }
}