package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* renamed from: myy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class myy implements igp {
    private final mzc a;
    private final PublicKeyCredentialRequestOptions b;
    private final gps c;

    public myy(mzc mzc, gps gps, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        this.a = mzc;
        this.c = gps;
        this.b = publicKeyCredentialRequestOptions;
    }

    public final void a(Object obj, Object obj2) {
        mzc mzc = this.a;
        gps gps = this.c;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.b;
        mza mza = new mza((acwd) obj2);
        mzd mzd = new mzd(gps);
        nbb nbb = (nbb) ((nba) obj).x();
        String uuid = mzc.a.toString();
        Parcel aQ = nbb.aQ();
        aQ.writeString(uuid);
        bhx.a(aQ, (IInterface) mza);
        bhx.a(aQ, (Parcelable) publicKeyCredentialRequestOptions);
        bhx.a(aQ, (IInterface) mzd);
        nbb.b(2, aQ);
    }
}
