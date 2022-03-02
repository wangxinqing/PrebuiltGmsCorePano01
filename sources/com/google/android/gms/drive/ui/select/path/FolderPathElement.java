package com.google.android.gms.drive.ui.select.path;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.Filter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FolderPathElement implements DriveIdPathElement {
    public static final Parcelable.Creator CREATOR = new lqb();
    public final DriveId a;
    public final boolean b;
    public final boolean c;
    private final int d;
    private final String e;

    public FolderPathElement(Parcel parcel) {
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.a = (DriveId) parcel.readParcelable(DriveId.class.getClassLoader());
        boolean z = true;
        this.b = parcel.readInt() > 0;
        this.c = parcel.readInt() <= 0 ? false : z;
    }

    public final DriveId a() {
        return this.a;
    }

    public final String a(Context context) {
        return this.e;
    }

    public final Filter b() {
        return lim.a(liu.d, (Object) this.a);
    }

    public final lqu c() {
        return lqu.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public FolderPathElement(jzr jzr) {
        this.d = loe.a(jzr.c()).a(jzr.f());
        this.e = jzr.d();
        this.a = jzr.a();
        this.b = jzr.g();
        this.c = jzr.f();
    }
}
