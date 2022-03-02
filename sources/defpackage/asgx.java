package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;

/* renamed from: asgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asgx extends bhv implements asgz {
    public asgx(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.direct.client.internal.INearbyDirectService");
    }

    public final OperationResponse a(OperationRequest operationRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) operationRequest);
        Parcel a = a(1, aQ);
        OperationResponse operationResponse = (OperationResponse) bhx.a(a, OperationResponse.CREATOR);
        a.recycle();
        return operationResponse;
    }

    public final OperationResponse b(OperationRequest operationRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) operationRequest);
        Parcel a = a(3, aQ);
        OperationResponse operationResponse = (OperationResponse) bhx.a(a, OperationResponse.CREATOR);
        a.recycle();
        return operationResponse;
    }

    public final boolean c(OperationRequest operationRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) operationRequest);
        Parcel a = a(4, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final boolean d(OperationRequest operationRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) operationRequest);
        Parcel a = a(5, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }

    public final OperationResponse a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        Parcel a = a(2, aQ);
        OperationResponse operationResponse = (OperationResponse) bhx.a(a, OperationResponse.CREATOR);
        a.recycle();
        return operationResponse;
    }
}
