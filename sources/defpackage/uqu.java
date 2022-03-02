package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.io.IOException;

/* renamed from: uqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uqu implements ampc {
    public final aejx a(Context context, String str, aejz aejz) {
        BluetoothDevice a = urm.a(str);
        if (a != null) {
            aejx a2 = aejx.a(a.connectGatt(context, false, aejz.b));
            try {
                Thread.sleep(aymi.k());
                a2.a(1);
                return a2;
            } catch (InterruptedException e) {
                a2.d();
                Thread.currentThread().interrupt();
                throw new IOException(String.format("WeaveGattProvider unsuccessfully slept after creating a GATT connection to device %s, aborting connection", new Object[]{a}), e);
            }
        } else {
            throw new IOException(String.format("WeaveGattProvider unable to retrieve BluetoothDevice for macAddress %s", new Object[]{str}));
        }
    }
}
