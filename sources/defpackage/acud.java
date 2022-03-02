package defpackage;

import android.accounts.Account;
import android.accounts.AuthenticatorException;

/* renamed from: acud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acud {
    private String a = null;
    private final String b;
    private final Account c;
    private final qub d;

    public acud(Account account, String str, qub qub) {
        this.b = str;
        this.c = account;
        this.d = qub;
    }

    public final synchronized String a() {
        if (this.a == null) {
            try {
                this.a = this.d.c(this.c, this.b);
            } catch (IllegalArgumentException e) {
                throw new AuthenticatorException(e);
            }
        }
        return this.a;
    }

    public final synchronized void b() {
        this.d.b(this.c.type, this.a);
        this.a = null;
    }
}
