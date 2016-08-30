package thirdpartylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by wangdongliang on 16/8/30.
 */
public class ThirdPartyUtility {
    private Context context;

    public ThirdPartyUtility(Context context) {
        this.context = context;
    }

    public void showToast(String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
