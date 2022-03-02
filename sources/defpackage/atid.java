package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

/* renamed from: atid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atid extends atij {
    private static final byte[] f = {0, 0};
    private athh g;
    private byte[] h;

    public atid(String str, byte[] bArr) {
        super(str);
        n();
        a(bArr);
    }

    private final void o() {
        if (this.h == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(c());
            dataOutputStream.writeUTF(k());
            dataOutputStream.writeShort(atij.m());
            dataOutputStream.writeUTF("POST");
            dataOutputStream.writeShort(28018);
            dataOutputStream.writeUTF("");
            dataOutputStream.writeUTF("ROOT");
            dataOutputStream.writeByte(0);
            athh athh = this.g;
            if (athh == null || athh.a() <= 0) {
                dataOutputStream.writeInt(0);
            } else {
                dataOutputStream.writeInt(this.g.a());
                dataOutputStream.writeUTF("g");
            }
            dataOutputStream.close();
            byteArrayOutputStream.close();
            this.h = byteArrayOutputStream.toByteArray();
        }
    }

    public final synchronized void a(int i) {
        super.a(i);
        this.h = null;
    }

    public final synchronized void d() {
        super.d();
        this.h = null;
        this.g = null;
    }

    public final synchronized InputStream e() {
        o();
        athh athh = this.g;
        if (athh != null) {
            if (athh.a() != 0) {
                return new SequenceInputStream(new SequenceInputStream(new ByteArrayInputStream(this.h), this.g.b()), new ByteArrayInputStream(f));
            }
        }
        return new SequenceInputStream(new ByteArrayInputStream(this.h), new ByteArrayInputStream(f));
    }

    public final synchronized int f() {
        int length;
        o();
        length = this.h.length + f.length;
        athh athh = this.g;
        if (athh != null) {
            length += athh.a();
        }
        return length;
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length > 0) {
                this.g = new atic(bArr);
            }
        }
        this.g = null;
    }
}
