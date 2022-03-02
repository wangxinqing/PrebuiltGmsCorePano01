package com.google.android.gms.smartdevice.utils.wifi;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiConnectionManager$WifiConnectionReceiver extends nla {
    final /* synthetic */ acqk a;
    private final int b;
    private final CountDownLatch c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiConnectionManager$WifiConnectionReceiver(acqk acqk, int i, CountDownLatch countDownLatch) {
        super("smartdevice");
        this.a = acqk;
        this.b = i;
        iva.a((Object) countDownLatch);
        this.c = countDownLatch;
    }

    public final void a(Context context, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo == null) {
            Log.i(acqk.a, "State is null");
            return;
        }
        if (networkInfo.getDetailedState() != null) {
            String str = acqk.a;
            String valueOf = String.valueOf(networkInfo.getDetailedState().name());
            Log.i(str, valueOf.length() == 0 ? new String("Detailed state: ") : "Detailed state: ".concat(valueOf));
        }
        if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.CONNECTED && this.a.b() == this.b) {
            this.c.countDown();
        }
    }
}
