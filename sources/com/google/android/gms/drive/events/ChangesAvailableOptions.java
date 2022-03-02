package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ChangesAvailableOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ksm();
    public final int a;
    public final boolean b;
    final List c;

    public ChangesAvailableOptions(int i, boolean z, List list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    public final Set a() {
        return new HashSet(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ChangesAvailableOptions changesAvailableOptions = (ChangesAvailableOptions) obj;
        return ius.a(this.c, changesAvailableOptions.c) && this.a == changesAvailableOptions.a && this.b == changesAvailableOptions.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.c(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
