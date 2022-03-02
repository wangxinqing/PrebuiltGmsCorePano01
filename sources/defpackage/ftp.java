package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.ListSignInCredentialsResult;
import com.google.android.gms.common.api.Status;

/* renamed from: ftp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ftp extends bhv implements ftr {
    public ftp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback");
    }

    public final void a(Status status, ListSignInCredentialsResult listSignInCredentialsResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) listSignInCredentialsResult);
        c(1, aQ);
    }
}
