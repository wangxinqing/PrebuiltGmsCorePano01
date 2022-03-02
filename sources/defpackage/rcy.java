package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: rcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rcy {
    public static final Feature a = new Feature("name_ulr_private", 1);
    public static final Feature b = new Feature("name_sleep_segment_request", 1);
    public static final Feature c = new Feature("support_context_feature_id", 1);
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("get_current_location", 1);
        d = feature;
        e = new Feature[]{a, b, c, feature};
    }
}
