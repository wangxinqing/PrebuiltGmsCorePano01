package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConsistencyInformation extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new acyf();
    public final String a;
    public final int b;

    public ConsistencyInformation(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConsistencyInformation) {
            ConsistencyInformation consistencyInformation = (ConsistencyInformation) obj;
            return ius.a(this.a, consistencyInformation.a) && this.b == consistencyInformation.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("ConsistencyTokenJar", this.a);
        a2.a("MaxAgeSec", Integer.valueOf(this.b));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
