package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: geu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class geu implements igp {
    final /* synthetic */ String a;

    public geu(String str) {
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        geq geq = new geq((acwd) obj2);
        ger ger = (ger) ((gey) obj).x();
        String str = this.a;
        Parcel aQ = ger.aQ();
        bhx.a(aQ, (IInterface) geq);
        aQ.writeString(str);
        bhx.a(aQ, true);
        ger.b(1, aQ);
    }
}
