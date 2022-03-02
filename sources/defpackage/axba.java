package defpackage;

/* renamed from: axba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axba implements axaz {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms"));
        a = agvx.a(agvw, "ProtoDataStoreFeature__dasu_sampling_interval", 0);
        b = agvx.a(agvw, "ProtoDataStoreFeature__enable_accounts_in_factory", false);
        c = agvx.a(agvw, "ProtoDataStoreFeature__enable_signalling_account_manager", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
