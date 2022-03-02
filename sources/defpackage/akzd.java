package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: akzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akzd implements rqs {
    final /* synthetic */ akzj a;

    public akzd(akzj akzj) {
        this.a = akzj;
    }

    public final void a(rqn rqn) {
        CameraPosition a2 = this.a.f.a();
        try {
            this.a.f.a.h();
            akzj.a(rqn, a2);
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
