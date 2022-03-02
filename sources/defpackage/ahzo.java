package defpackage;

import android.hardware.location.ContextHubTransaction;
import android.util.Log;

/* renamed from: ahzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahzo implements ContextHubTransaction.OnCompleteListener {
    final /* synthetic */ ahzr a;

    public ahzo(ahzr ahzr) {
        this.a = ahzr;
    }

    public final void onComplete(ContextHubTransaction contextHubTransaction, ContextHubTransaction.Response response) {
        if (this.a.e != null) {
            if (response.getResult() != 0 && Log.isLoggable("ContextHubComms", 6)) {
                int id = this.a.e.getAttachedHub().getId();
                StringBuilder sb = new StringBuilder(50);
                sb.append("Failed to communicate with contexthub: ");
                sb.append(id);
                Log.e("ContextHubComms", sb.toString());
            }
            ahzc ahzc = (ahzc) this.a.d;
            ahzc.d.clear();
            ahzc.c();
        }
    }
}
