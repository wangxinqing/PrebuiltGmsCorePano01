package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.PersonEntity;

/* renamed from: wzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface wzv extends IInterface {
    void a(int i, Bundle bundle, Bundle bundle2);

    void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor);

    void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2);

    void a(int i, Bundle bundle, DataHolder dataHolder);

    void a(int i, Bundle bundle, DataHolder[] dataHolderArr);

    void a(int i, MatrixCursorParcelable matrixCursorParcelable);

    void a(int i, SyncStatus syncStatus);

    void a(int i, PersonEntity personEntity);

    void a(int i, String str);

    void b(int i, SyncStatus syncStatus);
}
