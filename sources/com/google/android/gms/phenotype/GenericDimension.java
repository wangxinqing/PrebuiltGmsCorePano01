package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GenericDimension extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new yed();
    public final int a;
    public final int b;

    public GenericDimension(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static int[] a(GenericDimension... genericDimensionArr) {
        int[] iArr = new int[(r0 + r0)];
        int i = 0;
        for (GenericDimension genericDimension : genericDimensionArr) {
            iArr[i] = genericDimension.a;
            iArr[i + 1] = genericDimension.b;
            i += 2;
        }
        return iArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericDimension) && compareTo((GenericDimension) obj) == 0;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "GenericDimension" + "(" + this.a + ", " + this.b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }

    /* renamed from: a */
    public final int compareTo(GenericDimension genericDimension) {
        int i = this.a;
        int i2 = genericDimension.a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.b;
        int i4 = genericDimension.b;
        if (i3 < i4) {
            return -1;
        }
        if (i3 <= i4) {
            return 0;
        }
        return 1;
    }
}
