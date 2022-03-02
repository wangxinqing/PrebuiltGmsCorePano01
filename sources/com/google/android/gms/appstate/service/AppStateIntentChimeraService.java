package com.google.android.gms.appstate.service;

import android.content.Context;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppStateIntentChimeraService extends hcz {
    public static final hdb a = new hdb();

    public AppStateIntentChimeraService() {
        super("AppStateIntentService", a);
    }

    public static void a(Context context, hdb hdb, ebi ebi) {
        int i = jhg.a;
        hdb.offer(new ebj(ebi));
        context.startService(jhg.g("com.google.android.gms.appstate.service.INTENT"));
    }
}
