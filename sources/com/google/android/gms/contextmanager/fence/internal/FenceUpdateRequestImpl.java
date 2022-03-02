package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FenceUpdateRequestImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jvj();
    public final ArrayList a;

    @Deprecated
    public FenceUpdateRequestImpl() {
        this(new ArrayList());
    }

    public FenceUpdateRequestImpl(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
