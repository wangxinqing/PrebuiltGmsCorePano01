package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rvo();
    public static final StreetViewSource a = new StreetViewSource(0);
    public final int b;

    static {
        StreetViewSource.class.getSimpleName();
        new StreetViewSource(1);
    }

    public StreetViewSource(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StreetViewSource) && this.b == ((StreetViewSource) obj).b;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b)});
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i == 0) {
            str = "DEFAULT";
        } else if (i != 1) {
            str = String.format("UNKNOWN(%s)", new Object[]{Integer.valueOf(i)});
        } else {
            str = "OUTDOOR";
        }
        return String.format("StreetViewSource:%s", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
