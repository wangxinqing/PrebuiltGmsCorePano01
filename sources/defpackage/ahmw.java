package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ahmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahmw implements ahmg {
    private final float[] b;
    private final int c;
    private final ahmv d;
    private final ahmv e;
    private final boolean f;

    public ahmw(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, boolean z) {
        byteBuffer.rewind();
        ahmv ahmv = new ahmv(byteBuffer, axzj.b());
        this.d = ahmv;
        int i2 = ahmv.a - 1;
        this.b = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.b[i3] = byteBuffer.getFloat();
        }
        if (z && byteBuffer2 != null) {
            byteBuffer2.rewind();
            this.e = new ahmv(byteBuffer2, axzj.b());
        } else {
            this.e = null;
        }
        this.c = i;
        this.f = z;
    }

    public final List a(ahml ahml) {
        if (ahml.c < 4.0E-4f || ahml.s < 4.0E-4f) {
            return Collections.singletonList(new ahmo(ahmn.STILL, 100));
        }
        float[] a = ahml.a();
        ahmh.e(a);
        float[] a2 = this.d.a(a);
        ahmh.a(this.c, a2, this.b);
        List a3 = ahmh.a(a2);
        if (this.f && this.e != null) {
            float f2 = a2[3];
            float[] fArr = new float[2];
            if (((double) f2) > axzj.a.a().roadVehicleThresholdFor2wheelerDetection()) {
                float f3 = this.e.a(a)[0] * f2;
                fArr[0] = f3;
                fArr[1] = f2 - f3;
            } else {
                float f4 = f2 / 2.0f;
                fArr[1] = f4;
                fArr[0] = f4;
            }
            ahmh.a(a3, fArr);
        }
        return a3;
    }

    public final List a(float[] fArr) {
        ArrayList arrayList = new ArrayList();
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return a((ahml) ahmm.a(arrayList));
    }
}
