package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: uim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uim implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelablePayload[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        byte[] bArr = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Uri uri = null;
        long j = 0;
        long j2 = -1;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 2:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) ivw.a(parcel2, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 7:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) ivw.a(parcel2, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 8:
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ParcelablePayload(j, i, bArr, parcelFileDescriptor, str, j2, parcelFileDescriptor2, uri);
    }
}
