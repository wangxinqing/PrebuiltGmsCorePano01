package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: aecs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aecs {
    public final aect a;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public int d = 0;
    private final aecw e = new aecw(this.a);

    public final auay a() {
        this.a.a();
        if (this.a.a == 0) {
            return auay.b;
        }
        int i = 0;
        while (true) {
            try {
                aecv a2 = this.e.a();
                if (a2 != null) {
                    i += a2.c;
                    if (a2.a != 2) {
                        int i2 = a2.b;
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Section ");
                        sb.append(i2);
                        sb.append(" is not a message type");
                        throw new aecr(sb.toString());
                    } else if (a2.b == 1) {
                        this.b.add((avqk) aucj.a((aucj) avqk.b, this.a.a(a2.a(), a2.e)));
                    }
                } else if (i == 0) {
                    byte[] b2 = this.e.b();
                    if (b2 != null) {
                        this.d++;
                        return auay.a(b2);
                    } else if (this.e.c()) {
                        return a();
                    } else {
                        throw new aecr("Can't skip the next field");
                    }
                } else if (i == this.e.a) {
                    auay a3 = auay.a(this.a.a(0, i));
                    this.e.d();
                    this.d++;
                    return a3;
                } else {
                    throw new aecr(String.format(Locale.getDefault(), "bytes to upload %d should equal to index of read %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.e.a)}));
                }
            } catch (aecu e2) {
                throw new aecr("can't serialize to valid proto", e2);
            } catch (NoSuchMethodException e3) {
                throw new aecr("Invalid invocation", e3);
            }
        }
    }

    public aecs(InputStream inputStream, int i) {
        this.a = new aect(inputStream, i);
    }
}
