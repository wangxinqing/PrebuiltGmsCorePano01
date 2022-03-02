package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Encoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new edt();
    public final int a;
    public final DsssEncoding b;
    public final DtmfEncoding c;

    public Encoding(int i, DsssEncoding dsssEncoding, DtmfEncoding dtmfEncoding) {
        this.a = i;
        this.b = dsssEncoding;
        this.c = dtmfEncoding;
    }

    public static boolean a(int i) {
        return i == 1 || i == 3;
    }

    public static int b(int i) {
        return (i == 2 || i == 3) ? 2 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        Encoding encoding = (Encoding) obj;
        int i = this.a;
        if (i != encoding.a) {
            return false;
        }
        if ((i != 0 || ius.a(this.b, encoding.b)) && (this.a != 1 || ius.a(this.c, encoding.c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = Arrays.hashCode(new Object[]{Integer.valueOf(this.a)}) + (this.a == 0 ? this.b.hashCode() : 0);
        if (this.a == 1) {
            i = this.c.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
