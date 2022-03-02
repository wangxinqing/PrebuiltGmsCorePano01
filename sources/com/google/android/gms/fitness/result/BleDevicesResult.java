package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BleDevicesResult extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new neu();
    public final List a;
    public final Status b;

    public BleDevicesResult(List list, Status status) {
        this.a = Collections.unmodifiableList(list);
        this.b = status;
    }

    public final Status aO() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BleDevicesResult)) {
                return false;
            }
            BleDevicesResult bleDevicesResult = (BleDevicesResult) obj;
            if (!this.b.equals(bleDevicesResult.b) || !ius.a(this.a, bleDevicesResult.a)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("status", this.b);
        a2.a("bleDevices", this.a);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
