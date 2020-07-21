package sg.edu.rp.c346.id18016094.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Box> al;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewBox);
        al = new ArrayList<>();

        Box item1 = new Box (R.drawable.blue_box, R.drawable.orange_box, R.drawable.brown_box);
        al.add(item1);

        ca = new CustomAdapter(this, R.layout.row, al);
        lvContact.setAdapter(ca);
    }
}
