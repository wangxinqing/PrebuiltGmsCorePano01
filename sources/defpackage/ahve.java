package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ahve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahve extends BroadcastReceiver {
    final /* synthetic */ ahvk a;

    public ahve(ahvk ahvk) {
        this.a = ahvk;
    }

    public final void onReceive(Context context, Intent intent) {
        ahvk ahvk = this.a;
        AtomicLong atomicLong = ahvk.i;
        ajrh ajrh = ahvk.b;
        if (!ahvk.m.b(ajbe.COLLECTIONLIB_REPLAYER)) {
            this.a.m.b(ajbe.COLLECTIONLIB_REPLAYER, 600000, this.a.l);
        }
        this.a.a();
    }
}
