package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.util.SparseArray;

/* renamed from: tye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tye implements txz {
    public final Context a;
    public final tya b;
    public final ttf c;
    private final SparseArray d;
    private final arwg e;

    public tye(Context context) {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(1, new txu());
        sparseArray.put(2, new txv());
        sparseArray.put(3, new txx());
        sparseArray.put(255, new txt());
        sparseArray.put(4, new txw());
        this.d = sparseArray;
        this.a = context;
        this.b = (tya) thl.a(context, tya.class);
        this.e = (arwg) thl.a(context, arwg.class);
        this.c = (ttf) thl.a(context, ttf.class);
    }

    public final void a(BluetoothDevice bluetoothDevice) {
        ((anih) tsp.a.d()).a("FastPair: EventStream for [%s] is connected.", (Object) bluetoothDevice);
        this.e.c(new tyd(this, String.format("SendDeviceInformation[%s]", new Object[]{bluetoothDevice}), bluetoothDevice));
    }

    public final void b(BluetoothDevice bluetoothDevice) {
        ((anih) tsp.a.d()).a("FastPair: EventStream for [%s] is disconnected.", (Object) bluetoothDevice);
        if (aymw.a.a().ba()) {
            ((anih) tsp.a.d()).a("FastPair: EventStream listeners for [%s] are reset", (Object) bluetoothDevice);
            for (int i = 0; i < this.d.size(); i++) {
                ((txy) this.d.valueAt(i)).a(this.a, bluetoothDevice);
            }
        }
    }

    public final void a(Context context, BluetoothDevice bluetoothDevice, int i, int i2, byte[] bArr) {
        txy txy = (txy) this.d.get(i);
        if (txy != null) {
            txy.a(context, bluetoothDevice, i2, bArr);
        }
    }
}
