package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.updatecredentials.FinishUpdateCredentialsSessionController;

/* renamed from: gqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FinishUpdateCredentialsSessionController[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) parcel.readParcelable(systemClassLoader);
        Account account = (Account) parcel.readParcelable(systemClassLoader);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new FinishUpdateCredentialsSessionController(accountAuthenticatorResponse, account, z, ijn.a((Bundle) parcel.readParcelable(systemClassLoader)), parcel.readString(), parcel.readString());
    }
}
