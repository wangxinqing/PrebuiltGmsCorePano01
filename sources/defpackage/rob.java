package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: rob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rob extends BroadcastReceiver {
    final /* synthetic */ roc a;

    public rob(roc roc) {
        this.a = roc;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("android.location.extra.PROVIDER_NAME");
            boolean booleanExtra = intent.getBooleanExtra("android.location.extra.PROVIDER_ENABLED", false);
            if (stringExtra != null) {
                this.a.a(stringExtra, booleanExtra);
            }
        }
    }
}
