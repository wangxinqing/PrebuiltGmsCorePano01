package defpackage;

/* renamed from: ayqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayqh implements ayqg {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;
    public static final agvx i;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.update")).b();
        a = agvx.a(b2, "update_experiment_enable", false);
        b = agvx.a(b2, "update_experiment_enable_heart_beat_event_logging_post_update", false);
        c = agvx.a(b2, "update_experiment_enable_system_update_event_logging_post_update", false);
        d = agvx.a(b2, "update_experiment_heart_beat_log_max_delay_sec", 432000);
        e = agvx.a(b2, "update_experiment_heart_beat_log_min_delay_sec", 259200);
        f = agvx.a(b2, "update_experiment_id", "");
        g = agvx.a(b2, "update_experiment_keep_exp_id_magic_word", "KEEP");
        h = agvx.a(b2, "update_experiment_log_source", "ANDROID_OTA");
        i = agvx.a(b2, "update_experiment_name_space", "");
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

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final String f() {
        return (String) f.c();
    }

    public final String g() {
        return (String) g.c();
    }

    public final String h() {
        return (String) h.c();
    }

    public final String i() {
        return (String) i.c();
    }
}
