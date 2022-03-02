package defpackage;

import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: tco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tco implements asgs {
    final /* synthetic */ tcp a;

    public tco(tcp tcp) {
        this.a = tcp;
    }

    public final void a(asgh asgh) {
        tcp tcp = this.a;
        anil anil = tcp.a;
        Device a2 = tcp.a(asgh);
        if (a2 != null && this.a.b()) {
            try {
                tcp tcp2 = this.a;
                tcp2.e.a(6, (tdh) tcp2);
                this.a.b.a(a2);
            } catch (RemoteException | NullPointerException e) {
                anih anih = (anih) tcp.a.c();
                anih.a(e);
                ((anih) anih.a("tco", "a", 54, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleScanner: Fail to update scan listener");
            }
        }
        if ((asgh.a & 1) != 0) {
            asfz asfz = asgh.b;
            if (asfz == null) {
                asfz = asfz.d;
            }
            asgb a3 = asgb.a(asfz.c);
            if (a3 == null) {
                a3 = asgb.OPERATION_STATUS_UNKNOWN;
            }
            if (a3 != asgb.OPERATION_STATUS_FINISHED) {
                asfz asfz2 = asgh.b;
                if (asfz2 == null) {
                    asfz2 = asfz.d;
                }
                asgb a4 = asgb.a(asfz2.c);
                if (a4 == null) {
                    a4 = asgb.OPERATION_STATUS_UNKNOWN;
                }
                if (a4 != asgb.OPERATION_STATUS_FAILED) {
                    return;
                }
            }
            asfz asfz3 = asgh.b;
            if (asfz3 == null) {
                asfz3 = asfz.d;
            }
            if ((asfz3.a & 2) != 0) {
                asfz asfz4 = asgh.b;
                if (asfz4 == null) {
                    asfz4 = asfz.d;
                }
                int i = asfz4.c;
            }
            if (this.a.b()) {
                tcp tcp3 = this.a;
                if (tcp3.c) {
                    try {
                        tcp3.b.b();
                    } catch (RemoteException | NullPointerException e2) {
                        anih anih2 = (anih) tcp.a.c();
                        anih2.a(e2);
                        ((anih) anih2.a("tco", "a", 72, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleScanner: Fail to call onScanStopped");
                    }
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        asgh asgh = (asgh) audx;
        tcp tcp = this.a;
        anil anil = tcp.a;
        Device a2 = tcp.a(asgh);
        if (a2 != null && this.a.b()) {
            try {
                tcp tcp2 = this.a;
                tcp2.e.a(6, (tdh) tcp2);
                this.a.b.a(a2);
            } catch (RemoteException | NullPointerException e) {
                anih anih = (anih) tcp.a.c();
                anih.a(e);
                ((anih) anih.a("tco", "a", 54, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleScanner: Fail to update scan listener");
            }
        }
        if ((asgh.a & 1) != 0) {
            asfz asfz = asgh.b;
            if (asfz == null) {
                asfz = asfz.d;
            }
            asgb a3 = asgb.a(asfz.c);
            if (a3 == null) {
                a3 = asgb.OPERATION_STATUS_UNKNOWN;
            }
            if (a3 != asgb.OPERATION_STATUS_FINISHED) {
                asfz asfz2 = asgh.b;
                if (asfz2 == null) {
                    asfz2 = asfz.d;
                }
                asgb a4 = asgb.a(asfz2.c);
                if (a4 == null) {
                    a4 = asgb.OPERATION_STATUS_UNKNOWN;
                }
                if (a4 != asgb.OPERATION_STATUS_FAILED) {
                    return;
                }
            }
            asfz asfz3 = asgh.b;
            if (asfz3 == null) {
                asfz3 = asfz.d;
            }
            if ((asfz3.a & 2) != 0) {
                asfz asfz4 = asgh.b;
                if (asfz4 == null) {
                    asfz4 = asfz.d;
                }
                int i = asfz4.c;
            }
            if (this.a.b()) {
                tcp tcp3 = this.a;
                if (tcp3.c) {
                    try {
                        tcp3.b.b();
                    } catch (RemoteException | NullPointerException e2) {
                        anih anih2 = (anih) tcp.a.c();
                        anih2.a(e2);
                        ((anih) anih2.a("tco", "a", 72, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleScanner: Fail to call onScanStopped");
                    }
                }
            }
        }
    }
}
