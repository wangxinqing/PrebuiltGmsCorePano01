package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetAppIndexingPackageDetailsCall$Response extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new aagd();
    public final Status a;
    public final CorpusConfigParcelable[] b;
    public final long c;
    public final AppIndexingErrorInfo[] d;
    public final AppIndexingUserActionInfo[] e;
    public final boolean f;
    public final boolean g;

    public GetAppIndexingPackageDetailsCall$Response(Status status, CorpusConfigParcelable[] corpusConfigParcelableArr, long j, AppIndexingErrorInfo[] appIndexingErrorInfoArr, AppIndexingUserActionInfo[] appIndexingUserActionInfoArr, boolean z, boolean z2) {
        this.a = status;
        this.b = corpusConfigParcelableArr;
        this.c = j;
        this.d = appIndexingErrorInfoArr;
        this.e = appIndexingUserActionInfoArr;
        this.f = z;
        this.g = z2;
    }

    public final Status aO() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, (Parcelable[]) this.b, i);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, (Parcelable[]) this.d, i);
        ivx.a(parcel, 5, (Parcelable[]) this.e, i);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.b(parcel, a2);
    }
}
