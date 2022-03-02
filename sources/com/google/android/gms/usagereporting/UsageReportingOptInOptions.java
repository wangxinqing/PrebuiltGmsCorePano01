package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UsageReportingOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adsm();
    public int a;
    public boolean b;
    public final List c;
    public int d;
    public String e;
    public boolean f;

    public UsageReportingOptInOptions(int i) {
        this.c = new ArrayList();
        this.a = i;
    }

    public static adsl a() {
        return new adsl();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c, false);
        ivx.b(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f);
        ivx.b(parcel, a2);
    }

    public UsageReportingOptInOptions(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }
}
