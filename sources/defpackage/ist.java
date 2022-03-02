package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import org.chromium.net.UrlRequest;

/* renamed from: ist  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ist implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = ivx.a(parcel);
        ivx.b(parcel, 1, getServiceRequest.a);
        ivx.b(parcel, 2, getServiceRequest.b);
        ivx.b(parcel, 3, getServiceRequest.c);
        ivx.a(parcel, 4, getServiceRequest.d, false);
        ivx.a(parcel, 5, getServiceRequest.e);
        ivx.a(parcel, 6, (Parcelable[]) getServiceRequest.f, i);
        ivx.a(parcel, 7, getServiceRequest.g, false);
        ivx.a(parcel, 8, getServiceRequest.h, i, false);
        ivx.a(parcel, 10, (Parcelable[]) getServiceRequest.i, i);
        ivx.a(parcel, 11, (Parcelable[]) getServiceRequest.j, i);
        ivx.a(parcel, 12, getServiceRequest.k);
        ivx.b(parcel, 13, getServiceRequest.l);
        ivx.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    iBinder = ivw.r(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) ivw.b(parcel2, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) ivw.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) ivw.b(parcel2, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) ivw.b(parcel2, readInt, Feature.CREATOR);
                    break;
                case 12:
                    z = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
