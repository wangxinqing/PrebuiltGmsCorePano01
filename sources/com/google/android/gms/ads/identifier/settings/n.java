package com.google.android.gms.ads.identifier.settings;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class n implements Runnable {
    private final aosh a;
    private final izs b;

    public n(aosh aosh, izs izs) {
        this.a = aosh;
        this.b = izs;
    }

    public final void run() {
        aosh aosh = this.a;
        izs izs = this.b;
        if (aosh.isCancelled()) {
            izs.cancel();
        }
    }
}
