package defpackage;

import java.io.DataOutput;
import java.nio.ByteBuffer;

/* renamed from: apem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class apem extends apdl {
    private int e;
    private int[] f;

    protected apem(ByteBuffer byteBuffer, apdl apdl) {
        super(byteBuffer, apdl);
        this.e = aoop.a(byteBuffer.get());
        byteBuffer.position(byteBuffer.position() + 3);
        int i = byteBuffer.getInt();
        this.f = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f[i2] = byteBuffer.getInt();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        for (int writeInt : this.f) {
            dataOutput.writeInt(writeInt);
        }
    }

    /* access modifiers changed from: protected */
    public final apdk h() {
        return apdk.TABLE_TYPE_SPEC;
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.f.length);
    }
}
