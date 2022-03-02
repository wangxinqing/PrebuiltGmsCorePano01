package defpackage;

/* renamed from: afct  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afct extends afcq {
    final /* synthetic */ afcv g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afct(afcv afcv) {
        super(afcv);
        this.g = afcv;
        if (afcv.d.a()) {
            afcv.a.readLock().lock();
        }
    }

    public final void close() {
        amrl.b(!this.a, (Object) "Transaction is closed");
        try {
            a(this.b);
            this.a = true;
            if (this.g.d.a()) {
                this.g.a.readLock().unlock();
            }
            a(this.d);
        } catch (Throwable th) {
            this.a = true;
            if (this.g.d.a()) {
                this.g.a.readLock().unlock();
            }
            a(this.d);
            throw th;
        }
    }
}
