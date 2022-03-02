package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TimeFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxs();
    public final ArrayList a;
    public final int[] b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Interval extends AbstractSafeParcelable implements jxu {
        public static final Parcelable.Creator CREATOR = new jxt();
        public final long a;
        public final long b;

        public Interval(long j, long j2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (j >= -1) {
                z = true;
            } else {
                z = false;
            }
            iva.b(z);
            if (j2 > -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            iva.b(z2);
            if (j != -1) {
                iva.b(j > j2 ? false : z3);
            }
            this.a = j;
            this.b = j2;
        }

        public final boolean a() {
            return this.a != -1;
        }

        public final boolean b() {
            return this.b != Long.MAX_VALUE;
        }

        public final long c() {
            return this.a;
        }

        public final long d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Interval) {
                Interval interval = (Interval) obj;
                return this.a == interval.a && this.b == interval.b;
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.a(parcel, 2, this.a);
            ivx.a(parcel, 3, this.b);
            ivx.b(parcel, a2);
        }
    }

    public TimeFilterImpl(ArrayList arrayList, int[] iArr) {
        this.a = arrayList;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimeFilterImpl) {
            TimeFilterImpl timeFilterImpl = (TimeFilterImpl) obj;
            return ius.a(this.a, timeFilterImpl.a) && ius.a(this.b, timeFilterImpl.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
