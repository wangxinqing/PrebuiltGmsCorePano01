package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;

/* renamed from: tux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tux implements Runnable {
    private final Context a;
    private final tzi b;
    private final arxt c;
    private final BluetoothDevice d;

    public tux(Context context, tzi tzi, arxt arxt, BluetoothDevice bluetoothDevice) {
        this.a = context;
        this.b = tzi;
        this.c = arxt;
        this.d = bluetoothDevice;
    }

    public final void run() {
        tvd.a(this.a, this.b, this.c, this.d);
    }
}
