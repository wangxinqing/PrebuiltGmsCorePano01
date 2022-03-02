package defpackage;

/* renamed from: ahru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahru implements Runnable {
    final /* synthetic */ ahrx a;
    private final ahsy b;

    public ahru(ahrx ahrx, ahsy ahsy) {
        this.a = ahrx;
        this.b = ahsy;
    }

    public final void run() {
        synchronized (this.a.c) {
            if (this.a.e.contains(this.b)) {
                String valueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                sb.append("DataReader ");
                sb.append(valueOf);
                sb.append(" started by postDelayedIfNotQuitted.");
                sb.toString();
                this.a.e.remove(this.b);
                this.b.run();
            }
        }
    }
}
