package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: eaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eaw {
    public static eaw b;
    public final ReentrantLock a = new ReentrantLock();

    public final void a() {
        irk.a(!this.a.isHeldByCurrentThread(), (Object) "DataBroker left locked!");
    }
}
