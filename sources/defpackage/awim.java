package defpackage;

/* renamed from: awim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awim implements awil {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.audit")).a();
        a = agvx.a(a2, "ConfigFeature__log_audit_records_events", true);
        b = agvx.a(a2, "Log__log_cache_event_database_corrupted", true);
        c = agvx.a(a2, "Log__log_cache_event_delete_corrupt_entry", true);
        d = agvx.a(a2, "ConfigFeature__log_cache_events", true);
        e = agvx.a(a2, "ConfigFeature__log_cache_stats", true);
        f = agvx.a(a2, "ConfigFeature__log_upload_events", true);
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
}
