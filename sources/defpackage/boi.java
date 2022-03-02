package defpackage;

import android.os.Parcel;

/* renamed from: boi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class boi extends bhw implements boj {
    public boi() {
        super("com.google.android.chimera.container.internal.IUpdateProgressListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readInt());
        return true;
    }
}
