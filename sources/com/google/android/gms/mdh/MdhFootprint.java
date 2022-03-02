package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdhFootprint extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ryg();
    public final byte[] a;
    public final byte[] b;
    public final long c;

    public MdhFootprint(byte[] bArr, byte[] bArr2, long j) {
        this.a = bArr;
        this.c = j;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdhFootprint mdhFootprint = (MdhFootprint) obj;
            return this.c == mdhFootprint.c && Arrays.equals(this.a, mdhFootprint.a) && Arrays.equals(this.b, mdhFootprint.b);
        }
    }

    public final int hashCode() {
        Object[] objArr = new Object[3];
        byte[] bArr = this.a;
        if (bArr.length >= 64) {
            bArr = Arrays.copyOf(bArr, 64);
        }
        objArr[0] = Arrays.toString(bArr);
        objArr[1] = Arrays.toString(this.b);
        objArr[2] = Long.valueOf(this.c);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "MdhFootprint{sizeOf(data)=%d, secondaryId=%s, serverEventIdTimestamp=%d}", new Object[]{Integer.valueOf(this.a.length), Arrays.toString(this.b), Long.valueOf(this.c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
