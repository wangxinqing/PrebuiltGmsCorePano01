package defpackage;

/* renamed from: aznw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aznw implements aznv {
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
        agvw agvw = new agvw(agvj.a("com.google.android.metrics"));
        a = agvx.a(agvw, "EastworldError__eastworld_error_interval", 3600000);
        b = agvx.a(agvw, "Eastworld__enable_eastworld_error_processor", false);
        c = agvx.a(agvw, "EastworldError__enable_log_eastworld_first", false);
        d = agvx.a(agvw, "EastworldError__error_eastworld_qos_tier", 0);
        e = agvx.a(agvw, "EastworldError__handle_previous_day_metrics", true);
        f = agvx.a(agvw, "EastworldError__ignore_empty_logs", false);
        g = agvx.a(agvw, "EastworldError__ignore_package_version", true);
        h = agvx.a(agvw, "EastworldError__include_daily_errors", false);
        i = agvx.a(agvw, "EastworldError__include_totals", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
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

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) i.c()).booleanValue();
    }
}
