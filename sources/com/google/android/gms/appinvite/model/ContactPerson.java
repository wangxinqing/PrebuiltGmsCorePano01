package com.google.android.gms.appinvite.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dwt();
    public String a;
    public String b;
    public Long c;
    public AvatarReference d;
    public final ArrayList e;
    int f;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ContactMethod extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dws();
        public final int a;
        public final String b;
        public final AvatarReference c;

        public ContactMethod(int i, String str) {
            this(i, str, (AvatarReference) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ContactMethod contactMethod = (ContactMethod) obj;
                return this.a == contactMethod.a && ius.a(this.b, contactMethod.b);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
        }

        public ContactMethod(int i, String str, AvatarReference avatarReference) {
            this.a = i;
            this.b = str;
            this.c = avatarReference;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 2, this.a);
            ivx.a(parcel, 3, this.b, false);
            ivx.a(parcel, 4, this.c, i, false);
            ivx.b(parcel, a2);
        }
    }

    public ContactPerson(String str, String str2, AvatarReference avatarReference, List list) {
        this(str, str2, (Long) null, avatarReference, list);
    }

    public final ContactMethod a() {
        if (this.f < this.e.size()) {
            return (ContactMethod) this.e.get(this.f);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContactPerson contactPerson = (ContactPerson) obj;
            return ius.a(this.a, contactPerson.a) && ius.a(this.b, contactPerson.b) && ius.a(this.c, contactPerson.c) && ius.a(this.e, contactPerson.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactPerson{");
        if (!TextUtils.isEmpty(this.a)) {
            sb.append(" name=");
            sb.append(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(" gaiaId=");
            sb.append(this.b);
        }
        if (this.c != null) {
            sb.append(" cp2Id=");
            sb.append(this.c);
        }
        sb.append(" }");
        return sb.toString();
    }

    public ContactPerson(String str, String str2, Long l, AvatarReference avatarReference, List list) {
        this(str, str2, l, avatarReference, list, 0);
    }

    public final void a(ContactMethod contactMethod) {
        if (contactMethod == null) {
            this.f = this.e.size();
        } else if (this.e.contains(contactMethod)) {
            this.f = this.e.indexOf(contactMethod);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.c(parcel, 6, this.e, false);
        ivx.b(parcel, 7, this.f);
        ivx.b(parcel, a2);
    }

    public ContactPerson(String str, String str2, Long l, AvatarReference avatarReference, List list, int i) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = avatarReference;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f = i;
    }
}
