package defpackage;

/* renamed from: rpb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rpb {
    public static String a(String str, int i) {
        String num = Integer.toString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15 + String.valueOf(num).length());
        sb.append("opt-in-status-");
        sb.append(str);
        sb.append("-");
        sb.append(num);
        return sb.toString();
    }
}
