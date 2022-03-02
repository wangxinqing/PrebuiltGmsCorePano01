package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* renamed from: aeiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeiy implements AutoCloseable {
    public static final String a = aeiy.class.getSimpleName();
    static final long b = TimeUnit.SECONDS.toMillis(1);
    static final long c = TimeUnit.SECONDS.toMillis(10);
    public final aejx d;
    public final aekl e;
    public final aejb f;
    public volatile boolean g = false;
    public volatile boolean h = false;
    public final ConcurrentMap i = new ConcurrentHashMap();
    public final List j = new ArrayList();
    public long k = b;
    private volatile int l = 23;

    public aeiy(aejx aejx, aekl aekl, aejb aejb) {
        this.d = aejx;
        this.e = aekl;
        this.f = aejb;
    }

    public final BluetoothGattCharacteristic a(UUID uuid, UUID uuid2) {
        Object[] objArr = {uuid2, uuid};
        if (!this.g) {
            a();
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothGattService bluetoothGattService : this.d.b()) {
            if (bluetoothGattService.getUuid().equals(uuid)) {
                arrayList.addAll(bluetoothGattService.getCharacteristics());
            }
        }
        int size = arrayList.size();
        BluetoothGattCharacteristic bluetoothGattCharacteristic = null;
        for (int i2 = 0; i2 < size; i2++) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) arrayList.get(i2);
            if (bluetoothGattCharacteristic2.getUuid().equals(uuid2)) {
                if (bluetoothGattCharacteristic == null) {
                    bluetoothGattCharacteristic = bluetoothGattCharacteristic2;
                } else {
                    throw new BluetoothException(String.format("More than one characteristic %s found on service %s on device %s.", new Object[]{uuid2, uuid, this.d.a()}));
                }
            }
        }
        if (bluetoothGattCharacteristic != null) {
            return bluetoothGattCharacteristic;
        }
        throw new BluetoothException(String.format("Characteristic %s not found on service %s of device %s.", new Object[]{uuid2, uuid, this.d.a()}));
    }

    public final void b() {
        Log.i(a, "Starting services discovery.");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.e.b((aekj) new aeir(this, aeje.DISCOVER_SERVICES_INTERNAL, this.d), c);
            Log.i(a, String.format("Services discovered successfully in %s ms.", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
        } catch (BluetoothException e2) {
            if (e2 instanceof BluetoothGattException) {
                throw new BluetoothGattException(String.format("Failed to discover services on device: %s.", new Object[]{this.d.a()}), ((BluetoothGattException) e2).a, e2);
            } else {
                throw new BluetoothException(String.format("Failed to discover services on device: %s.", new Object[]{this.d.a()}), e2);
            }
        }
    }

    public final aeix c(UUID uuid, UUID uuid2) {
        BluetoothGattCharacteristic a2 = a(uuid, uuid2);
        return (aeix) this.e.a((aekj) new aeiw(this, new Object[]{aeje.NOTIFICATION_CHANGE, a2}, a2));
    }

    public final void c() {
        this.h = true;
    }

    public final void close() {
        aejx aejx;
        try {
            if (this.h) {
                this.e.b((aekj) new aeip(this, aeje.DISCONNECT, this.d.a()), this.k);
                aejx = this.d;
            } else {
                aejx = this.d;
            }
            aejx.e();
        } catch (Throwable th) {
            this.d.e();
            throw th;
        }
    }

    public final void a() {
        aekl.a(this.e.b(new aeiq(this, aeje.DISCOVER_SERVICES)));
    }

    public final byte[] b(UUID uuid, UUID uuid2) {
        BluetoothGattCharacteristic a2 = a(uuid, uuid2);
        try {
            return (byte[]) this.e.a((aekj) new aeis(this, new Object[]{aeje.READ_CHARACTERISTIC, this.d, a2}, a2), this.k);
        } catch (BluetoothException e2) {
            throw new BluetoothException(String.format("Failed to read %s on device %s.", new Object[]{aekh.b(a2), this.d.a()}), e2);
        }
    }

    public final void a(long j2) {
        amrl.a(j2 > 0, (Object) "invalid time out value");
        this.k = j2;
    }

    public final void a(UUID uuid, UUID uuid2, byte[] bArr) {
        BluetoothGattCharacteristic a2 = a(uuid, uuid2);
        Object[] objArr = {Integer.valueOf(bArr.length), aekh.b(a2), this.d.a()};
        if ((a2.getProperties() & 12) != 0) {
            try {
                this.e.b((aekj) new aeit(this, new Object[]{aeje.WRITE_CHARACTERISTIC, this.d, a2}, a2, bArr), this.k);
            } catch (BluetoothException e2) {
                throw new BluetoothException(String.format("Failed to write %s on device %s.", new Object[]{aekh.b(a2), this.d.a()}), e2);
            }
        } else {
            throw new BluetoothException(String.format("%s is not writable!", new Object[]{a2}));
        }
    }
}
