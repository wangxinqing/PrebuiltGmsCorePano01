package defpackage;

/* renamed from: aywr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aywr implements aywq {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "MenagerieSyncFeature__deregister_gsync_subscription_for_chime", true);
        b = agvx.a(agvw, "MenagerieSyncFeature__enable_chime_for_tickle_sync", false);
        c = agvx.a(agvw, "MenagerieSyncFeature__periodic_sync_gcm_fix_enabled", false);
        d = agvx.a(agvw, "MenagerieSyncFeature__request_sync_operation_disabled", 0);
        e = agvx.a(agvw, "MenagerieSyncFeature__update_sync_time_on_skipped_enabled", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
