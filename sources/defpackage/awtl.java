package defpackage;

/* renamed from: awtl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awtl implements awtk {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.playlog.uploader").a("gms:playlog:metalogger:");
        agvx.a(a2, "ClearcutMetalog__get_storage_by_log_source", true);
        a = agvx.a(a2, "kill_switch", false);
        b = agvx.a(a2, "ClearcutMetalog__log_auth_token_status_by_log_source", true);
        c = agvx.a(a2, "ClearcutMetalog__log_corrupted_log_drop_reason", true);
        agvx.a(a2, "ClearcutMetalog__report_aggregated_storage", false);
        d = agvx.a(a2, "samples_per_counter", 200);
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
}
