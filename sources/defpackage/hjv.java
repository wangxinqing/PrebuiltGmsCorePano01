package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: hjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjv extends bhv implements hjx {
    public hjv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.chromesync.internal.IChromeSyncApiService");
    }

    public final void a(hju hju, int i, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) hju);
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        b(103, aQ);
    }

    public final void a(hju hju, String str) {
        throw null;
    }

    public final void a(hju hju, List list) {
        throw null;
    }

    public final void a(ifu ifu) {
        throw null;
    }

    public final void a(ifu ifu, int i) {
        throw null;
    }

    public final void a(ifu ifu, Bundle bundle) {
        throw null;
    }

    public final void b(ifu ifu, int i, Bundle bundle, Bundle bundle2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) bundle2);
        b(105, aQ);
    }

    public final void a(hju hju, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) hju);
        bhx.a(aQ, (Parcelable) bundle);
        b(1, aQ);
    }

    public final void b(ifu ifu, int i, String str, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeInt(i);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) bundle);
        b(102, aQ);
    }

    public final void a(hju hju, List list, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) hju);
        aQ.writeStringList(list);
        bhx.a(aQ, (Parcelable) bundle);
        b(202, aQ);
    }

    public final void a(ifu ifu, int i, Bundle bundle, Bundle bundle2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) bundle2);
        b(104, aQ);
    }

    public final void a(ifu ifu, int i, String str, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeInt(i);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) bundle);
        b(101, aQ);
    }

    public final void a(ifu ifu, String str, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) bundle);
        b(2, aQ);
    }
}
