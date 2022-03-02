package defpackage;

import android.accounts.Account;

/* renamed from: ahag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahag implements aoqb {
    private final int a;

    public ahag(int i) {
        this.a = i;
    }

    public final aorr a(Object obj) {
        auii auii;
        int i = this.a;
        auik auik = (auik) obj;
        audr audr = auik.c;
        Integer valueOf = Integer.valueOf(i);
        Account account = null;
        if (audr.containsKey(valueOf)) {
            auii = (auii) audr.get(valueOf);
        } else {
            auii = null;
        }
        if (auii != null) {
            account = new Account(auii.b, auii.c);
        }
        if (account != null) {
            return aorl.a((Object) account);
        }
        if (!auik.equals(auik.d)) {
            int i2 = auik.b;
            if (i == i2) {
                throw new ahbf("Account not found");
            } else if (i < 0) {
                throw new ahbf("Account not found");
            } else if (i > 100) {
                throw new ahbf("Account not found");
            } else if (i > i2) {
                throw new ahbf("Account not found");
            } else {
                throw new ahbf("Account not found");
            }
        } else {
            throw new ahbf("Account not found");
        }
    }
}
