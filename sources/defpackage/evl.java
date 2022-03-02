package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: evl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class evl implements evo {
    private final ftl a;

    public evl(ftl ftl) {
        this.a = ftl;
    }

    public final void a(Status status, Object obj) {
        ftl ftl = this.a;
        Parcel aQ = ftl.aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) (PendingIntent) obj);
        ftl.c(1, aQ);
    }
}
