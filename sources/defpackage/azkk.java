package defpackage;

/* renamed from: azkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azkk implements azkj {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        a = agvx.a(agvw, "EsimSupport__persisted_data_window_secs", 172800);
        b = agvx.a(agvw, "source_supports_esim_seamless_transfer", false);
        agvx.a(agvw, "target_supports_esim_seamless_transfer", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
