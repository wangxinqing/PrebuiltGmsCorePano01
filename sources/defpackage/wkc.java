package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: wkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wkc {
    final /* synthetic */ wjy a;

    public wkc(wjy wjy) {
        this.a = wjy;
    }

    public final void a(Status status) {
        wjy wjy = this.a;
        Parcel aQ = wjy.aQ();
        bhx.a(aQ, (Parcelable) status);
        wjy.b(1, aQ);
    }
}
