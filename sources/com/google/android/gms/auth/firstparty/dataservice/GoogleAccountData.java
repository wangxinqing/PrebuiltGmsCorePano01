package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gbt();
    final int a;
    @Deprecated
    String b;
    boolean c;
    public List d;
    public String e;
    public String f;
    public Account g;

    public GoogleAccountData(int i, String str, boolean z, List list, String str2, String str3, Account account) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = str2;
        this.f = str3;
        if (account != null || TextUtils.isEmpty(str)) {
            this.g = account;
        } else {
            this.g = new Account(str, "com.google");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, i, false);
        ivx.b(parcel, a2);
    }

    public GoogleAccountData(Account account, boolean z, List list, String str, String str2) {
        this.a = 2;
        this.g = account;
        this.c = z;
        this.d = Collections.unmodifiableList(new ArrayList(list));
        this.e = str;
        this.f = str2;
    }
}
