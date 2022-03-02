package defpackage;

import android.accounts.Account;

/* renamed from: eqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class eqi extends enx {
    public final String a;

    public eqi(String str) {
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final Object a(qub qub, Account account) {
        String str = this.a;
        amkr a2 = amlv.a("AccountManager.getUserData");
        try {
            String userData = qub.a.getUserData(account, str);
            if (a2 != null) {
                a2.close();
            }
            return userData == null ? b() : a(userData);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public Object b() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(qub qub, Account account, Object obj) {
        String str;
        if (obj != null) {
            str = a(obj);
        } else {
            str = null;
        }
        String str2 = this.a;
        amkr a2 = amlv.a("AccountManager.setUserData");
        try {
            qub.a.setUserData(account, str2, str);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
