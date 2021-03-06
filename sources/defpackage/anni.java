package defpackage;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: anni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anni extends FilterOutputStream implements DataOutput {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anni(OutputStream outputStream) {
        super(new DataOutputStream(outputStream));
        amrl.a((Object) outputStream);
    }

    public final void close() {
        this.out.close();
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }

    public final void writeBoolean(boolean z) {
        ((DataOutputStream) this.out).writeBoolean(z);
    }

    public final void writeByte(int i) {
        ((DataOutputStream) this.out).writeByte(i);
    }

    @Deprecated
    public final void writeBytes(String str) {
        ((DataOutputStream) this.out).writeBytes(str);
    }

    public final void writeChar(int i) {
        writeShort(i);
    }

    public final void writeChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            writeShort(str.charAt(i));
        }
    }

    public final void writeDouble(double d) {
        writeLong(Double.doubleToLongBits(d));
    }

    public final void writeFloat(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    public final void writeInt(int i) {
        this.out.write(i & 255);
        this.out.write((i >> 8) & 255);
        this.out.write((i >> 16) & 255);
        this.out.write((i >> 24) & 255);
    }

    public final void writeLong(long j) {
        byte[] b = aook.b(Long.reverseBytes(j));
        write(b, 0, b.length);
    }

    public final void writeShort(int i) {
        this.out.write(i & 255);
        this.out.write((i >> 8) & 255);
    }

    public final void writeUTF(String str) {
        ((DataOutputStream) this.out).writeUTF(str);
    }
}
