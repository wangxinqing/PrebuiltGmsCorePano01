package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Locale;

/* renamed from: adcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adcp {
    public static String a(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        int i = Build.VERSION.SDK_INT;
        return locale.toLanguageTag();
    }
}
