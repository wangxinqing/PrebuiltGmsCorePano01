package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: evj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class evj implements evo {
    private final fsz a;

    public evj(fsz fsz) {
        this.a = fsz;
    }

    public final void a(Status status, Object obj) {
        fsz fsz = this.a;
        Parcel aQ = fsz.aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) (BeginSignInResult) obj);
        fsz.c(1, aQ);
    }
}
