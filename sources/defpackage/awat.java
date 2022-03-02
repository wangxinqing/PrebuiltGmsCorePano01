package defpackage;

import java.io.IOException;

/* renamed from: awat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awat extends awab {
    final /* synthetic */ int b;
    final /* synthetic */ batd c;
    final /* synthetic */ int d;
    final /* synthetic */ awbb e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awat(awbb awbb, String str, Object[] objArr, int i, batd batd, int i2) {
        super(str, objArr);
        this.e = awbb;
        this.b = i;
        this.c = batd;
        this.d = i2;
    }

    public final void a() {
        try {
            this.c.h((long) this.d);
            this.e.q.a(this.b, awak.CANCEL);
            synchronized (this.e) {
                this.e.s.remove(Integer.valueOf(this.b));
            }
        } catch (IOException e2) {
        }
    }
}
