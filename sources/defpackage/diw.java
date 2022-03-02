package defpackage;

/* renamed from: diw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class diw {
    public static String a(int i, String str) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(str);
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }
}
