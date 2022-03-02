package defpackage;

/* renamed from: aysw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aysw implements aysv {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaBugFixesY2019w49__check_cursor_move_success_in_contacts_counter", true);
        b = agvx.a(agvw, "FsaBugFixesY2019w49__dump_contacts_count_enabled", true);
        c = agvx.a(agvw, "FsaBugFixesY2019w49__stop_log_sheepdog_sweep_as_googlified_contacts_enabled", true);
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
