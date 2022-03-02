package com.google.android.gms.mdd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OverrideFileGroupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rxz();
    public final String a;
    public final String b;
    public final String[] c;
    public final String[] d;
    public final ParcelFileDescriptor[] e;
    public final Account f;

    public OverrideFileGroupRequest(String str, String str2, String[] strArr, String[] strArr2, ParcelFileDescriptor[] parcelFileDescriptorArr, Account account) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = strArr2;
        this.e = parcelFileDescriptorArr;
        this.f = account;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, (Parcelable[]) this.e, i);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.b(parcel, a2);
    }
}
