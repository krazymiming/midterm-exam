package timagos.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


/**
 * Created by Louie on 23/02/2016.
 */
public class BooksList extends AppCompatActivity {
    private int contentView;
    private TextView booksTitle;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        booksTitle = (TextView) findViewById(R.id.title);
        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("title");
        booksTitle.setText(mTitle);
    }
}
