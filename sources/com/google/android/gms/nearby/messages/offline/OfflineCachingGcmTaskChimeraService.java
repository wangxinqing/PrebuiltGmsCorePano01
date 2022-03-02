package com.google.android.gms.nearby.messages.offline;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OfflineCachingGcmTaskChimeraService extends qwf {
    public final int a(qxz qxz) {
        if (aymw.w()) {
            startService(new Intent("com.google.android.gms.nearby.messages.service.POPULATE_CACHE").setClassName(this, "com.google.android.gms.nearby.messages.service.NearbyMessagesService"));
        }
        if (!aymw.A()) {
            return 0;
        }
        startService(new Intent("com.google.android.gms.nearby.discovery.fastpair.service.POPULATE_CACHE").setClassName(this, "com.google.android.gms.nearby.discovery.service.DiscoveryService"));
        return 0;
    }
}
