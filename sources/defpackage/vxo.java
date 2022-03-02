package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.ContactFilter;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;

/* renamed from: vxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vxo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetContactsParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        ContactFilter contactFilter = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                i2 = ivw.g(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                contactFilter = (ContactFilter) ivw.a(parcel, readInt, ContactFilter.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new GetContactsParams(iBinder, i, i2, contactFilter);
    }
}
