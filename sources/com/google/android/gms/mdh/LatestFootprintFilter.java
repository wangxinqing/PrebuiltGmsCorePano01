package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LatestFootprintFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ryd();
    private static final byte[] b = new byte[0];
    public final List a;

    static {
        ryc ryc = new ryc();
        ryc.a(b, 2);
        ryc.a();
        new ryc().a();
    }

    public LatestFootprintFilter(List list) {
        this.a = list;
    }

    public static ryc a() {
        return new ryc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ius.a(this.a, ((LatestFootprintFilter) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
