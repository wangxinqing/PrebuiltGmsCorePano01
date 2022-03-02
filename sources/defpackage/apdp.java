package defpackage;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: apdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apdp extends apdw implements apdn {
    public byte[] f;
    public byte[] g;
    private boolean k = true;

    protected apdp(annh annh, apdl apdl) {
        super(apdo.a(annh, 286), apdl);
    }

    public final void a() {
        this.k = false;
        for (apdl apdl : this.e.values()) {
            if (apdl instanceof apdn) {
                ((apdn) apdl).a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final short b() {
        return (short) (this.k ? apdk.TABLE_PACKAGE.q | 4096 : apdk.TABLE_PACKAGE.q);
    }

    public final apei d() {
        if (this.f == null) {
            return super.d();
        }
        throw new RuntimeException("Compressed packagechunks in extraction mode do not support access to the Type and Key string pools.");
    }

    public final apei e() {
        if (this.g == null) {
            return super.e();
        }
        throw new RuntimeException("Compressed packagechunks in extraction mode do not support access to the Type and Key string pools.");
    }

    /* access modifiers changed from: protected */
    public final void a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        byte[] bArr = this.f;
        if (bArr == null || this.g == null) {
            boolean z = false;
            if (bArr == null && this.g == null) {
                z = true;
            }
            amrl.b(z);
            apei e = e();
            apei d = d();
            amrl.b(e instanceof apdn);
            amrl.b(d instanceof apdn);
            ((apds) e).a();
            ((apds) d).a();
            Map a = apdo.a(dataOutput, this.e.values(), this.k);
            for (apdl apdl : this.e.values()) {
                if (apdl == e) {
                    Integer num = (Integer) a.get(apdl);
                    amrl.a((Object) num);
                    byteBuffer.putInt(276, num.intValue());
                } else if (apdl == d) {
                    Integer num2 = (Integer) a.get(apdl);
                    amrl.a((Object) num2);
                    byteBuffer.putInt(268, num2.intValue());
                }
            }
            return;
        }
        dataOutput.write(bArr);
        byteBuffer.putInt(268, this.b);
        dataOutput.write(this.g);
        byteBuffer.putInt(276, this.b + this.f.length);
        apdo.a(dataOutput, this.e.values(), this.k);
    }
}
