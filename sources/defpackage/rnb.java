package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: rnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rnb extends BroadcastReceiver {
    final /* synthetic */ rnc a;

    public rnb(rnc rnc) {
        this.a = rnc;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.location.MODE_CHANGED".equals(intent.getAction())) {
            int i = 0;
            boolean booleanExtra = intent.getBooleanExtra("android.location.extra.LOCATION_ENABLED", false);
            rnc rnc = this.a;
            if (booleanExtra) {
                i = 3;
            }
            rnc.a(i);
        }
    }
}
