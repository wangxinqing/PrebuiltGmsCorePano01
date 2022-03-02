package com.google.android.gms.nearby.discovery.devices;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FindDeviceChimeraActivity extends bjs {
    private ttp a;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ttp ttp = new ttp(this, "com.google.android.gms.fastpair.fmd.FindDeviceActivity", new tvg(this));
        this.a = ttp;
        ttp.a(getIntent());
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        this.a.a((bjs) this);
    }
}
