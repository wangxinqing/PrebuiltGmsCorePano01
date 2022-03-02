package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ClassifyAccountTypeResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wmf();
    public final String a;
    public final String b;
    public final wmb c;
    private final wmc d;

    public ClassifyAccountTypeResult(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = wmb.a(i);
        this.d = wmc.a(i2);
    }

    public static ClassifyAccountTypeResult a(String str, String str2, wmb wmb, wmc wmc) {
        return new ClassifyAccountTypeResult(str, str2, wmb.j, wmc.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeResult classifyAccountTypeResult = (ClassifyAccountTypeResult) obj;
            return amqx.a(this.a, classifyAccountTypeResult.a) && amqx.a(this.b, classifyAccountTypeResult.b) && this.c == classifyAccountTypeResult.c && this.d == classifyAccountTypeResult.d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("accountType", (Object) this.a);
        a2.a("dataSet", (Object) this.b);
        a2.a("category", (Object) this.c);
        a2.a("matchTag", (Object) this.d);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, 3, this.c.j);
        ivx.b(parcel, 4, this.d.f);
        ivx.b(parcel, a2);
    }
}
