package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: fta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fta extends bhv implements ftc {
    public fta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
    }

    public final void a(Status status, CompleteSignInResult completeSignInResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) completeSignInResult);
        c(1, aQ);
    }
}
