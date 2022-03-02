package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: fwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwo extends bhv implements fwq {
    public fwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public final void a(GoogleSignInAccount googleSignInAccount, Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) googleSignInAccount);
        bhx.a(aQ, (Parcelable) status);
        b(101, aQ);
    }

    public final void b(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        b(103, aQ);
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        b(102, aQ);
    }
}
