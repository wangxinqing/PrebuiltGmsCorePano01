package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserPreferredSleepWindow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfe();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public UserPreferredSleepWindow(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (i < 0) {
            z = false;
        } else {
            z = i <= 23;
        }
        iva.a(z, (Object) "Start hour must be in range [0, 23].");
        if (i2 < 0) {
            z2 = false;
        } else {
            z2 = i2 <= 59;
        }
        iva.a(z2, (Object) "Start minute must be in range [0, 59].");
        if (i3 < 0) {
            z3 = false;
        } else {
            z3 = i3 <= 23;
        }
        iva.a(z3, (Object) "End hour must be in range [0, 23].");
        if (i4 < 0) {
            z4 = false;
        } else {
            z4 = i4 <= 59;
        }
        iva.a(z4, (Object) "End minute must be in range [0, 59].");
        iva.a(((i + i2) + i3) + i4 <= 0 ? false : z5, (Object) "Parameters can't be all 0.");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserPreferredSleepWindow) {
            UserPreferredSleepWindow userPreferredSleepWindow = (UserPreferredSleepWindow) obj;
            return this.a == userPreferredSleepWindow.a && this.b == userPreferredSleepWindow.b && this.c == userPreferredSleepWindow.c && this.d == userPreferredSleepWindow.d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
