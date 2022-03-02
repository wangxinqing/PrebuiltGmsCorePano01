package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConsentCancelReason extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new acyc();
    public final int a;
    public final boolean b;

    public ConsentCancelReason(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConsentCancelReason) {
            ConsentCancelReason consentCancelReason = (ConsentCancelReason) obj;
            return this.a == consentCancelReason.a && this.b == consentCancelReason.b;
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("CancelAction", Integer.valueOf(this.a));
        a2.a("HadErrors", Boolean.valueOf(this.b));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
