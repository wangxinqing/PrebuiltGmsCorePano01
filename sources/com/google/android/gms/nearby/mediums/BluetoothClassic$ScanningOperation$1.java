package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothClassic$ScanningOperation$1 extends nla {
    public final /* synthetic */ ujp a;
    final /* synthetic */ tou b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothClassic$ScanningOperation$1(ujp ujp, String str, tou tou) {
        super(str);
        this.a = ujp;
        this.b = tou;
    }

    public final void a(Context context, Intent intent) {
        if (intent == null) {
            ((anih) ((anih) ulh.a.c()).a("com.google.android.gms.nearby.mediums.BluetoothClassic$ScanningOperation$1", "a", 876, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring Bluetooth Classic scan result because the broadcasted intent is null.");
            return;
        }
        ujp ujp = this.a;
        ujp.b.execute(new ujo(this, intent, this.b));
    }
}
