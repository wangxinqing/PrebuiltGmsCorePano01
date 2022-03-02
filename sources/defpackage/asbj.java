package defpackage;

import java.io.IOException;

/* renamed from: asbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbj implements amop {
    final /* synthetic */ asbn a;

    public asbj(asbn asbn) {
        this.a = asbn;
    }

    private final void a(Exception exc) {
        try {
            asbn asbn = this.a;
            int i = asbn.i;
            asbn.d.put(new asbm(exc));
        } catch (InterruptedException e) {
            anih anih = (anih) asil.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("asbj", "a", 233, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleGattConnection: Failed to put exception to read buffer");
        }
    }

    public final void b() {
        jjg jjg = asil.a;
        asbn asbn = this.a;
        int i = asbn.i;
        asbn.f.countDown();
        this.a.g.countDown();
        amog amog = this.a.c;
        if (amog != null) {
            amog.b();
        }
        a((Exception) new IOException("Socket disconnected"));
    }

    public final void a() {
        jjg jjg = asil.a;
        asbn asbn = this.a;
        int i = asbn.i;
        asbn.f.countDown();
    }

    public final void a(IOException iOException) {
        anih anih = (anih) asil.a.b();
        anih.a((Throwable) iOException);
        ((anih) anih.a("asbj", "a", 221, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Socket.onError()");
        asbn asbn = this.a;
        int i = asbn.i;
        asbn.f.countDown();
        amog amog = this.a.c;
        if (amog != null) {
            amog.b();
        }
        a((Exception) iOException);
    }

    public final void a(byte[] bArr) {
        jjg jjg = asil.a;
        try {
            asbn asbn = this.a;
            int i = asbn.i;
            asbn.d.put(new asbm(bArr));
        } catch (InterruptedException e) {
            anih anih = (anih) asil.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("asbj", "a", 214, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleGattConnection: Failed to put message to read buffer");
        }
    }
}
