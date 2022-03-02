package defpackage;

/* renamed from: aywu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aywu implements aywt {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;
    public static final agvx i;
    public static final agvx j;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "MenagerieSyncLogging__menagerie_log_container_updates_from_manual_syncs_enabled", false);
        b = agvx.a(agvw, "MenagerieSyncLogging__menagerie_log_database_downgrade_from_manual_syncs_enabled", false);
        c = agvx.a(agvw, "MenagerieSyncLogging__menagerie_log_database_upgrade_from_manual_syncs_enabled", false);
        d = agvx.a(agvw, "MenagerieSyncLogging__menagerie_log_last_successful_full_sync_timestamp_enabled", false);
        e = agvx.a(agvw, "MenagerieSyncLogging__menagerie_log_last_successful_periodic_sync_timestamp_enabled", false);
        f = agvx.a(agvw, "MenagerieSyncLogging__menagerie_log_last_sync_timestamp_enabled", false);
        g = agvx.a(agvw, "MenagerieSyncLogging__menagerie_log_network_type_enabled", false);
        h = agvx.a(agvw, "MenagerieSyncLogging__menagerie_log_sync_db_transactions_v27_enabled", false);
        i = agvx.a(agvw, "MenagerieSyncLogging__menagerie_log_sync_db_transactions_v27_sample_rate", 0.01d);
        j = agvx.a(agvw, "MenagerieSyncLogging__menagerie_log_sync_skip_fresh_data", false);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final double i() {
        return ((Double) i.c()).doubleValue();
    }

    public final boolean j() {
        return ((Boolean) j.c()).booleanValue();
    }
}
