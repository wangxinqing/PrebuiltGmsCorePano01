package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ClientContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new irz();
    public final int a;
    public int b;
    public Account c;
    public Account d;
    public String e;
    public String f;
    public List g;
    public List h;
    public Bundle i;
    public int j;

    public ClientContext() {
        this(0, -1, (Account) null, (Account) null, (String) null, (String) null, (List) null, (List) null, (Bundle) null, -1);
    }

    public static ClientContext a(Context context, int i2, Account account, String str) {
        Account account2;
        Account account3;
        iva.a((Object) account);
        iva.a((Object) str);
        String a2 = a(account, str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(a2, 0);
        int i3 = sharedPreferences.getInt("calling_uid", -1);
        if (i3 == -1 || i3 != i2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String string = sharedPreferences.getString("granted_scopes", (String) null);
        if (string != null && string.length() > 0) {
            String[] split = string.split(",");
            for (String add : split) {
                arrayList.add(add);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        String string2 = sharedPreferences.getString("requested_visible_actions", (String) null);
        if (string2 != null && string2.length() > 0) {
            for (String add2 : string2.split(",")) {
                arrayList2.add(add2);
            }
        }
        Bundle bundle = new Bundle();
        String string3 = sharedPreferences.getString("extras", (String) null);
        if (string3 != null && string3.length() > 0) {
            String[] split2 = string3.split(",");
            int length = split2.length - 1;
            for (int i4 = 0; i4 < length; i4 += 2) {
                bundle.putString(split2[i4], split2[i4 + 1]);
            }
        }
        String string4 = sharedPreferences.getString("resolved_account_name", (String) null);
        if (!TextUtils.isEmpty(string4)) {
            account2 = new Account(string4, sharedPreferences.getString("resolved_account_type", "com.google"));
        } else {
            account2 = null;
        }
        String string5 = sharedPreferences.getString("requested_account_name", (String) null);
        if (!TextUtils.isEmpty(string5)) {
            account3 = new Account(string5, sharedPreferences.getString("requested_account_type", "com.google"));
        } else {
            account3 = null;
        }
        return new ClientContext(i3, account2, account3, sharedPreferences.getString("calling_package_name", (String) null), sharedPreferences.getString("auth_package_name", (String) null), arrayList, arrayList2, bundle);
    }

    public static Account c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new Account(str, "com.google");
        }
        return null;
    }

    @Deprecated
    public final String b() {
        Account account = this.c;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public final void d(String str) {
        if (!a(str)) {
            this.g.add(str);
        }
    }

    @Deprecated
    public final void e(String str) {
        this.c = c(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientContext) {
            ClientContext clientContext = (ClientContext) obj;
            return ius.a(clientContext.c, this.c) && ius.a(clientContext.d, this.d) && ius.a(clientContext.e, this.e) && ius.a(clientContext.f, this.f) && clientContext.b == this.b;
        }
    }

    public final boolean f() {
        List list = this.g;
        return list != null && list.size() > 0;
    }

    public final String g() {
        if (f()) {
            String valueOf = String.valueOf(TextUtils.join(" ", this.g));
            return valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf);
        }
        throw new NullPointerException("no scopes granted");
    }

    public final String[] h() {
        List list = this.h;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.e, this.f, Integer.valueOf(this.b)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("mRequestedAccount", this.d);
        a2.a("mResolvedAccount", this.c);
        a2.a("mCallingPackageName", this.e);
        a2.a("mCallingUid", Integer.valueOf(this.b));
        a2.a("mAuthPackageName", this.f);
        a2.a("mGrantedScopes", this.g);
        a2.a("isProxyingAuthentication", Boolean.valueOf(d()));
        a2.a("mVisibleActions", this.h);
        a2.a("mExtras", this.i);
        return a2.toString();
    }

    public ClientContext(int i2, int i3, Account account, Account account2, String str, String str2, List list, List list2, Bundle bundle, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = account;
        this.d = account2;
        this.e = str;
        this.f = str2;
        this.g = list == null ? new ArrayList() : list;
        this.h = list2 == null ? new ArrayList() : list2;
        this.i = bundle == null ? new Bundle() : bundle;
        this.j = i4;
    }

    public final String b(String str) {
        return this.i.getString(str);
    }

    public final boolean d() {
        return !TextUtils.equals(this.e, this.f);
    }

    public final String[] e() {
        List list = this.g;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i2, false);
        ivx.a(parcel, 4, this.d, i2, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.b(parcel, 7, this.g, false);
        ivx.b(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, false);
        ivx.b(parcel, 10, this.j);
        ivx.b(parcel, a2);
    }

    public final void b(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(a(this.c, this.f), 0).edit();
        edit.clear();
        edit.commit();
    }

    public final boolean c() {
        String str;
        Account account = this.d;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        return "<<default account>>".equals(str);
    }

    @Deprecated
    public ClientContext(int i2, Account account, Account account2, String str, String str2) {
        this(i2, account2, account, str, str2, (ArrayList) null, (ArrayList) null, new Bundle());
    }

    @Deprecated
    public ClientContext(int i2, Account account, Account account2, String str, String str2, ArrayList arrayList, ArrayList arrayList2, Bundle bundle) {
        this(0, i2, account, account2, str, str2, arrayList, arrayList2, bundle, -1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClientContext(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r9 = this;
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            android.accounts.Account r2 = c(r12)
            android.accounts.Account r3 = c(r11)
            r6 = 0
            r7 = 0
            r0 = r9
            r1 = r10
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.ClientContext.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public ClientContext(ClientContext clientContext) {
        this(clientContext.b, clientContext.c, clientContext.d, clientContext.e, clientContext.f, new ArrayList(clientContext.g), new ArrayList(clientContext.h), new Bundle(clientContext.i));
    }

    private static String a(Account account, String str) {
        String valueOf = String.valueOf(String.valueOf(account.hashCode() ^ str.hashCode()));
        return valueOf.length() == 0 ? new String("common.clientcontext_") : "common.clientcontext_".concat(valueOf);
    }

    @Deprecated
    public final String a() {
        Account account = this.d;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public final void a(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(a(this.c, this.f), 0).edit();
        edit.putInt("calling_uid", this.b);
        edit.putString("resolved_account_name", this.c.name);
        edit.putString("resolved_account_type", this.c.type);
        edit.putString("requested_account_name", this.d.name);
        edit.putString("requested_account_type", this.d.type);
        edit.putString("calling_package_name", this.e);
        edit.putString("auth_package_name", this.f);
        StringBuilder sb = new StringBuilder();
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                sb.append(",");
            }
            sb.append((String) this.g.get(i2));
        }
        edit.putString("granted_scopes", sb.toString());
        edit.putString("requested_visible_actions", TextUtils.join(",", this.h));
        if (this.i.size() > 0) {
            sb.delete(0, sb.length());
            for (String str : this.i.keySet()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str);
                sb.append(',');
                sb.append(this.i.getString(str));
            }
            edit.putString("extras", sb.toString());
        }
        edit.apply();
    }

    public final void a(ClientContext clientContext) {
        this.i.clear();
        this.i.putAll(clientContext.i);
    }

    public final void a(String str, String str2) {
        boolean z = true;
        iva.b(!str.contains(","), "key cannot contain ','");
        if (str2 != null && str2.contains(",")) {
            z = false;
        }
        iva.b(z, "value cannot contain ','");
        this.i.putString(str, str2);
    }

    public final void a(String[] strArr) {
        this.g.clear();
        if (strArr != null) {
            for (String add : strArr) {
                this.g.add(add);
            }
        }
    }

    public final boolean a(String str) {
        return this.g.contains(str);
    }
}
