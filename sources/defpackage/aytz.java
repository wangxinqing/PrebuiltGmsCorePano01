package defpackage;

/* renamed from: aytz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aytz implements ayty {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaNewTickleSyncFeature__enable_new_tickle_sync", false);
        b = agvx.a(agvw, "FsaNewTickleSyncFeature__maximum_time_to_fetch_account_obfuscatedgaia_id_in_tickle_sync", 3000);
        c = agvx.a(agvw, "FsaNewTickleSyncFeature__remove_gsync_subscription_in_tickle_sync", true);
        d = agvx.a(agvw, "FsaNewTickleSyncFeature__seconds_to_invalidate_account_gaia_cache", 86400);
        e = agvx.a(agvw, "FsaNewTickleSyncFeature__sync_all_accounts_when_no_account_name_present_in_tickle_sync", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
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
