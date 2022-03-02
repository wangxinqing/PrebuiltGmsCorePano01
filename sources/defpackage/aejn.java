package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: aejn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aejn implements Closeable {
    public final List a = new ArrayList();
    public final aejw b;
    aekl c = new aekl(1);
    final Map d = new HashMap();
    final Map e = new HashMap();
    private final aejs f;
    private final Map g;

    static {
        aejn.class.getSimpleName();
        TimeUnit.SECONDS.toMillis(1);
    }

    public aejn(aejs aejs, aejw aejw, aejh aejh) {
        new HashMap();
        this.f = aejs;
        this.b = aejw;
        HashMap hashMap = new HashMap();
        for (aejg aejg : aejh.a.values()) {
            hashMap.putAll(aejg.a);
        }
        this.g = hashMap;
    }

    public final aejt a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        aejt aejt = (aejt) this.g.get(bluetoothGattCharacteristic);
        if (aejt != null) {
            return aejt;
        }
        throw new BluetoothGattException(String.format("No handler registered for characteristic %s.", new Object[]{bluetoothGattCharacteristic.getUuid()}), 6);
    }

    public final void close() {
        try {
            aejs aejs = this.f;
            aejw aejw = this.b;
            aeka aeka = aejs.j;
            if (aeka == null) {
                throw new BluetoothException("Server is not open.");
            } else if (aejs.g.a.getConnectionState(aejw.a, 7) == 2) {
                aejs.e.b((aekj) new aejp(new Object[]{aejr.CLOSE_CONNECTION}, aeka, aejw), aejs.b);
            }
        } catch (BluetoothException e2) {
            throw new IOException("Failed to close connection", e2);
        }
    }
}
