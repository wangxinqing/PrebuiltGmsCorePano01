package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NameEntity extends AbstractSafeParcelable implements Name {
    public static final Parcelable.Creator CREATOR = new xoz();
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public NameEntity(PersonFieldMetadata personFieldMetadata, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
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

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Name)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Name name = (Name) obj;
        return ius.a(a(), name.a()) && ius.a(b(), name.b()) && ius.a(c(), name.c()) && ius.a(d(), name.d()) && ius.a(e(), name.e()) && ius.a(f(), name.f()) && ius.a(g(), name.g());
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), d(), e(), f(), g()});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.g, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f, false);
        ivx.a(parcel, 17, this.c, false);
        ivx.b(parcel, a2);
    }

    public NameEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }
}
