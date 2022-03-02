package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.SystemClock;
import com.google.location.nearby.direct.bluetooth.state.BluetoothAdapterWrapper$1;

/* renamed from: ascr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ascr extends arwm {
    final /* synthetic */ BluetoothAdapterWrapper$1 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ascr(BluetoothAdapterWrapper$1 bluetoothAdapterWrapper$1, String str) {
        super(str);
        this.a = bluetoothAdapterWrapper$1;
    }

    public final void run() {
        BluetoothAdapter bluetoothAdapter = this.a.b.c;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            this.a.b.g = Long.valueOf(SystemClock.elapsedRealtime());
            jjg jjg = asil.a;
            BluetoothAdapterWrapper$1 bluetoothAdapterWrapper$1 = this.a;
            ascs ascs = bluetoothAdapterWrapper$1.b;
            Long l = ascs.g;
            arwg arwg = ascs.e;
            arwm arwm = bluetoothAdapterWrapper$1.a;
            auyo auyo = ascs.b.b.g;
            if (auyo == null) {
                auyo = auyo.j;
            }
            arwg.a(arwm, auyo.i);
            return;
        }
        BluetoothAdapterWrapper$1 bluetoothAdapterWrapper$12 = this.a;
        ascs ascs2 = bluetoothAdapterWrapper$12.b;
        ascs2.g = null;
        ascs2.e.e(bluetoothAdapterWrapper$12.a);
    }
}
