package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SyncPolicy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ryo();
    public int a;
    public SyncSubPolicy b;
    public SyncSubPolicy c;
    public SyncSubPolicy d;
    public SyncSubPolicy e;
    public Integer f;
    public boolean g;
    public boolean h;

    static {
        a().a();
        ryn a2 = a();
        a2.a = 0;
        a2.a();
    }

    public SyncPolicy(int i, SyncSubPolicy syncSubPolicy, SyncSubPolicy syncSubPolicy2, SyncSubPolicy syncSubPolicy3, SyncSubPolicy syncSubPolicy4, Integer num, boolean z, boolean z2) {
        this.a = i;
        this.b = syncSubPolicy;
        this.c = syncSubPolicy2;
        this.d = syncSubPolicy3;
        this.e = syncSubPolicy4;
        this.f = num;
        this.g = z;
        this.h = z2;
    }

    public static ryn a() {
        return new ryn();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SyncPolicy syncPolicy = (SyncPolicy) obj;
            if (this.a == syncPolicy.a && this.g == syncPolicy.g && this.h == syncPolicy.h && this.b.equals(syncPolicy.b) && this.c.equals(syncPolicy.c) && this.d.equals(syncPolicy.d) && this.e.equals(syncPolicy.e)) {
                Integer num = this.f;
                if (num != null) {
                    return num.equals(syncPolicy.f);
                }
                return syncPolicy.f == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Integer num = this.f;
        return ((((hashCode + (num != null ? num.hashCode() : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.b(parcel, a2);
    }
}
