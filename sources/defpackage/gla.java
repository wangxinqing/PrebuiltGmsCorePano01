package defpackage;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.auth.uiflows.addaccount.AddAccountController;

/* renamed from: gla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gla implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddAccountController[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
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
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String[] createStringArray = parcel.createStringArray();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Intent intent = (Intent) parcel2.readParcelable(systemClassLoader);
        Account account = (Account) parcel2.readParcelable(systemClassLoader);
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Intent intent2 = (Intent) parcel2.readParcelable(systemClassLoader);
        String readString7 = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str = readString7;
        String readString8 = parcel.readString();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        String str2 = readString8;
        ManagedAuthOptions a2 = ManagedAuthOptions.a(parcel.createByteArray());
        D2dOptions a3 = D2dOptions.a(parcel.createByteArray());
        glb a4 = AddAccountController.a();
        a4.a = new fzo(ihs.b());
        a4.b = new glm(ihs.b());
        a4.c = accountAuthenticatorResponse;
        a4.d = readString;
        a4.e = z;
        a4.f = z2;
        a4.g = a;
        a4.h = z3;
        a4.i = readString2;
        a4.j = readString3;
        a4.k = readString4;
        a4.l = createStringArray;
        a4.m = readString5;
        a4.n = readString6;
        a4.o = Process.myUserHandle().isOwner();
        a4.p = z4;
        a4.q = intent;
        a4.r = account;
        a4.s = z5;
        a4.t = intent2;
        a4.u = str;
        a4.v = z6;
        a4.w = z7;
        a4.x = z8;
        a4.y = str2;
        a4.z = z9;
        a4.A = z10;
        a4.B = z11;
        a4.C = z12;
        a4.D = z13;
        a4.E = a2;
        a4.F = a3;
        return a4.a();
    }
}
