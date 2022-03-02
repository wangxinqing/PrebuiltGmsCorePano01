package com.google.android.gms.smartdevice.directtransfer;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SourceDirectTransferApiService extends nio {
    private static final iwd b = acqa.a("DirectTransfer", "SourceDirectTransferApiService");
    private static final abpn l = abpn.a;
    private static final acab m = acab.a;
    Handler a;
    private acex k;

    /* access modifiers changed from: protected */
    public final void a(nit nit, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.d;
        acpo acpo = new acpo(this);
        isq isq = new isq(str);
        if (this.k == null) {
            this.k = new acex(this.e, l, m, this, this.a, str, isq.a(), acpo.a(str));
        }
        nit.a(this.k);
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
        acex acex = this.k;
        if (acex != null) {
            acah acah = acex.a;
            if (acah != null) {
                acex.a(acah, acex.b);
            }
            acex.b();
        }
        acqe.a();
        acpl.a(this.a);
    }

    public SourceDirectTransferApiService() {
        super(210, "com.google.android.gms.smartdevice.directtransfer.SourceDirectTransferService.START", (Set) anfv.a, 3, 10);
    }
}
