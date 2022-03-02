package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.security.verifier.ApkUploadEntry;

/* renamed from: aazh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApkUploadEntry[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i;
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        byte[] createByteArray2 = parcel.createByteArray();
        long readLong2 = parcel.readLong();
        int readInt2 = parcel.readInt();
        long readLong3 = parcel.readLong();
        int readInt3 = parcel.readInt();
        if (azfv.u()) {
            i = aazs.a(parcel.readInt());
        } else {
            i = 0;
        }
        return new ApkUploadEntry(readLong, readString, readInt, createByteArray, createByteArray2, readLong2, readInt2, readLong3, readInt3, i == 0 ? 1 : i);
    }
}
