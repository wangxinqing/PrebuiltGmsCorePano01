package defpackage;

import android.content.Intent;
import com.google.android.gms.nearby.mediums.BluetoothClassic$ScanningOperation$1;

/* renamed from: ujo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ujo implements Runnable {
    private final BluetoothClassic$ScanningOperation$1 a;
    private final Intent b;
    private final tou c;

    public ujo(BluetoothClassic$ScanningOperation$1 bluetoothClassic$ScanningOperation$1, Intent intent, tou tou) {
        this.a = bluetoothClassic$ScanningOperation$1;
        this.b = intent;
        this.c = tou;
    }

    public final void run() {
        BluetoothClassic$ScanningOperation$1 bluetoothClassic$ScanningOperation$1 = this.a;
        Intent intent = this.b;
        tou tou = this.c;
        ujp ujp = bluetoothClassic$ScanningOperation$1.a;
        ujp.a(intent, ujp.a, tou);
    }
}
