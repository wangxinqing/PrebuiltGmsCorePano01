package defpackage;

import java.io.IOException;

/* renamed from: awas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awas extends awab {
    final /* synthetic */ int b;
    final /* synthetic */ awbb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awas(awbb awbb, String str, Object[] objArr, int i) {
        super(str, objArr);
        this.c = awbb;
        this.b = i;
    }

    public final void a() {
        try {
            this.c.q.a(this.b, awak.CANCEL);
            synchronized (this.c) {
                this.c.s.remove(Integer.valueOf(this.b));
            }
        } catch (IOException e) {
        }
    }
}
