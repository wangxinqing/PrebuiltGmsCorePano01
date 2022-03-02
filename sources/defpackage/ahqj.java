package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: ahqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqj extends ahye {
    public static final ahqj a = new ahqj();
    public aizy b;
    public ajbg c;
    public long d = -1;
    public long e = 0;
    long f = 0;
    final int[] g = new int[34];

    private ahqj() {
    }

    private final void b(int i, int i2) {
        int[] iArr = this.g;
        int i3 = i - 1;
        iArr[i3] = iArr[i3] + i2;
    }

    public final void a() {
        Arrays.fill(this.g, 0);
        this.f = this.b.b();
    }

    public final void a(int i) {
        b(i, 1);
    }

    public final int b(int i) {
        return this.g[i - 1];
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        this.g[i - 1] = i2;
    }

    public final void a(int i, aqek aqek, int i2) {
        if (aqek.i(i2)) {
            try {
                b(i, aqek.e(i2).b().length);
            } catch (IOException e2) {
            }
        }
    }

    public final void a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(146);
        allocate.putShort(9);
        allocate.putLong(this.f);
        for (int putInt : this.g) {
            allocate.putInt(putInt);
        }
        this.h.f().execute(new ahqh(this, allocate));
        this.e = j;
    }

    public final void a(aqek aqek) {
        long b2 = this.b.b();
        long j = (b2 - this.f) - 86400000;
        if (j > 1200000) {
            a();
            a(b2);
        } else if (j >= -1200000) {
            boolean z = b(5) > 0;
            StringBuilder sb = new StringBuilder(24);
            sb.append("FREWLE is enabled? ");
            sb.append(z);
            sb.toString();
            int b3 = b(1);
            int b4 = b(2);
            StringBuilder sb2 = new StringBuilder(130);
            sb2.append("Number of successful wifi cluster gls transactions: ");
            sb2.append(b3);
            sb2.append(", Number of unsuccessful wifi cluster gls transactions: ");
            sb2.append(b4);
            sb2.toString();
            int b5 = b(11);
            int b6 = b(12);
            StringBuilder sb3 = new StringBuilder(130);
            sb3.append("Number of successful cell locator gls transactions: ");
            sb3.append(b5);
            sb3.append(", Number of unsuccessful cell locator gls transactions: ");
            sb3.append(b6);
            sb3.toString();
            int b7 = b(3);
            int b8 = b(4);
            StringBuilder sb4 = new StringBuilder(118);
            sb4.append("Number of successful FREWLE gls transactions: ");
            sb4.append(b7);
            sb4.append(", Number of unsuccessful FREWLE gls transactions: ");
            sb4.append(b8);
            sb4.toString();
            int b9 = b(13);
            int b10 = b(14);
            StringBuilder sb5 = new StringBuilder(136);
            sb5.append("Total number of successful gls transactions over wifi: ");
            sb5.append(b9);
            sb5.append(", Total number of unsuccessful gls transactions over wifi: ");
            sb5.append(b10);
            sb5.toString();
            int b11 = b(15);
            int b12 = b(16);
            StringBuilder sb6 = new StringBuilder(136);
            sb6.append("Total number of successful gls transactions over cell: ");
            sb6.append(b11);
            sb6.append(", Total number of unsuccessful gls transactions over cell: ");
            sb6.append(b12);
            sb6.toString();
            int b13 = b(18);
            int b14 = b(19);
            StringBuilder sb7 = new StringBuilder(116);
            sb7.append("Total number of successful gls transactions: ");
            sb7.append(b13);
            sb7.append(", Total number of unsuccessful gls transactions: ");
            sb7.append(b14);
            sb7.toString();
            int b15 = b(6);
            int b16 = b(7);
            StringBuilder sb8 = new StringBuilder(110);
            sb8.append("Number of bytes uploaded by wifi cluster: ");
            sb8.append(b15);
            sb8.append(", Number of bytes downloaded by wifi cluster: ");
            sb8.append(b16);
            sb8.toString();
            int b17 = b(8);
            int b18 = b(9);
            StringBuilder sb9 = new StringBuilder(98);
            sb9.append("Number of bytes uploaded by FREWLE: ");
            sb9.append(b17);
            sb9.append(", Number of bytes downloaded by FREWLE: ");
            sb9.append(b18);
            sb9.toString();
            int b19 = b(10);
            int b20 = b(17);
            StringBuilder sb10 = new StringBuilder(94);
            sb10.append("Number of bytes uploaded by cell: ");
            sb10.append(b19);
            sb10.append(", Number of bytes downloaded by cell: ");
            sb10.append(b20);
            sb10.toString();
            int b21 = b(22);
            int b22 = b(23);
            int b23 = b(24);
            int b24 = b(25);
            StringBuilder sb11 = new StringBuilder(163);
            sb11.append("Number of FREWLE locations: ");
            sb11.append(b21);
            sb11.append(", Number of GPWLE locations: ");
            sb11.append(b22);
            sb11.append(", Total number of Wifi locations: ");
            sb11.append(b23);
            sb11.append(", Number of cell locations: ");
            sb11.append(b24);
            sb11.toString();
            if (aydu.a.a().uploadNlpDailyStats()) {
                a(26, this.h.g());
                a(29, aybc.a.d().elevationFromWifiEnabled() ? 1 : 0);
                a(5, 1);
                aqek aqek2 = new aqek(ajck.aw);
                for (int i = 1; i < this.g.length + 1; i++) {
                    int g2 = aqek2.g(i);
                    if (g2 == 21) {
                        aqek2.g(i, b(i));
                    } else if (g2 == 24) {
                        aqek2.b(i, b(i) > 0);
                    } else {
                        StringBuilder sb12 = new StringBuilder(36);
                        sb12.append("Unexpected ProtoBufType: ");
                        sb12.append(g2);
                        throw new IllegalStateException(sb12.toString());
                    }
                }
                aqek aqek3 = new aqek(ajck.av);
                aqek3.b(1, b2 / 1000);
                aqek3.g(2, (int) ((b2 - this.f) / 1000));
                aqek3.b(17, (Object) aqek2);
                aqek.a(5, (Object) aqek3);
            }
            a();
            a(b2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.limit() - wrap.position() != 146) {
            throw new IOException("Byte buffer length doesn't match expected byte buffer length");
        } else if (wrap.getShort() == 9) {
            this.c.a((Runnable) new ahqi(this, wrap));
        } else {
            throw new IOException("File version doesn't match expected version");
        }
    }
}
