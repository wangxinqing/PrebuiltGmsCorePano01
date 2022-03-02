package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adxy();
    @Deprecated
    String a;
    @Deprecated
    String b;
    ArrayList c;

    LabelValueRow() {
        this.c = jhx.a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.c(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }
}
