package defpackage;

import android.content.Intent;
import com.google.android.gms.nearby.mediums.BluetoothRadio$1;

/* renamed from: ula  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ula implements Runnable {
    private final BluetoothRadio$1 a;
    private final Intent b;

    public ula(BluetoothRadio$1 bluetoothRadio$1, Intent intent) {
        this.a = bluetoothRadio$1;
        this.b = intent;
    }

    public final void run() {
        BluetoothRadio$1 bluetoothRadio$1 = this.a;
        bluetoothRadio$1.a.a(this.b);
    }
}
