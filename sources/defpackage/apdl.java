package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: apdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class apdl {
    public final apdl a;
    protected final int b;
    protected final int c;
    protected final int d;

    protected apdl(ByteBuffer byteBuffer, apdl apdl) {
        this.a = apdl;
        this.d = byteBuffer.position() - 2;
        this.b = (char) byteBuffer.getShort();
        this.c = byteBuffer.getInt();
    }

    protected static int a(DataOutput dataOutput, int i) {
        while (i % 4 != 0) {
            dataOutput.write(0);
            i++;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public void a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void a(ByteBuffer byteBuffer) {
    }

    /* access modifiers changed from: protected */
    public short b() {
        return h().q;
    }

    /* JADX INFO: finally extract failed */
    public final byte[] c() {
        ByteBuffer order = ByteBuffer.allocate(this.b).order(ByteOrder.LITTLE_ENDIAN);
        int position = order.position();
        order.putShort(b());
        order.putShort((short) this.b);
        order.putInt(0);
        a(order);
        int position2 = order.position() - position;
        int i = this.b;
        if (position2 == i) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            anni anni = new anni(byteArrayOutputStream);
            try {
                a((DataOutput) anni, order);
                anmt.a((Closeable) anni);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length = this.b + byteArray.length;
                order.putInt(4, length);
                ByteBuffer order2 = ByteBuffer.allocate(length).order(ByteOrder.LITTLE_ENDIAN);
                order2.put(order.array());
                order2.put(byteArray);
                return order2.array();
            } catch (Throwable th) {
                anmt.a((Closeable) anni);
                throw th;
            }
        } else {
            throw new IllegalStateException(amsu.a("Written header is wrong size. Got %s, want %s", Integer.valueOf(position2), Integer.valueOf(i)));
        }
    }

    /* access modifiers changed from: protected */
    public abstract apdk h();
}
