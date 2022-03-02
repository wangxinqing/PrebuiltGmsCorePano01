package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: oqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oqd {
    public static final Feature a = new Feature("mdh_read_sync_status", 1);
    public static final Feature b = new Feature("mdh_time_series_write", 1);
    public static final Feature c = new Feature("mdh_broadcast_listeners", 1);
    public static final Feature d = new Feature("mdd_download_right_now", 1);
    public static final Feature e = new Feature("mdd_delayed_download", 1);
    public static final Feature f = new Feature("mobstore_write_api", 1);
    public static final Feature g;
    public static final Feature[] h;

    static {
        Feature feature = new Feature("mobstore_rename", 1);
        g = feature;
        h = new Feature[]{a, b, c, d, e, f, feature};
    }
}
