package defpackage;

import android.os.Parcel;

/* renamed from: vyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vyg extends bhw implements vyh {
    public vyg() {
        super("com.google.android.gms.nearby.sharing.internal.IIntResultListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readInt());
        return true;
    }
}
