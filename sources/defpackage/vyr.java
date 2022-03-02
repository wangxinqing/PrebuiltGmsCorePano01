package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

/* renamed from: vyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vyr extends bhv implements vyt {
    public vyr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
    }

    public final void a(OnTransferUpdateParams onTransferUpdateParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onTransferUpdateParams);
        c(1, aQ);
    }
}
