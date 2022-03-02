package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FieldOnlyFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR = new ljb();
    final MetadataBundle a;
    private final kyq b;

    public FieldOnlyFilter(MetadataBundle metadataBundle) {
        this.a = metadataBundle;
        this.b = lje.a(metadataBundle);
    }

    public final Object a(ljf ljf) {
        return ljf.a(this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }

    public FieldOnlyFilter(kyt kyt) {
        this(MetadataBundle.a(kyt, (Object) null));
    }
}
