package defpackage;

/* renamed from: diq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class diq implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dis b;

    public diq(dis dis, int i) {
        this.b = dis;
        this.a = i;
    }

    public final void run() {
        this.b.a(this.a, ((Integer) dis.a.get(0)).intValue(), ((Integer) dis.a.get(1)).intValue());
        this.b.c.remove(this);
    }
}
