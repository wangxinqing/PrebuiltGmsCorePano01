package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BleDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ndd();
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    public BleDevice(String str, String str2, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BleDevice) {
            BleDevice bleDevice = (BleDevice) obj;
            return this.b.equals(bleDevice.b) && this.a.equals(bleDevice.a) && new HashSet(this.c).equals(new HashSet(bleDevice.c)) && new HashSet(this.d).equals(new HashSet(bleDevice.d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("name", this.b);
        a2.a("address", this.a);
        a2.a("dataTypes", this.d);
        a2.a("supportedProfiles", this.c);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, 3, this.c, false);
        ivx.c(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
