package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfb();
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;

    public SleepClassifyEvent(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, int i9) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = z;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SleepClassifyEvent) {
            SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
            return this.a == sleepClassifyEvent.a && this.b == sleepClassifyEvent.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = this.d;
        int i6 = this.e;
        int i7 = this.f;
        int i8 = this.g;
        boolean z = this.h;
        int i9 = this.i;
        StringBuilder sb = new StringBuilder(117);
        sb.append(i2);
        sb.append(" - ");
        sb.append(i3);
        sb.append(" - ");
        sb.append(i4);
        sb.append(" - ");
        sb.append(i5);
        sb.append(" - ");
        sb.append(i6);
        sb.append(" - ");
        sb.append(i7);
        sb.append(" - ");
        sb.append(i8);
        sb.append(" - ");
        sb.append(z);
        sb.append(" - ");
        sb.append(i9);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, 5, this.e);
        ivx.b(parcel, 6, this.f);
        ivx.b(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.b(parcel, 9, this.i);
        ivx.b(parcel, a2);
    }
}
