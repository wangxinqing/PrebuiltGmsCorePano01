package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: andd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class andd extends amyo implements Serializable {
    private static final long serialVersionUID = 3;
    final andr a;
    final andr b;
    final amqw c;
    final int d;
    transient ConcurrentMap e;

    public andd(andr andr, andr andr2, amqw amqw, int i, ConcurrentMap concurrentMap) {
        this.a = andr;
        this.b = andr2;
        this.c = amqw;
        this.d = i;
        this.e = concurrentMap;
    }

    /* access modifiers changed from: protected */
    public final ConcurrentMap a() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Map b() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c() {
        return this.e;
    }
}
