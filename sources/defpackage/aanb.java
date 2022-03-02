package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

/* renamed from: aanb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aanb extends qvy {
    final /* synthetic */ aanc a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aanb(aanc aanc) {
        super("security");
        this.a = aanc;
    }

    public final void a(ComponentName componentName) {
        aanc aanc = this.a;
        if (!aanc.b) {
            aanc.a(new Status(12004), (HarmfulAppsInfo) null);
        }
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        allo allo;
        aanc aanc = this.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.vending.verifier.IPackageVerificationApiService");
            allo = queryLocalInterface instanceof allo ? (allo) queryLocalInterface : new allo(iBinder);
        } else {
            allo = null;
        }
        try {
            Parcel aQ = allo.aQ();
            bhx.a(aQ, (IInterface) aanc);
            allo.c(1, aQ);
        } catch (RemoteException e) {
            aanc.a(new Status(12004), (HarmfulAppsInfo) null);
        }
    }
}
