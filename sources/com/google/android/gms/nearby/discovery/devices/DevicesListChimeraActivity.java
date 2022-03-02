package com.google.android.gms.nearby.discovery.devices;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DevicesListChimeraActivity extends mrm {
    private ttp c;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        this.b = aymw.a.a().ae();
        super.onCreate(bundle);
        tvg tvg = new tvg(this);
        if (this.b) {
            ttp ttp = new ttp(this, "com.google.android.gms.fastpair.devices.DevicesListActivity", tvg);
            this.c = ttp;
            ttp.a(getIntent());
            return;
        }
        tvg.a();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        ttp ttp = this.c;
        if (ttp != null) {
            ttp.a((bjs) this);
        }
    }
}
