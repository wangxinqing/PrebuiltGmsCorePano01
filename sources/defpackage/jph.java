package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: jph  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jph {
    public static final Feature a = new Feature("asterism_consent", 3);
    public static final Feature b = new Feature("one_time_verification", 1);
    public static final Feature c;
    public static final Feature[] d;

    static {
        Feature feature = new Feature("carrier_auth", 1);
        c = feature;
        d = new Feature[]{a, b, feature};
    }
}
