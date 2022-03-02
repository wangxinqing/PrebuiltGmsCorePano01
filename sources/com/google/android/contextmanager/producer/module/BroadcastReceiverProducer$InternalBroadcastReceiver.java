package com.google.android.contextmanager.producer.module;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BroadcastReceiverProducer$InternalBroadcastReceiver extends nla {
    public final /* synthetic */ ccy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverProducer$InternalBroadcastReceiver(ccy ccy) {
        super("contextmanager");
        this.a = ccy;
    }

    public final void a(Context context, Intent intent) {
        ccy ccy = this.a;
        if (ccy.j) {
            ccy.a.a(new ccx(this, context, intent), bvq.a(String.valueOf(this.a.c).concat("_broadcast")));
        } else {
            ccy.a(context, intent);
        }
    }
}
