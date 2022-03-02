package defpackage;

/* renamed from: ahyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyt {
    public final Thread a;
    private final String b;

    public ahyt(String str) {
        Thread currentThread = Thread.currentThread();
        this.b = str;
        this.a = currentThread;
    }

    public final void a() {
        if (aydu.a.a().enforceThreadAffinity()) {
            Thread currentThread = Thread.currentThread();
            if (this.a.getId() != currentThread.getId()) {
                throw new ahyu(this.b, this.a, currentThread);
            }
        }
    }
}
