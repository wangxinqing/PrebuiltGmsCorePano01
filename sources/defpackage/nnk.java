package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

/* renamed from: nnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nnk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SnapshotEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        SnapshotContentsEntity snapshotContentsEntity = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                snapshotMetadataEntity = (SnapshotMetadataEntity) ivw.a(parcel, readInt, SnapshotMetadataEntity.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                snapshotContentsEntity = (SnapshotContentsEntity) ivw.a(parcel, readInt, SnapshotContentsEntity.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SnapshotEntity(snapshotMetadataEntity, snapshotContentsEntity);
    }
}
