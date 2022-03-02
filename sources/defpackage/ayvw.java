package defpackage;

/* renamed from: ayvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayvw implements ayvv {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "MenagerieImagesApiFeature__base_load_remote_image_operation_disabled", 0);
        b = agvx.a(agvw, "MenagerieImagesApiFeature__load_avatar_by_reference_operation_disabled", 0);
        c = agvx.a(agvw, "MenagerieImagesApiFeature__load_avatar_by_url_operation_disabled", 0);
        d = agvx.a(agvw, "MenagerieImagesApiFeature__load_by_reference_disabled_for_cp2_focus_alt", false);
        e = agvx.a(agvw, "MenagerieImagesApiFeature__load_by_reference_disabled_for_cp2_raw_contact_id", false);
        agvx.a(agvw, "MenagerieImagesApiFeature__load_by_reference_disabled_for_plus_page_profile", false);
        agvx.a(agvw, "MenagerieImagesApiFeature__load_contact_image_by_contact_id_operation_disabled", 2);
        agvx.a(agvw, "MenagerieImagesApiFeature__load_people_for_aggregation_operation_disabled", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
