package assaf.zfani.adapterlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getView() - פונקציה חשובה שמחזירה וויו
        //getCount() - כמה פריטים
        // cursor = database
        final String[] days = new String[]{"sun","mon","tus","wen"};
        ListView listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> myAdapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView currentView = (TextView)view;
               //Option A: Toast.makeText(MainActivity.this,currentView.getText().toString(),Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,days[position],Toast.LENGTH_LONG).show();
                 

            }
        });
    }
}
