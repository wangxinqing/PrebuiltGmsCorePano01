package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: wxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxh {
    public static Integer a(wwj wwj, int i) {
        String a = wwj.a(i);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException e) {
            Log.w("ContactData", String.format(Locale.US, "Invalid ID: %s[%d] = %s", new Object[]{wwj.c, Integer.valueOf(i), a}), e);
            return null;
        }
    }

    public static String b(String str) {
        if (a(str)) {
            return str.substring(2);
        }
        return null;
    }

    public static Set c(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        return hashSet;
    }

    public static boolean d(String str) {
        return str != null && str.startsWith("f:");
    }

    public static boolean e(String str) {
        return str != null && str.startsWith("p:");
    }

    public static String f(String str) {
        if (d(str)) {
            return str.substring(2);
        }
        return null;
    }

    public static String g(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("f:") : "f:".concat(valueOf);
    }

    public static String h(String str) {
        if (e(str)) {
            return str.substring(2);
        }
        return null;
    }

    public static boolean a(String str) {
        return str != null && str.startsWith("c:");
    }
}
