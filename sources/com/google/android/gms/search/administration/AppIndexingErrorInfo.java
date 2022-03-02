package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppIndexingErrorInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aafm();
    public String a;
    public int b;
    public int c;
    public String d;
    public long e;
    public Thing f;
    public ActionImpl g;

    public AppIndexingErrorInfo() {
    }

    public AppIndexingErrorInfo(String str, int i, int i2, String str2, long j, Thing thing, ActionImpl actionImpl) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = j;
        this.f = thing;
        this.g = actionImpl;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.a(parcel, 7, this.g, i, false);
        ivx.b(parcel, a2);
    }
}
