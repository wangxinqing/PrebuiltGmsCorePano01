package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: fts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fts extends bhv implements ftu {
    public fts(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
    }

    public final void a(Status status, MatchPasswordResult matchPasswordResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) matchPasswordResult);
        c(1, aQ);
    }
}
