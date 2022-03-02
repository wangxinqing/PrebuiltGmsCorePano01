package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetGlobalSearchSourcesCall$Response extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new aajg();
    public Status a;
    public GetGlobalSearchSourcesCall$GlobalSearchSource[] b;

    public GetGlobalSearchSourcesCall$Response() {
    }

    public final Status aO() {
        return this.a;
    }

    public GetGlobalSearchSourcesCall$Response(Status status, GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr) {
        this.a = status;
        this.b = getGlobalSearchSourcesCall$GlobalSearchSourceArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, (Parcelable[]) this.b, i);
        ivx.b(parcel, a2);
    }
}
