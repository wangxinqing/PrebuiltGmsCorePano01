package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ContactFilter;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetContactsCountParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vxm();
    public vyh a;
    public ContactFilter b;

    public GetContactsCountParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetContactsCountParams) {
            GetContactsCountParams getContactsCountParams = (GetContactsCountParams) obj;
            return ius.a(this.a, getContactsCountParams.a) && ius.a(this.b, getContactsCountParams.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public GetContactsCountParams(IBinder iBinder, ContactFilter contactFilter) {
        vyh vyh;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IIntResultListener");
            vyh = queryLocalInterface instanceof vyh ? (vyh) queryLocalInterface : new vyf(iBinder);
        } else {
            vyh = null;
        }
        this.a = vyh;
        this.b = contactFilter;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a.asBinder());
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
