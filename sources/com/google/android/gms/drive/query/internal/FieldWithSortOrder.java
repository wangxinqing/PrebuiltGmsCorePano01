package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FieldWithSortOrder extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ljc();
    public final String a;
    public final boolean b;

    public FieldWithSortOrder(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = this.a;
        objArr[1] = !this.b ? "DESC" : "ASC";
        return String.format(locale, "FieldWithSortOrder[%s %s]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
