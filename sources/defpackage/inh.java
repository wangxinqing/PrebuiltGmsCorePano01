package defpackage;

import java.util.List;

/* renamed from: inh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class inh extends imh {
    public inh() {
        super("FixesNeedToBeLogged");
    }

    /* access modifiers changed from: protected */
    public final boolean a(inb inb) {
        if (!inp.b()) {
            return false;
        }
        ilw ilw = new ilw();
        try {
            List b = ilw.b();
            ilw.close();
            if (!b.isEmpty()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
