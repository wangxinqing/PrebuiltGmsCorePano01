package com.google.android.gms.gcm;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class Task implements ReflectedParcelable {
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final nto g;

    @Deprecated
    public Task(Parcel parcel) {
        boolean z;
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.c = parcel.readString();
        this.d = parcel.readString();
        boolean z2 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = parcel.readInt() == 1 ? true : z2;
        Collections.emptySet();
        this.g = nto.a;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
