package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ruz();
    public final int a;
    public final Float b;
    private final ruv c;

    static {
        Cap.class.getSimpleName();
    }

    public Cap(int i, ruv ruv, Float f) {
        boolean z;
        boolean z2;
        if (f == null || f.floatValue() <= 0.0f) {
            z = false;
        } else {
            z = true;
        }
        if (i != 3) {
            z2 = true;
        } else {
            z2 = ruv != null && z;
        }
        iva.b(z2, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), ruv, f}));
        this.a = i;
        this.c = ruv;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cap) {
            Cap cap = (Cap) obj;
            return this.a == cap.a && ius.a(this.c, cap.c) && ius.a(this.b, cap.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.b});
    }

    public String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ruv ruv = this.c;
        if (ruv != null) {
            iBinder = ruv.a.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 3, iBinder);
        ivx.a(parcel, 4, this.b);
        ivx.b(parcel, a2);
    }
}
