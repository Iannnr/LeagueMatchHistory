package portfolio.ian.com.leaguematchhistory.Constants;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ian on 04/12/2015.
 */
public class ToastMessage {
    public static void message(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
