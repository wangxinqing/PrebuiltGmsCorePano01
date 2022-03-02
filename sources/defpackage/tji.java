package defpackage;

import android.os.Parcel;

/* renamed from: tji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tji extends ugz {
    final /* synthetic */ ugr a;

    public tji(ugr ugr) {
        this.a = ugr;
    }

    public final void a(int i) {
        ugr ugr = this.a;
        Parcel aQ = ugr.aQ();
        aQ.writeInt(i);
        ugr.b(1013, aQ);
    }
}
