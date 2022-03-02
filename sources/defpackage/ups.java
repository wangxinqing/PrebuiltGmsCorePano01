package defpackage;

import android.bluetooth.BluetoothSocket;
import android.os.SystemClock;
import java.io.Closeable;

/* renamed from: ups  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ups extends jfx {
    final /* synthetic */ BluetoothSocket a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ups(BluetoothSocket bluetoothSocket) {
        super(9);
        this.a = bluetoothSocket;
    }

    public final void run() {
        SystemClock.sleep(aymi.f());
        jjt.a((Closeable) this.a);
    }
}
