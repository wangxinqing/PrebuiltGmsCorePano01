package defpackage;

/* renamed from: acqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acqc {
    public static String a(String str) {
        iva.a((Object) str);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    public static String b(String str) {
        return (amrk.b(str).length() < 2 || str == null || !str.startsWith("\"") || !str.endsWith("\"")) ? str : str.substring(1, str.length() - 1);
    }
}
