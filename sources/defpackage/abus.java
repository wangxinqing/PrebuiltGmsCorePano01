package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;

/* renamed from: abus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abus implements acvp {
    private final abut a;

    public abus(abut abut) {
        this.a = abut;
    }

    public final void a(acwa acwa) {
        abut abut = this.a;
        if (!acwa.b()) {
            abva.a.a((Throwable) acwa.e());
            try {
                abut.a.a(Status.c, (ManagedAccountSetupInfo) null);
            } catch (RemoteException e) {
                abva.a.a((Throwable) e);
            }
        } else {
            try {
                abut.a.a(Status.a, (ManagedAccountSetupInfo) acwa.d());
            } catch (RemoteException e2) {
                abva.a.a((Throwable) e2);
            }
        }
    }
}
