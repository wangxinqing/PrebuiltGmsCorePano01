package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RemoveGeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rex();
    public final List a;
    public final PendingIntent b;
    public final String c;

    public RemoveGeofencingRequest(List list, PendingIntent pendingIntent, String str) {
        this.a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.b = pendingIntent;
        this.c = str;
    }

    public static RemoveGeofencingRequest a(PendingIntent pendingIntent) {
        iva.a((Object) pendingIntent, (Object) "PendingIntent can not be null.");
        return new RemoveGeofencingRequest((List) null, pendingIntent, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
