package defpackage;

/* renamed from: ankq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ankq {
    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str.concat(" must not be null"));
    }

    public static boolean a(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return c >= 'A' && c <= 'Z';
    }
}
