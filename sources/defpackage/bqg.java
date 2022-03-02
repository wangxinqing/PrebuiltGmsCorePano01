package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bqg implements Comparable {
    private final int a;
    private final ByteBuffer b;

    public bqg(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bqg bqg = (bqg) obj;
        return amya.b.a(this.a, bqg.a).a((Comparable) this.b, (Comparable) bqg.b).a();
    }
}
