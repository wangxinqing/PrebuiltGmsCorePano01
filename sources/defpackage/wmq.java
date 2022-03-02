package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.PersonEntity;

/* renamed from: wmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmq implements wzv {
    final boolean a;
    private final wzv b;

    public wmq(wzv wzv, boolean z) {
        this.b = wzv;
        this.a = z;
    }

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        this.b.a(i, bundle, bundle2);
    }

    public final IBinder asBinder() {
        return this.b.asBinder();
    }

    public final void b(int i, SyncStatus syncStatus) {
        this.b.b(i, syncStatus);
    }

    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        throw new RuntimeException("Shouldn't be called");
    }

    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        if (this.a) {
            this.b.a(i, bundle, parcelFileDescriptor, bundle2);
        } else {
            this.b.a(i, bundle, parcelFileDescriptor);
        }
    }

    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        this.b.a(i, bundle, dataHolder);
    }

    public final void a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
        this.b.a(i, bundle, dataHolderArr);
    }

    public final void a(int i, MatrixCursorParcelable matrixCursorParcelable) {
        this.b.a(i, matrixCursorParcelable);
    }

    public final void a(int i, SyncStatus syncStatus) {
        this.b.a(i, syncStatus);
    }

    public final void a(int i, PersonEntity personEntity) {
        this.b.a(i, personEntity);
    }

    public final void a(int i, String str) {
        this.b.a(i, str);
    }
}
