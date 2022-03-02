package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: apds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apds extends apei implements apdn {
    private boolean i = true;

    protected apds(annh annh, apdl apdl) {
        super(apdo.b(annh), apdl);
    }

    private static int b(DataOutput dataOutput, int i2) {
        if (i2 > 127) {
            dataOutput.write(((i2 & 32512) >> 8) | 128);
        }
        dataOutput.write(i2 & 255);
        return i2 > 127 ? 2 : 1;
    }

    public final void a() {
        this.i = false;
    }

    /* access modifiers changed from: protected */
    public final void a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        int i2;
        if (this.i) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < this.g.size()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                anni anni = new anni(byteArrayOutputStream);
                int i5 = 0;
                while (i5 < 2097152 && i3 < this.g.size()) {
                    byte[] bytes = ((String) this.g.get(i3)).getBytes(d().c);
                    int length = bytes.length;
                    amrl.b(((short) length) == length);
                    anni.writeShort(length);
                    anni.write(bytes);
                    i5 += length + 2;
                    i3++;
                }
                dataOutput.writeInt(i5);
                dataOutput.write(byteArrayOutputStream.toByteArray());
                i4 += i5 + 4;
            }
            dataOutput.writeInt(0);
            int i6 = i4 + 4;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            anni anni2 = new anni(byteArrayOutputStream2);
            List list = this.h;
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                anni2.write(((apeh) list.get(i7)).b());
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            int length2 = byteArray.length;
            int i8 = (length2 + i6) % 4;
            if (i8 != 0) {
                i2 = (4 - i8) + length2;
            } else {
                i2 = length2;
            }
            dataOutput.writeInt(i2);
            dataOutput.write(byteArray);
            apdl.a(dataOutput, i6 + 4 + length2);
            return;
        }
        super.a(dataOutput, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public final int b(DataOutput dataOutput, ByteBuffer byteBuffer) {
        if (d() != apea.UTF8) {
            return super.b(dataOutput, byteBuffer);
        }
        List list = this.g;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            String str = (String) list.get(i3);
            byte[] bytes = str.getBytes(amqn.c);
            int b = b(dataOutput, str.length());
            int length = bytes.length;
            int b2 = b(dataOutput, length);
            dataOutput.write(bytes);
            dataOutput.write(0);
            byteBuffer.putInt(i2);
            i2 += b + b2 + length + 1;
        }
        return apdl.a(dataOutput, i2);
    }

    /* access modifiers changed from: protected */
    public final short b() {
        return (short) (this.i ? apdk.STRING_POOL.q | 4096 : apdk.STRING_POOL.q);
    }
}
