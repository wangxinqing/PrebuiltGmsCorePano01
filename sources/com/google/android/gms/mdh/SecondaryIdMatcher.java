package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SecondaryIdMatcher extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rym();
    private static final Charset c = Charset.forName("UTF-8");
    public final byte[] a;
    public final int b;

    public SecondaryIdMatcher(byte[] bArr, int i) {
        iva.a((Object) bArr);
        this.a = bArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SecondaryIdMatcher secondaryIdMatcher = (SecondaryIdMatcher) obj;
            return this.b == secondaryIdMatcher.b && Arrays.equals(this.a, secondaryIdMatcher.a);
        }
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? "__unknown__" : "MATCHING_TYPE_PREFIX" : "MATCHING_TYPE_EXACT";
        String str2 = new String(this.a, c);
        StringBuilder sb = new StringBuilder(str.length() + 2 + str2.length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
