package defpackage;

/* renamed from: akzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class akzo implements icm {
    public final void a(icl icl) {
        try {
            b(icl);
            if (icl instanceof ici) {
                ((ici) icl).c();
            }
        } catch (Throwable th) {
            if (icl instanceof ici) {
                ((ici) icl).c();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(icl icl);
}
