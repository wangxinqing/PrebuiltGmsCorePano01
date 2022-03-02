package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: fos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fos implements aora {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ fot c;

    public fos(fot fot, String str, long j) {
        this.c = fot;
        this.a = str;
        this.b = j;
    }

    private final void a(Status status) {
        fgm fgm = this.c.b;
        aucd o = anov.f.o();
        String str = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anov anov = (anov) o.b;
        str.getClass();
        int i = anov.a | 1;
        anov.a = i;
        anov.b = str;
        String str2 = this.c.a;
        str2.getClass();
        int i2 = i | 16;
        anov.a = i2;
        anov.e = str2;
        int i3 = status.i;
        anov.a = i2 | 4;
        anov.c = i3;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        anov anov2 = (anov) o.b;
        anov2.a |= 8;
        anov2.d = elapsedRealtime;
        anov anov3 = (anov) o.i();
        aucd o2 = anon.v.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anon anon = (anon) o2.b;
        anon.c = 9;
        int i4 = anon.a | 1;
        anon.a = i4;
        anov3.getClass();
        anon.h = anov3;
        anon.a = i4 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        fgm.a((anon) o2.i());
    }

    public final void a(Object obj) {
        a(Status.a);
    }

    public final void a(Throwable th) {
        a(qbf.a(th).b());
    }
}
