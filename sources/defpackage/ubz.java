package defpackage;

import android.content.Intent;

/* renamed from: ubz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ubz implements Runnable {
    private final udb a;
    private final Intent b;

    public ubz(udb udb, Intent intent) {
        this.a = udb;
        this.b = intent;
    }

    public final void run() {
        udb udb = this.a;
        Intent intent = this.b;
        udb.g.b();
        String stringExtra = intent.getStringExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS");
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS");
        boolean booleanExtra = intent.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_RETROACTIVE_PAIR", false);
        arwg arwg = udb.a;
        String valueOf = String.valueOf(stringExtra);
        arwg.c(new uch(udb, valueOf.length() == 0 ? new String("fastPairDeviceAdded=") : "fastPairDeviceAdded=".concat(valueOf), intent, stringExtra, stringExtra2, booleanExtra));
    }
}
