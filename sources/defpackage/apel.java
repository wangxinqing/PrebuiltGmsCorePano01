package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: apel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class apel extends apdl {
    public final int e;
    public final int f;
    protected final Map g = new TreeMap();
    private final int h;
    private final int i;
    private final apdz j;

    protected apel(ByteBuffer byteBuffer, apdl apdl) {
        super(byteBuffer, apdl);
        this.h = aoop.a(byteBuffer.get());
        this.i = aoop.a(byteBuffer.get());
        byteBuffer.position(byteBuffer.position() + 2);
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.j = apdz.a(byteBuffer);
    }

    private final int g() {
        return this.e * 4;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        int i2;
        boolean z;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteBuffer order = ByteBuffer.allocate(g()).order(ByteOrder.LITTLE_ENDIAN);
        anni anni = new anni(byteArrayOutputStream);
        try {
            if (d()) {
                i2 = 0;
                for (Map.Entry entry : this.g.entrySet()) {
                    byte[] k = ((apek) entry.getValue()).k();
                    anni.write(k);
                    order.putShort((short) ((char) ((Integer) entry.getKey()).intValue()));
                    order.putShort((short) (i2 / 4));
                    i2 += k.length;
                    if (i2 % 4 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    amrl.b(z);
                }
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 < this.e; i4++) {
                    apek apek = (apek) this.g.get(Integer.valueOf(i4));
                    if (apek != null) {
                        byte[] k2 = apek.k();
                        anni.write(k2);
                        order.putInt(i3);
                        i3 += k2.length;
                    } else {
                        order.putInt(-1);
                    }
                }
                i2 = i3;
            }
            apdl.a((DataOutput) anni, i2);
            anmt.a((Closeable) anni);
            dataOutput.write(order.array());
            dataOutput.write(byteArrayOutputStream.toByteArray());
        } catch (Throwable th) {
            anmt.a((Closeable) anni);
            throw th;
        }
    }

    public final boolean d() {
        return (this.i & 1) != 0;
    }

    public final String e() {
        apdw f2 = f();
        amrl.a((Object) f2, "%s has no parent package.", (Object) getClass());
        int i2 = this.h;
        apei d = f2.d();
        amrl.a((Object) d, (Object) "Package has no type pool.");
        boolean z = d.g.size() >= i2;
        StringBuilder sb = new StringBuilder(27);
        sb.append("No type for id: ");
        sb.append(i2);
        amrl.b(z, (Object) sb.toString());
        return d.a(i2 - 1);
    }

    public final apdw f() {
        apdl apdl = this.a;
        while (apdl != null && !(apdl instanceof apdw)) {
            apdl = apdl.a;
        }
        if (apdl == null || !(apdl instanceof apdw)) {
            return null;
        }
        return (apdw) apdl;
    }

    /* access modifiers changed from: protected */
    public final apdk h() {
        return apdk.TABLE_TYPE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TypeChunk[id:");
        sb.append(this.h);
        sb.append(", typeName:");
        sb.append(e());
        sb.append(", configuration:");
        sb.append(this.j);
        sb.append(", originalEntryCount:");
        sb.append(this.e);
        sb.append(", entries:");
        for (Map.Entry entry : this.g.entrySet()) {
            sb.append("<");
            sb.append(entry.getKey());
            sb.append("->");
            sb.append(entry.getValue());
            sb.append("> ");
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void a(ByteBuffer byteBuffer) {
        int i2 = this.b;
        int g2 = g();
        byteBuffer.put(aoop.a((long) this.h));
        byteBuffer.put(aoop.a((long) this.i));
        byteBuffer.putShort(0);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(i2 + g2);
        apdz apdz = this.j;
        ByteBuffer order = ByteBuffer.allocate(apdz.a()).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(apdz.a());
        order.putShort((short) apdz.b());
        order.putShort((short) apdz.c());
        order.put(apdz.d());
        order.put(apdz.e());
        order.put((byte) apdz.f());
        order.put((byte) apdz.g());
        order.putShort((short) apdz.h());
        order.put((byte) apdz.i());
        order.put((byte) apdz.j());
        order.put((byte) apdz.k());
        order.put((byte) 0);
        order.putShort((short) apdz.l());
        order.putShort((short) apdz.m());
        order.putShort((short) apdz.n());
        order.putShort((short) apdz.o());
        if (apdz.a() >= 32) {
            order.put((byte) apdz.p());
            order.put((byte) apdz.q());
            order.putShort((short) apdz.r());
        }
        if (apdz.a() >= 36) {
            order.putShort((short) apdz.s());
            order.putShort((short) apdz.t());
        }
        if (apdz.a() >= 48) {
            order.put(apdz.u());
            order.put(apdz.v());
        }
        if (apdz.a() >= 52) {
            order.put((byte) apdz.w());
            order.put((byte) apdz.x());
            order.putShort(0);
        }
        order.put(apdz.y());
        byteBuffer.put(order.array());
    }
}
