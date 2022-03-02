package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.addaccount.StartAddAccountSessionController;

/* renamed from: gmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gmo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StartAddAccountSessionController[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Parcel parcel2 = parcel;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) parcel2.readParcelable(systemClassLoader);
        String readString = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ijn a = ijn.a((Bundle) parcel2.readParcelable(systemClassLoader));
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String[] createStringArray = parcel.createStringArray();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new StartAddAccountSessionController(accountAuthenticatorResponse, readString, z, z2, a, readString2, readString3, createStringArray, readString4, readString5, z3, z4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }
}
