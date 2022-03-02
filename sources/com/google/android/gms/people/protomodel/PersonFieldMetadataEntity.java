package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PersonFieldMetadataEntity extends AbstractSafeParcelable implements PersonFieldMetadata {
    public static final Parcelable.Creator CREATOR = new xpd();
    public final Integer a;
    public final Boolean b;

    public PersonFieldMetadataEntity(PersonFieldMetadata personFieldMetadata) {
        this(personFieldMetadata.a(), personFieldMetadata.b());
    }

    public final Integer a() {
        return this.a;
    }

    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonFieldMetadata)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata) obj;
        return ius.a(a(), personFieldMetadata.a()) && ius.a(b(), personFieldMetadata.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 3, this.a);
        ivx.a(parcel, 4, this.b);
        ivx.b(parcel, a2);
    }

    public PersonFieldMetadataEntity(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }
}
