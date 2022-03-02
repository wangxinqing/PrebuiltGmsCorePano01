package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;

/* renamed from: ampb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ampb extends aejz {
    private final Context a;
    private final int c;
    private final ampc d;
    private final UUID e;
    private final UUID f;
    private final UUID g;
    private final Map h = new HashMap();
    private final Map i = new HashMap();
    private final Set j = new HashSet();

    public ampb(Context context, ampc ampc, UUID uuid, UUID uuid2, UUID uuid3, int i2) {
        this.a = context;
        this.d = ampc;
        this.e = uuid;
        this.f = uuid2;
        this.g = uuid3;
        this.c = i2;
    }

    private final amoz a(aejx aejx) {
        amoz amoz = (amoz) this.i.get(aejx);
        if (amoz != null) {
            return amoz;
        }
        throw new IllegalStateException("missing BleConnection");
    }

    private final ampa b(aejx aejx) {
        ampa ampa = (ampa) this.h.remove(aejx);
        if (ampa != null) {
            return ampa;
        }
        throw new IllegalStateException("missing PendingConnection");
    }

    public final synchronized Future a(String str) {
        ampa ampa;
        try {
            aejx a2 = this.d.a(this.a, str, this);
            ampa = new ampa(a2);
            this.h.put(a2, ampa);
        } catch (IOException e2) {
            ampa ampa2 = new ampa((aejx) null);
            ampa2.a(e2);
            return ampa2;
        }
        return ampa;
    }

    public final void b(aejx aejx, int i2, int i3) {
        int i4 = ampm.c;
        new Object[1][0] = Integer.valueOf(i2);
        if (i3 != 0) {
            ampm.a.a("Failed to change mtu.");
        }
        if (this.j.contains(aejx)) {
            ampm.a.a("Duplicate onMtuChanged callback received.");
            return;
        }
        this.j.add(aejx);
        if (!aejx.c()) {
            b(aejx).a(new IOException("service discovery failed"));
        }
    }

    public final synchronized void a(aejx aejx, int i2) {
        if (i2 == 0) {
            try {
                amom amom = null;
                for (BluetoothGattService bluetoothGattService : aejx.b()) {
                    if (bluetoothGattService.getUuid().equals(this.e)) {
                        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(this.f);
                        if (characteristic == null) {
                            String valueOf = String.valueOf(this.f);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                            sb.append("missing client tx characteristic ");
                            sb.append(valueOf);
                            amom = new amom(sb.toString());
                        } else {
                            BluetoothGattCharacteristic characteristic2 = bluetoothGattService.getCharacteristic(this.g);
                            if (characteristic2 == null) {
                                String valueOf2 = String.valueOf(this.g);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                                sb2.append("missing client rx characteristic ");
                                sb2.append(valueOf2);
                                amom = new amom(sb2.toString());
                            } else {
                                BluetoothGattDescriptor descriptor = characteristic2.getDescriptor(ampl.a);
                                if (descriptor == null) {
                                    amom = new amom("missing client characteristic configuration descriptor for client rx characteristic");
                                } else {
                                    ampa ampa = (ampa) this.h.get(aejx);
                                    if (ampa != null) {
                                        ampa.c = characteristic;
                                        descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                                        aejx.b(characteristic2);
                                        aejx.a(descriptor);
                                    } else {
                                        throw new IllegalStateException("missing PendingConnection");
                                    }
                                }
                            }
                        }
                    }
                }
                if (amom == null) {
                    String valueOf3 = String.valueOf(this.e);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                    sb3.append("missing service ");
                    sb3.append(valueOf3);
                    throw new amom(sb3.toString());
                }
                throw amom;
            } catch (IOException e2) {
                ampm ampm = ampm.a;
                if (Log.isLoggable(ampm.b, 5)) {
                    Log.w(ampm.b, e2);
                }
                b(aejx).a(e2);
            } finally {
            }
        } else {
            StringBuilder sb4 = new StringBuilder(48);
            sb4.append("service discovery failed with status ");
            sb4.append(i2);
            throw new IOException(sb4.toString());
        }
    }

    public final synchronized void b(aejx aejx, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        amon amon;
        int i3 = ampm.c;
        Object[] objArr = {bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i2)};
        if (!this.f.equals(bluetoothGattCharacteristic.getUuid())) {
            ampm.a.a("unrecognized characteristic written %s", bluetoothGattCharacteristic.getUuid());
            return;
        }
        amoz a2 = a(aejx);
        if (i2 == 0) {
            amon = amon.a();
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("failed with status ");
            sb.append(i2);
            amon = amon.a(new IOException(sb.toString()));
        }
        a2.a(amon);
    }

    public final synchronized void b(aejx aejx, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        int i3 = ampm.c;
        Object[] objArr = {bluetoothGattDescriptor.getUuid(), Integer.valueOf(i2)};
        if (ampl.a.equals(bluetoothGattDescriptor.getUuid())) {
            if (this.g.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                ampa b = b(aejx);
                byte[] value = bluetoothGattDescriptor.getValue();
                if (!Arrays.equals(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE, value)) {
                    String valueOf = String.valueOf(Arrays.toString(value));
                    String str = valueOf.length() == 0 ? new String("unexpected descriptor value ") : "unexpected descriptor value ".concat(valueOf);
                    ampm.a.a(str);
                    b.a(new amom(str));
                    return;
                }
                amoz amoz = new amoz(aejx, b.c, this.c - 3);
                this.i.put(aejx, amoz);
                b.b = amoz;
                b.a.countDown();
                return;
            }
        }
        ampm.a.a("unrecognized descriptor written %s for characteristic %s", bluetoothGattDescriptor.getUuid(), bluetoothGattDescriptor.getCharacteristic().getUuid());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.aejx r6, int r7, int r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = defpackage.ampm.c     // Catch:{ all -> 0x0078 }
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0078 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0078 }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x0078 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0078 }
            r4 = 1
            r1[r4] = r2     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x0017
            goto L_0x0040
        L_0x0017:
            if (r8 != r0) goto L_0x0040
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0078 }
            int r7 = r5.c     // Catch:{ all -> 0x0078 }
            boolean r7 = r6.b((int) r7)     // Catch:{ all -> 0x0078 }
            if (r7 != 0) goto L_0x0076
            ampm r7 = defpackage.ampm.a     // Catch:{ all -> 0x0078 }
            java.lang.String r8 = "request mtu failed"
            r7.a(r8)     // Catch:{ all -> 0x0078 }
            boolean r7 = r6.c()     // Catch:{ all -> 0x0078 }
            if (r7 != 0) goto L_0x0076
            ampa r6 = r5.b(r6)     // Catch:{ all -> 0x0078 }
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0078 }
            java.lang.String r8 = "service discovery failed"
            r7.<init>(r8)     // Catch:{ all -> 0x0078 }
            r6.a(r7)     // Catch:{ all -> 0x0078 }
            monitor-exit(r5)
            return
        L_0x0040:
            java.util.Set r8 = r5.j     // Catch:{ all -> 0x0078 }
            r8.remove(r6)     // Catch:{ all -> 0x0078 }
            java.util.Map r8 = r5.h     // Catch:{ all -> 0x0078 }
            java.lang.Object r8 = r8.remove(r6)     // Catch:{ all -> 0x0078 }
            ampa r8 = (defpackage.ampa) r8     // Catch:{ all -> 0x0078 }
            if (r8 == 0) goto L_0x0069
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x0078 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0078 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0078 }
            r0[r3] = r7     // Catch:{ all -> 0x0078 }
            r0[r4] = r2     // Catch:{ all -> 0x0078 }
            java.lang.String r7 = "Connection failed. status: %d, state: %d"
            java.lang.String r7 = java.lang.String.format(r1, r7, r0)     // Catch:{ all -> 0x0078 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0078 }
            r0.<init>(r7)     // Catch:{ all -> 0x0078 }
            r8.a(r0)     // Catch:{ all -> 0x0078 }
        L_0x0069:
            java.util.Map r7 = r5.i     // Catch:{ all -> 0x0078 }
            java.lang.Object r6 = r7.remove(r6)     // Catch:{ all -> 0x0078 }
            amoz r6 = (defpackage.amoz) r6     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x0076
            r6.e()     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r5)
            return
        L_0x0078:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ampb.a(aejx, int, int):void");
    }

    public final synchronized void a(aejx aejx, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int i2 = ampm.c;
        Object[] objArr = {bluetoothGattCharacteristic.getUuid(), Arrays.toString(bluetoothGattCharacteristic.getValue())};
        if (!this.g.equals(bluetoothGattCharacteristic.getUuid())) {
            ampm.a.a("unrecognized characteristic changed %s", bluetoothGattCharacteristic.getUuid());
            return;
        }
        a(aejx).a(bluetoothGattCharacteristic.getValue());
    }

    public final synchronized void a(aejx aejx, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        int i3 = ampm.c;
        Object[] objArr = {bluetoothGattCharacteristic.getUuid(), Integer.valueOf(i2)};
    }

    public final synchronized void a(aejx aejx, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        int i3 = ampm.c;
        Object[] objArr = {bluetoothGattDescriptor.getUuid(), Integer.valueOf(i2)};
    }
}
