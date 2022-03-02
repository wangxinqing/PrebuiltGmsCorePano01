package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.ExecuteBuyFlowRequest;

/* renamed from: adwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class adwx implements igp {
    private final adxa a;
    private final ExecuteBuyFlowRequest b;

    public adwx(adxa adxa, ExecuteBuyFlowRequest executeBuyFlowRequest) {
        this.a = adxa;
        this.b = executeBuyFlowRequest;
    }

    public final void a(Object obj, Object obj2) {
        adxa adxa = this.a;
        ExecuteBuyFlowRequest executeBuyFlowRequest = this.b;
        Bundle a2 = adxp.a(adxa.b, adxa.a.getPackageName(), (String) null, adxa.l, false);
        adwy adwy = new adwy((acwd) obj2);
        adxm adxm = (adxm) ((adxp) obj).x();
        Parcel aQ = adxm.aQ();
        bhx.a(aQ, (Parcelable) executeBuyFlowRequest);
        bhx.a(aQ, (Parcelable) a2);
        bhx.a(aQ, (IInterface) adwy);
        adxm.c(16, aQ);
    }
}
