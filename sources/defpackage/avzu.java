package defpackage;

/* renamed from: avzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzu extends avzz {
    final /* synthetic */ avzv a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avzu(avzv avzv, batz batz) {
        super(batz);
        this.a = avzv;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.a.d) {
            this.a.c = true;
        }
    }
}
