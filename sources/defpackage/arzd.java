package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: arzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arzd {
    public static String a() {
        Locale b = b();
        int i = Build.VERSION.SDK_INT;
        return b.toLanguageTag();
    }

    public static Locale b() {
        if (Build.VERSION.SDK_INT >= 24) {
            return LocaleList.getDefault().get(0);
        }
        return Locale.getDefault();
    }

    public static String a(String str) {
        String str2 = "?";
        if (str.contains(str2)) {
            str2 = "&";
        }
        return str.concat(str2).concat("hl=").concat(a());
    }
}
