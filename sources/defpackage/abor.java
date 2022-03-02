package defpackage;

import com.android.volley.RetryPolicy;
import java.util.concurrent.Future;

/* renamed from: abor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abor extends abos {
    final /* synthetic */ avpb a;
    final /* synthetic */ abot b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abor(abot abot, int i, int i2, float f, avpb avpb) {
        super(i, i2, f);
        this.b = abot;
        this.a = avpb;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(int i) {
        iwd iwd = abot.b;
        aucd o = avpc.e.o();
        aucd o2 = avoy.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avoy avoy = (avoy) o2.b;
        avoy.b = i;
        avoy.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        avpc avpc = (avpc) o.b;
        avoy avoy2 = (avoy) o2.i();
        avoy2.getClass();
        avpc.c = avoy2;
        avpc.a |= 2;
        return (avpc) o.i();
    }

    /* access modifiers changed from: protected */
    public final Future a() {
        RetryPolicy retryPolicy = this.b.c;
        ihs b2 = ihs.b();
        return new accg(b2, b2.getRequestQueue(), retryPolicy).a("post", awjm.a.a().d(), this.a.k(), avpc.e);
    }
}
