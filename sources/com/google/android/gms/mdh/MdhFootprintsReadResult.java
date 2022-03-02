package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdhFootprintsReadResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wkm(new ryi());
    public final List a;
    public final SyncStatus b;

    public MdhFootprintsReadResult(List list, SyncStatus syncStatus) {
        this.a = list;
        this.b = syncStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) obj;
            return ius.a(this.a, mdhFootprintsReadResult.a) && ius.a(this.b, mdhFootprintsReadResult.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "MdhFootprintsReadResult{mdhFootprints=%s, syncStatus=%s}", new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        wkm.a(this, parcel, new ryh(i));
    }
}
