package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhoneEntity extends AbstractSafeParcelable implements Phone {
    public static final Parcelable.Creator CREATOR = new xpf();
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;

    public PhoneEntity(PersonFieldMetadata personFieldMetadata, String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        if (z) {
            this.a = (PersonFieldMetadataEntity) personFieldMetadata;
        } else {
            this.a = personFieldMetadata != null ? new PersonFieldMetadataEntity(personFieldMetadata) : null;
        }
    }

    public final PersonFieldMetadata a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Phone)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Phone phone = (Phone) obj;
        return ius.a(a(), phone.a()) && ius.a(b(), phone.b()) && ius.a(c(), phone.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c()});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }

    public PhoneEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
    }
}
