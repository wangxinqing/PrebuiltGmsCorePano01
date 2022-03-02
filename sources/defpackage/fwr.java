package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: fwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwr extends bhv implements fwt {
    public fwr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void a(fwq fwq, GoogleSignInOptions googleSignInOptions) {
        throw null;
    }

    public final void b(fwq fwq, GoogleSignInOptions googleSignInOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fwq);
        bhx.a(aQ, (Parcelable) googleSignInOptions);
        b(102, aQ);
    }

    public final void c(fwq fwq, GoogleSignInOptions googleSignInOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fwq);
        bhx.a(aQ, (Parcelable) googleSignInOptions);
        b(103, aQ);
    }
}
