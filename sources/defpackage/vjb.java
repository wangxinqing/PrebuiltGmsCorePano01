package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.FileAttachment;

/* renamed from: vjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vjb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FileAttachment[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        Uri uri = null;
        Bundle bundle = null;
        String str2 = "application/octet-stream";
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel, readInt);
                    break;
                case 2:
                    i = ivw.g(parcel, readInt);
                    break;
                case 3:
                    j = ivw.i(parcel, readInt);
                    break;
                case 4:
                    uri = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    bundle = ivw.s(parcel, readInt);
                    break;
                case 6:
                    str2 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new FileAttachment(str, i, j, uri, bundle, str2);
    }
}
