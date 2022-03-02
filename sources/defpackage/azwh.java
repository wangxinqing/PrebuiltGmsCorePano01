package defpackage;

/* renamed from: azwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azwh implements azwg {
    public static final agvx a;

    static {
        agvw a2 = new agvw("com.google.android.westworld").a("gms:westworld:");
        agvx.a(a2, "separate_configs", true);
        agvx.a(a2, "use_active_config_list", true);
        a = agvx.a(a2, "use_persist_locally", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
