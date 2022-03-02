package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: ydy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydy {
    public static final Feature a = new Feature("set_dimensions_api", 1);
    public static final Feature b = new Feature("get_serving_version_api", 1);
    public static final Feature c = new Feature("get_experiment_tokens_api", 1);
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("sync_after_api", 1);
        d = feature;
        e = new Feature[]{a, b, c, feature};
    }
}
