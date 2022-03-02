package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Contact extends AbstractSafeParcelable implements Cloneable, Comparable {
    public static final Parcelable.Creator CREATOR = new vij();
    public final long a;
    public final String b;
    public final String c;
    public final Uri d;
    public final boolean e;
    public final ContactInfo f;
    public final boolean g;
    public final boolean h;

    public Contact(long j, String str, String str2, Uri uri, boolean z, ContactInfo contactInfo, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = z;
        this.f = contactInfo;
        this.g = z2;
        this.h = z3;
    }

    /* renamed from: a */
    public final Contact clone() {
        try {
            return (Contact) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Contact contact = (Contact) obj;
        int compareToIgnoreCase = this.c.compareToIgnoreCase(contact.c);
        return compareToIgnoreCase == 0 ? this.f.a - contact.f.a : compareToIgnoreCase;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            return ius.a(Long.valueOf(this.a), Long.valueOf(contact.a)) && ius.a(this.b, contact.b) && ius.a(this.c, contact.c) && ius.a(this.d, contact.d) && ius.a(this.f, contact.f) && ius.a(Boolean.valueOf(this.g), Boolean.valueOf(contact.g)) && ius.a(Boolean.valueOf(this.h), Boolean.valueOf(contact.h));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.US, "Contact<id: %d, lookupKey: %s, displayName: %s, imageUri: %s, isSelected: %s, contactInfo: %s, isReachable: %s, isRecommended: %s>", new Object[]{Long.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.b(parcel, a2);
    }
}
