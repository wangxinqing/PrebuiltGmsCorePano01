package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdhFootprintListSafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wkm(new saz());
    public final List a;

    public MdhFootprintListSafeParcelable(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((MdhFootprintListSafeParcelable) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("MdhFootprintListSafeParcelable{mdhFootprints=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        wkm.a(this, parcel, new say());
    }
}
