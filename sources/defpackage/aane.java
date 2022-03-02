package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

/* renamed from: aane  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aane extends qvy {
    final /* synthetic */ aanf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aane(aanf aanf) {
        super("security");
        this.a = aanf;
    }

    public final void a(ComponentName componentName) {
        aanf aanf = this.a;
        if (!aanf.b) {
            aanf.a(new Status(12004), (HarmfulAppsInfo) null);
        }
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        allo allo;
        aanf aanf = this.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.vending.verifier.IPackageVerificationApiService");
            allo = queryLocalInterface instanceof allo ? (allo) queryLocalInterface : new allo(iBinder);
        } else {
            allo = null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("verify_apps_data_flags", 1);
            bundle.putLong("verify_apps_data_autoscan_stale_ms", aanf.a);
            Parcel aQ = allo.aQ();
            bhx.a(aQ, (IInterface) aanf);
            bhx.a(aQ, (Parcelable) bundle);
            allo.c(3, aQ);
        } catch (RemoteException e) {
            aanf.a(new Status(12004), (HarmfulAppsInfo) null);
        }
    }
}
