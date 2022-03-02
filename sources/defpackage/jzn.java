package defpackage;

import android.text.TextUtils;

/* renamed from: jzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jzn {
    public static boolean a(int i) {
        return i == 1;
    }

    public static boolean b(int i) {
        return i == 0 || i == 1;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 65536;
    }
}
