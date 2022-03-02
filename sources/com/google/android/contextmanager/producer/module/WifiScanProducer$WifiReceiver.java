package com.google.android.contextmanager.producer.module;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiScanProducer$WifiReceiver extends nla {
    public final /* synthetic */ cga a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiScanProducer$WifiReceiver(cga cga) {
        super("contextmanager");
        this.a = cga;
    }

    public final void a(Context context, Intent intent) {
        this.a.a.a(new cfz(this, intent), bvq.a("WifiReceiver"));
    }
}
