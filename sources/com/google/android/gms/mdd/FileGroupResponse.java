package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FileGroupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwu();
    public final String a;
    public final String b;
    public final List c;
    public final int d;

    public FileGroupResponse(String str, String str2, int i, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.c(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
