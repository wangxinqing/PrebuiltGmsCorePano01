package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ContactFilter;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetContactsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vxo();
    public vyd a;
    public int b;
    public int c;
    public ContactFilter d;

    public GetContactsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetContactsParams) {
            GetContactsParams getContactsParams = (GetContactsParams) obj;
            return ius.a(this.a, getContactsParams.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(getContactsParams.b)) && ius.a(Integer.valueOf(this.c), Integer.valueOf(getContactsParams.c)) && ius.a(this.d, getContactsParams.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public GetContactsParams(IBinder iBinder, int i, int i2, ContactFilter contactFilter) {
        vyd vyd;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IContactsResultListener");
            vyd = queryLocalInterface instanceof vyd ? (vyd) queryLocalInterface : new vyb(iBinder);
        } else {
            vyd = null;
        }
        this.a = vyd;
        this.b = i;
        this.c = i2;
        this.d = contactFilter;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a.asBinder());
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
