package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;

/* renamed from: nbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nbd extends ihb {
    final /* synthetic */ BrowserSignRequestParams a;
    final /* synthetic */ nbh b;

    public nbd(BrowserSignRequestParams browserSignRequestParams, nbh nbh) {
        this.a = browserSignRequestParams;
        this.b = nbh;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf, acwd acwd) {
        ncz ncz = (ncz) ((ndb) ibf).x();
        nbc nbc = new nbc(acwd);
        BrowserSignRequestParams browserSignRequestParams = this.a;
        nbh nbh = this.b;
        Parcel aQ = ncz.aQ();
        bhx.a(aQ, (IInterface) nbc);
        bhx.a(aQ, (Parcelable) browserSignRequestParams);
        bhx.a(aQ, (IInterface) nbh);
        ncz.b(1, aQ);
    }
}
