package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParcelableEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lmz();
    final String a;
    final String b;
    final List c;
    final boolean d;
    final boolean e;
    final boolean f;
    final String g;
    final String h;
    final TextInsertedDetails i;
    final TextDeletedDetails j;
    final ValuesAddedDetails k;
    final ValuesRemovedDetails l;
    final ValuesSetDetails m;
    final ValueChangedDetails n;
    final ReferenceShiftedDetails o;
    final ObjectChangedDetails p;
    final FieldChangedDetails q;

    public ParcelableEvent(String str, String str2, List list, boolean z, boolean z2, boolean z3, String str3, String str4, TextInsertedDetails textInsertedDetails, TextDeletedDetails textDeletedDetails, ValuesAddedDetails valuesAddedDetails, ValuesRemovedDetails valuesRemovedDetails, ValuesSetDetails valuesSetDetails, ValueChangedDetails valueChangedDetails, ReferenceShiftedDetails referenceShiftedDetails, ObjectChangedDetails objectChangedDetails, FieldChangedDetails fieldChangedDetails) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str3;
        this.h = str4;
        this.i = textInsertedDetails;
        this.j = textDeletedDetails;
        this.k = valuesAddedDetails;
        this.l = valuesRemovedDetails;
        this.m = valuesSetDetails;
        this.n = valueChangedDetails;
        this.o = referenceShiftedDetails;
        this.p = objectChangedDetails;
        this.q = fieldChangedDetails;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.g, false);
        ivx.a(parcel, 7, this.h, false);
        ivx.a(parcel, 8, this.i, i2, false);
        ivx.a(parcel, 9, this.j, i2, false);
        ivx.a(parcel, 10, this.k, i2, false);
        ivx.a(parcel, 11, this.l, i2, false);
        ivx.a(parcel, 12, this.m, i2, false);
        ivx.a(parcel, 13, this.n, i2, false);
        ivx.a(parcel, 14, this.o, i2, false);
        ivx.a(parcel, 15, this.p, i2, false);
        ivx.a(parcel, 16, this.e);
        ivx.a(parcel, 17, this.f);
        ivx.a(parcel, 18, this.q, i2, false);
        ivx.b(parcel, a2);
    }
}
