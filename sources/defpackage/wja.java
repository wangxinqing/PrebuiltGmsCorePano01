package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: wja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wja {
    public static String a(Context context) {
        if (jkr.c()) {
            return context.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        }
        int i = Build.VERSION.SDK_INT;
        return context.getResources().getConfiguration().locale.toLanguageTag();
    }
}
