package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaceOpeningHoursEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rko();
    public final List a;
    public final List b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class BusinessHoursInterval extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new rjb();
        public final int a;
        public final int b;

        public BusinessHoursInterval(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static BusinessHoursInterval a(int i, int i2) {
            return new BusinessHoursInterval(i, i2);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 1, this.a);
            ivx.b(parcel, 2, this.b);
            ivx.b(parcel, a2);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ExceptionalHours extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new rjc();
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final List g;

        public ExceptionalHours(int i, int i2, int i3, int i4, int i5, int i6, List list) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = Collections.unmodifiableList(list);
        }

        public static ExceptionalHours a(int i, int i2, int i3, int i4, int i5, int i6, List list) {
            return new ExceptionalHours(i, i2, i3, i4, i5, i6, list);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 1, this.a);
            ivx.b(parcel, 2, this.b);
            ivx.b(parcel, 3, this.c);
            ivx.b(parcel, 4, this.d);
            ivx.b(parcel, 5, this.e);
            ivx.b(parcel, 6, this.f);
            ivx.c(parcel, 7, this.g, false);
            ivx.b(parcel, a2);
        }
    }

    public PlaceOpeningHoursEntity(List list, List list2) {
        this.a = Collections.unmodifiableList(list);
        this.b = Collections.unmodifiableList(list2);
    }

    public static PlaceOpeningHoursEntity a(List list, List list2) {
        return new PlaceOpeningHoursEntity(list, list2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.c(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
