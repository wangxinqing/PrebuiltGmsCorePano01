package defpackage;

import android.os.Parcel;

/* renamed from: vcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vcp extends bhw implements vcq {
    public vcp() {
        super("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        b();
        return true;
    }
}
