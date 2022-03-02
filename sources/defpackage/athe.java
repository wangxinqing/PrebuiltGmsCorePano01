package defpackage;

/* renamed from: athe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class athe {
    public final Object a = new Object();
    public final byte[] b;
    public int c = -1;
    public int d;
    public boolean e;

    public athe(int i) {
        if (i > 0) {
            this.b = new byte[i];
            return;
        }
        StringBuilder sb = new StringBuilder(22);
        sb.append("bufferSize ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a() {
        synchronized (this.a) {
            this.e = true;
            this.a.notifyAll();
        }
    }
}
