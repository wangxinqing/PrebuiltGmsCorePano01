package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActivityStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adhw();
    public final boolean a;
    public final boolean b;

    public ActivityStatus(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ActivityStatus) {
            ActivityStatus activityStatus = (ActivityStatus) obj;
            if (this.a == activityStatus.a && this.b == activityStatus.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("isUp", Boolean.valueOf(this.a));
        a2.a("isSetupWizard", Boolean.valueOf(this.b));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
