package defpackage;

import java.util.Set;

/* renamed from: ppn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ppn extends ppr {
    private final Set a;

    public ppn(Set set) {
        super(aonk.ON_SLEEP_ACTIONS, 2);
        this.a = set;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        for (Runnable run : this.a) {
            run.run();
        }
        return null;
    }
}
