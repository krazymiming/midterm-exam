package timagos.com.myapplication;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Louie on 23/02/2016.
 */
public class BooksApi extends AppCompatActivity {

    private static String url = "joseniandroid.herokuapp.com/api/books";

    private static final String book_id = "id";
    private static final String book_title = "title";
    private static final String book_genre = "genre";
    private static final String book_author = "author";
    private static final String book_isRead = "isRead";

    public static Bookss getBooks(Uri uri, @NonNull String requestMethod) {
        String json = HttpUtils.getResponse(uri, requestMethod);

        JSONObject jsonObject = new JSONObject();
        Bookss books = new Bookss();

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


}
