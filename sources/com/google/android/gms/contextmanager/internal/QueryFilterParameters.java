package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class QueryFilterParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxq();
    public final int a;
    public final int b;
    public final int[] c;

    public QueryFilterParameters(int i, int i2, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = iArr;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QueryFilterParameters) {
            QueryFilterParameters queryFilterParameters = (QueryFilterParameters) obj;
            if (queryFilterParameters.b == this.b && queryFilterParameters.a == this.a && a() == queryFilterParameters.a()) {
                if (a()) {
                    int length = this.c.length;
                    int[] iArr = queryFilterParameters.c;
                    int length2 = iArr.length;
                    if (length == length2) {
                        int i = 0;
                        while (i < length2) {
                            int i2 = iArr[i];
                            int[] iArr2 = this.c;
                            int length3 = iArr2.length;
                            int i3 = 0;
                            while (i3 < length3) {
                                if (iArr2[i3] != i2) {
                                    i3++;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.c;
        if (iArr != null) {
            i = 0;
            for (int i2 : iArr) {
                i += i2 * 13;
            }
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
