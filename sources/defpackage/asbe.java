package defpackage;

import android.bluetooth.BluetoothManager;
import java.io.IOException;

/* renamed from: asbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbe implements ashq {
    final /* synthetic */ asbg a;

    public asbe(asbg asbg) {
        this.a = asbg;
    }

    public final void a() {
        this.a.a();
    }

    public final void run() {
        jjg jjg = asil.a;
        this.a.b = new ampk(asda.b, asda.e, asda.f, new asbc(this));
        asbg asbg = this.a;
        ampk ampk = asbg.b;
        ampk.a(aeka.a(((BluetoothManager) this.a.a.getSystemService("bluetooth")).openGattServer(asbg.a, ampk.b)), (ampj) new asbd(this));
        while (!this.a.f.get()) {
            try {
                asbf asbf = (asbf) this.a.g.take();
                IOException iOException = asbf.b;
                if (iOException == null) {
                    asbg asbg2 = this.a;
                    asbn asbn = asbf.a;
                    synchronized (asbg2.c) {
                        asbg2.c.add(asbn);
                        asbg2.d.a((ashv) asbn);
                        aucd o = asem.e.o();
                        aucd o2 = asfs.f.o();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        asfs asfs = (asfs) o2.b;
                        asfs.b = 3;
                        asfs.a |= 1;
                        asfw g = asbn.g();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        asfs asfs2 = (asfs) o2.b;
                        g.getClass();
                        asfs2.c = g;
                        asfs2.a |= 2;
                        aucd o3 = asft.c.o();
                        auay a2 = auay.a(asgt.a(asbn.a));
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        asft asft = (asft) o3.b;
                        a2.getClass();
                        asft.a |= 1;
                        asft.b = a2;
                        asft asft2 = (asft) o3.i();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        asfs asfs3 = (asfs) o2.b;
                        asft2.getClass();
                        asfs3.e = asft2;
                        asfs3.a |= 16;
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        asem asem = (asem) o.b;
                        asfs asfs4 = (asfs) o2.i();
                        asfs4.getClass();
                        asem.c = asfs4;
                        asem.a |= 2;
                        asgs asgs = asbg2.e;
                        if (asgs != null) {
                            asgs.a((asem) o.i());
                        }
                    }
                } else {
                    throw iOException;
                }
            } catch (IOException | InterruptedException e) {
                return;
            }
        }
    }
}
