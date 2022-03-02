package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.StateUpdate;

/* renamed from: nbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nbf extends ihb {
    final /* synthetic */ StateUpdate a;

    public nbf(StateUpdate stateUpdate) {
        this.a = stateUpdate;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ncz ncz = (ncz) ((ndb) ibf).x();
        nbe nbe = new nbe(acwd);
        StateUpdate stateUpdate = this.a;
        Parcel aQ = ncz.aQ();
        bhx.a(aQ, (IInterface) nbe);
        bhx.a(aQ, (Parcelable) stateUpdate);
        ncz.b(3, aQ);
    }
}
