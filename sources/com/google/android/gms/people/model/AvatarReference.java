package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AvatarReference extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new xfi();
    public final int a;
    @Deprecated
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Long h;

    @Deprecated
    public AvatarReference(int i, String str) {
        iva.a(true);
        this.a = i;
        this.b = str;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final boolean a() {
        return this.c == null && this.d == null && this.e == null && this.f == null && this.g == null && this.h == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AvatarReference avatarReference = (AvatarReference) obj;
            return this.a == avatarReference.a && ius.a(this.b, avatarReference.b) && ius.a(this.c, avatarReference.c) && ius.a(this.d, avatarReference.d) && ius.a(this.e, avatarReference.e) && ius.a(this.f, avatarReference.f) && ius.a(this.g, avatarReference.g) && ius.a(this.h, avatarReference.h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("source", Integer.valueOf(this.a));
        a2.a("location", this.b);
        a2.a("url", this.c);
        a2.a("email", this.d);
        a2.a("account", this.e);
        a2.a("focusId", this.f);
        a2.a("contactId", this.g);
        a2.a("rawContactId", this.h);
        return a2.toString();
    }

    public AvatarReference(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        this.a = i;
        this.b = TextUtils.isEmpty(str) ? null : str;
        this.c = TextUtils.isEmpty(str2) ? null : str2;
        this.d = TextUtils.isEmpty(str3) ? null : str3;
        this.e = TextUtils.isEmpty(str4) ? null : str4;
        this.f = TextUtils.isEmpty(str5) ? null : str5;
        this.g = l;
        this.h = l2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.b(parcel, a2);
    }
}
