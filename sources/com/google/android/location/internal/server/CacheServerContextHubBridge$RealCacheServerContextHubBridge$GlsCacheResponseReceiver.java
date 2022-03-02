package com.google.android.location.internal.server;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver extends nla {
    private final arnh a;

    public CacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver(arnh arnh) {
        super("location");
        this.a = arnh;
    }

    public final void a(Context context, Intent intent) {
        boolean i = aydu.i();
        StringBuilder sb = new StringBuilder(29);
        sb.append("onReceive, configured : ");
        sb.append(i);
        sb.toString();
        if (i) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.location.internal.CACHE_RESULT_PROTO");
            int length = byteArrayExtra.length;
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("Sending, to hub, NLP cache response, length ");
            sb2.append(length);
            sb2.toString();
            arnk a2 = this.a.a(33, 0, byteArrayExtra);
            if (a2 != null) {
                a2.a(new aipb());
            }
        }
    }
}
