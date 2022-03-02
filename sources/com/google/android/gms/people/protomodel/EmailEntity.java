package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EmailEntity extends AbstractSafeParcelable implements Email {
    public static final Parcelable.Creator CREATOR = new xov();
    public final PersonFieldMetadataEntity a;
    public final String b;

    public EmailEntity(PersonFieldMetadata personFieldMetadata, String str, boolean z) {
        this.b = str;
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

    public final boolean equals(Object obj) {
        if (!(obj instanceof Email)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Email email = (Email) obj;
        return ius.a(a(), email.a()) && ius.a(b(), email.b());
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
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }

    public EmailEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str) {
        this.a = personFieldMetadataEntity;
        this.b = str;
    }
}
