package defpackage;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: nx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nx {
    static {
        new Locale("", "");
    }

    public static int a(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
