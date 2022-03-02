package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: zat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zat extends qvy {
    final /* synthetic */ ytm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zat(ytm ytm, String str) {
        super(str);
        this.a = ytm;
    }

    public final void a(ComponentName componentName) {
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        fwn fwn;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.IRevocationService");
            if (queryLocalInterface instanceof fwn) {
                fwn = (fwn) queryLocalInterface;
            } else {
                fwn = new fwl(iBinder);
            }
            try {
                fwn.b();
            } catch (RemoteException e) {
                Log.w("PlusService", "Could not invoke revokeAccess on IRevocationService", e);
            } catch (Throwable th) {
                jca.a().a(this.a.a, (ServiceConnection) this);
                throw th;
            }
            jca.a().a(this.a.a, (ServiceConnection) this);
        }
    }
}
