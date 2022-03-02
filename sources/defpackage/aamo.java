package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: aamo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamo extends aakp implements niz {
    public final void a(aako aako) {
        Status status = Status.a;
        Parcel aQ = aako.aQ();
        bhx.a(aQ, (Parcelable) status);
        aako.c(2, aQ);
    }

    public final void b(aako aako) {
        Status status = new Status(10000);
        Parcel aQ = aako.aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) null);
        aako.c(1, aQ);
    }
}
