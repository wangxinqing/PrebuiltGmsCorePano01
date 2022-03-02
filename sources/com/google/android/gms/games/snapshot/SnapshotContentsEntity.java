package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SnapshotContentsEntity extends GamesAbstractSafeParcelable implements SnapshotContents {
    public static final Parcelable.Creator CREATOR = new nnj();
    public Contents a;

    public SnapshotContentsEntity(Contents contents) {
        this.a = contents;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
