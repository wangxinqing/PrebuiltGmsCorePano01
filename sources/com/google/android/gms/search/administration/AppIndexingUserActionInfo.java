package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.ActionImpl;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppIndexingUserActionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aafo();
    public String a;
    public long b;
    public ActionImpl c;

    public AppIndexingUserActionInfo() {
    }

    public AppIndexingUserActionInfo(String str, long j, ActionImpl actionImpl) {
        this.a = str;
        this.b = j;
        this.c = actionImpl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
