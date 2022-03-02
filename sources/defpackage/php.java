package defpackage;

import android.accounts.Account;

/* renamed from: php  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class php {
    private final bapu a;

    public php(bapu bapu) {
        a(bapu, 1);
        this.a = bapu;
    }

    private static void a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    public final pho a(Account account, int i, int i2, sah sah, ifu ifu) {
        pgm pgm = (pgm) this.a.a();
        a(pgm, 1);
        a(account, 2);
        a(sah, 5);
        a(ifu, 6);
        return new pho(pgm, account, i, i2, sah, ifu);
    }
}
