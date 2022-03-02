package defpackage;

/* renamed from: azla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azla implements azkz {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        a = agvx.a(agvw, "Nearby__remove_google_settings_instruction", true);
        b = agvx.a(agvw, "Nearby__retry_attempts", 0);
        c = agvx.a(agvw, "Nearby__use_connect2", false);
        d = agvx.a(agvw, "Nearby__use_real_target_device_type", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
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
