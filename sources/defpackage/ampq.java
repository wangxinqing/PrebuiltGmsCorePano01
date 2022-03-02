package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ampq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ampq extends amoe implements amoq {
    public int f = 0;
    public int g;
    private final amoh h = new ampp(this);

    /* access modifiers changed from: protected */
    public final synchronized void a(amoj amoj) {
        if (amoj.b() == 2) {
            b();
        } else if (this.f != 0) {
            amop amop = this.b;
            String valueOf = String.valueOf(amoj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("unexpected control packet ");
            sb.append(valueOf);
            amop.a((IOException) new amom(sb.toString()));
        } else {
            try {
                if (amoj.b() == 0) {
                    char c = (char) amoj.b.getShort();
                    char c2 = (char) amoj.b.getShort();
                    if (c > 1 || c2 <= 0) {
                        StringBuilder sb2 = new StringBuilder(56);
                        sb2.append("unsupported protocol versions ");
                        sb2.append(c);
                        sb2.append(" to ");
                        sb2.append(c2);
                        throw new amom(sb2.toString());
                    }
                    char c3 = (char) amoj.b.getShort();
                    if (c3 != 0) {
                        this.g = Math.min(this.a.a(), c3);
                    } else {
                        this.g = this.a.a();
                    }
                    if (amoj.b.hasRemaining()) {
                        byte[] bArr = new byte[amoj.b.remaining()];
                        amoj.b.get(bArr);
                        this.b.a(bArr);
                    }
                    this.f = 1;
                    int i = this.g;
                    ByteBuffer a = amoi.a();
                    if (a.remaining() <= 15) {
                        amoj a2 = amoj.a(1, a.remaining() + 4);
                        a2.b.putShort(1);
                        a2.b.putShort((short) i);
                        a2.b.put(a);
                        a2.b.rewind();
                        c(a2).a(this.h);
                        return;
                    }
                    throw new IllegalArgumentException("Connection confirm control packet may contain at most 15 bytes of extra data.");
                }
                String valueOf2 = String.valueOf(amoj);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
                sb3.append("expected connection request packet but recevied ");
                sb3.append(valueOf2);
                throw new amom(sb3.toString());
            } catch (amom e) {
                a((IOException) e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void b() {
        this.f = 0;
        super.b();
    }

    public final synchronized void f() {
        throw new UnsupportedOperationException();
    }

    public ampq(amog amog, amop amop) {
        super(amog, amop);
    }
}
