package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhoneNumberEntity extends AbstractSafeParcelable implements PhoneNumber {
    public static final Parcelable.Creator CREATOR = new zwb();
    public final String a;

    public PhoneNumberEntity(PhoneNumber phoneNumber) {
        this(((PhoneNumberEntity) phoneNumber).a);
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PhoneNumber)) {
            return false;
        }
        if (this != obj) {
            return ius.a(a(), ((PhoneNumber) obj).a());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }

    public PhoneNumberEntity(String str) {
        this.a = str;
    }
}
