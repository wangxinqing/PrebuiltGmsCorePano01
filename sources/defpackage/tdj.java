package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;

/* renamed from: tdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tdj implements asgs {
    final /* synthetic */ tdk a;

    public tdj(tdk tdk) {
        this.a = tdk;
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        asfk asfk = (asfk) audx;
        anil anil = tdk.b;
        asfz asfz = asfk.b;
        if (asfz == null) {
            asfz = asfz.d;
        }
        String str = asfz.b;
        asfz asfz2 = asfk.b;
        if (asfz2 == null) {
            asfz2 = asfz.d;
        }
        if ((asfz2.a & 2) != 0) {
            asfz asfz3 = asfk.b;
            if (asfz3 == null) {
                asfz3 = asfz.d;
            }
            int i = asfz3.c;
            asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        }
        asgb asgb2 = asgb.OPERATION_STATUS_UNKNOWN;
        int a2 = asfm.a(asfk.c);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        if (i2 == 2) {
            tdk tdk = this.a;
            if (!tdk.g) {
                asfn asfn = asfk.d;
                if (asfn == null) {
                    asfn = asfn.d;
                }
                tdk.e = asfn;
                tdk tdk2 = this.a;
                tdk2.g = true;
                tdk2.h = true;
                try {
                    SystemClock.elapsedRealtime();
                    if (tdk.a((IInterface) tdk2.p)) {
                        tdk2.r.a(12, tdk2);
                        tdk2.p.a(tdk2.k, (byte[]) null);
                    }
                    tdk2.o.b();
                } catch (RemoteException e) {
                    ((anih) ((anih) tdk.b.c()).a("tdk", "f", 112, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: fail to call ConnectionListener.onConnected");
                }
            }
        } else if (i2 == 3) {
            asfp asfp = asfk.e;
            if (asfp == null) {
                asfp = asfp.c;
            }
            if ((asfp.a & 1) != 0) {
                asfp asfp2 = asfk.e;
                if (asfp2 == null) {
                    asfp2 = asfp.c;
                }
                byte[] k = asfp2.b.k();
                tdk tdk3 = this.a;
                try {
                    SystemClock.elapsedRealtime();
                    if (tdk.a((IInterface) tdk3.q)) {
                        tdk3.q.a(k);
                    }
                } catch (RemoteException e2) {
                    ((anih) ((anih) tdk.b.c()).a("tdk", "a", 139, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: fail to call DataListener.onDataReceived");
                }
            }
        } else if (i2 == 4) {
            tdk tdk4 = this.a;
            tdk4.e = null;
            tdk4.d();
        } else if (i2 == 5) {
            tdk tdk5 = this.a;
            String str2 = asfk.f;
            try {
                SystemClock.elapsedRealtime();
                if (tdk.a((IInterface) tdk5.p)) {
                    tdk5.p.b(str2);
                }
            } catch (RemoteException e3) {
                ((anih) ((anih) tdk.b.c()).a("tdk", "a", 151, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: fail to call DataListener.onDataReceived");
            }
        }
        asfz asfz4 = asfk.b;
        if (asfz4 == null) {
            asfz4 = asfz.d;
        }
        asgb a3 = asgb.a(asfz4.c);
        if (a3 == null) {
            a3 = asgb.OPERATION_STATUS_UNKNOWN;
        }
        int ordinal = a3.ordinal();
        if (ordinal == 3) {
            tdk tdk6 = this.a;
            tdk6.g = false;
            tdk6.e = null;
            if (tdk6.h) {
                tdk6.g();
            } else if (tdk6.i) {
                try {
                    if (tdk.a((IInterface) tdk6.p)) {
                        tdk6.p.a(16);
                    }
                    tdk6.o.b();
                } catch (RemoteException e4) {
                    ((anih) ((anih) tdk.b.c()).a("tdk", "i", 177, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("SocketDevice: fail to call ConnectionListener.onError(CANCELED)");
                }
            } else {
                tdk6.h();
            }
        } else if (ordinal == 4) {
            tdk tdk7 = this.a;
            tdk7.g = false;
            tdk7.e = null;
            tdk7.h();
        }
    }
}
