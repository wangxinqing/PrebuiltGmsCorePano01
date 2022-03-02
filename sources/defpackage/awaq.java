package defpackage;

import java.io.IOException;

/* renamed from: awaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awaq extends awab {
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ awbb d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awaq(awbb awbb, String str, Object[] objArr, int i, int i2) {
        super(str, objArr);
        this.d = awbb;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        try {
            awbb awbb = this.d;
            int i = this.b;
            int i2 = this.c;
            synchronized (awbb.q) {
                awbb.q.a(i, i2);
            }
        } catch (IOException e) {
        }
    }
}
