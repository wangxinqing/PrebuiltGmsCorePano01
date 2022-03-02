package defpackage;

import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: hdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hdj implements Runnable {
    private final hdk a;
    private final ArrayBlockingQueue b;

    public hdj(hdk hdk, ArrayBlockingQueue arrayBlockingQueue) {
        this.a = hdk;
        this.b = arrayBlockingQueue;
    }

    public final void run() {
        hdk hdk = this.a;
        ArrayBlockingQueue arrayBlockingQueue = this.b;
        hdm hdm = hdk.c;
        Intent intent = hdk.b;
        int i = hdm.c;
        Object a2 = hdm.a(intent);
        if (a2 == null) {
            Log.w("GmsApiChimeraSvc", "Failed in attempt to reload bound-service.");
            a2 = hdk.a;
        }
        try {
            arrayBlockingQueue.add(a2);
        } catch (IllegalStateException e) {
            Log.w("GmsApiChimeraSvc", "Duplicate binder!");
        }
    }
}
