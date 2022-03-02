package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: akmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akmd {
    public final ou a;
    public final asve b;
    public final akmb c;
    public final assi[] d;
    public final int e;
    public final int f;
    public final apxg g;

    public akmd(asve asve, int i, akmb akmb) {
        this(asve, i, a(), akmb);
    }

    private static assi[] a() {
        assi[] assiArr = new assi[90];
        for (int i = 0; i < 90; i++) {
            assiArr[i] = assi.a(i);
        }
        return assiArr;
    }

    public akmd(asve asve, int i, assi[] assiArr, akmb akmb) {
        ou ouVar;
        this.g = null;
        this.f = i;
        this.e = asve.d;
        this.c = akmb;
        if (assiArr.length == 0) {
            this.d = a();
        } else {
            this.d = assiArr;
        }
        aucx aucx = asve.c;
        if (aucx == null) {
            aklz.a().b("Missing first pass model.");
            ouVar = new ou();
        } else {
            ou ouVar2 = new ou();
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                asvh asvh = (asvh) aucx.get(i2);
                ouVar2.put(asvh.a, Float.valueOf((float) asvh.b));
            }
            ouVar = ouVar2;
        }
        this.a = ouVar;
        this.b = asve;
    }

    public akmd(ByteBuffer byteBuffer, akmb akmb) {
        int i;
        ou ouVar;
        String str;
        double d2;
        assi[] a2 = a();
        this.b = null;
        this.f = 2;
        this.c = akmb;
        apxg apxg = new apxg();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        apxg.b(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        this.g = apxg;
        int d3 = apxg.d(8);
        if (d3 != 0) {
            i = apxg.d.getInt(d3 + apxg.c);
        } else {
            i = 0;
        }
        this.e = i;
        if (a2.length == 0) {
            this.d = a();
        } else {
            this.d = a2;
        }
        apxg apxg2 = this.g;
        if (apxg2 == null || apxg2.N() == 0) {
            aklz.a().b("Missing first pass model in FB");
            ouVar = new ou();
        } else {
            ouVar = new ou();
            int N = apxg2.N();
            for (int i2 = 0; i2 < N; i2++) {
                apxg l = apxg2.l(i2);
                int d4 = l.d(4);
                if (d4 != 0) {
                    str = l.f(d4 + l.c);
                } else {
                    str = null;
                }
                apxg l2 = apxg2.l(i2);
                int d5 = l2.d(6);
                if (d5 != 0) {
                    d2 = l2.d.getDouble(d5 + l2.c);
                } else {
                    d2 = 0.0d;
                }
                ouVar.put(str, Float.valueOf((float) d2));
            }
        }
        this.a = ouVar;
    }
}
