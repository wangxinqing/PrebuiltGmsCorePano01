package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.b;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class d extends qvr {
    public d(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            b.a();
            b.b();
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            b.b();
            com.google.android.gms.ads.internal.state.b.a(e, "AdMobHandler.handleMessage");
        }
    }
}
