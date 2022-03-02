package defpackage;

/* renamed from: aysk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aysk implements aysj {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaBugFixesY2019w36__force_full_sync_when_already_exist_group_not_found_on_device", true);
        b = agvx.a(agvw, "FsaBugFixesY2019w36__initialize_gcm_task_service_when_reboot", true);
        c = agvx.a(agvw, "FsaBugFixesY2019w36__merge_to_one_of_multiple_synced_same_title_group", true);
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
