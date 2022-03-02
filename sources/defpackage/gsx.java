package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.backup.ParcelableBackupDataOutput;

/* renamed from: gsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gsx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableBackupDataOutput[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) ivw.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ParcelableBackupDataOutput(parcelFileDescriptor);
    }
}
