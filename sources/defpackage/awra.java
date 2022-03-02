package defpackage;

/* renamed from: awra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awra implements awqz {
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
        agvw a2 = new agvw(agvj.a("com.google.android.gms.car")).a("gearhead:");
        a = agvx.a(a2, "bt_autolaunch_allowed_devices", "PROF=[],MAJ=400;PROF=[],MAJ=500;PROF*=110b;PROF*=111e;PROF*=1108");
        b = agvx.a(a2, "delayed_autostart_timeout", 180000);
        c = agvx.a(a2, "driving_mode_behavior_whitelist", "com.google.android.projection.bumblebee,com.google.android.gms");
        agvx.a(a2, "driving_mode_config_copier_delay_ms", 30000);
        d = agvx.a(a2, "driving_mode_ignore_non_bonded_devices", true);
        e = agvx.a(a2, "driving_mode_launch_notification_cancel_delay_ms", 1800000);
        f = agvx.a(a2, "driving_mode_launch_notification_countdown_ms", 15000);
        g = agvx.a(a2, "driving_mode_launch_notification_snooze_duration_ms", 60000);
        h = agvx.a(a2, "driving_mode_prompt_enabled", true);
        i = agvx.a(a2, "drivingmode_gearhead_version", 31000000);
        j = agvx.a(a2, "enable_vehicle_exit_transition_on_foot", true);
    }

    public final String a() {
        return (String) a.c();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final String c() {
        return (String) c.c();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final long g() {
        return ((Long) g.c()).longValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final long i() {
        return ((Long) i.c()).longValue();
    }

    public final boolean j() {
        return ((Boolean) j.c()).booleanValue();
    }
}
