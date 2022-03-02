package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FlagOverride extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yeb();
    public final String a;
    public final String b;
    public final Flag c;
    public final boolean d;

    public FlagOverride(String str, String str2, Flag flag, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = flag;
        this.d = z;
    }

    public final String a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.a(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlagOverride) {
            FlagOverride flagOverride = (FlagOverride) obj;
            return yez.a(this.a, flagOverride.a) && yez.a(this.b, flagOverride.b) && yez.a(this.c, flagOverride.c) && this.d == flagOverride.d;
        }
    }

    public final String toString() {
        return a(new StringBuilder());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.a(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }
}
