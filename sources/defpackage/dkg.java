package defpackage;

/* renamed from: dkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dkg {
    public static String a(int i) {
        return a("pi", i);
    }

    public static String a(String str, int i) {
        if (i > 0) {
            StringBuilder sb = new StringBuilder(str.length() + 11);
            sb.append(str);
            sb.append(i);
            return sb.toString();
        }
        dph.a("index out of range for prefix", str);
        return "";
    }
}
