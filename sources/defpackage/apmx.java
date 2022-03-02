package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: apmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apmx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MutateRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Thing[] thingArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        ActionImpl actionImpl = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    thingArr = (Thing[]) ivw.b(parcel, readInt, Thing.CREATOR);
                    break;
                case 3:
                    strArr = ivw.A(parcel, readInt);
                    break;
                case 5:
                    strArr2 = ivw.A(parcel, readInt);
                    break;
                case 6:
                    actionImpl = (ActionImpl) ivw.a(parcel, readInt, ActionImpl.CREATOR);
                    break;
                case 7:
                    str = ivw.q(parcel, readInt);
                    break;
                case 8:
                    str2 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new MutateRequest(i, thingArr, strArr, strArr2, actionImpl, str, str2);
    }
}
