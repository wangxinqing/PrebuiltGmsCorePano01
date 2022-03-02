package defpackage;

import android.accounts.Account;

/* renamed from: aext  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aext {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;

    public aext(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        a(bapu, 1);
        this.a = bapu;
        a(bapu2, 2);
        this.b = bapu2;
        a(bapu3, 3);
        this.c = bapu3;
        a(bapu4, 4);
        this.d = bapu4;
    }

    private static void a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    public final aexs a(String str, Account account, int i, int i2, aeta aeta) {
        aeri aeri = (aeri) this.a.a();
        a(aeri, 1);
        awdn awdn = (awdn) this.b.a();
        a(awdn, 2);
        aeva aeva = (aeva) this.c.a();
        a(aeva, 3);
        afeb afeb = (afeb) this.d.a();
        a(afeb, 4);
        a(str, 5);
        a(account, 6);
        aeta aeta2 = aeta;
        a(aeta2, 9);
        return new aexs(aeri, awdn, aeva, afeb, str, account, i, i2, aeta2);
    }
}
