package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.internal.OnMetadataResponse;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: kwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kwy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnMetadataResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                metadataBundle = (MetadataBundle) ivw.a(parcel, readInt, MetadataBundle.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new OnMetadataResponse(metadataBundle);
    }
}
