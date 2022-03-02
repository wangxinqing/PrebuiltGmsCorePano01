package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rcs();
    public static final Comparator a = new rcr();
    public final List b;
    public final String c;
    public final List d;

    public ActivityTransitionRequest(List list, String str, List list2) {
        boolean z;
        iva.a((Object) list, (Object) "transitions can't be null");
        if (list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(a);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ActivityTransition activityTransition = (ActivityTransition) list.get(i);
            iva.b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", new Object[]{activityTransition}));
        }
        this.b = Collections.unmodifiableList(list);
        this.c = str;
        this.d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return ius.a(this.b, activityTransitionRequest.b) && ius.a(this.c, activityTransitionRequest.c) && ius.a(this.d, activityTransitionRequest.d);
        }
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.c(parcel, 3, this.d, false);
        ivx.b(parcel, a2);
    }
}
