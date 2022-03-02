package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;

/* renamed from: nft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nft implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FontFetchResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Status status = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        FontMatchSpec fontMatchSpec = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                status = (Status) ivw.a(parcel, readInt, Status.CREATOR);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
            } else if (a == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) ivw.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                fontMatchSpec = (FontMatchSpec) ivw.a(parcel, readInt, FontMatchSpec.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new FontFetchResult(i, status, str, parcelFileDescriptor, fontMatchSpec);
    }
}
