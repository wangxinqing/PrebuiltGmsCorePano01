package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: fdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fdk {
    private final ftw a;

    public fdk(ftw ftw) {
        this.a = ftw;
    }

    public final void a(Status status, Object obj) {
        ftw ftw = this.a;
        Parcel aQ = ftw.aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) (SavePasswordResult) obj);
        ftw.c(1, aQ);
    }
}
