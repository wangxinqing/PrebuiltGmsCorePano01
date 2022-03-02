package defpackage;

/* renamed from: nvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvr {
    public static final anax a = anax.a("INSTALL_ASSET", "REMOVE_ASSET", "DECLINE_ASSET", "UPDATES_AVAILABLE", "SERVER_NOTIFICATION");
    private static final anaf d;
    public final String b;
    public final ntx c;

    static {
        anab anab = new anab();
        anab.a("android.intent.category.MASTER_CLEAR", "android");
        anab.a("android.server.checkin.CHECKIN", "com.google.android.gms");
        anab.a("com.google.android.gsf.subscribedfeeds", "com.google.android.gsf");
        anab.a("INSTALL_ASSET", "com.android.vending");
        anab.a("REMOVE_ASSET", "com.android.vending");
        anab.a("SERVER_NOTIFICATION", "com.android.vending");
        anab.a("DECLINE_ASSET", "com.android.vending");
        anab.a("com.google.android.gsf", "com.google.android.gsf");
        anab.a("com.google.android.apps.googlevoice.INBOX_NOTIFICATION", "com.google.android.apps.googlevoice");
        d = anab.a();
    }

    private nvr(String str, int i) {
        iva.a((Object) str);
        this.b = str;
        this.c = ntx.a(a(), i);
    }

    public static nvr a(amnc amnc) {
        return new nvr(amnc.e, (int) amnc.k);
    }

    public final boolean b() {
        return d.containsKey(this.b);
    }

    public final boolean c() {
        return "GSYNC_TICKLE".equals(this.b);
    }

    public final String a() {
        if (b()) {
            return (String) d.get(this.b);
        }
        return !c() ? this.b : "com.google.android.gsf";
    }
}
