package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.QueryCall$Request;

/* renamed from: aaln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaln implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new QueryCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        QuerySpecification querySpecification = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
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
                    strArr = ivw.A(parcel, readInt);
                    break;
                case 4:
                    i = ivw.g(parcel, readInt);
                    break;
                case 5:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 6:
                    querySpecification = (QuerySpecification) ivw.a(parcel, readInt, QuerySpecification.CREATOR);
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
        return new QueryCall$Request(str, str2, strArr, i, i2, querySpecification, bundle);
    }
}
