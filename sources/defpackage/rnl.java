package defpackage;

import android.content.Context;
import android.provider.Settings;

/* renamed from: rnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rnl implements rnq {
    static final rnq a = new rnl();

    private rnl() {
    }

    public final Object a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed");
    }
}
