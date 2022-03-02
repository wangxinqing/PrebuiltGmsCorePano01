package com.google.android.location.reporting.state.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InactiveReason extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajni();
    public static final int[] a = {13, 3, 5, 7, 11, 12, 4, 14, 6, 10};
    public final int b;
    public final String c;

    public InactiveReason(int i, String str) {
        this.b = i;
        iva.a((Object) str, (Object) "missing name");
        this.c = str;
    }

    public static boolean a(Iterable iterable, int i) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((InactiveReason) it.next()).b == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InactiveReason) {
            InactiveReason inactiveReason = (InactiveReason) obj;
            if (this.b != inactiveReason.b || !this.c.equals(inactiveReason.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c});
    }

    public final String toString() {
        int i = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
        sb.append("InactiveReason{mIdentifier=");
        sb.append(i);
        sb.append(", mName='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
