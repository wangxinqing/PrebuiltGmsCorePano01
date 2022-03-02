package defpackage;

/* renamed from: axcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axcq implements axcp {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a("gms:shush_native:");
        a = agvx.a(a2, "ShushNative__shush_native_crashes_enabled", false);
        b = agvx.a(a2, "ShushNative__shush_native_crashes_reporter_poll_millis", 100);
        c = agvx.a(a2, "ShushNative__shush_native_crashes_reporter_timeout_millis", 500);
        d = agvx.a(a2, "ShushNative__shush_native_crashes_reportermax_files_limit", 5);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }
}
