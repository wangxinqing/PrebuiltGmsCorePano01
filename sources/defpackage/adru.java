package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: adru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adru {
    public static final Feature a = new Feature("usage_and_diagnostics_listener", 1);
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("usage_and_diagnostics_consents", 1);
        b = feature;
        c = new Feature[]{a, feature};
    }
}
