package defpackage;

import java.io.IOException;

/* renamed from: awao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awao extends awab {
    final /* synthetic */ int b;
    final /* synthetic */ awak c;
    final /* synthetic */ awbb d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awao(awbb awbb, String str, Object[] objArr, int i, awak awak) {
        super(str, objArr);
        this.d = awbb;
        this.b = i;
        this.c = awak;
    }

    public final void a() {
        try {
            this.d.b(this.b, this.c);
        } catch (IOException e) {
        }
    }
}
