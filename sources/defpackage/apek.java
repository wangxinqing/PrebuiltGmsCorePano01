package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: apek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class apek {
    public static apek a(ByteBuffer byteBuffer, int i, apel apel, int i2) {
        apef apef;
        int i3;
        int position = byteBuffer.position();
        byteBuffer.position(i);
        char c = (char) byteBuffer.getShort();
        char c2 = (char) byteBuffer.getShort();
        int i4 = byteBuffer.getInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if ((c2 & 1) != 0) {
            i3 = byteBuffer.getInt();
            int i5 = byteBuffer.getInt();
            for (int i6 = 0; i6 < i5; i6++) {
                linkedHashMap.put(Integer.valueOf(byteBuffer.getInt()), apef.a(byteBuffer));
            }
            apef = null;
        } else {
            apef = apef.a(byteBuffer);
            i3 = 0;
        }
        apej i7 = i();
        i7.b(c);
        i7.a(c2);
        i7.c(i4);
        i7.a = apef;
        i7.b = linkedHashMap;
        i7.d(i3);
        i7.c = apel;
        i7.e(i2);
        apek a = i7.a();
        byteBuffer.position(position);
        return a;
    }

    public static apej i() {
        return new apej();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract apef d();

    public abstract Map e();

    public abstract int f();

    public abstract apel g();

    public abstract int h();

    public final boolean j() {
        return (b() & 1) != 0;
    }

    public final String toString() {
        apel g = g();
        int c = c();
        apdw f = g.f();
        amrl.a((Object) f, "%s has no parent package.", (Object) g.getClass());
        apei e = f.e();
        amrl.a((Object) e, "%s's parent package has no key pool.", (Object) g.getClass());
        return String.format("Entry{key=%s,value=%s,values=%s}", new Object[]{e.a(c), d(), e()});
    }

    public final byte[] k() {
        int i;
        int a = a();
        if (j()) {
            i = e().size() * 12;
        } else {
            i = 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(a + i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) a());
        allocate.putShort((short) b());
        allocate.putInt(c());
        if (j()) {
            allocate.putInt(f());
            allocate.putInt(e().size());
            for (Map.Entry entry : e().entrySet()) {
                allocate.putInt(((Integer) entry.getKey()).intValue());
                allocate.put(((apef) entry.getValue()).e());
            }
        } else {
            apef d = d();
            amrl.a((Object) d, (Object) "A non-complex TypeChunk entry must have a value.");
            allocate.put(d.e());
        }
        return allocate.array();
    }
}
