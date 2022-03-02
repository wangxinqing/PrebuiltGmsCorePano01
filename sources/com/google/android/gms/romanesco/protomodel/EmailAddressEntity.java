package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EmailAddressEntity extends AbstractSafeParcelable implements EmailAddress {
    public static final Parcelable.Creator CREATOR = new zvz();
    public final String a;

    public EmailAddressEntity(EmailAddress emailAddress) {
        this(((EmailAddressEntity) emailAddress).a);
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EmailAddress)) {
            return false;
        }
        if (this != obj) {
            return ius.a(a(), ((EmailAddress) obj).a());
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

    public EmailAddressEntity(String str) {
        this.a = str;
    }
}
