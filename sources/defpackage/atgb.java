package defpackage;

/* renamed from: atgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgb {
    public static String a(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }
}
