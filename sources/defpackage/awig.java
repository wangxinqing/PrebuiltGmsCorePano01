package defpackage;

/* renamed from: awig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awig implements awif {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.audit")).a();
        a = agvx.a(a2, "ConfigFeature__audit_record_maximum_size", 4096);
        b = agvx.a(a2, "ConfigFeature__cache_audit_record_maximum_count", 512);
        agvx.a(a2, "Config__catch_null_pointer_exception_only", true);
        c = agvx.a(a2, "Config__error_on_empty_requests_b137768454", true);
        d = agvx.a(a2, "Config__error_on_null_records_b137768454", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }
}
