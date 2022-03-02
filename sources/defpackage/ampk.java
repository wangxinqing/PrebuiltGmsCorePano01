package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: ampk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ampk extends aekc {
    private final UUID a;
    private final UUID c;
    private final UUID d;
    private boolean e = false;
    private boolean f = false;
    private aeka g;
    private ampj h;
    private final aekc i;
    private final Map j = new HashMap();
    private final Map k = new HashMap();

    public ampk(UUID uuid, UUID uuid2, UUID uuid3, aekc aekc) {
        this.a = uuid;
        this.c = uuid2;
        this.d = uuid3;
        this.i = aekc;
    }

    public final void a(int i2, BluetoothGattService bluetoothGattService) {
        int i3 = ampm.c;
        Object[] objArr = {bluetoothGattService.getUuid(), Integer.valueOf(i2)};
        this.i.a(i2, bluetoothGattService);
    }

    public final void b(aejw aejw, int i2) {
        int i3 = ampm.c;
        Integer valueOf = Integer.valueOf(i2);
        Object[] objArr = {aejw.a(), valueOf};
        this.k.put(aejw.a(), valueOf);
        if (this.j.containsKey(aejw.a())) {
            ampm.a.a("MTU changed after BluetoothGattServerConnection has been created. The max packet size will not be changed");
        }
        this.i.b(aejw, i2);
    }

    public final void a(aejw aejw, int i2) {
        amon amon;
        String a2 = aejw.a();
        int i3 = ampm.c;
        Object[] objArr = {a2, Integer.valueOf(i2)};
        this.i.a(aejw, i2);
        ampi ampi = (ampi) this.j.get(a2);
        if (ampi == null) {
            String valueOf = String.valueOf(a2);
            if (valueOf.length() == 0) {
                new String("Notified unconnected device: ");
            } else {
                "Notified unconnected device: ".concat(valueOf);
            }
        } else {
            if (i2 != 0) {
                StringBuilder sb = new StringBuilder(30);
                sb.append("failed with status ");
                sb.append(i2);
                amon = amon.a(new IOException(sb.toString()));
            } else {
                amon = amon.a();
            }
            ampi.a(amon);
        }
    }

    public final void a(aejw aejw, int i2, int i3) {
        String a2 = aejw.a();
        int i4 = ampm.c;
        Object[] objArr = {a2, Integer.valueOf(i2), Integer.valueOf(i3)};
        this.i.a(aejw, i2, i3);
        if (i2 == 0 && i3 == 2) {
            new Object[1][0] = a2;
            return;
        }
        new Object[1][0] = a2;
        this.k.remove(a2);
        ampi ampi = (ampi) this.j.remove(a2);
        if (ampi != null) {
            ampi.e();
            this.g.a(aejw);
        }
        if (this.e && this.j.isEmpty()) {
            this.e = false;
            this.g.a();
        }
    }

    public final void a(aejw aejw, int i2, int i3, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int i4 = ampm.c;
        Object[] objArr = {aejw.a(), bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i2), Integer.valueOf(i3)};
        this.i.a(aejw, i2, i3, bluetoothGattCharacteristic);
    }

    public final void a(aejw aejw, int i2, int i3, BluetoothGattDescriptor bluetoothGattDescriptor) {
        int i4 = ampm.c;
        Object[] objArr = {aejw.a(), bluetoothGattDescriptor.getUuid(), Integer.valueOf(i2), Integer.valueOf(i3)};
        this.i.a(aejw, i2, i3, bluetoothGattDescriptor);
    }

    public final void a(aejw aejw, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i3, byte[] bArr) {
        String a2 = aejw.a();
        int i4 = ampm.c;
        Object[] objArr = {a2, bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(z2), Arrays.toString(bArr)};
        this.i.a(aejw, i2, bluetoothGattCharacteristic, z, z2, i3, bArr);
        if (z2) {
            this.g.a(aejw, i2, 0, i3, (byte[]) null);
        }
        if (!this.d.equals(bluetoothGattCharacteristic.getUuid())) {
            ampm.a.a("unrecognized characteristic written %s", bluetoothGattCharacteristic.getUuid());
            return;
        }
        ampi ampi = (ampi) this.j.get(a2);
        if (ampi == null) {
            ampm.a.a("Device %s not connected yet", a2);
            return;
        }
        ampi.a(bArr);
    }

    public final void a(aejw aejw, int i2, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i3, byte[] bArr) {
        int i4;
        aejw aejw2 = aejw;
        String a2 = aejw.a();
        int i5 = ampm.c;
        Object[] objArr = {a2, bluetoothGattDescriptor.getUuid(), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z), Boolean.valueOf(z2), Arrays.toString(bArr)};
        this.i.a(aejw, i2, bluetoothGattDescriptor, z, z2, i3, bArr);
        if (z2) {
            this.g.a(aejw, i2, 0, i3, (byte[]) null);
        }
        if (this.j.containsKey(a2)) {
            ampm.a.a("Device %s already connected and subscribed to indications", a2);
        } else if (bluetoothGattDescriptor.getCharacteristic().getUuid().equals(this.c)) {
            if (!Arrays.equals(bArr, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE) || !bluetoothGattDescriptor.getUuid().equals(ampl.a)) {
                this.h.a((IOException) new amom(String.format("Device %s wrote an unexpected descriptor value", new Object[]{a2})));
                return;
            }
            if (aejw.b() == 2) {
                this.g.b(aejw);
            } else {
                new Object[1][0] = Integer.valueOf(aejw.b());
            }
            BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
            aeka aeka = this.g;
            String a3 = aejw.a();
            if (this.k.containsKey(a3)) {
                i4 = ((Integer) this.k.get(a3)).intValue() - 3;
            } else {
                i4 = 20;
            }
            ampi ampi = new ampi(aeka, aejw, characteristic, i4);
            this.j.put(a2, ampi);
            this.h.a(ampi);
        }
    }

    public final void a(aejw aejw, int i2, boolean z) {
        int i3 = ampm.c;
        Object[] objArr = {aejw.a(), Integer.valueOf(i2), Boolean.valueOf(z)};
        this.i.a(aejw, i2, z);
    }

    public final synchronized void a(aeka aeka, ampj ampj) {
        if (!this.f) {
            int i2 = ampm.c;
            this.g = aeka;
            this.h = ampj;
            BluetoothGattService bluetoothGattService = new BluetoothGattService(this.a, 0);
            BluetoothGattDescriptor bluetoothGattDescriptor = new BluetoothGattDescriptor(ampl.a, 16);
            BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(this.c, 32, 0);
            bluetoothGattCharacteristic.addDescriptor(bluetoothGattDescriptor);
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(this.d, 8, 16);
            bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
            bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic2);
            this.g.a(bluetoothGattService);
            this.f = true;
            this.e = false;
        } else {
            throw new IllegalStateException("GattServer already initialized");
        }
    }

    public final void a(boolean z) {
        int i2 = ampm.c;
        if (this.g == null) {
            return;
        }
        if (!this.j.isEmpty()) {
            this.e = true;
            if (z) {
                for (ampi b : this.j.values()) {
                    b.b();
                }
                return;
            }
            return;
        }
        this.g.a();
    }
}
