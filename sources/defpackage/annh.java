package defpackage;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: annh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class annh extends FilterInputStream implements DataInput {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public annh(InputStream inputStream) {
        super(inputStream);
        amrl.a((Object) inputStream);
    }

    private final byte a() {
        int read = this.in.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    public final char readChar() {
        return (char) readUnsignedShort();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        anmr.a((InputStream) this, bArr);
    }

    public final int readInt() {
        byte a = a();
        byte a2 = a();
        return aoog.a(a(), a(), a2, a);
    }

    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    public final long readLong() {
        byte a = a();
        byte a2 = a();
        byte a3 = a();
        byte a4 = a();
        byte a5 = a();
        byte a6 = a();
        return aook.a(a(), a(), a6, a5, a4, a3, a2, a);
    }

    public final short readShort() {
        return (short) readUnsignedShort();
    }

    public final String readUTF() {
        return new DataInputStream(this.in).readUTF();
    }

    public final int readUnsignedByte() {
        int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    public final int readUnsignedShort() {
        return aoog.a((byte) 0, (byte) 0, a(), a());
    }

    public final int skipBytes(int i) {
        return (int) this.in.skip((long) i);
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        anmr.a(this, bArr, i, i2);
    }
}
