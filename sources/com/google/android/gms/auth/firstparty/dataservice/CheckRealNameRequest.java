package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckRealNameRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gbk();
    final int a;
    public AppDescription b;
    public String c;
    public String d;

    public CheckRealNameRequest() {
        this.a = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }

    public CheckRealNameRequest(int i, AppDescription appDescription, String str, String str2) {
        this.a = i;
        this.b = appDescription;
        this.c = str;
        this.d = str2;
    }
}
