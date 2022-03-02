package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: adty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adty {
    public static final Feature a = new Feature("check_in", 1);
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("placefencing", 1);
        b = feature;
        c = new Feature[]{a, feature};
    }
}
