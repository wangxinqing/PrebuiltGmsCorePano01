package defpackage;

import android.os.Build;
import java.util.Locale;

/* renamed from: oal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oal {
    public static String a() {
        Locale locale = Locale.getDefault();
        int i = Build.VERSION.SDK_INT;
        return locale.toLanguageTag();
    }
}
