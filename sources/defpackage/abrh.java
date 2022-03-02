package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import java.util.concurrent.ExecutionException;

/* renamed from: abrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abrh implements Runnable {
    private final abri a;

    public abrh(abri abri) {
        this.a = abri;
    }

    public final void run() {
        acwa acwa;
        Status status;
        abri abri = this.a;
        absf absf = abri.b;
        ConnectParams connectParams = abri.a;
        iva.a(absf.c);
        absf.b.e(2);
        acaj.a(absf.b, 21);
        abxe abxe = connectParams.a;
        if (abxe == null) {
            absf.a.d("connect2 received null device callbacks", new Object[0]);
            return;
        }
        abra abra = absf.d;
        ConnectionRequest connectionRequest = connectParams.b;
        abxb abxb = connectParams.c;
        iva.a((Object) abxe, (Object) "SourceDeviceCallbacks must not be null!");
        if (connectionRequest == null || abxb == null) {
            abra.c(abxe, new Status(10594));
            return;
        }
        D2DDevice d2DDevice = connectionRequest.a;
        int i = 4;
        if (!azky.d()) {
            if (d2DDevice == null || d2DDevice.b == 2) {
                abra.d.f(4);
            } else {
                abra.c(abxe, new Status(13));
                return;
            }
        } else if (d2DDevice != null) {
            acah acah = abra.d;
            int i2 = d2DDevice.b;
            if (i2 == 1) {
                i = 2;
            } else if (i2 != 2) {
                i = 1;
            }
            acah.f(i);
        } else {
            abra.d.f(4);
        }
        if (abra.k == null) {
            if (azlf.f()) {
                abra.g.c();
            }
            abra.m = false;
            abra.i = d2DDevice;
            abra.k = abra.f.a(abra.c, abra, abxb);
            if (abra.b) {
                abra.d();
            }
            abqy abqy = new abqy(abra, abra.k, abxb);
            abqg abqg = abra.h;
            if (!azky.d()) {
                abpx abpx = (abpx) abqg;
                abpx.c = 3;
                acwa = abpx.b.a(connectionRequest, (acau) abqy);
            } else {
                D2DDevice d2DDevice2 = connectionRequest.a;
                if (d2DDevice2 == null) {
                    abpx abpx2 = (abpx) abqg;
                    abpx2.c = 3;
                    acwa = abpx2.b.a(connectionRequest, (acau) abqy);
                } else {
                    int i3 = d2DDevice2.b;
                    if (i3 == 1) {
                        abpx abpx3 = (abpx) abqg;
                        abpx3.c = 2;
                        acwa = abpx3.a.a(d2DDevice2, abqy, connectionRequest.b);
                    } else if (i3 != 2) {
                        acwa = acws.a((Exception) new ibr(new Status(13)));
                    } else {
                        abpx abpx4 = (abpx) abqg;
                        abpx4.c = 3;
                        acwa = abpx4.b.a(connectionRequest, (acau) abqy);
                    }
                }
            }
            try {
                acws.a(acwa);
            } catch (InterruptedException | ExecutionException e) {
                abra.a.a(e);
            }
            if (acwa.b()) {
                status = Status.a;
            } else {
                Exception e2 = acwa.e();
                if (e2 instanceof ibr) {
                    status = new Status(((ibr) e2).a());
                } else {
                    status = new Status(13);
                }
            }
            if (!status.c()) {
                abra.a.e("Connection to device failed (%s)", status);
                abra.d.b(status.i);
                abra.a();
            }
            abra.c(abxe, status);
            return;
        }
        abra.a.e("Connection already in progress.", new Object[0]);
        abra.c(abxe, new Status(10566));
    }
}
