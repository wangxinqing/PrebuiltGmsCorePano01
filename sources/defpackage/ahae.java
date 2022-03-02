package defpackage;

import android.accounts.Account;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ahae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahae implements amqy {
    private final Account a;
    private final AtomicInteger b;

    public ahae(Account account, AtomicInteger atomicInteger) {
        this.a = account;
        this.b = atomicInteger;
    }

    public final Object a(Object obj) {
        Account account = this.a;
        AtomicInteger atomicInteger = this.b;
        auik auik = (auik) obj;
        aucd aucd = (aucd) auik.c(5);
        aucd.a((aucj) auik);
        Integer a2 = agzu.a(auik, account);
        if (a2 == null) {
            a2 = Integer.valueOf(auik.b);
            aucd o = auii.d.o();
            String str = account.name;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auii auii = (auii) o.b;
            str.getClass();
            auii.a |= 1;
            auii.b = str;
            String str2 = account.type;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auii auii2 = (auii) o.b;
            str2.getClass();
            auii2.a |= 2;
            auii2.c = str2;
            auii auii3 = (auii) o.i();
            int intValue = a2.intValue() + 1;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            auik auik2 = (auik) aucd.b;
            auik auik3 = auik.d;
            auik2.a |= 1;
            auik2.b = intValue;
            int intValue2 = a2.intValue();
            auii3.getClass();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            auik auik4 = (auik) aucd.b;
            audr audr = auik4.c;
            if (!audr.a) {
                auik4.c = audr.a();
            }
            auik4.c.put(Integer.valueOf(intValue2), auii3);
        }
        atomicInteger.set(a2.intValue());
        return (auik) aucd.i();
    }
}
