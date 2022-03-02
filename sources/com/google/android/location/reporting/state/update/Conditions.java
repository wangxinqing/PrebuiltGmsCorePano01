package com.google.android.location.reporting.state.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Conditions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajmy();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public Conditions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.c = z3;
        this.b = z2;
        this.d = z4;
        this.e = z5;
    }

    public static Conditions a(ajjq ajjq) {
        return new Conditions(ajjq.h, ajjq.c, ajjq.d, ajjq.f, ajjq.g);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        if (!this.a) {
            arrayList.add(new InactiveReason(13, "UnsupportedFormFactor"));
        }
        if (this.b) {
            arrayList.add(new InactiveReason(11, "RestrictedProfile"));
        }
        if (!this.c) {
            arrayList.add(new InactiveReason(3, "UnsupportedGeo"));
        }
        return arrayList;
    }

    public final boolean c() {
        return b().isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Conditions) {
            Conditions conditions = (Conditions) obj;
            return this.a == conditions.a && this.b == conditions.b && this.c == conditions.c && this.d == conditions.d && this.e == conditions.e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        StringBuilder sb = new StringBuilder(134);
        sb.append("Conditions{supportedFormFactor=");
        sb.append(z);
        sb.append(", restrictedProfile=");
        sb.append(z2);
        sb.append(", supportedGeo=");
        sb.append(z3);
        sb.append(", googleLocationEnabled=");
        sb.append(z4);
        sb.append(", locationEnabled=");
        sb.append(z5);
        sb.append('}');
        return sb.toString();
    }

    public final ajjq a() {
        aucd o = ajjq.i.o();
        boolean z = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        ajjq ajjq = (ajjq) o.b;
        int i = ajjq.a | 64;
        ajjq.a = i;
        ajjq.h = z;
        boolean z2 = this.c;
        int i2 = i | 4;
        ajjq.a = i2;
        ajjq.d = z2;
        boolean z3 = this.b;
        int i3 = i2 | 2;
        ajjq.a = i3;
        ajjq.c = z3;
        boolean z4 = this.d;
        int i4 = i3 | 16;
        ajjq.a = i4;
        ajjq.f = z4;
        boolean z5 = this.e;
        int i5 = i4 | 32;
        ajjq.a = i5;
        ajjq.g = z5;
        int i6 = i5 | 1;
        ajjq.a = i6;
        ajjq.b = true;
        ajjq.a = i6 | 8;
        ajjq.e = false;
        return (ajjq) o.i();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.b(parcel, a2);
    }
}
