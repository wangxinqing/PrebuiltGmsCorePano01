package defpackage;

import java.io.DataOutput;
import java.nio.ByteBuffer;

/* renamed from: apdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apdq extends apec implements apdn {
    private boolean h = true;

    protected apdq(annh annh, apdl apdl) {
        super(apdo.a(annh, 10), apdl);
    }

    public final void a() {
        this.h = false;
        for (apdl apdl : this.e.values()) {
            if (apdl instanceof apdn) {
                ((apdn) apdl).a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final short b() {
        return (short) (this.h ? apdk.TABLE.q | 4096 : apdk.TABLE.q);
    }

    /* access modifiers changed from: protected */
    public final void a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        if (this.h) {
            apdo.a(dataOutput, this.e.values(), true);
        } else {
            super.a(dataOutput, byteBuffer);
        }
    }
}
