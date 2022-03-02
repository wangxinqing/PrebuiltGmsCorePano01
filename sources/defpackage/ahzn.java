package defpackage;

import android.hardware.location.ContextHubClient;

/* renamed from: ahzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahzn implements Runnable {
    private final ahzr a;

    public ahzn(ahzr ahzr) {
        this.a = ahzr;
    }

    public final void run() {
        ahzr ahzr = this.a;
        ContextHubClient contextHubClient = ahzr.e;
        if (contextHubClient != null) {
            contextHubClient.close();
            ahzr.e = null;
        }
        ahzr.c = false;
    }
}
