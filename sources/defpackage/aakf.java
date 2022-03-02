package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Response;

/* renamed from: aakf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aakf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetCorpusHandlesRegisteredForIMECall$Response[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Status status = null;
        String[] strArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                status = (Status) ivw.a(parcel, readInt, Status.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                strArr = ivw.A(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GetCorpusHandlesRegisteredForIMECall$Response(status, strArr);
    }
}
