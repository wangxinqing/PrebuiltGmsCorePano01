package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;

/* renamed from: aali  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aali implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GlobalQueryCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        GlobalSearchQuerySpecification globalSearchQuerySpecification = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 4) {
                globalSearchQuerySpecification = (GlobalSearchQuerySpecification) ivw.a(parcel, readInt, GlobalSearchQuerySpecification.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                bundle = ivw.s(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GlobalQueryCall$Request(str, i, i2, globalSearchQuerySpecification, bundle);
    }
}
