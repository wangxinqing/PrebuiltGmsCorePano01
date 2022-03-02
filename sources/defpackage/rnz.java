package defpackage;

import android.content.Context;
import android.provider.Settings;

/* renamed from: rnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rnz implements rnq {
    static final rnq a = new rnz();

    private rnz() {
    }

    public final Object a(Context context) {
        int i = roa.i;
        return Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed");
    }
}
