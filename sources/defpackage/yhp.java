package defpackage;

/* renamed from: yhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhp {
    static final String[] a = {"flagType", "name", "intVal", "boolVal", "floatVal", "stringVal", "extensionVal", "packageName", "user", "committed"};
    public String b;
    public final String c;
    public final String d;
    public final String e;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public yhp(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    static boolean a(String str, String str2) {
        if (str.endsWith("*")) {
            return str2.startsWith(str.substring(0, str.length() - 1));
        }
        return str.equals(str2);
    }
}
