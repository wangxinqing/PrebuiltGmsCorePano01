package defpackage;

/* renamed from: baov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class baov implements bape {
    public final azxl a;
    public boolean b;
    private boolean c;
    private boolean d;

    public baov() {
    }

    public final void a() {
        this.a.b();
        this.d = true;
    }

    public final void a(Object obj) {
        amrl.b(!this.c, (Object) "Stream was terminated by error, no further calls are allowed");
        amrl.b(!this.d, (Object) "Stream is already completed, no further calls are allowed");
        this.a.a(obj);
    }

    public baov(azxl azxl) {
        this.b = true;
        this.c = false;
        this.d = false;
        this.a = azxl;
    }

    public final void a(Throwable th) {
        this.a.a("Cancelled by client with StreamObserver.onError()", th);
        this.c = true;
    }
}
