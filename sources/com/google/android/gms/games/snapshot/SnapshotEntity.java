package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SnapshotEntity extends GamesAbstractSafeParcelable implements Snapshot {
    public static final Parcelable.Creator CREATOR = new nnk();
    public final SnapshotMetadataEntity a;
    private final SnapshotContentsEntity b;

    public SnapshotEntity(SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this.a = new SnapshotMetadataEntity(snapshotMetadata);
        this.b = snapshotContentsEntity;
    }

    public final SnapshotMetadata a() {
        return this.a;
    }

    public final SnapshotContents b() {
        SnapshotContentsEntity snapshotContentsEntity = this.b;
        if (snapshotContentsEntity.a != null) {
            return snapshotContentsEntity;
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, b()});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Snapshot) {
            if (this == obj) {
                return true;
            }
            Snapshot snapshot = (Snapshot) obj;
            if (!ius.a(snapshot.a(), this.a) || !ius.a(snapshot.b(), b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Metadata", this.a);
        a2.a("HasContents", Boolean.valueOf(b() != null));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 3, b(), i, false);
        ivx.b(parcel, a2);
    }
}
