package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* renamed from: ral  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ral implements amqy {
    private final ras a;
    private final auco b;
    private final Executor c;
    private final adet d;
    private final int e;

    public ral(ras ras, auco auco, int i, adet adet, Executor executor) {
        this.a = ras;
        this.b = auco;
        this.e = i;
        this.d = adet;
        this.c = executor;
    }

    public final Object a(Object obj) {
        ras ras = this.a;
        auco auco = this.b;
        int i = this.e;
        adet adet = this.d;
        Executor executor = this.c;
        amzy amzy = (amzy) obj;
        amzy.size();
        amzt j = amzy.j();
        anhk i2 = amzy.listIterator();
        while (i2.hasNext()) {
            Account account = (Account) i2.next();
            j.c(ras.c(auco, account).a(new rad(adet, account), i, executor));
        }
        return j.a();
    }
}
