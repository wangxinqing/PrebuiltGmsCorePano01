package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: aimf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aimf extends aimi {
    public final CountDownLatch a = new CountDownLatch(1);

    public aimf(Object obj) {
        super(103, obj);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.countDown();
    }
}
