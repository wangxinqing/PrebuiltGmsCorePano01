package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.PersonEntity;

/* renamed from: wzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wzt extends bhv implements wzv {
    public wzt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) bundle2);
        c(1, aQ);
    }

    public final void b(int i, SyncStatus syncStatus) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) syncStatus);
        c(18, aQ);
    }

    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) parcelFileDescriptor);
        c(3, aQ);
    }

    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) parcelFileDescriptor);
        bhx.a(aQ, (Parcelable) bundle2);
        c(5, aQ);
    }

    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) dataHolder);
        c(2, aQ);
    }

    public final void a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        aQ.writeTypedArray(dataHolderArr, 0);
        c(4, aQ);
    }

    public final void a(int i, MatrixCursorParcelable matrixCursorParcelable) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) matrixCursorParcelable);
        c(16, aQ);
    }

    public final void a(int i, SyncStatus syncStatus) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) syncStatus);
        c(12, aQ);
    }

    public final void a(int i, PersonEntity personEntity) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) personEntity);
        c(7, aQ);
    }

    public final void a(int i, String str) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        aQ.writeString(str);
        c(15, aQ);
    }
}
