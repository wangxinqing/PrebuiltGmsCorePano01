package defpackage;

import android.content.Intent;

/* renamed from: uce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uce extends arwm {
    final /* synthetic */ Intent a;
    final /* synthetic */ udb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uce(udb udb, String str, Intent intent) {
        super(str);
        this.b = udb;
        this.a = intent;
    }

    public final void run() {
        this.b.a(this.a.getByteArrayExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER"), this.a.getBooleanExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER_SUPPRESS_NOTIFICATION", false), this.a.getStringExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS"), this.a.getByteArrayExtra("com.google.android.gms.nearby.discovery.BLOOM_FILTER_SALT"), this.a.getByteArrayExtra("com.google.android.gms.nearby.discovery.BATTERY_VALUES"), this.a.getBooleanExtra("com.google.android.gms.nearby.discovery.BATTERY_SUPPRESS_NOTIFICATION", true), this.a.getDoubleExtra("com.google.android.gms.nearby.discovery.DISTANCE_ESTIMATE", Double.NaN));
    }
}
