package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;

/* renamed from: sje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sje implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SyncRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        SyncOptions syncOptions = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                bArr = ivw.t(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                syncOptions = (SyncOptions) ivw.a(parcel, readInt, SyncOptions.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SyncRequest(i, bArr, syncOptions);
    }
}
