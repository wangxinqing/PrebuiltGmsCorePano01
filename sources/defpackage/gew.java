package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gew implements igp {
    final /* synthetic */ String a;

    public gew(String str) {
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        get get = new get((acwd) obj2);
        ger ger = (ger) ((gey) obj).x();
        String str = this.a;
        Parcel aQ = ger.aQ();
        bhx.a(aQ, (IInterface) get);
        aQ.writeString(str);
        ger.b(5, aQ);
    }
}
