package defpackage;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.R;

/* renamed from: ahoo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahoo {
    public static int a = 0;

    public static String a(Context context, iwq iwq) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        String string = context.getString(R.string.dnd_driving);
        return iwq.a(new AutomaticZenRule(string, new ComponentName(context.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider"), new Uri.Builder().scheme("condition").authority(context.getPackageName()).appendPath(Boolean.toString(true)).appendPath(Integer.toString((int) aycw.c())).appendQueryParameter("provider", string).build(), (int) aycw.c(), true));
    }
}
