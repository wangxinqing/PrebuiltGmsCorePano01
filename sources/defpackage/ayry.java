package defpackage;

/* renamed from: ayry  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayry implements ayrx {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaBugFixesY2019w21__clean_up_preferences_on_account_remove_enabled", true);
        b = agvx.a(agvw, "FsaBugFixesY2019w21__skip_prepare_sync_when_account_removal", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
