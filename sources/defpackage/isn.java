package defpackage;

/* renamed from: isn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class isn extends oi {
    final /* synthetic */ iso a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public isn(iso iso, int i) {
        super(i);
        this.a = iso;
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj, Object obj2, Object obj3) {
        synchronized (this.a.a) {
            if (obj3 == null) {
                try {
                    if (this.a.b()) {
                        this.a.b.remove(obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (obj3 == null && this.a.c()) {
                this.a.c.remove(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int b(Object obj, Object obj2) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final Object c(Object obj) {
        return null;
    }
}
