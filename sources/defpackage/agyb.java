package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;

/* renamed from: agyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class agyb implements icb {
    static final icb a = new agyb();

    private agyb() {
    }

    public final void a(ConnectionResult connectionResult) {
        Log.e("RocketImpressions", String.format(Locale.US, "ClearcutLogger connection failed: %s", new Object[]{connectionResult}));
    }
}
