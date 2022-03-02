package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.ActionImpl;

/* renamed from: apma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apma implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActionImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ActionImpl.MetadataImpl metadataImpl = null;
        String str5 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel, readInt);
                    break;
                case 2:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 3:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 4:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    metadataImpl = (ActionImpl.MetadataImpl) ivw.a(parcel, readInt, ActionImpl.MetadataImpl.CREATOR);
                    break;
                case 6:
                    str5 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    bundle = ivw.s(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ActionImpl(str, str2, str3, str4, metadataImpl, str5, bundle);
    }
}
