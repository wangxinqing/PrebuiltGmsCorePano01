package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: xdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xdt {
    public static String a(String str, Object... objArr) {
        try {
            Locale locale = Locale.US;
            for (int i = 0; i < objArr.length; i++) {
                String str2 = objArr[i];
                if (str2 instanceof Bundle) {
                    StringBuilder sb = new StringBuilder();
                    xds.a((Bundle) str2, "", sb);
                    str2 = sb.toString();
                }
                objArr[i] = str2;
            }
            return String.format(locale, str, objArr);
        } catch (IllegalFormatException e) {
            String format = String.format(Locale.US, "Error formatting log string. fmtMessage:%s params: [%s]", new Object[]{str, TextUtils.join(", ", objArr)});
            Log.e("PeopleModuleLog", format, e);
            return format;
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        Log.e(str, a(str2, objArr));
    }

    public static void a(String str, String str2, int i) {
        Log.i(str, a(str2, Integer.valueOf(i)));
    }

    public static void a(String str, String str2, int i, int i2) {
        Log.i(str, a(str2, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void a(String str, String str2, Object obj) {
        Log.i(str, a(str2, obj));
    }

    public static void a(String str, String str2, Object obj, Object obj2) {
        Log.i(str, a(str2, obj, obj2));
    }

    public static void a(String str, String str2, Object... objArr) {
        Log.w(str, a(str2, objArr));
    }
}
