package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: zrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zrb {
    public static final Feature a = new Feature("gms_restore_api", 1);
    public static final Feature b = new Feature("gms_restore_info_api", 1);
    public static final Feature c;
    public static final Feature[] d;

    static {
        Feature feature = new Feature("gms_cache_preview_api", 1);
        c = feature;
        d = new Feature[]{a, b, feature};
    }
}
