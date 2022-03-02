package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Query extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lir();
    public final LogicalFilter a;
    public final String b;
    public final SortOrder c;
    public final List d;
    public final boolean e;
    final List f;
    public final boolean g;

    public Query(LogicalFilter logicalFilter, String str, SortOrder sortOrder, List list, boolean z, List list2, boolean z2) {
        this.a = logicalFilter;
        this.b = str;
        this.c = sortOrder;
        this.d = list;
        this.e = z;
        this.f = list2;
        this.g = z2;
    }

    public final Set a() {
        List list = this.f;
        return list != null ? new HashSet(list) : new HashSet();
    }

    public final String toString() {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", new Object[]{this.a, this.c, this.b, this.f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.b(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e);
        ivx.c(parcel, 7, this.f, false);
        ivx.a(parcel, 8, this.g);
        ivx.b(parcel, a2);
    }
}
