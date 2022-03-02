package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SortOrder extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lix();
    public final List a;
    public final boolean b;

    public SortOrder(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final String toString() {
        return String.format(Locale.US, "SortOrder[%s, %s]", new Object[]{TextUtils.join(",", this.a), Boolean.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
