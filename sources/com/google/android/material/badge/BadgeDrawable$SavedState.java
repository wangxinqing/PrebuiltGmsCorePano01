package com.google.android.material.badge;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BadgeDrawable$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ajsr();
    public int a;
    public int b;
    public int c = 255;
    public int d = -1;
    public int e;
    public CharSequence f;
    public int g;
    public int h;
    public int i;
    public int j;

    public BadgeDrawable$SavedState(Context context) {
        this.b = new ajyq(context, 2132018320).b.getDefaultColor();
        this.f = context.getString(R.string.mtrl_badge_numberless_content_description);
        this.g = R.plurals.mtrl_badge_content_description;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f.toString());
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
    }

    public BadgeDrawable$SavedState(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
    }
}
