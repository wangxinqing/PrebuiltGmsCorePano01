package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.MatrixCursorParcelable;
import com.google.android.gms.people.internal.SyncStatus;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.PersonEntity;

/* renamed from: wzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class wzu extends bhw implements wzv {
    public wzu() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    public void a(int i, Bundle bundle, Bundle bundle2) {
    }

    public void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
    }

    public void a(int i, Bundle bundle, DataHolder dataHolder) {
    }

    public void a(int i, Bundle bundle, DataHolder[] dataHolderArr) {
    }

    public final void a(int i, MatrixCursorParcelable matrixCursorParcelable) {
    }

    public void a(int i, SyncStatus syncStatus) {
    }

    public final void a(int i, PersonEntity personEntity) {
    }

    public final void a(int i, String str) {
    }

    public final void b(int i, SyncStatus syncStatus) {
    }

    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        throw new RuntimeException("Shouldn't be called");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 12) {
            a(parcel.readInt(), (SyncStatus) bhx.a(parcel, SyncStatus.CREATOR));
            return true;
        } else if (i == 18) {
            parcel.readInt();
            SyncStatus syncStatus = (SyncStatus) bhx.a(parcel, SyncStatus.CREATOR);
            return true;
        } else if (i == 15) {
            parcel.readInt();
            parcel.readString();
            return true;
        } else if (i != 16) {
            switch (i) {
                case 1:
                    a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (Bundle) bhx.a(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (DataHolder) bhx.a(parcel, DataHolder.CREATOR));
                    return true;
                case 3:
                    a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) bhx.a(parcel, ParcelFileDescriptor.CREATOR));
                    return true;
                case 4:
                    a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR));
                    return true;
                case 5:
                    a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) bhx.a(parcel, ParcelFileDescriptor.CREATOR), (Bundle) bhx.a(parcel, Bundle.CREATOR));
                    return true;
                case 6:
                    parcel.readInt();
                    BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = (BackedUpContactsPerDeviceEntity) bhx.a(parcel, BackedUpContactsPerDeviceEntity.CREATOR);
                    return true;
                case 7:
                    parcel.readInt();
                    PersonEntity personEntity = (PersonEntity) bhx.a(parcel, PersonEntity.CREATOR);
                    return true;
                case 8:
                    parcel.readInt();
                    return true;
                default:
                    return false;
            }
        } else {
            parcel.readInt();
            MatrixCursorParcelable matrixCursorParcelable = (MatrixCursorParcelable) bhx.a(parcel, MatrixCursorParcelable.CREATOR);
            return true;
        }
    }
}
