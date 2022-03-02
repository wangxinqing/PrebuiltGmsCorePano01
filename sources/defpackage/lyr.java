package defpackage;

import java.util.Arrays;

/* renamed from: lyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lyr {
    public static final boolean a(String str) {
        return !a(str, axff.a.a().f());
    }

    public static boolean a(String str, String str2) {
        if (str2 != null) {
            return Arrays.asList(str2.split(",")).contains(str);
        }
        return false;
    }
}
