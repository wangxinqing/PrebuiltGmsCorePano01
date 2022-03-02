package com.google.android.gms.smartdevice.d2d;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SourceDeviceApiService extends nio {
    private static final iwd b = acqa.a("D2D", "SourceDeviceApiService");
    private static final abpn m = abpn.a;
    private static final acab n = acab.a;
    Handler a;
    private absd k;
    private acgt l;

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.d;
        acpo acpo = new acpo(this);
        boolean a2 = acpo.a(str);
        new isq(str).b();
        Feature[] featureArr = getServiceRequest.i;
        if (featureArr == null || featureArr.length == 0) {
            if (this.k == null) {
                this.k = new absd(this.e, m, n, this, this.a, str, a2);
            }
            nit.a(this.k);
        } else if (featureArr[0].equals(abmo.a)) {
            if (this.l == null) {
                this.l = new acgt(this.e, this, str, acpo.b(str));
            }
            nit.a(this.l);
        }
    }

    public final void onCreate() {
        b.a("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("SourceDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.a = new qvr(handlerThread.getLooper());
    }

    public final void onDestroy() {
        b.a("onDestroy()", new Object[0]);
        absd absd = this.k;
        if (absd != null) {
            absd.c();
        }
        acqe.a();
        acpl.a(this.a);
    }

    public SourceDeviceApiService() {
        super(75, "com.google.android.gms.smartdevice.d2d.SourceDeviceService.START", (Set) anfv.a, 3, 10);
    }
}
