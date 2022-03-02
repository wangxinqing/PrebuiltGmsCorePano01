package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: ftf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ftf extends bhv implements fth {
    public ftf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
    }

    public final void a(Status status, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) saveAccountLinkingTokenRequest);
        c(1, aQ);
    }
}
