package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gex implements igp {
    final /* synthetic */ String a;

    public gex(String str) {
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        gep gep = new gep((acwd) obj2);
        ger ger = (ger) ((gey) obj).x();
        String str = this.a;
        Parcel aQ = ger.aQ();
        bhx.a(aQ, (IInterface) gep);
        aQ.writeString(str);
        ger.b(4, aQ);
    }
}
