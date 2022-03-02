package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ChangeSequenceNumber extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jyx();
    public final long a;
    public final long b;
    public final long c;
    private volatile String d = null;

    public ChangeSequenceNumber(long j, long j2, long j3) {
        boolean z = true;
        iva.b(j != -1);
        iva.b(j2 != -1);
        iva.b(j3 == -1 ? false : z);
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == ChangeSequenceNumber.class) {
            ChangeSequenceNumber changeSequenceNumber = (ChangeSequenceNumber) obj;
            if (changeSequenceNumber.b == this.b && changeSequenceNumber.c == this.c && changeSequenceNumber.a == this.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(valueOf);
        sb.append(valueOf2);
        sb.append(valueOf3);
        return sb.toString().hashCode();
    }

    public final String toString() {
        if (this.d == null) {
            aucd o = kwn.f.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            kwn kwn = (kwn) o.b;
            int i = kwn.a | 1;
            kwn.a = i;
            kwn.b = 1;
            long j = this.a;
            int i2 = i | 2;
            kwn.a = i2;
            kwn.c = j;
            long j2 = this.b;
            int i3 = i2 | 4;
            kwn.a = i3;
            kwn.d = j2;
            long j3 = this.c;
            kwn.a = i3 | 8;
            kwn.e = j3;
            String valueOf = String.valueOf(Base64.encodeToString(((kwn) o.i()).k(), 10));
            this.d = valueOf.length() == 0 ? new String("ChangeSequenceNumber:") : "ChangeSequenceNumber:".concat(valueOf);
        }
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
