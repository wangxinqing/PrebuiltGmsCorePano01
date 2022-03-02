package defpackage;

import java.util.concurrent.Semaphore;

/* renamed from: quw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class quw {
    public final quz a;
    public final quy b;

    public quw(Semaphore semaphore) {
        quz quz = new quz(semaphore);
        this.a = quz;
        this.b = new quy(quz);
    }
}
