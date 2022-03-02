package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnDownloadProgressResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kws();
    public static final List a = Collections.emptyList();
    final long b;
    final long c;
    final int d;
    final List e;

    public OnDownloadProgressResponse(long j, long j2, int i, List list) {
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.c(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
