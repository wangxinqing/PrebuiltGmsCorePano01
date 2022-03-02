package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, icl {
    public static final Parcelable.Creator CREATOR = new icp();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Status f = new Status(17);
    public static final Status g = new Status(18);
    public final int h;
    public final int i;
    public final String j;
    public final PendingIntent k;

    public Status(int i2) {
        this(i2, (String) null);
    }

    public final void a(Activity activity, int i2) {
        if (b()) {
            activity.startIntentSenderForResult(this.k.getIntentSender(), i2, (Intent) null, 0, 0, 0);
        }
    }

    public final Status aO() {
        return this;
    }

    public final boolean b() {
        return this.k != null;
    }

    public final boolean c() {
        return this.i <= 0;
    }

    public final String d() {
        String str = this.j;
        return str == null ? ibt.a(this.i) : str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.h != status.h || this.i != status.i || !ius.a(this.j, status.j) || !ius.a(this.k, status.k)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("statusCode", d());
        a2.a("resolution", this.k);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        icp.a(this, parcel, i2);
    }

    public Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.h = i2;
        this.i = i3;
        this.j = str;
        this.k = pendingIntent;
    }

    public Status(int i2, String str) {
        this(1, i2, str, (PendingIntent) null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }
}
