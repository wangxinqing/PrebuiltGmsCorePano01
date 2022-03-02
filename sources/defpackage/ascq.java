package defpackage;

import android.content.Intent;
import com.google.location.nearby.direct.bluetooth.state.BluetoothAdapterWrapper$1;

/* renamed from: ascq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ascq extends arwm {
    final /* synthetic */ BluetoothAdapterWrapper$1 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ascq(BluetoothAdapterWrapper$1 bluetoothAdapterWrapper$1, String str) {
        super(str);
        this.a = bluetoothAdapterWrapper$1;
    }

    public final void run() {
        this.a.b.a.sendBroadcast(new Intent("com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED"));
    }
}
