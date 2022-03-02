package defpackage;

import android.util.Pair;

/* renamed from: fva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fva extends oi {
    final /* synthetic */ fvb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fva(fvb fvb) {
        super(4);
        this.a = fvb;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        Pair pair = (Pair) obj;
        return new izd(this.a.a, (String) pair.first, ((Integer) pair.second).intValue());
    }
}
