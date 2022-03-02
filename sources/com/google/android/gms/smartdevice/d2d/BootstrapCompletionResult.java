package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BootstrapCompletionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abnx();
    public final int a;
    public final String b;
    public final ArrayList c;
    public final BootstrapAccount d;
    public final ArrayList e;
    public final int f;
    public final long g;

    public BootstrapCompletionResult(int i, String str, ArrayList arrayList, BootstrapAccount bootstrapAccount, ArrayList arrayList2, int i2, long j) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
        this.d = bootstrapAccount;
        this.e = arrayList2;
        this.f = i2;
        this.g = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.c(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.c(parcel, 6, this.e, false);
        ivx.b(parcel, 7, this.f);
        ivx.a(parcel, 8, this.g);
        ivx.b(parcel, a2);
    }
}
