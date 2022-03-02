package defpackage;

/* renamed from: fkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fkx implements fln {
    public static final fkx a = new fkx();
    public static final String[] b = {"account", "key", "value"};
    public static final String[] c = {"TEXT NOT NULL", "TEXT NOT NULL", "TEXT"};
    public static final String[] d = {"PRIMARY KEY (account, key)"};
    public static final String[][] e = {new String[]{"account", "key"}};

    private fkx() {
    }

    public final String a() {
        return "credential_setting";
    }

    public final String[] b() {
        return b;
    }

    public final String[] c() {
        return c;
    }

    public final String[] d() {
        return d;
    }

    public final String[][] e() {
        return e;
    }
}
