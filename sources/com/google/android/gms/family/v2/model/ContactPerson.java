package com.google.android.gms.family.v2.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new mpx();
    public final String a;
    public final Long b;
    public final AvatarReference c;
    public final ArrayList d;
    public final Uri e;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ContactMethod extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new mpw();
        public final int a;
        public final String b;

        public ContactMethod(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ContactMethod) {
                ContactMethod contactMethod = (ContactMethod) obj;
                return this.a == contactMethod.a && ius.a(this.b, contactMethod.b);
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 1, this.a);
            ivx.a(parcel, 2, this.b, false);
            ivx.b(parcel, a2);
        }
    }

    public ContactPerson(String str, Long l, AvatarReference avatarReference, Uri uri) {
        this.d = new ArrayList();
        this.a = str;
        this.b = l;
        this.c = avatarReference;
        this.e = uri;
    }

    public final void a(List list) {
        this.d.addAll(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContactPerson contactPerson = (ContactPerson) obj;
            return ius.a(this.a, contactPerson.a) && ius.a(this.b, contactPerson.b) && ius.a(new HashSet(this.d), new HashSet(contactPerson.d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactPerson{");
        if (!TextUtils.isEmpty(this.a)) {
            sb.append(" name=");
            sb.append(this.a);
        }
        if (this.b != null) {
            sb.append(" cp2Id=");
            sb.append(this.b);
        }
        sb.append(" }");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.c(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.b(parcel, a2);
    }

    public ContactPerson(String str, Long l, AvatarReference avatarReference, List list, Uri uri) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = str;
        this.b = l;
        this.c = avatarReference;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.e = uri;
    }
}
