package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.internal.CloseContentsRequest;

/* renamed from: kud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kud implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CloseContentsRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Contents contents = null;
        Boolean bool = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                contents = (Contents) ivw.a(parcel, readInt, Contents.CREATOR);
            } else if (a == 3) {
                bool = ivw.d(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new CloseContentsRequest(contents, bool, i);
    }
}
