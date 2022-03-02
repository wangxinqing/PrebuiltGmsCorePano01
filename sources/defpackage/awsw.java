package defpackage;

/* renamed from: awsw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awsw implements awsv {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.playlog.uploader").a("gms:playlog:debug:");
        a = agvx.a(a2, "disable_log_operation", false);
        b = agvx.a(a2, "disable_log_operation_scheduling", false);
        c = agvx.a(a2, "disable_log_persistence", false);
        d = agvx.a(a2, "record_simulation_events", false);
        e = agvx.a(a2, "skip_phenotype_commit", false);
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
}
