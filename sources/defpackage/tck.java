package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobstore.RenameRequest;

/* renamed from: tck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tck implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RenameRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Uri uri = null;
        Uri uri2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                uri = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                uri2 = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new RenameRequest(uri, uri2);
    }
}
