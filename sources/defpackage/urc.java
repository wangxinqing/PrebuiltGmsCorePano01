package defpackage;

import android.bluetooth.BluetoothSocket;
import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;

/* renamed from: urc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class urc extends urk implements uqr {
    private final Map k = new nz();
    private uqo l;

    static urc a(ampi ampi, url url, uqo uqo) {
        urc urc = new urc(ampi.c(), ampi, (BluetoothSocket) null, url, uqo);
        if (urc.c()) {
            return urc;
        }
        ((anih) ((anih) ulh.a.c()).a("urc", "a", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 failed to init on GATT for client %s.", (Object) ampi.c());
        urc.b();
        return null;
    }

    private final void b(int i, byte[] bArr) {
        if (this.l == null) {
            ((anih) ((anih) ulh.a.b()).a("urc", "b", 349, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s received an unexpected intro packet as a client socket.", (Object) this.a);
            return;
        }
        uql a = a(i, bArr);
        if (a != null) {
            this.l.a(a);
        }
    }

    private final void c(byte[] bArr) {
        try {
            asmh asmh = (asmh) aucj.a((aucj) asmh.e, bArr);
            int a = asmg.a(asmh.b);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 0) {
                ((anih) ((anih) ulh.a.c()).a("urc", "c", 339, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s received a control frame of an unknown type.", (Object) this.a);
            } else if (i2 != 1) {
                asmd asmd = asmh.d;
                if (asmd == null) {
                    asmd = asmd.c;
                }
                a(asmd.b.k());
            } else {
                asme asme = asmh.c;
                if (asme == null) {
                    asme = asme.d;
                }
                int a2 = asmj.a(asme.c);
                if (a2 != 0) {
                    i = a2;
                }
                int i3 = i - 1;
                asme asme2 = asmh.c;
                if (asme2 == null) {
                    asme2 = asme.d;
                }
                byte[] k2 = asme2.b.k();
                if (this.l == null) {
                    ((anih) ((anih) ulh.a.b()).a("urc", "b", 349, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s received an unexpected intro packet as a client socket.", (Object) this.a);
                    return;
                }
                uql a3 = a(i3, k2);
                if (a3 != null) {
                    this.l.a(a3);
                }
            }
        } catch (auda e) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("urc", "c", 324, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s was unable to parse control frame.", (Object) this.a);
        }
    }

    private urc(Context context, String str, url url, int i) {
        super(context, str, (amog) null, (BluetoothSocket) null, url, i);
    }

    /* renamed from: b */
    public final synchronized uql a(int i, String str) {
        uql a = a(i, ulu.a(str.getBytes(), 3));
        if (a == null) {
            ((anih) ((anih) ulh.a.c()).a("urc", "b", 198, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 failed to create a new outgoing BLE socket for service ID %s because the BLE socket failed to initialize.", (Object) str);
            return null;
        }
        aucd o = asmh.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh = (asmh) o.b;
        asmh.b = 1;
        asmh.a |= 1;
        aucd o2 = asme.d.o();
        auay a2 = auay.a(a.c);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asme asme = (asme) o2.b;
        a2.getClass();
        int i2 = 1 | asme.a;
        asme.a = i2;
        asme.b = a2;
        asme.c = 2;
        asme.a = i2 | 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asmh asmh2 = (asmh) o.b;
        asme asme2 = (asme) o2.i();
        asme2.getClass();
        asmh2.c = asme2;
        asmh2.a |= 2;
        try {
            a.e.a(((asmh) o.i()).k());
            return a;
        } catch (IOException e) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("uql", "f", 136, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleSocketV2 failed to send a introduction packet to connect for service ID hash %s.", (Object) ulu.a(a.c));
            ((anih) ((anih) ulh.a.c()).a("urc", "b", 210, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 failed to request a new outgoing BleSocket to %s for service ID %s", (Object) this.a, (Object) str);
            jjt.a((Closeable) a);
            return null;
        }
    }

    public urc(String str, ampi ampi, BluetoothSocket bluetoothSocket, url url, uqo uqo) {
        super((Context) null, str, ampi, bluetoothSocket, url, 0);
        this.l = uqo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f4, code lost:
        if (super.d() != false) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.urc a(android.content.Context r9, java.lang.String r10, defpackage.url r11, int r12) {
        /*
            urc r0 = new urc
            r0.<init>(r9, r10, r11, r12)
            amog r9 = super.e()
            r0.f = r9
            amog r9 = r0.f
            java.lang.String r11 = "a"
            java.lang.String r12 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            r1 = 0
            if (r9 != 0) goto L_0x0016
            goto L_0x00f7
        L_0x0016:
            int r9 = r0.j
            if (r9 > 0) goto L_0x001c
            goto L_0x00dd
        L_0x001c:
            java.lang.String r2 = r0.a
            android.bluetooth.BluetoothDevice r2 = defpackage.urm.a((java.lang.String) r2)
            java.lang.String r3 = "upm"
            if (r2 == 0) goto L_0x0112
            upm r4 = new upm     // Catch:{ IOException -> 0x002c }
            r4.<init>(r2, r9)     // Catch:{ IOException -> 0x002c }
            goto L_0x004a
        L_0x002c:
            r4 = move-exception
            jjg r5 = defpackage.ulh.a
            anie r5 = r5.b()
            anih r5 = (defpackage.anih) r5
            r5.a((java.lang.Throwable) r4)
            r4 = 106(0x6a, float:1.49E-43)
            anie r4 = r5.a((java.lang.String) r3, (java.lang.String) r11, (int) r4, (java.lang.String) r12)
            anih r4 = (defpackage.anih) r4
            java.lang.String r2 = r2.getAddress()
            java.lang.String r5 = "Failed to create BleL2capClient with address %s and psm %s"
            r4.a((java.lang.String) r5, (java.lang.Object) r2, (int) r9)
            r4 = r1
        L_0x004a:
            if (r4 == 0) goto L_0x00dd
            boolean r9 = r4.a()
            if (r9 == 0) goto L_0x00dd
            tfu r9 = r4.d()
            java.lang.String r2 = "g"
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00bc }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00bc }
            android.bluetooth.BluetoothSocket r7 = r4.c     // Catch:{ IOException -> 0x00bc }
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x00bc }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00bc }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00bc }
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x00bc }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00bc }
            android.bluetooth.BluetoothSocket r8 = r4.c     // Catch:{ IOException -> 0x00bc }
            java.io.OutputStream r8 = r8.getOutputStream()     // Catch:{ IOException -> 0x00bc }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00bc }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00bc }
            r7 = 3
            byte[] r7 = defpackage.upn.a(r7, r1)     // Catch:{ IOException -> 0x00bc }
            defpackage.upm.a((java.io.DataOutputStream) r6, (byte[]) r7)     // Catch:{ IOException -> 0x00bc }
            upn r5 = defpackage.upm.a(r5)     // Catch:{ IOException -> 0x00bc }
            int r5 = r5.a     // Catch:{ IOException -> 0x00bc }
            r6 = 23
            if (r5 != r6) goto L_0x008c
            r5 = 1
            goto L_0x008d
        L_0x008c:
            r5 = 0
        L_0x008d:
            jjg r6 = defpackage.ulh.a     // Catch:{ IOException -> 0x00bc }
            anie r6 = r6.d()     // Catch:{ IOException -> 0x00bc }
            anih r6 = (defpackage.anih) r6     // Catch:{ IOException -> 0x00bc }
            r7 = 206(0xce, float:2.89E-43)
            anie r6 = r6.a((java.lang.String) r3, (java.lang.String) r2, (int) r7, (java.lang.String) r12)     // Catch:{ IOException -> 0x00bc }
            anih r6 = (defpackage.anih) r6     // Catch:{ IOException -> 0x00bc }
            java.lang.String r7 = "BleL2capClient data connection to device %s was successful? %b"
            java.lang.String r8 = r4.a     // Catch:{ IOException -> 0x00bc }
            r6.a((java.lang.String) r7, (java.lang.Object) r8, (boolean) r5)     // Catch:{ IOException -> 0x00bc }
            r9.b()
            if (r5 == 0) goto L_0x00dd
            android.bluetooth.BluetoothSocket r9 = r4.c     // Catch:{ IOException -> 0x00b5 }
            java.io.InputStream r9 = r9.getInputStream()     // Catch:{ IOException -> 0x00b5 }
            super.a((java.io.InputStream) r9)     // Catch:{ IOException -> 0x00b5 }
            r0.h = r4     // Catch:{ IOException -> 0x00b5 }
            goto L_0x00f6
        L_0x00b5:
            r9 = move-exception
            r4.b()
            goto L_0x00dd
        L_0x00ba:
            r10 = move-exception
            goto L_0x00d9
        L_0x00bc:
            r4 = move-exception
            jjg r5 = defpackage.ulh.a     // Catch:{ all -> 0x00ba }
            anie r5 = r5.b()     // Catch:{ all -> 0x00ba }
            anih r5 = (defpackage.anih) r5     // Catch:{ all -> 0x00ba }
            r5.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x00ba }
            r4 = 212(0xd4, float:2.97E-43)
            anie r2 = r5.a((java.lang.String) r3, (java.lang.String) r2, (int) r4, (java.lang.String) r12)     // Catch:{ all -> 0x00ba }
            anih r2 = (defpackage.anih) r2     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "Failed to request data connection on L2CAP socket!"
            r2.a((java.lang.String) r3)     // Catch:{ all -> 0x00ba }
            r9.b()
            goto L_0x00dd
        L_0x00d9:
            r9.b()
            throw r10
        L_0x00dd:
            ampo r9 = new ampo
            amog r2 = r0.f
            urj r3 = new urj
            r3.<init>(r0)
            r9.<init>(r2, r3)
            r0.g = r9
            amoq r9 = r0.g
            r9.f()
            boolean r9 = super.d()
            if (r9 == 0) goto L_0x00f7
        L_0x00f6:
            return r0
        L_0x00f7:
            jjg r9 = defpackage.ulh.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r2 = 102(0x66, float:1.43E-43)
            java.lang.String r3 = "urc"
            anie r9 = r9.a((java.lang.String) r3, (java.lang.String) r11, (int) r2, (java.lang.String) r12)
            anih r9 = (defpackage.anih) r9
            java.lang.String r11 = "MultiplexBleSocketV2 failed to connect to server %s."
            r9.a((java.lang.String) r11, (java.lang.Object) r10)
            r0.b()
            return r1
        L_0x0112:
            jjg r9 = defpackage.ulh.a
            anie r9 = r9.b()
            anih r9 = (defpackage.anih) r9
            r10 = 98
            anie r9 = r9.a((java.lang.String) r3, (java.lang.String) r11, (int) r10, (java.lang.String) r12)
            anih r9 = (defpackage.anih) r9
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urc.a(android.content.Context, java.lang.String, url, int):urc");
    }

    static urc a(String str, BluetoothSocket bluetoothSocket, url url, uqo uqo) {
        urc urc = new urc(str, (ampi) null, bluetoothSocket, url, uqo);
        if (urc.c()) {
            return urc;
        }
        ((anih) ((anih) ulh.a.c()).a("urc", "a", 176, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 failed to init on L2CAP.");
        urc.b();
        return null;
    }

    public final void b() {
        for (uql g : this.k.values()) {
            g.g();
        }
        this.k.clear();
        amoq amoq = this.g;
        if (amoq != null) {
            amoq.a();
        }
        amog amog = this.f;
        if (amog != null) {
            amog.b();
        }
        upm upm = this.h;
        if (upm != null) {
            upm.b();
        }
        jjt.a((Closeable) this.i);
        tid.a(this.d, "PhysicalBleSocket.gattThreadOffloader");
        tid.a(this.e, "PhysicalBleSocket.l2capReaderThread");
    }

    private final void a(byte[] bArr, byte[] bArr2) {
        try {
            uql uql = (uql) this.k.get(jhy.d(bArr));
            if (uql == null) {
                ((anih) ((anih) ulh.a.b()).a("urc", "a", 369, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s and seems APP stop listening service ID hash %s but still have enqueued data(or still receive incoming data) %s.", (Object) this.a, (Object) ulu.a(bArr), (Object) ulu.a(bArr2));
                return;
            }
            uql.d.write(bArr2);
            if (aymi.A()) {
                uql.d.flush();
            }
        } catch (IOException e) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("urc", "a", 375, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s encountered an error while receiving incoming data for service ID hash %s.", (Object) this.a, (Object) ulu.a(bArr));
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized boolean b(upu upu) {
        if (upu.a()) {
            return true;
        }
        if (((uql) this.k.get(jhy.d(upu.b))) == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A[SYNTHETIC, Splitter:B:27:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b A[SYNTHETIC, Splitter:B:37:0x009b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.uql a(int r10, byte[] r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = defpackage.jhy.d(r11)     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "urc"
            java.lang.String r2 = "a"
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.util.Map r4 = r9.k     // Catch:{ all -> 0x00a2 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00a2 }
            r5 = 0
            if (r4 == 0) goto L_0x002f
            jjg r10 = defpackage.ulh.a     // Catch:{ all -> 0x00a2 }
            anie r10 = r10.b()     // Catch:{ all -> 0x00a2 }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x00a2 }
            r0 = 223(0xdf, float:3.12E-43)
            anie r10 = r10.a((java.lang.String) r1, (java.lang.String) r2, (int) r0, (java.lang.String) r3)     // Catch:{ all -> 0x00a2 }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "MultiplexBleSocketV2 failed to create a new BLE socket for service ID hash %s because there is already an active BLE socket under the same service ID."
            java.lang.String r11 = defpackage.ulu.a((byte[]) r11)     // Catch:{ all -> 0x00a2 }
            r10.a((java.lang.String) r0, (java.lang.Object) r11)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r9)
            return r5
        L_0x002f:
            urb r4 = new urb     // Catch:{ all -> 0x00a2 }
            r4.<init>(r9, r11)     // Catch:{ all -> 0x00a2 }
            r6 = 0
            upm r7 = r9.h     // Catch:{ IOException -> 0x005b }
            if (r7 == 0) goto L_0x004a
            android.bluetooth.BluetoothSocket r7 = r7.c     // Catch:{ IOException -> 0x005b }
            java.io.OutputStream r7 = r7.getOutputStream()     // Catch:{ IOException -> 0x005b }
            upm r8 = r9.h     // Catch:{ IOException -> 0x0048 }
            android.bluetooth.BluetoothSocket r8 = r8.c     // Catch:{ IOException -> 0x0048 }
            int r6 = r8.getMaxTransmitPacketSize()     // Catch:{ IOException -> 0x0048 }
            goto L_0x005a
        L_0x0048:
            r8 = move-exception
            goto L_0x005d
        L_0x004a:
            android.bluetooth.BluetoothSocket r7 = r9.i     // Catch:{ IOException -> 0x005b }
            if (r7 == 0) goto L_0x0059
            java.io.OutputStream r7 = r7.getOutputStream()     // Catch:{ IOException -> 0x005b }
            android.bluetooth.BluetoothSocket r8 = r9.i     // Catch:{ IOException -> 0x0048 }
            int r6 = r8.getMaxTransmitPacketSize()     // Catch:{ IOException -> 0x0048 }
            goto L_0x005a
        L_0x0059:
            r7 = r5
        L_0x005a:
            goto L_0x005d
        L_0x005b:
            r7 = move-exception
            r7 = r5
        L_0x005d:
            if (r7 == 0) goto L_0x0069
            uqj r8 = new uqj     // Catch:{ all -> 0x00a2 }
            r8.<init>(r11, r5, r7)     // Catch:{ all -> 0x00a2 }
            uql r10 = defpackage.uql.a(r10, r11, r4, r8, r6)     // Catch:{ all -> 0x00a2 }
            goto L_0x007e
        L_0x0069:
            amoq r6 = r9.g     // Catch:{ all -> 0x00a2 }
            if (r6 == 0) goto L_0x007d
            amog r7 = r9.f     // Catch:{ all -> 0x00a2 }
            int r7 = r7.a()     // Catch:{ all -> 0x00a2 }
            uqj r8 = new uqj     // Catch:{ all -> 0x00a2 }
            r8.<init>(r11, r6, r5)     // Catch:{ all -> 0x00a2 }
            uql r10 = defpackage.uql.a(r10, r11, r4, r8, r7)     // Catch:{ all -> 0x00a2 }
            goto L_0x007e
        L_0x007d:
            r10 = r5
        L_0x007e:
            if (r10 != 0) goto L_0x009b
            jjg r10 = defpackage.ulh.a     // Catch:{ all -> 0x00a2 }
            anie r10 = r10.b()     // Catch:{ all -> 0x00a2 }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x00a2 }
            r0 = 236(0xec, float:3.31E-43)
            anie r10 = r10.a((java.lang.String) r1, (java.lang.String) r2, (int) r0, (java.lang.String) r3)     // Catch:{ all -> 0x00a2 }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "MultiplexBleSocketV2 failed to create a new BLE socket for service ID hash %s because without a physical connection."
            java.lang.String r11 = defpackage.ulu.a((byte[]) r11)     // Catch:{ all -> 0x00a2 }
            r10.a((java.lang.String) r0, (java.lang.Object) r11)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r9)
            return r5
        L_0x009b:
            java.util.Map r11 = r9.k     // Catch:{ all -> 0x00a2 }
            r11.put(r0, r10)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r9)
            return r10
        L_0x00a2:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urc.a(int, byte[]):uql");
    }

    public final synchronized void a() {
        b();
    }

    /* access modifiers changed from: protected */
    public final void a(upu upu) {
        if (!upu.a()) {
            byte[] bArr = upu.b;
            byte[] bArr2 = upu.c;
            try {
                uql uql = (uql) this.k.get(jhy.d(bArr));
                if (uql == null) {
                    ((anih) ((anih) ulh.a.b()).a("urc", "a", 369, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s and seems APP stop listening service ID hash %s but still have enqueued data(or still receive incoming data) %s.", (Object) this.a, (Object) ulu.a(bArr), (Object) ulu.a(bArr2));
                    return;
                }
                uql.d.write(bArr2);
                if (aymi.A()) {
                    uql.d.flush();
                }
            } catch (IOException e) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("urc", "a", 375, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s encountered an error while receiving incoming data for service ID hash %s.", (Object) this.a, (Object) ulu.a(bArr));
            }
        } else {
            try {
                asmh asmh = (asmh) aucj.a((aucj) asmh.e, upu.c);
                int a = asmg.a(asmh.b);
                int i = 1;
                if (a == 0) {
                    a = 1;
                }
                int i2 = a - 1;
                if (i2 == 0) {
                    ((anih) ((anih) ulh.a.c()).a("urc", "c", 339, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s received a control frame of an unknown type.", (Object) this.a);
                } else if (i2 != 1) {
                    asmd asmd = asmh.d;
                    if (asmd == null) {
                        asmd = asmd.c;
                    }
                    a(asmd.b.k());
                } else {
                    asme asme = asmh.c;
                    if (asme == null) {
                        asme = asme.d;
                    }
                    int a2 = asmj.a(asme.c);
                    if (a2 != 0) {
                        i = a2;
                    }
                    int i3 = i - 1;
                    asme asme2 = asmh.c;
                    if (asme2 == null) {
                        asme2 = asme.d;
                    }
                    byte[] k2 = asme2.b.k();
                    if (this.l == null) {
                        ((anih) ((anih) ulh.a.b()).a("urc", "b", 349, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s received an unexpected intro packet as a client socket.", (Object) this.a);
                        return;
                    }
                    uql a3 = a(i3, k2);
                    if (a3 != null) {
                        this.l.a(a3);
                    }
                }
            } catch (auda e2) {
                anih anih2 = (anih) ulh.a.c();
                anih2.a((Throwable) e2);
                ((anih) anih2.a("urc", "c", 324, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV2 connected to %s was unable to parse control frame.", (Object) this.a);
            }
        }
    }

    public final synchronized void a(byte[] bArr) {
        uql uql = (uql) this.k.remove(jhy.d(bArr));
        if (uql != null) {
            uql.g();
            if (this.k.isEmpty()) {
                a();
            }
        }
    }
}
