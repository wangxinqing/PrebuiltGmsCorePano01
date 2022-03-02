package defpackage;

/* renamed from: qmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qmc {
    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 15 + String.valueOf(str2).length());
        sb.append("<a href=\"");
        sb.append(str);
        sb.append("\">");
        sb.append(str2);
        sb.append("</a>");
        return sb.toString();
    }
}
