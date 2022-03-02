package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: wku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wku {
    public static final Feature a = new Feature("bulk_lookup_api", 2);
    public static final Feature b = new Feature("backup_and_sync_api", 3);
    public static final Feature c = new Feature("backup_and_sync_suggestion_api", 1);
    public static final Feature d = new Feature("sync_high_res_photo_api", 1);
    public static final Feature e = new Feature("get_first_full_sync_status_api", 1);
    public static final Feature f;
    public static final Feature[] g;

    static {
        Feature feature = new Feature("account_categories_api", 1);
        f = feature;
        g = new Feature[]{a, b, c, d, e, feature};
    }
}
