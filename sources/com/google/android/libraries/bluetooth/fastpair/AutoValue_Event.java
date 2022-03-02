package com.google.android.libraries.bluetooth.fastpair;

import android.bluetooth.BluetoothDevice;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AutoValue_Event extends Event {
    private final aspb a;
    private final long b;
    private final Short c;
    private final BluetoothDevice d;
    private final Exception e;

    public AutoValue_Event(aspb aspb, long j, Short sh, BluetoothDevice bluetoothDevice, Exception exc) {
        this.a = aspb;
        this.b = j;
        this.c = sh;
        this.d = bluetoothDevice;
        this.e = exc;
    }

    public final aspb a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final Short c() {
        return this.c;
    }

    public final BluetoothDevice d() {
        return this.d;
    }

    public final Exception e() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r1 = r7.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        r1 = r7.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r1 = r7.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == r7) goto L_0x0065
            boolean r1 = r8 instanceof com.google.android.libraries.bluetooth.fastpair.Event
            r2 = 0
            if (r1 == 0) goto L_0x0064
            com.google.android.libraries.bluetooth.fastpair.Event r8 = (com.google.android.libraries.bluetooth.fastpair.Event) r8
            aspb r1 = r7.a
            aspb r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0063
            long r3 = r7.b
            long r5 = r8.b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            java.lang.Short r1 = r7.c
            if (r1 == 0) goto L_0x002f
            java.lang.Short r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0063
        L_0x002e:
            goto L_0x0036
        L_0x002f:
            java.lang.Short r1 = r8.c()
            if (r1 != 0) goto L_0x0063
            goto L_0x002e
        L_0x0036:
            android.bluetooth.BluetoothDevice r1 = r7.d
            if (r1 == 0) goto L_0x0045
            android.bluetooth.BluetoothDevice r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0063
        L_0x0044:
            goto L_0x004c
        L_0x0045:
            android.bluetooth.BluetoothDevice r1 = r8.d()
            if (r1 != 0) goto L_0x0063
            goto L_0x0044
        L_0x004c:
            java.lang.Exception r1 = r7.e
            if (r1 == 0) goto L_0x005b
            java.lang.Exception r8 = r8.e()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0061
            goto L_0x0062
        L_0x005b:
            java.lang.Exception r8 = r8.e()
            if (r8 == 0) goto L_0x0062
        L_0x0061:
            goto L_0x0063
        L_0x0062:
            return r0
        L_0x0063:
            return r2
        L_0x0064:
            return r2
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.bluetooth.fastpair.AutoValue_Event.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.a.hashCode();
        long j = this.b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Short sh = this.c;
        int i4 = 0;
        if (sh != null) {
            i = sh.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 ^ i) * 1000003;
        BluetoothDevice bluetoothDevice = this.d;
        if (bluetoothDevice != null) {
            i2 = bluetoothDevice.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 ^ i2) * 1000003;
        Exception exc = this.e;
        if (exc != null) {
            i4 = exc.hashCode();
        }
        return i6 ^ i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 89 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Event{eventCode=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", profile=");
        sb.append(valueOf2);
        sb.append(", bluetoothDevice=");
        sb.append(valueOf3);
        sb.append(", exception=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
