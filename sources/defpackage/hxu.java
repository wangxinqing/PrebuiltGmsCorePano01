package defpackage;

import java.util.concurrent.Callable;

/* renamed from: hxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hxu extends hxv {
    private final Callable e;

    public hxu(Callable callable) {
        super(false, (String) null, (Throwable) null);
        this.e = callable;
    }

    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
