package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;

/* renamed from: dup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dup implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UsageInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        DocumentId documentId = null;
        String str = null;
        DocumentContents documentContents = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = -1;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    documentId = (DocumentId) ivw.a(parcel2, readInt, DocumentId.CREATOR);
                    break;
                case 2:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 3:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    documentContents = (DocumentContents) ivw.a(parcel2, readInt, DocumentContents.CREATOR);
                    break;
                case 6:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 8:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 9:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new UsageInfo(documentId, j, i, str, documentContents, z, i2, i3, str2);
    }
}
