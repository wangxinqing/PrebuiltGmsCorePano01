package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ahah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahah implements agzt {
    public final ahfv a;

    public ahah(ahfv ahfv) {
        this.a = ahfv;
    }

    public final aorr a(Account account) {
        AtomicInteger atomicInteger = new AtomicInteger();
        return aopr.a(this.a.a((amqy) new ahae(account, atomicInteger), (Executor) aoqm.a), (amqy) new ahaf(atomicInteger), (Executor) aoqm.a);
    }
}
