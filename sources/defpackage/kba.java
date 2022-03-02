package defpackage;

import java.util.Locale;

/* renamed from: kba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kba extends kap {
    final /* synthetic */ khq d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kba(kkf kkf, kkz kkz, khq khq) {
        super(kkf, kkz, true);
        this.d = khq;
    }

    /* access modifiers changed from: protected */
    public final boolean a(kmp kmp) {
        if (!kmp.j()) {
            return false;
        }
        if (kmp.A() || kmp.a(this.d)) {
            return true;
        }
        throw new lsj("Descendant inaccessible", new kcq(String.format(Locale.US, "App (fullAccess=%s) cannot access %s", new Object[]{Boolean.valueOf(this.d.a()), kmp.i()})));
    }

    /* access modifiers changed from: protected */
    public final boolean c(kmp kmp) {
        return !kmp.A();
    }
}
