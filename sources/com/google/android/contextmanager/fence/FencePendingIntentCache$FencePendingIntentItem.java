package com.google.android.contextmanager.fence;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FencePendingIntentCache$FencePendingIntentItem extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new byq();
    public final String a;
    public final PendingIntent b;

    public FencePendingIntentCache$FencePendingIntentItem(String str, PendingIntent pendingIntent) {
        iva.c(str);
        this.a = str;
        iva.a((Object) pendingIntent);
        this.b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FencePendingIntentCache$FencePendingIntentItem) {
            return this.a.equals(((FencePendingIntentCache$FencePendingIntentItem) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("key", this.a);
        a2.a("p.Int", this.b);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
