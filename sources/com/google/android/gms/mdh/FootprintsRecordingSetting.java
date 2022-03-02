package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FootprintsRecordingSetting extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ryb();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public FootprintsRecordingSetting(int i, boolean z, boolean z2, long j) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FootprintsRecordingSetting) {
            FootprintsRecordingSetting footprintsRecordingSetting = (FootprintsRecordingSetting) obj;
            return this.a == footprintsRecordingSetting.a && this.b == footprintsRecordingSetting.b && this.c == footprintsRecordingSetting.c && this.d == footprintsRecordingSetting.d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        long j = this.d;
        StringBuilder sb = new StringBuilder(124);
        sb.append("FootprintsRecordingSetting{corpusGroup=");
        sb.append(i);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(", unset=");
        sb.append(z2);
        sb.append(", lastModifiedTimeMicros=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
