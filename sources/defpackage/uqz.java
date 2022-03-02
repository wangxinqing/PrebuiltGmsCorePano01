package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/* renamed from: uqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uqz implements amop {
    final /* synthetic */ ura a;

    public uqz(ura ura) {
        this.a = ura;
    }

    private final void a(int i, byte[] bArr) {
        ura ura = this.a;
        byte[] bArr2 = ura.a;
        if (ura.f == null) {
            ((anih) ((anih) ulh.a.b()).a("uqz", "a", 535, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s received an unexpected intro packet as a client socket.", (Object) this.a.b);
            return;
        }
        uqk a2 = ura.a(i, bArr);
        if (a2 != null) {
            this.a.f.a(a2);
        }
    }

    public final void b() {
        ura ura = this.a;
        uqw uqw = new uqw(this);
        byte[] bArr = ura.a;
        ura.a((Runnable) uqw);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(byte[] bArr) {
        upu a2 = upu.a(bArr);
        if (a2 == null) {
            ura ura = this.a;
            byte[] bArr2 = ura.a;
            ((anih) ((anih) ulh.a.c()).a("uqz", "c", 477, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s was unable to parse incoming data.", (Object) ura.b);
        } else if (!Arrays.equals(a2.b, ura.a)) {
            byte[] bArr3 = a2.b;
            byte[] bArr4 = a2.c;
            try {
                uqk uqk = (uqk) this.a.g.get(jhy.d(bArr3));
                uqk.c.write(bArr4);
                if (aymi.A()) {
                    uqk.c.flush();
                }
            } catch (IOException e) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("uqz", "a", 552, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s encountered an error while receiving incoming data for service ID hash %s.", (Object) this.a.b, (Object) ulu.a(bArr3));
            }
        } else {
            b(a2.c);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(IOException iOException) {
        anih anih = (anih) ulh.a.c();
        anih.a((Throwable) iOException);
        ura ura = this.a;
        byte[] bArr = ura.a;
        ((anih) anih.a("uqz", "b", 497, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s encountered an error with its internal Weave socket.", (Object) ura.b);
    }

    public final void b(byte[] bArr) {
        try {
            asmh asmh = (asmh) aucj.a((aucj) asmh.e, bArr);
            int a2 = asmg.a(asmh.b);
            int i = 1;
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 0) {
                ura ura = this.a;
                byte[] bArr2 = ura.a;
                ((anih) ((anih) ulh.a.c()).a("uqz", "b", 525, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s received a control frame of an unknown type.", (Object) ura.b);
            } else if (i2 != 1) {
                ura ura2 = this.a;
                asmd asmd = asmh.d;
                if (asmd == null) {
                    asmd = asmd.c;
                }
                byte[] k = asmd.b.k();
                byte[] bArr3 = ura.a;
                ura2.a(k);
            } else {
                asme asme = asmh.c;
                if (asme == null) {
                    asme = asme.d;
                }
                int a3 = asmj.a(asme.c);
                if (a3 != 0) {
                    i = a3;
                }
                int i3 = i - 1;
                asme asme2 = asmh.c;
                if (asme2 == null) {
                    asme2 = asme.d;
                }
                byte[] k2 = asme2.b.k();
                ura ura3 = this.a;
                byte[] bArr4 = ura.a;
                if (ura3.f == null) {
                    ((anih) ((anih) ulh.a.b()).a("uqz", "a", 535, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s received an unexpected intro packet as a client socket.", (Object) this.a.b);
                    return;
                }
                uqk a4 = ura3.a(i3, k2);
                if (a4 != null) {
                    this.a.f.a(a4);
                }
            }
        } catch (auda e) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e);
            ura ura4 = this.a;
            byte[] bArr5 = ura.a;
            ((anih) anih.a("uqz", "b", 510, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s was unable to parse control frame.", (Object) ura4.b);
        }
    }

    private final void a(byte[] bArr, byte[] bArr2) {
        try {
            ura ura = this.a;
            byte[] bArr3 = ura.a;
            uqk uqk = (uqk) ura.g.get(jhy.d(bArr));
            uqk.c.write(bArr2);
            if (aymi.A()) {
                uqk.c.flush();
            }
        } catch (IOException e) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e);
            ura ura2 = this.a;
            byte[] bArr4 = ura.a;
            ((anih) anih.a("uqz", "a", 552, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("MultiplexBleSocketV1 connected to %s encountered an error while receiving incoming data for service ID hash %s.", (Object) ura2.b, (Object) ulu.a(bArr));
        }
    }

    public final void a() {
        ura ura = this.a;
        byte[] bArr = ura.a;
        CountDownLatch countDownLatch = ura.c;
        countDownLatch.getClass();
        ura.a((Runnable) new uqv(countDownLatch));
    }

    public final void a(IOException iOException) {
        ura ura = this.a;
        uqy uqy = new uqy(this, iOException);
        byte[] bArr = ura.a;
        ura.a((Runnable) uqy);
    }

    public final void a(byte[] bArr) {
        ura ura = this.a;
        uqx uqx = new uqx(this, bArr);
        byte[] bArr2 = ura.a;
        ura.a((Runnable) uqx);
    }
}
