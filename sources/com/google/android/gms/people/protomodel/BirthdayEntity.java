package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BirthdayEntity extends AbstractSafeParcelable implements Birthday {
    public static final Parcelable.Creator CREATOR = new xos();
    public final PersonFieldMetadataEntity a;
    public final Long b;

    public BirthdayEntity(PersonFieldMetadata personFieldMetadata, Long l, boolean z) {
        this.b = l;
        if (z) {
            this.a = (PersonFieldMetadataEntity) personFieldMetadata;
        } else {
            this.a = personFieldMetadata != null ? new PersonFieldMetadataEntity(personFieldMetadata) : null;
        }
    }

    public final PersonFieldMetadata a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Birthday)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Birthday birthday = (Birthday) obj;
        return ius.a(a(), birthday.a()) && ius.a(b(), birthday.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }

    public BirthdayEntity(PersonFieldMetadataEntity personFieldMetadataEntity, Long l) {
        this.a = personFieldMetadataEntity;
        this.b = l;
    }
}
