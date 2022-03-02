package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HasFilter extends AbstractFilter {
    public static final lji CREATOR = new lji();
    final MetadataBundle a;
    final kyq b;

    public HasFilter(MetadataBundle metadataBundle) {
        this.a = metadataBundle;
        this.b = lje.a(metadataBundle);
    }

    public final Object a(ljf ljf) {
        kyq kyq = this.b;
        return ljf.a(kyq, this.a.a(kyq));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
