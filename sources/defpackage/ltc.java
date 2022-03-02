package defpackage;

import android.bluetooth.BluetoothDevice;
import android.util.Log;

/* renamed from: ltc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ltc implements amrm {
    private final lti a;
    private final ampx b;
    private final Object c;

    public ltc(lti lti, ampx ampx, Object obj) {
        this.a = lti;
        this.b = ampx;
        this.c = obj;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        ampx ampx;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
        lti lti = this.a;
        if (lti != null && (ampx = this.b) != null) {
            return ampx.a(lti.a(bluetoothDevice), this.c);
        }
        Log.w("CAR.BT", "Could not parse BT rule");
        return false;
    }
}
