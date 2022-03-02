package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;

/* renamed from: ftv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ftv extends bhv implements IInterface {
    public ftv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    public final void a(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) saveAccountLinkingTokenResult);
        c(1, aQ);
    }
}
