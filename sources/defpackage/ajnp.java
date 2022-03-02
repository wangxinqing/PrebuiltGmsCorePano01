package defpackage;

import com.google.android.gms.R;

/* renamed from: ajnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnp {
    public static int a(int i) {
        if (i != 1) {
            return i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.string.common_unknown : R.string.location_settings_ulr_summary_auth_error : R.string.location_settings_ulr_summary_error : R.string.location_settings_ulr_summary_offline : R.string.location_settings_ulr_summary_loading;
        }
        ajix.c("GCoreUlr", 43, "Caller must handle DEFINED itself");
        return R.string.common_unknown;
    }
}
