package defpackage;

import com.google.android.gms.drive.events.ChangesAvailableOptions;
import java.util.Set;

/* renamed from: ksi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ksi extends kta {
    private final ksn c;

    public ksi(kwj kwj, long j, ChangesAvailableOptions changesAvailableOptions, Set set) {
        super(4, kwj);
        this.c = new ksn(new ksh(this), j, changesAvailableOptions, set);
    }

    public static kta a(kwj kwj) {
        return new kta(4, kwj);
    }

    public final boolean a() {
        return this.c.b();
    }

    public final boolean a(kmp kmp) {
        return this.c.a(kmp);
    }
}
