package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.util.ArrayList;

/* renamed from: gdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gdp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StartAddAccountSessionWorkflowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Bundle bundle = new Bundle();
        String str = "null";
        String str2 = str;
        ArrayList arrayList = null;
        AppDescription appDescription = null;
        String str3 = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case 3:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 4:
                    appDescription = (AppDescription) ivw.a(parcel2, readInt, AppDescription.CREATOR);
                    break;
                case 5:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) ivw.a(parcel2, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                case 7:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new StartAddAccountSessionWorkflowRequest(i, arrayList, bundle, appDescription, str3, accountAuthenticatorResponse, z, z2, str, str2);
    }
}
