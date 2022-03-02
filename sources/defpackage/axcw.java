package defpackage;

/* renamed from: axcw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axcw implements axcv {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms")).a("gms:chimera:");
        a = agvx.a(a2, "SyncUpdateService__enable_sync_update_service", false);
        b = agvx.a(a2, "SyncUpdateService__force_update_now_on_download_failure", true);
        agvx.a(a2, "SyncUpdateService__test_notify_pending_update_delay", 0);
        agvx.a(a2, "SyncUpdateService__test_notify_pending_update_status", 0);
        c = agvx.a(a2, "SyncUpdateService__wait_for_phenotype_commit_timeout_seconds", 10);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }
}
