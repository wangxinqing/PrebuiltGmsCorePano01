package defpackage;

import java.io.IOException;

/* renamed from: awap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awap extends awab {
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ awbb d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awap(awbb awbb, String str, Object[] objArr, int i, long j) {
        super(str, objArr);
        this.d = awbb;
        this.b = i;
        this.c = j;
    }

    public final void a() {
        try {
            this.d.q.a(this.b, this.c);
        } catch (IOException e) {
        }
    }
}
