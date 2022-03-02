package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.contextmanager.producer.module.BroadcastReceiverProducer$InternalBroadcastReceiver;

/* renamed from: ccx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ccx implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ Intent b;
    final /* synthetic */ BroadcastReceiverProducer$InternalBroadcastReceiver c;

    public ccx(BroadcastReceiverProducer$InternalBroadcastReceiver broadcastReceiverProducer$InternalBroadcastReceiver, Context context, Intent intent) {
        this.c = broadcastReceiverProducer$InternalBroadcastReceiver;
        this.a = context;
        this.b = intent;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
    }
}
