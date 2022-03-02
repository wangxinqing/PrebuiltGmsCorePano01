package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FlagOverrides extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yec();
    public final List a;

    public FlagOverrides(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlagOverrides) {
            return this.a.equals(((FlagOverrides) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        List list = this.a;
        int size = list.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            FlagOverride flagOverride = (FlagOverride) list.get(i);
            if (!z) {
                sb.append(", ");
            }
            flagOverride.a(sb);
            i++;
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
