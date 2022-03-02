package defpackage;

/* renamed from: azuq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azuq implements azup {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw("com.google.android.westworld").a("gms:westworld:");
        agvx.a(a2, "baseline_enabled", false);
        agvx.a(a2, "use_new_checkbox_consent", false);
        a = agvx.a(a2, "force_multi_user_as_opted_out", false);
        b = agvx.a(a2, "metadata_enabled", true);
        c = agvx.a(a2, "metrics_enabled", true);
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
}
