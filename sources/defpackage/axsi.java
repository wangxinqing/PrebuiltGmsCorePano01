package defpackage;

/* renamed from: axsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axsi implements axsh {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing"));
        a = agvx.a(agvw, "PriorityUpload__action_type_whitelist", "");
        b = agvx.a(agvw, "gms_icing_enable_priority_upload_feature", false);
        c = agvx.a(agvw, "PriorityUpload__priority_upload_sample_interval", 1);
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }
}
