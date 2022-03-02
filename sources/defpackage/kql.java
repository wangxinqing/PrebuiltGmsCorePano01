package defpackage;

import android.database.SQLException;
import java.util.Locale;

/* renamed from: kql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class kql extends kqt {
    public final kqh a;
    private final lsb d;
    private final lsb e = new kqj(this);

    protected kql(int i, kqk kqk) {
        super(i, kqk);
        this.d = kqk.a;
        this.a = kqk.b.a(i, this);
    }

    public final String b() {
        h();
        return a(this.c);
    }

    public final String toString() {
        return String.format(Locale.US, "DatabaseTable[%s]", new Object[]{b()});
    }

    public final String a(int i) {
        String str = ((kqr) c(i)).a;
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public final void a(StringBuilder sb, int i, String str) {
        iva.b(e(i));
        sb.append("SELECT ");
        boolean z = false;
        for (lsb b : a()) {
            kqh kqh = (kqh) b.b();
            if (kqh.e(i)) {
                if (z) {
                    sb.append(", ");
                }
                kqp kqp = (kqp) kqh.c(i);
                kqp kqp2 = (kqp) kqh.d(i - 1);
                if (kqp2 != null) {
                    iva.a((Object) str);
                    sb.append(kqh.a(str));
                    sb.append('.');
                    sb.append(kqh.a(kqp2.a));
                } else if (!kqp.g || kqp.f != null || str == null) {
                    sb.append(kqh.a(kqp.f));
                } else {
                    throw new SQLException("Cannot add not null field without default to existing table");
                }
                sb.append(" AS ");
                sb.append(kqh.a(kqp.a));
                z = true;
            }
        }
        if (str != null) {
            sb.append(" FROM ");
            sb.append(kqh.a(str));
            return;
        }
        sb.append(" LIMIT 0");
    }

    public final lsb[] a() {
        lsb[] lsbArr = (lsb[]) this.d.b();
        int length = lsbArr.length;
        lsb[] lsbArr2 = new lsb[(length + 1)];
        lsbArr2[0] = this.e;
        System.arraycopy(lsbArr, 0, lsbArr2, 1, length);
        return lsbArr2;
    }
}
