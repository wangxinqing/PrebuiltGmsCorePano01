package com.google.android.gms.auth.account.be.legacy;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountChimeraContentProvider extends ContentProvider {
    private static final iwd a = ehv.a("AccountChimeraContentProvider");
    private qub b;
    private hya c;

    public final Bundle call(String str, String str2, Bundle bundle) {
        Account[] accountArr;
        int length;
        int i;
        amkr a2;
        Throwable th;
        String str3 = str;
        String str4 = str2;
        int callingUid = Binder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (this.c.a(callingUid)) {
                Bundle bundle2 = new Bundle();
                String str5 = null;
                int i2 = 0;
                if ("get_accounts".equals(str3)) {
                    jnh b2 = jni.b(getContext());
                    String[] a3 = b2.a(callingUid);
                    if (!(a3 == null || (length = a3.length) == 0)) {
                        str5 = a3[0];
                        if (length != 1) {
                            String str6 = str5;
                            int i3 = Integer.MAX_VALUE;
                            for (String str7 : a3) {
                                try {
                                    ApplicationInfo a4 = b2.a(str7, i2);
                                    if (a4 != null && (i = a4.targetSdkVersion) < i3) {
                                        str6 = str7;
                                        i3 = i;
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    iwd iwd = a;
                                    String valueOf = String.valueOf(e);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                                    sb.append("Error while getting ApplicationInfo ");
                                    sb.append(valueOf);
                                    String sb2 = sb.toString();
                                    i2 = 0;
                                    iwd.b(sb2, new Object[0]);
                                }
                            }
                            str5 = str6;
                        }
                    }
                    if (!((fys) fys.d.b()).b(callingUid)) {
                        accountArr = this.b.a(str4, str5);
                    } else {
                        accountArr = this.b.a(str4);
                    }
                    bundle2.putParcelableArray("accounts", accountArr);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return bundle2;
                } else if ("clear_password".equals(str3)) {
                    Account account = (Account) bundle.getParcelable("clear_password");
                    a.c("Calling clearPassword on account by uid: %d", Integer.valueOf(callingUid));
                    qub qub = this.b;
                    a2 = amlv.a("AccountManager.clearPassword");
                    qub.a.clearPassword(account);
                    if (a2 != null) {
                        a2.close();
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return null;
                } else {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw new IllegalArgumentException(String.format("Unsupported method [%s] or argument [%s].", new Object[]{str3, str4}));
                }
            } else {
                throw new SecurityException("Caller isn't signed with recognized keys!");
            }
        } catch (Throwable th2) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th2;
        }
        throw th;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        return "text/plain";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final boolean onCreate() {
        Context context = getContext();
        hya a2 = hya.a(context);
        this.b = qub.a(context);
        this.c = a2;
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
