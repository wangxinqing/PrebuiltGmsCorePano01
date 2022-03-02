package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mdm implements igp {
    public final void a(Object obj, Object obj2) {
        mdo mdo = new mdo((acwd) obj2);
        mdj mdj = (mdj) ((mdi) obj).x();
        Parcel aQ = mdj.aQ();
        bhx.a(aQ, (Parcelable) null);
        bhx.a(aQ, (IInterface) mdo);
        mdj.b(1, aQ);
    }
}
