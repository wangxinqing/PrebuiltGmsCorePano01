package defpackage;

import java.io.IOException;

/* renamed from: awaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awaz extends awab {
    final /* synthetic */ awbw b;
    final /* synthetic */ awba c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awaz(awba awba, String str, Object[] objArr, awbw awbw) {
        super(str, objArr);
        this.c = awba;
        this.b = awbw;
    }

    public final void a() {
        try {
            this.c.c.q.a(this.b);
        } catch (IOException e) {
        }
    }
}
