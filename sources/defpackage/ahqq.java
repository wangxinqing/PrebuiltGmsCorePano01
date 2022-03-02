package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* renamed from: ahqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqq implements ajpi {
    public long a;
    public boolean b;
    public final ahqp c;
    final aizy d;
    public final aizz e;
    public final ahqz f = new ahqz((byte[]) null);
    private aiab g;

    public ahqq(aizz aizz, aizy aizy, ahqp ahqp) {
        this.e = aizz;
        this.d = aizy;
        this.c = ahqp;
        a(aizy.c());
    }

    public final void a() {
        this.f.e.d();
    }

    public final void a(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final void a(long j) {
        a(j - ((long) Math.floor(Math.random() * 8.64E7d)), true);
        this.f.a.clear();
    }

    public final void a(aiaq aiaq, boolean z, long j) {
        int i;
        int i2;
        ArrayList arrayList = aiaq.b;
        if (!arrayList.isEmpty()) {
            int d2 = this.c.d();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                aqek aqek = (aqek) arrayList.get(i3);
                int j2 = aqek.j(3);
                int i4 = 0;
                while (true) {
                    i = i3 + 1;
                    if (i4 >= j2) {
                        break;
                    }
                    aqek f2 = aqek.f(3, i4);
                    if (f2.i(1)) {
                        aqek e2 = f2.e(1);
                        if (e2.i(8)) {
                            i2 = e2.b(8);
                        } else {
                            i2 = -1;
                        }
                        if (f2.i(2) && i2 != 3) {
                            String b2 = aiaj.b(f2.e(2));
                            if (e2.i(3) && e2.i(1)) {
                                aibe aibe = new aibe(e2.e(1).b(1), e2.e(1).b(2), e2.b(3) * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
                                ahqz ahqz = this.f;
                                if (z || ahqz.a.a((Object) b2)) {
                                    int b3 = ahqz.b();
                                    int a2 = ((argt) ahqz.a).a((Object) b2, (Object) aibe);
                                    if (a2 < 0) {
                                        ahqz.e.c();
                                        if (b3 == ahqz.b()) {
                                            ahqz.e.a();
                                        }
                                        a2 ^= -1;
                                        ahqz.d[a2] = j;
                                    }
                                    ahqz.c[a2] = j;
                                    ahqz.b[a2] = d2;
                                }
                            }
                        }
                    }
                    i4++;
                }
                i3 = i;
            }
        }
    }

    public final void a(ajaa ajaa) {
        File b2 = ajaa.b();
        if (b2 != null) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(b2, "nlp_state")));
                byte[] b3 = this.e.b();
                long d2 = this.d.d();
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                dataOutputStream.writeShort(15);
                dataOutputStream.flush();
                ahqz ahqz = this.f;
                ByteBuffer allocate = ByteBuffer.allocate(ahqz.a() + 12 + ahqz.a.h() + 17);
                allocate.putLong(d2);
                allocate.putLong(this.a);
                allocate.put(this.b ? (byte) 1 : 0);
                this.f.b(allocate);
                if (this.g == null) {
                    this.g = aiab.a(b3, (ajrh) null);
                }
                this.g.a(dataOutputStream, allocate.array());
                dataOutputStream.close();
            } catch (IOException | SecurityException e2) {
                String valueOf = String.valueOf(e2.getMessage());
                if (valueOf.length() == 0) {
                    new String("exception is ");
                } else {
                    "exception is ".concat(valueOf);
                }
            }
        }
    }

    public final void a(aqek aqek, long j) {
        ahqz ahqz = this.f;
        aqek.b(3, (Object) ahqz.e.a(ahqz.a.g(), ahqz.a.size()));
    }

    public final void a(aucd aucd, long j) {
        ahqz ahqz = this.f;
        arti b2 = ahqz.e.b(ahqz.a.g(), ahqz.a.size());
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        artq artq = (artq) aucd.b;
        artq artq2 = artq.i;
        b2.getClass();
        artq.c = b2;
        artq.a |= 2;
    }

    public final void a(InputStream inputStream, byte[] bArr, long j, long j2) {
        boolean z;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            Locale locale = Locale.ENGLISH;
            new Object[1][0] = Integer.valueOf(readUnsignedShort);
            if (readUnsignedShort == 15) {
                if (this.g == null) {
                    this.g = aiab.a(bArr, (ajrh) null);
                }
                ByteBuffer wrap = ByteBuffer.wrap(this.g.a(dataInputStream).b);
                long min = Math.min(j2, (wrap.getLong() + wrap.getLong()) - j);
                if (wrap.get() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                a(min, z);
                this.f.a(wrap);
                Locale locale2 = Locale.ENGLISH;
                Object[] objArr = {Integer.valueOf(this.f.b()), new Date(this.a + j)};
                return;
            }
            a(j2);
        } catch (IllegalArgumentException | BufferUnderflowException e2) {
            throw new IOException("Byte buffer read failed.", e2);
        } catch (IOException e3) {
            a(j2);
            throw e3;
        }
    }
}
