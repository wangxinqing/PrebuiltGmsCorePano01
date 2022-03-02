package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ComparisonFilter extends AbstractFilter {
    public static final lja CREATOR = new lja();
    final Operator a;
    final MetadataBundle b;
    final kyq c;

    public ComparisonFilter(Operator operator, MetadataBundle metadataBundle) {
        this.a = operator;
        this.b = metadataBundle;
        this.c = lje.a(metadataBundle);
    }

    public final Object a(ljf ljf) {
        Operator operator = this.a;
        kyq kyq = this.c;
        return ljf.a(operator, kyq, this.b.a(kyq));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
