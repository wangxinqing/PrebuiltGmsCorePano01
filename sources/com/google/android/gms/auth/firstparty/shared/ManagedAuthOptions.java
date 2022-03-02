package com.google.android.gms.auth.firstparty.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ManagedAuthOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gee();
    final int a;
    public int b;
    int c;
    @Deprecated
    long d;

    public ManagedAuthOptions() {
        this(1, 0, 0, -1);
    }

    public static ManagedAuthOptions a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new ManagedAuthOptions();
        }
        return (ManagedAuthOptions) ivy.a(bArr, CREATOR);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ManagedAuthOptions) {
            ManagedAuthOptions managedAuthOptions = (ManagedAuthOptions) obj;
            if (this.b == managedAuthOptions.b && this.c == managedAuthOptions.c && this.d == managedAuthOptions.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    @Deprecated
    public ManagedAuthOptions(int i, int i2) {
        this(1, i, i2, 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }

    public ManagedAuthOptions(int i, int i2, int i3, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("enforced_management_mode", this.b);
        bundle.putInt("restore_mode", this.c);
        long j = this.d;
        if (j != -1) {
            bundle.putLong("source_device_id", j);
        }
        return bundle;
    }
}
