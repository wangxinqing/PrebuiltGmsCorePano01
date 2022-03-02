package defpackage;

/* renamed from: hsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hsg {
    static boolean a(String str) {
        int length;
        if (str == null || (length = str.length()) == 0 || length > 64) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'A' || charAt > 'Z') && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                return false;
            }
        }
        return true;
    }
}
