package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.feedback.ThemeSettings;

/* renamed from: jbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbn {
    public static ThemeSettings a(Context context) {
        int i;
        if (!jkr.e()) {
            int i2 = Build.VERSION.SDK_INT;
            i = 1;
        } else {
            i = 0;
        }
        int a = jkr.e() ? ThemeSettings.a(context, "android:colorAccent") : ThemeSettings.a(context);
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = i;
        themeSettings.b = a;
        return themeSettings;
    }
}
