package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: aafm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aafm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppIndexingErrorInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        Thing thing = null;
        ActionImpl actionImpl = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
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
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 4:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    j = ivw.i(parcel, readInt);
                    break;
                case 6:
                    thing = (Thing) ivw.a(parcel, readInt, Thing.CREATOR);
                    break;
                case 7:
                    actionImpl = (ActionImpl) ivw.a(parcel, readInt, ActionImpl.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AppIndexingErrorInfo(str, i, i2, str2, j, thing, actionImpl);
    }
}
