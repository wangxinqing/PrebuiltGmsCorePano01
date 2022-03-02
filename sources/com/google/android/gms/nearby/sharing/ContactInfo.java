package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactInfo extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new vin();
    public final int a;
    public final String b;

    public ContactInfo(int i, String str) {
        this.a = i;
        this.b = str;
    }

    /* renamed from: a */
    public final ContactInfo clone() {
        try {
            return (ContactInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactInfo) {
            ContactInfo contactInfo = (ContactInfo) obj;
            return ius.a(Integer.valueOf(this.a), Integer.valueOf(contactInfo.a)) && ius.a(this.b, contactInfo.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        int i = this.a;
        objArr[0] = i != 1 ? i != 2 ? "Unknown" : "EmailAddress" : "PhoneNumber";
        objArr[1] = this.b;
        return String.format(locale, "ContactInfo<type: %s, value: %s>", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
