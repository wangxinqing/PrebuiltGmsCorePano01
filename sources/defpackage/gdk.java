package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* renamed from: gdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gdk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FinishSessionWorkflowRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Bundle bundle = null;
        AppDescription appDescription = null;
        String str = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                bundle = ivw.s(parcel, readInt);
            } else if (a == 3) {
                appDescription = (AppDescription) ivw.a(parcel, readInt, AppDescription.CREATOR);
            } else if (a == 4) {
                str = ivw.q(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                accountAuthenticatorResponse = (AccountAuthenticatorResponse) ivw.a(parcel, readInt, AccountAuthenticatorResponse.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new FinishSessionWorkflowRequest(i, bundle, appDescription, str, accountAuthenticatorResponse);
    }
}
