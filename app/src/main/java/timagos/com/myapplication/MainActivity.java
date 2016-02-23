package timagos.com.myapplication;

import android.app.ListActivity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private Toolbar supportActionBar;

    private static String url = "joseniandroid.herokuapp.com/api/books";

    private static final String book_id = "id";
    private static final String book_title = "title";
    private static final String book_genre = "genre";
    private static final String book_author = "author";
    private static final String book_isRead = "isRead";

    ArrayList<HashMap<String, String>> bookList;
    private TextView booksTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



    }
    public Books getBooks(Uri uri, @NonNull String requestMethod) {
        String json = HttpUtils.getResponse(uri, requestMethod);


        JSONObject jsonObject = new JSONObject();
        Books books = new Books();

        try {
            books.setId(jsonObject.getString(book_id));
            books.setTitle(jsonObject.getString(book_title));
            books.setAuthor(jsonObject.getString(book_author));
            books.setGenre(jsonObject.getString(book_genre));
            books.setIsRead(jsonObject.getBoolean(book_isRead));

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
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

    public void setSupportActionBar(Toolbar supportActionBar) {
        this.supportActionBar = supportActionBar;
    }


}
