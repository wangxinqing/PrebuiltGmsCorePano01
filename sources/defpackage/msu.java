package defpackage;

import android.bluetooth.BluetoothDevice;

/* renamed from: msu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msu implements Runnable {
    private final mta a;
    private final BluetoothDevice b;

    public msu(mta mta, BluetoothDevice bluetoothDevice) {
        this.a = mta;
        this.b = bluetoothDevice;
    }

    public final void run() {
        mta mta = this.a;
        BluetoothDevice bluetoothDevice = this.b;
        try {
            aeic.a(bluetoothDevice).a("removeBond", new Class[0]).a(new Object[0]);
            mtd.a(mta.getContext(), asom.FAST_PAIR_DEVICE_FORGOTTEN);
        } catch (aeid e) {
            anih anih = (anih) mte.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("mta", "a", 337, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DeviceDetail: Error removing bond for device=%s", (Object) bluetoothDevice);
        }
    }
}
