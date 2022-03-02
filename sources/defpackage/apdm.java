package defpackage;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: apdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class apdm extends apdl {
    protected final Map e = new LinkedHashMap();

    protected apdm(ByteBuffer byteBuffer, apdl apdl) {
        super(byteBuffer, apdl);
    }

    /* access modifiers changed from: protected */
    public void a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        for (apdl c : this.e.values()) {
            byte[] c2 = c.c();
            dataOutput.write(c2);
            apdl.a(dataOutput, c2.length);
        }
    }
}
