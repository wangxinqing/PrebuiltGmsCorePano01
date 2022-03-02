package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

/* renamed from: vys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vys extends bhw implements vyt {
    public vys() {
        super("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((OnTransferUpdateParams) bhx.a(parcel, OnTransferUpdateParams.CREATOR));
        return true;
    }
}
