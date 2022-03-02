package com.google.firebase.appindexing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ResultSet extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new aplw();
    final List a;

    public ResultSet(List list) {
        this.a = list;
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
