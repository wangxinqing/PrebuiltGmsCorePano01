package defpackage;

/* renamed from: awzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awzb implements awza {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw("direct_boot:gms_chimera_phenotype_flags");
        a = agvx.a(agvw, "DirectBoot__enable_new_user_unlocked", true);
        b = agvx.a(agvw, "DirectBoot__enable_process_restart_on_direct_boot_exit", false);
        c = agvx.a(agvw, "DirectBoot__read_device_prefs_first", true);
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
