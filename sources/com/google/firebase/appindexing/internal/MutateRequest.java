package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MutateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apmx();
    public final int a;
    public final Thing[] b;
    public final String[] c;
    public final String[] d;
    public final ActionImpl e;
    public final String f;
    public final String g;

    public MutateRequest(int i, Thing[] thingArr) {
        this(i, thingArr, (String[]) null, (String[]) null, (ActionImpl) null, (String) null, (String) null);
    }

    public static MutateRequest a(Thing... thingArr) {
        return new MutateRequest(1, thingArr);
    }

    public static MutateRequest b(Thing... thingArr) {
        return new MutateRequest(2, thingArr);
    }

    public MutateRequest(int i, Thing[] thingArr, String[] strArr, String[] strArr2, ActionImpl actionImpl, String str, String str2) {
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7)) {
            i = 0;
        }
        this.a = i;
        this.b = thingArr;
        this.c = strArr;
        this.d = strArr2;
        this.e = actionImpl;
        this.f = str;
        this.g = str2;
    }

    public static MutateRequest a(String... strArr) {
        return new MutateRequest(3, (Thing[]) null, strArr, (String[]) null, (ActionImpl) null, (String) null, (String) null);
    }

    public static MutateRequest b(String... strArr) {
        return new MutateRequest(6, (Thing[]) null, (String[]) null, strArr, (ActionImpl) null, (String) null, (String) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, (Parcelable[]) this.b, i);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, i, false);
        ivx.a(parcel, 7, this.f, false);
        ivx.a(parcel, 8, this.g, false);
        ivx.b(parcel, a2);
    }
}
