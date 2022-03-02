package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* renamed from: tuo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tuo implements Runnable {
    private final Context a;
    private final anab b;

    public tuo(Context context, anab anab) {
        this.a = context;
        this.b = anab;
    }

    public final void run() {
        Context context = this.a;
        anaf a2 = this.b.a();
        anhj a3 = a2.keySet().iterator();
        while (a3.hasNext()) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) a3.next();
            uaj uaj = ((tzi) a2.get(bluetoothDevice)).n;
            if (uaj == null) {
                uaj = uaj.K;
            }
            jjg jjg = tsp.a;
            bluetoothDevice.getAddress();
            tvd.a(context, bluetoothDevice, uaj, 5, uab.MAIN);
            if (arww.a(bluetoothDevice)) {
                tvd.a(context, bluetoothDevice, uaj, 7, uab.LEFT);
                tvd.a(context, bluetoothDevice, uaj, 8, uab.RIGHT);
                tvd.a(context, bluetoothDevice, uaj, 9, uab.CASE);
            }
        }
    }
}
