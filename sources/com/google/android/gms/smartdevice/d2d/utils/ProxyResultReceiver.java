package com.google.android.gms.smartdevice.d2d.utils;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ProxyResultReceiver extends ResultReceiver {
    private final WeakReference a;

    public ProxyResultReceiver(Handler handler, aced aced) {
        super(handler);
        this.a = new WeakReference(aced);
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        aced aced = (aced) this.a.get();
        if (aced != null) {
            aced.a(i, bundle);
        }
    }
}
