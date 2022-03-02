package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import java.util.ArrayList;

/* renamed from: jwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jwf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContextDataFilterImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        QueryFilterParameters queryFilterParameters = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                arrayList = ivw.c(parcel, readInt, ContextDataFilterImpl.Inclusion.CREATOR);
            } else if (a == 3) {
                arrayList2 = ivw.C(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                queryFilterParameters = (QueryFilterParameters) ivw.a(parcel, readInt, QueryFilterParameters.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ContextDataFilterImpl(arrayList, arrayList2, queryFilterParameters);
    }
}
