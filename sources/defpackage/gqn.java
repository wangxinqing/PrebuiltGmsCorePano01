package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.updatecredentials.UpdateCredentialsController;

/* renamed from: gqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpdateCredentialsController[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        return new UpdateCredentialsController((AccountAuthenticatorResponse) parcel.readParcelable(systemClassLoader), (Account) parcel.readParcelable(systemClassLoader), parcel.readByte() != 0, ijn.a((Bundle) parcel.readParcelable(systemClassLoader)), parcel.readByte() != 0, parcel.readString(), parcel.readString(), parcel.readString());
    }
}
