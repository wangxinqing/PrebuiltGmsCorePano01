package com.google.android.pano.chimera;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Action implements Parcelable {
    public static Parcelable.Creator CREATOR = new akdj();
    public String a;
    public String b;
    public String c;
    public Intent d;
    public String e;
    public int f;
    public Uri g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;

    public final Drawable a(Context context) {
        if (this.f == 0) {
            return null;
        }
        String str = this.e;
        if (str == null) {
            return context.getResources().getDrawable(this.f);
        }
        try {
            return context.createPackageContext(str, 0).getResources().getDrawable(this.f);
        } catch (PackageManager.NameNotFoundException e2) {
            if (!Log.isLoggable("Action", 5)) {
                return null;
            }
            Log.w("Action", "No icon for this action.");
            return null;
        } catch (Resources.NotFoundException e3) {
            if (!Log.isLoggable("Action", 5)) {
                return null;
            }
            Log.w("Action", "No icon for this action.");
            return null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i2);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeParcelable(this.g, i2);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j);
    }
}
