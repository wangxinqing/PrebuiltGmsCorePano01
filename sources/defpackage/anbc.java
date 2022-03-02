package defpackage;

import java.util.Comparator;

/* renamed from: anbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anbc extends anae {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    public anbc(anbd anbd) {
        super(anbd);
        this.a = anbd.comparator();
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return a(new anbb(this.a));
    }
}
