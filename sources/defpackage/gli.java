package defpackage;

import android.accounts.Account;
import android.content.Intent;

/* renamed from: gli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gli {
    public final int a;
    public final Account b;
    public final Intent c;
    public final String d;
    public final boolean e;
    public final String f;
    public final int g;

    public gli(int i, Account account, Intent intent, String str, boolean z, String str2, int i2) {
        if (i == 0) {
            iva.a((Object) account);
        }
        this.a = i;
        this.b = account;
        this.c = intent;
        this.d = str;
        this.e = z;
        this.f = str2;
        this.g = i2;
    }

    public final String toString() {
        return "status=" + this.a + "unicorn=" + this.e;
    }
}
