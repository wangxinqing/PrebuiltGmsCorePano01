package com.google.android.gms.drive.ui.select.path;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.Filter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ViewPathElement implements PathElement {
    public static final Parcelable.Creator CREATOR = new lqk();
    public final int a;
    private final int b;
    private final Filter c;
    private final lqu d;

    public ViewPathElement(int i, int i2, Filter filter, lqu lqu) {
        this.b = i;
        this.a = i2;
        this.c = filter;
        this.d = lqu;
    }

    public final String a(Context context) {
        return context.getResources().getString(this.b);
    }

    public final Filter b() {
        return this.c;
    }

    public final lqu c() {
        return this.d;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        while (true) {
            int length = lqj.d.length;
            if (i2 >= 4) {
                return;
            }
            if (lqj.d[i2] != this) {
                i2++;
            } else {
                parcel.writeInt(i2);
                return;
            }
        }
    }
}
