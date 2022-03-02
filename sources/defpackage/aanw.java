package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: aanw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aanw extends qvy {
    final /* synthetic */ aanx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aanw(aanx aanx) {
        super("security");
        this.a = aanx;
    }

    public final void a(ComponentName componentName) {
        this.a.a.countDown();
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        allo allo;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.vending.verifier.IPackageVerificationApiService");
            allo = queryLocalInterface instanceof allo ? (allo) queryLocalInterface : new allo(iBinder);
        } else {
            allo = null;
        }
        try {
            aanx aanx = this.a;
            int i = 3;
            if (aanx.c >= 80832200) {
                if (aanx.d) {
                    i = 7;
                }
            }
            if (allo != null) {
                long j = (long) i;
                Parcel aQ = allo.aQ();
                bhx.a(aQ, (IInterface) aanx);
                aQ.writeLong(j);
                allo.c(2, aQ);
            }
        } catch (RemoteException e) {
            this.a.a.countDown();
        }
    }
}
