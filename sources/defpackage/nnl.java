package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

/* renamed from: nnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nnl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SnapshotMetadataChangeEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        Long l = null;
        BitmapTeleporter bitmapTeleporter = null;
        Uri uri = null;
        Long l2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                l = ivw.j(parcel, readInt);
            } else if (a == 4) {
                uri = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
            } else if (a == 5) {
                bitmapTeleporter = (BitmapTeleporter) ivw.a(parcel, readInt, BitmapTeleporter.CREATOR);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                l2 = ivw.j(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SnapshotMetadataChangeEntity(str, l, bitmapTeleporter, uri, l2);
    }
}
