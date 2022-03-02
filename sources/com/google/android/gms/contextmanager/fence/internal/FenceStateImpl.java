package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceState;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FenceStateImpl extends FenceState {
    public static final Parcelable.Creator CREATOR = new jvf();
    public final int a;
    public final long b;
    public final String c;
    public final int d;
    public final ArrayList e;

    public FenceStateImpl(int i, long j, String str, int i2) {
        this(i, j, str, i2, (ArrayList) null);
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public FenceStateImpl(int i, long j, String str, int i2, ArrayList arrayList) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.d = i2;
        this.e = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, 5, this.d);
        ivx.c(parcel, 6, this.e, false);
        ivx.b(parcel, a2);
    }
}
