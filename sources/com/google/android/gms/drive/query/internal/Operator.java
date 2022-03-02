package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Operator extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ljn();
    public static final Operator a = new Operator("=");
    public static final Operator b = new Operator("<");
    public static final Operator c = new Operator("<=");
    public static final Operator d = new Operator(">");
    public static final Operator e = new Operator(">=");
    public static final Operator f = new Operator("and");
    public static final Operator g = new Operator("or");
    public static final Operator h = new Operator("contains");
    public final String i;

    static {
        new Operator("not");
    }

    public Operator(String str) {
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Operator operator = (Operator) obj;
        String str = this.i;
        if (str != null) {
            if (!str.equals(operator.i)) {
                return false;
            }
        } else if (operator.i != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.i;
        return (str != null ? str.hashCode() : 0) + 31;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.i, false);
        ivx.b(parcel, a2);
    }
}
