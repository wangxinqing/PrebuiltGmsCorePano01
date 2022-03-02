package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: rjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class rjz extends bhw implements rka {
    public rjz() {
        super("com.google.android.gms.location.places.internal.IPlacesCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((DataHolder) bhx.a(parcel, DataHolder.CREATOR));
        } else if (i == 2) {
            b((DataHolder) bhx.a(parcel, DataHolder.CREATOR));
        } else if (i == 3) {
            c((DataHolder) bhx.a(parcel, DataHolder.CREATOR));
        } else if (i == 4) {
            a((Status) bhx.a(parcel, Status.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            d((DataHolder) bhx.a(parcel, DataHolder.CREATOR));
        }
        return true;
    }
}
