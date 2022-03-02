package defpackage;

/* renamed from: axtt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axtt implements axts {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.icing.mdh")).a();
        a = agvx.a(a2, "FootprintsFeature__enable_filtering_for_latest_footprints_sync", false);
        b = agvx.a(a2, "FootprintsFeature__enable_upload_changes_count_limit", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
