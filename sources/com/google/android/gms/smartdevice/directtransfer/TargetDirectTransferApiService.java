package com.google.android.gms.smartdevice.directtransfer;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TargetDirectTransferApiService extends nio {
    static abpn a = abpn.a;
    static acab b = acab.a;
    private static final iwd l = acqa.a("D2D", "TargetDirectTransferApiService");
    Handler k;
    private acfd m;

    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.d;
        acpo acpo = new acpo(this);
        if (this.m == null) {
            this.m = new acfd(this.e, a, b, this, this.k, str, acpo.b(str), acpo.a(str));
        }
        nit.a(this.m);
    }

    public final void onCreate() {
        l.a("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.k = new qvr(handlerThread.getLooper());
    }

    public final void onDestroy() {
        l.a("onDestroy()", new Object[0]);
        acfd acfd = this.m;
        if (acfd != null) {
            if (!acfd.d) {
                acfd.b();
            }
            if (!jhg.a()) {
                acfd.c.a();
            }
            acfd.a.post(new acey(acfd));
        }
        acpl.a(this.k);
    }

    public TargetDirectTransferApiService() {
        super(211, "com.google.android.gms.smartdevice.directtransfer.TargetDirectTransferService.START", (Set) anfv.a, 3, 10);
    }
}
