package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapChimeraService;

/* renamed from: tff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tff extends irg {
    final /* synthetic */ NearbyBootstrapChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tff(NearbyBootstrapChimeraService nearbyBootstrapChimeraService) {
        super(nearbyBootstrapChimeraService, 69, new int[0]);
        this.a = nearbyBootstrapChimeraService;
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        try {
            NearbyBootstrapChimeraService nearbyBootstrapChimeraService = this.a;
            anil anil = NearbyBootstrapChimeraService.a;
            if (nearbyBootstrapChimeraService.b == null) {
                nearbyBootstrapChimeraService.b = new tfq(nearbyBootstrapChimeraService, nearbyBootstrapChimeraService.c);
                tfq tfq = this.a.b;
                jca a2 = jca.a();
                Context context = tfq.c;
                a2.a(context, asec.a(context), tfq.e, 1);
            }
            tfq tfq2 = this.a.b;
            tfq2.asBinder();
            isv.a(0, (IBinder) tfq2, (Bundle) null);
        } catch (RemoteException e) {
            anih anih = (anih) NearbyBootstrapChimeraService.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("tff", "a", 78, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Client died while brokering nearbybootstrap service");
        }
    }
}
