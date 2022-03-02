package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;
import java.util.ArrayList;

/* renamed from: jzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jzx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RealtimeDocumentSyncRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                arrayList = ivw.C(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                arrayList2 = ivw.C(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new RealtimeDocumentSyncRequest(arrayList, arrayList2);
    }
}
