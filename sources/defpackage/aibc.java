package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aibc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aibc implements arhp {
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        aibe aibe = (aibe) obj;
        return 12;
    }

    public final /* bridge */ /* synthetic */ Object a(ByteBuffer byteBuffer, int i) {
        return new aibe(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
    }

    public final /* bridge */ /* synthetic */ void a(ByteBuffer byteBuffer, Object obj) {
        aibe aibe = (aibe) obj;
        byteBuffer.putInt(aibe.b);
        byteBuffer.putInt(aibe.c);
        byteBuffer.putInt(aibe.d);
    }
}
