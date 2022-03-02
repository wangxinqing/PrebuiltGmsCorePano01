package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: abzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abzo extends qvy {
    final /* synthetic */ acwd a;
    final /* synthetic */ abzs b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abzo(abzs abzs, String str, acwd acwd) {
        super(str);
        this.b = abzs;
        this.a = acwd;
    }

    public final void a(ComponentName componentName) {
        abzs.a.a("service disconnected %s", componentName);
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        ity ity;
        abzs abzs = this.b;
        acwd acwd = this.a;
        GetServiceRequest getServiceRequest = new GetServiceRequest(iyc.SMARTDEVICE_SETUP_ACCOUNTS_BOOTSTRAP.a());
        getServiceRequest.d = abzs.b.getPackageName();
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            ity = (queryLocalInterface == null || !(queryLocalInterface instanceof ity)) ? new itw(iBinder) : (ity) queryLocalInterface;
        } else {
            ity = null;
        }
        abzs.d = ity;
        ity ity2 = abzs.d;
        if (ity2 == null) {
            acwd.b((Exception) new IllegalStateException("Service broker is null"));
            return;
        }
        try {
            ity2.a(new abzr(abzs.c, abzs), getServiceRequest);
        } catch (RemoteException e) {
            abzs.a.a((Throwable) e);
            acwd.b((Exception) e);
        }
    }
}
