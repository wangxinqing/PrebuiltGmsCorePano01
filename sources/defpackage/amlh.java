package defpackage;

/* renamed from: amlh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amlh implements Runnable {
    final /* synthetic */ amkw a;
    final /* synthetic */ Runnable b;

    public amlh(amkw amkw, Runnable runnable) {
        this.a = amkw;
        this.b = runnable;
    }

    public final void run() {
        amkw b2 = amlv.b(this.a);
        try {
            this.b.run();
        } finally {
            amlv.b(b2);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
