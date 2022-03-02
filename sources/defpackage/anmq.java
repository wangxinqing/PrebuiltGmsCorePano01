package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: anmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anmq implements DataOutput {
    final DataOutput a;
    public final ByteArrayOutputStream b;

    public anmq(ByteArrayOutputStream byteArrayOutputStream) {
        this.b = byteArrayOutputStream;
        this.a = new DataOutputStream(byteArrayOutputStream);
    }

    public final void write(int i) {
        try {
            this.a.write(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeBoolean(boolean z) {
        try {
            this.a.writeBoolean(z);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeByte(int i) {
        try {
            this.a.writeByte(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeBytes(String str) {
        try {
            this.a.writeBytes(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeChar(int i) {
        try {
            this.a.writeChar(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeChars(String str) {
        try {
            this.a.writeChars(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeDouble(double d) {
        try {
            this.a.writeDouble(d);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeFloat(float f) {
        try {
            this.a.writeFloat(f);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeInt(int i) {
        try {
            this.a.writeInt(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeLong(long j) {
        try {
            this.a.writeLong(j);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeShort(int i) {
        try {
            this.a.writeShort(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeUTF(String str) {
        try {
            this.a.writeUTF(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void write(byte[] bArr) {
        try {
            this.a.write(bArr);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
