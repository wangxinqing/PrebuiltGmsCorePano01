package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: awbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbt {
    public int a;
    public final batf b;
    private final batm c;

    public awbt(batf batf) {
        awbr awbr = new awbr(this, batf);
        batm batm = new batm(batq.a((baua) awbr), new awbs());
        this.c = batm;
        this.b = batq.a((baua) batm);
    }

    private final batg a() {
        return this.b.d((long) this.b.g());
    }

    public final List a(int i) {
        this.a += i;
        int g = this.b.g();
        if (g < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("numberOfPairs < 0: ");
            sb.append(g);
            throw new IOException(sb.toString());
        } else if (g <= 1024) {
            ArrayList arrayList = new ArrayList(g);
            int i2 = 0;
            while (i2 < g) {
                batg d = a().d();
                batg a2 = a();
                if (d.e() != 0) {
                    arrayList.add(new awbg(d, a2));
                    i2++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            if (this.a > 0) {
                this.c.b();
                int i3 = this.a;
                if (i3 != 0) {
                    StringBuilder sb2 = new StringBuilder(32);
                    sb2.append("compressedLimit > 0: ");
                    sb2.append(i3);
                    throw new IOException(sb2.toString());
                }
            }
            return arrayList;
        } else {
            StringBuilder sb3 = new StringBuilder(33);
            sb3.append("numberOfPairs > 1024: ");
            sb3.append(g);
            throw new IOException(sb3.toString());
        }
    }
}
