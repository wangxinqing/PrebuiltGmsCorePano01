package defpackage;

import android.os.Parcel;

/* renamed from: tjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tjj extends ugz {
    final /* synthetic */ ugr a;

    public tjj(ugr ugr) {
        this.a = ugr;
    }

    public final void a(int i) {
        ugr ugr = this.a;
        Parcel aQ = ugr.aQ();
        aQ.writeInt(i);
        ugr.b(1014, aQ);
    }
}
