package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.location.activity.ActivityRecognitionHelper$LastActivityReceiver;
import java.util.List;

/* renamed from: ahjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjj {
    public final jkb a;
    public volatile ActivityRecognitionResult b;
    private final BroadcastReceiver c = new ActivityRecognitionHelper$LastActivityReceiver(this);
    private final Context d;

    public ahjj(Context context) {
        this.d = context;
        this.a = jkb.a(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.location.activity.ACTIVITY_RESULT");
        alv.a(this.d).a(this.c, intentFilter);
    }

    public static boolean a(String str, String str2) {
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || str == null) {
            return false;
        }
        List list = null;
        if (str.equalsIgnoreCase("com.google.android.gms") && str2 != null) {
            if (!TextUtils.isEmpty(axxd.g())) {
                list = amsk.a(';').c(axxd.g());
            }
            if (list == null || !list.contains(str2)) {
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(axxd.f())) {
            list = amsk.a(';').c(axxd.f());
        }
        if (list == null || !list.contains(str)) {
            return false;
        }
        return true;
    }
}
