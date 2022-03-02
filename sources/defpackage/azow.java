package defpackage;

/* renamed from: azow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azow implements azov {
    public static final agvx a;

    static {
        agvw a2 = new agvw("com.google.android.metrics").a("gms:stats:");
        a = agvx.a(a2, "add_external_experiment_ids", true);
        agvx.a(a2, "clearcut_add_external_ids_log_source_BATTERY_STATS", true);
        agvx.a(a2, "clearcut_add_external_ids_log_source_DROP_BOX", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
