package defpackage;

import android.os.Parcel;

/* renamed from: ugz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ugz extends bhw implements uha {
    public ugz() {
        super("com.google.android.gms.nearby.internal.connection.IResultListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a(parcel.readInt());
        return true;
    }
}
