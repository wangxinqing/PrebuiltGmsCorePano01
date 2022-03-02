package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class o implements Callable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ Context b;

    public o(byte[] bArr, Context context) {
        this.a = bArr;
        this.b = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        HashMap hashMap = new HashMap();
        hashMap.put("pk", new String(this.a));
        return lxz.a(this.b, "ad-event-attest-token", (Map) hashMap);
    }
}
