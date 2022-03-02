package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gev implements igp {
    final /* synthetic */ String a;

    public gev(String str) {
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ges ges = new ges((acwd) obj2);
        ger ger = (ger) ((gey) obj).x();
        String str = this.a;
        Parcel aQ = ger.aQ();
        bhx.a(aQ, (IInterface) ges);
        aQ.writeString(str);
        ger.b(3, aQ);
    }
}
