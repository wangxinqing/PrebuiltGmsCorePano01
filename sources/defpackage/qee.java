package defpackage;

import android.accounts.Account;
import java.util.Collection;
import java.util.List;

/* renamed from: qee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qee implements qei {
    private static final qfn a = new qfn("CompositeRouter");
    private final qeg b;
    private final qei c;
    private final qei d;
    private final qei e;

    public qee(qeg qeg, qei qei, qei qei2, qei qei3) {
        this.b = qeg;
        this.c = qei;
        this.d = qei2;
        this.e = qei3;
    }

    private final qei a() {
        if (axuy.a.a().x()) {
            a.a("Using fake backend", new Object[0]);
            return this.e;
        } else if (!this.b.a()) {
            return this.c;
        } else {
            a.a("Using development backend", new Object[0]);
            return this.d;
        }
    }

    public final aorr a(Account account, Collection collection) {
        return a().a(account, collection);
    }

    public final aorr a(avwo avwo, Account account) {
        return a().a(avwo, account);
    }

    public final aorr a(String str, int i, int i2, List list) {
        return a().a(str, i, i2, list);
    }

    public final aorr a(byte[] bArr, Account account, avwm avwm, Collection collection) {
        return a().a(bArr, account, avwm, collection);
    }
}
