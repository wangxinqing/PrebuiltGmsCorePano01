package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bqi implements Comparable {
    private final int a;
    private final ByteBuffer b;

    public bqi(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bqi bqi = (bqi) obj;
        return amya.b.a(this.a, bqi.a).a((Comparable) this.b, (Comparable) bqi.b).a();
    }
}
