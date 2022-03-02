package defpackage;

/* renamed from: aytm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aytm implements aytl {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaFirstFullSyncApiFeature__enable_log_of_get_first_full_sync_status", true);
        b = agvx.a(agvw, "FsaFirstFullSyncApiFeature__get_first_full_sync_status_enabled", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
