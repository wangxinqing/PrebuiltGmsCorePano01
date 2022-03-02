package defpackage;

/* renamed from: aweh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aweh extends aopn implements Runnable {
    private aorr a;

    public aweh(aorr aorr) {
        this.a = aorr;
    }

    /* access modifiers changed from: protected */
    public final String aK() {
        aorr aorr = this.a;
        if (aorr == null) {
            return null;
        }
        String valueOf = String.valueOf(aorr);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("delegate=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a = null;
    }

    public final boolean f() {
        return super.d();
    }

    public final void run() {
        aorr aorr = this.a;
        if (aorr != null) {
            b(aorr);
        }
    }
}
