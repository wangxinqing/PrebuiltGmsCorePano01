package defpackage;

import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;

/* renamed from: asby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asby implements ashq {
    final /* synthetic */ asbz a;

    public asby(asbz asbz) {
        this.a = asbz;
    }

    public final void a() {
        BluetoothServerSocket bluetoothServerSocket = this.a.f;
        if (bluetoothServerSocket != null) {
            try {
                bluetoothServerSocket.close();
            } catch (IOException e) {
                anih anih = (anih) asil.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("asbz", "a", 149, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothRfcommAccept: Error closing connection");
            }
        }
        this.a.e.set(true);
    }

    public final void run() {
        String str;
        if (this.a.b.e()) {
            try {
                asbz asbz = this.a;
                asbz.f = asbz.a.listenUsingInsecureRfcommWithServiceRecord("Nearby", ascd.a);
                while (!this.a.e.get()) {
                    try {
                        jjg jjg = asil.a;
                        BluetoothSocket accept = this.a.f.accept();
                        asbz asbz2 = this.a;
                        synchronized (asbz2.d) {
                            ascc ascc = new ascc(accept);
                            asbz2.d.add(ascc);
                            asbz2.c.a((ashv) ascc);
                            aucd o = asem.e.o();
                            aucd o2 = asfs.f.o();
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            asfs asfs = (asfs) o2.b;
                            asfs.b = 1;
                            asfs.a |= 1;
                            asfw h = ascc.h();
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            asfs asfs2 = (asfs) o2.b;
                            h.getClass();
                            asfs2.c = h;
                            asfs2.a |= 2;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            asem asem = (asem) o.b;
                            asfs asfs3 = (asfs) o2.i();
                            asfs3.getClass();
                            asem.c = asfs3;
                            asem.a |= 2;
                            aucd o3 = asfv.d.o();
                            auay a2 = auay.a(asgt.a(ascc.g()));
                            if (o3.c) {
                                o3.c();
                                o3.c = false;
                            }
                            asfv asfv = (asfv) o3.b;
                            a2.getClass();
                            asfv.a = 1 | asfv.a;
                            asfv.b = a2;
                            BluetoothSocket bluetoothSocket = ascc.c;
                            if (bluetoothSocket == null) {
                                str = ascc.b.a().getName();
                            } else {
                                str = bluetoothSocket.getRemoteDevice().getName();
                            }
                            if (o3.c) {
                                o3.c();
                                o3.c = false;
                            }
                            asfv asfv2 = (asfv) o3.b;
                            str.getClass();
                            asfv2.a |= 2;
                            asfv2.c = str;
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            asem asem2 = (asem) o.b;
                            asfv asfv3 = (asfv) o3.i();
                            asfv3.getClass();
                            asem2.d = asfv3;
                            asem2.a |= 4;
                            asbz2.g.a((asem) o.i());
                        }
                    } catch (IOException e) {
                        jjg jjg2 = asil.a;
                        return;
                    }
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new RuntimeException("Failed to enable bluetooth");
        }
    }
}
