package defpackage;

/* renamed from: awqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awqi implements awqh {
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
        agvw agvw = new agvw(agvj.a("com.google.android.gms.car"));
        a = agvx.a(agvw, "always_route_dnd_rule_to_driving_mode", false);
        agvx.a(agvw, "copy_driving_mode_settings", false);
        b = agvx.a(agvw, "driving_mode_activity_transition_allow_test_events", false);
        c = agvx.a(agvw, "driving_mode_activity_transition_allowed_behaviors", "car_pref_key_driving_mode_behavior_dnd_preference");
        d = agvx.a(agvw, "driving_mode_activity_transition_auto_launch", false);
        e = agvx.a(agvw, "driving_mode_client_api_enabled", false);
        f = agvx.a(agvw, "driving_mode_setting_enabled", false);
        g = agvx.a(agvw, "driving_mode_toggle_whitelist", "com.google.android.gms,com.google.android.projection.gearhead");
        agvx.a(agvw, "enable_driving_mode_exit_with_audio_fusion", false);
        h = agvx.a(agvw, "enable_driving_mode_with_audio_fusion", false);
        i = agvx.a(agvw, "force_driving_mode_frx_rerun", false);
        j = agvx.a(agvw, "only_rely_on_audio_based_activity_recognition", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final String c() {
        return (String) c.c();
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

    public final String g() {
        return (String) g.c();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) i.c()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) j.c()).booleanValue();
    }
}
