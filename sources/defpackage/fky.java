package defpackage;

/* renamed from: fky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fky implements fln {
    public static final fky a = new fky();
    public static final String[] b = {"account", "app", "key", "value"};
    public static final String[] c = {"TEXT NOT NULL", "TEXT NOT NULL", "TEXT NOT NULL", "TEXT"};
    public static final String[] d = {"PRIMARY KEY (account, app, key)"};
    public static final String[][] e = {new String[]{"account", "app", "key"}};

    private fky() {
    }

    public final String a() {
        return "credential_app_setting";
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
