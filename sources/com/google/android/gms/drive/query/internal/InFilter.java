package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InFilter extends AbstractFilter {
    public static final ljj CREATOR = new ljj();
    final MetadataBundle a;
    private final kym b;

    public InFilter(MetadataBundle metadataBundle) {
        this.a = metadataBundle;
        this.b = (kym) lje.a(metadataBundle);
    }

    public final Object a(ljf ljf) {
        kym kym = this.b;
        return ljf.a(kym, ((Collection) this.a.a((kyq) kym)).iterator().next());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
