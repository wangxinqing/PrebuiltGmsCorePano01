package com.google.android.location.geofencer.data;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PendingIntentCacheItem extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aike();
    public final PendingIntent a;
    public final String b;
    public final List c;
    public final String d;

    public PendingIntentCacheItem(PendingIntent pendingIntent, String str, List list, String str2) {
        this.a = pendingIntent;
        this.b = str;
        this.c = list;
        this.d = str2;
    }

    public final int a() {
        List list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PendingIntentCacheItem [mPendingIntent=");
        sb.append(this.a);
        sb.append(", mExternalKey=");
        sb.append(this.b);
        sb.append(", mTag=");
        sb.append(this.d);
        sb.append(", mAssociatedGeofenceIds=[");
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) list.get(i)).replaceAll("\\p{C}", "?"));
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append("]]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, 3, Collections.unmodifiableList(this.c), false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
