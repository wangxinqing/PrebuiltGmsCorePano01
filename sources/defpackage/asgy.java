package defpackage;

import android.os.Parcel;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;

/* renamed from: asgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class asgy extends bhw implements asgz {
    public asgy() {
        super("com.google.location.nearby.direct.client.internal.INearbyDirectService");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            OperationResponse a = a((OperationRequest) bhx.a(parcel, OperationRequest.CREATOR));
            parcel2.writeNoException();
            bhx.b(parcel2, a);
        } else if (i == 2) {
            OperationResponse a2 = a(parcel.readString());
            parcel2.writeNoException();
            bhx.b(parcel2, a2);
        } else if (i == 3) {
            OperationResponse b = b((OperationRequest) bhx.a(parcel, OperationRequest.CREATOR));
            parcel2.writeNoException();
            bhx.b(parcel2, b);
        } else if (i == 4) {
            boolean c = c((OperationRequest) bhx.a(parcel, OperationRequest.CREATOR));
            parcel2.writeNoException();
            bhx.a(parcel2, c);
        } else if (i != 5) {
            return false;
        } else {
            boolean d = d((OperationRequest) bhx.a(parcel, OperationRequest.CREATOR));
            parcel2.writeNoException();
            bhx.a(parcel2, d);
        }
        return true;
    }
}
