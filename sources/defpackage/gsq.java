package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: gsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class gsq implements igp {
    private final long a;
    private final String b;

    public gsq(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final void a(Object obj, Object obj2) {
        long j = this.a;
        String str = this.b;
        gss gss = new gss((acwd) obj2);
        gtb gtb = (gtb) ((gsz) obj).x();
        Parcel aQ = gtb.aQ();
        bhx.a(aQ, (IInterface) gss);
        aQ.writeLong(j);
        aQ.writeString(str);
        gtb.b(2, aQ);
    }
}
