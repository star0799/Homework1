package idv.star.homework1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private EditText etName;
    private EditText etPhone;
    private Button btnSubmit;
    private CheckBox cbSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

    }

    private void findViews(){
        etName=(EditText)findViewById(R.id.etName);
        etPhone=(EditText)findViewById(R.id.etPhone);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        cbSave=(CheckBox)findViewById(R.id.cbSave);
        btnSubmit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString();
                String phone = etPhone.getText().toString();
                String message=getResources().getString(R.string.ShowName)+" "+name+"\n"+
                        getResources().getString(R.string.ShowPhone)+" "+phone+"\n";
                if(cbSave.isChecked()){
                message+=getResources().getString(R.string.ShowSave).toString();
                }
                Toast.makeText(MainActivity.this,message, Toast.LENGTH_SHORT)
                        .show();
            }
        });


        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
