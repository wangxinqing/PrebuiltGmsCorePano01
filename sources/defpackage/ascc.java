package defpackage;

import android.bluetooth.BluetoothSocket;
import android.os.Build;
import java.io.IOException;

/* renamed from: ascc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ascc implements ashv {
    private static final asik d = asik.b();
    public final boolean a;
    public final asce b;
    public BluetoothSocket c;
    private final String e;
    private asiv f;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public ascc(BluetoothSocket bluetoothSocket) {
        this.a = false;
        this.e = ((asih) d).a();
        this.b = null;
        iva.a((Object) bluetoothSocket);
        this.c = bluetoothSocket;
    }

    public final String a() {
        return this.e;
    }

    public final byte[] b() {
        return this.f.b();
    }

    public final synchronized void c() {
        if (!d()) {
            if (this.a) {
                asce asce = this.b;
                this.c = asce.a().createInsecureRfcommSocketToServiceRecord(asce.a);
            }
            if (!this.c.isConnected()) {
                try {
                    this.c.connect();
                } catch (IOException e2) {
                    anih anih = (anih) asil.a.c();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("ascc", "c", 77, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothRfcommConnection failed to connect");
                }
            }
            BluetoothSocket bluetoothSocket = this.c;
            asja asja = new asja(this.a, bluetoothSocket.getInputStream(), bluetoothSocket.getOutputStream());
            this.f = asja;
            asja.c();
        }
    }

    public final void close() {
        asiv asiv = this.f;
        if (asiv != null) {
            asiv.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r1 = this;
            android.bluetooth.BluetoothSocket r0 = r1.c
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0016
            asiv r0 = r1.f
            if (r0 == 0) goto L_0x0016
            asja r0 = (defpackage.asja) r0
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x0016
            r0 = 1
            return r0
        L_0x0016:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ascc.d():boolean");
    }

    public final asfn e() {
        aucd o = asfn.d.o();
        String str = this.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfn asfn = (asfn) o.b;
        str.getClass();
        asfn.a |= 1;
        asfn.b = str;
        aucf aucf = (aucf) asfo.c.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asfo asfo = (asfo) aucf.b;
        asfo.b = 0;
        asfo.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfn asfn2 = (asfn) o.b;
        asfo asfo2 = (asfo) aucf.i();
        asfo2.getClass();
        asfn2.c = asfo2;
        asfn2.a |= 2;
        return (asfn) o.i();
    }

    public final boolean f() {
        return this.a;
    }

    public final String g() {
        BluetoothSocket bluetoothSocket = this.c;
        if (bluetoothSocket == null) {
            return this.b.a().getAddress();
        }
        return bluetoothSocket.getRemoteDevice().getAddress();
    }

    public final asfw h() {
        aucd o = asfw.c.o();
        String str = this.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfw asfw = (asfw) o.b;
        str.getClass();
        asfw.a |= 1;
        asfw.b = str;
        return (asfw) o.i();
    }

    public final void a(byte[] bArr) {
        this.f.a(bArr);
    }

    public ascc(asce asce) {
        this.a = true;
        this.e = ((asih) d).a();
        iva.a((Object) asce);
        this.b = asce;
        this.c = null;
    }
}
