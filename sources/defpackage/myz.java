package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.StateUpdate;

/* renamed from: myz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class myz implements igp {
    private final mzc a;
    private final StateUpdate b;

    public myz(mzc mzc, StateUpdate stateUpdate) {
        this.a = mzc;
        this.b = stateUpdate;
    }

    public final void a(Object obj, Object obj2) {
        mzc mzc = this.a;
        StateUpdate stateUpdate = this.b;
        mzb mzb = new mzb((acwd) obj2);
        nbb nbb = (nbb) ((nba) obj).x();
        String uuid = mzc.a.toString();
        Parcel aQ = nbb.aQ();
        aQ.writeString(uuid);
        bhx.a(aQ, (IInterface) mzb);
        bhx.a(aQ, (Parcelable) stateUpdate);
        nbb.b(4, aQ);
    }
}
