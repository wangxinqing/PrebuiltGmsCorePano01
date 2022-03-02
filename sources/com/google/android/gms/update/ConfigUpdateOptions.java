package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConfigUpdateOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adib();
    public final boolean a;

    public ConfigUpdateOptions(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConfigUpdateOptions) || this.a != ((ConfigUpdateOptions) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("userInitiated", Boolean.valueOf(this.a));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.b(parcel, a2);
    }
}
