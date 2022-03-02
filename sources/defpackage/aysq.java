package defpackage;

/* renamed from: aysq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aysq implements aysp {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaBugFixesY2019w42__keep_sync_proxy_alive_when_bulk_insert_contacts", true);
        b = agvx.a(agvw, "FsaBugFixesY2019w42__log_contact_count_between_sync_down_and_up", true);
        c = agvx.a(agvw, "FsaBugFixesY2019w42__set_email_display_name_field", false);
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
