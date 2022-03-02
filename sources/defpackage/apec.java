package defpackage;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: apec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class apec extends apdm {
    public apei f;
    public final Map g = new HashMap();

    protected apec(ByteBuffer byteBuffer, apdl apdl) {
        super(byteBuffer, apdl);
        amrl.b(byteBuffer.getInt() > 0, (Object) "ResourceTableChunk package count was < 1.");
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.g.size());
    }

    /* access modifiers changed from: protected */
    public final apdk h() {
        return apdk.TABLE;
    }
}
