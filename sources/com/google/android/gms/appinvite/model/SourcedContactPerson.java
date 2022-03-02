package com.google.android.gms.appinvite.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SourcedContactPerson extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dwu();
    public ContactPerson a;
    public int b;

    public SourcedContactPerson(ContactPerson contactPerson, int i) {
        this.a = contactPerson;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SourcedContactPerson sourcedContactPerson = (SourcedContactPerson) obj;
            return ius.a(this.a, sourcedContactPerson.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(sourcedContactPerson.b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourcedContactPerson{");
        if (this.a != null) {
            sb.append(" person=");
            sb.append(this.a.toString());
        }
        sb.append(" personSource=");
        sb.append(this.b);
        sb.append(" }");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
