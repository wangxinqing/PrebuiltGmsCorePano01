package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: zvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zvk extends bhv implements zvm {
    public zvk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(2, aQ);
    }

    public final void b(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList(list);
        c(3, aQ);
    }

    public final void c(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList(list);
        c(4, aQ);
    }

    public final void d(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList(list);
        c(5, aQ);
    }

    public final void a(Status status, List list) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeTypedList(list);
        c(1, aQ);
    }
}
