package defpackage;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: jef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jef implements Comparable {
    protected static final int[] a = {-1, 0, 1, 2, 3, 7};
    private static final anax f = anax.a(-1, 3, 2, 1, 0, 7, new Integer[0]);
    protected final ou b = new ou();
    protected final int c;
    protected final int d;
    protected final int e;

    public jef(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        for (int i4 : a) {
            this.b.put(Integer.valueOf(i4), new jee(i, i2, i4, i3));
        }
    }

    public void a(jee jee) {
        if (b(jee)) {
            b(-1).a(jee);
            b(jee.n).a(jee);
        }
    }

    public jee b(int i) {
        anax anax = f;
        Integer valueOf = Integer.valueOf(i);
        if (anax.contains(valueOf)) {
            jee jee = (jee) this.b.get(valueOf);
            iva.a((Object) jee);
            return jee;
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("unexpected device state passed ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean b(jee jee) {
        int i = jee.n;
        return this.c == jee.l && this.d == jee.m && this.e == jee.o && i >= 0 && (i <= 3 || i == 7);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (b(-1).e() > ((jef) obj).b(-1).e() ? 1 : (b(-1).e() == ((jef) obj).b(-1).e() ? 0 : -1));
    }

    public String toString() {
        jee b2 = b(-1);
        StringBuilder sb = new StringBuilder();
        sb.append(b2);
        long e2 = b2.e();
        if (e2 > 0) {
            long e3 = b(0).e();
            long e4 = b(1).e();
            long e5 = b(2).e();
            long e6 = b(3).e();
            long e7 = b(7).e();
            NumberFormat percentInstance = NumberFormat.getPercentInstance();
            double d2 = (double) e2;
            double d3 = (double) e3;
            Double.isNaN(d3);
            Double.isNaN(d2);
            double d4 = (double) e4;
            Double.isNaN(d4);
            Double.isNaN(d2);
            double d5 = (double) e5;
            Double.isNaN(d5);
            Double.isNaN(d2);
            double d6 = (double) e6;
            Double.isNaN(d6);
            Double.isNaN(d2);
            double d7 = (double) e7;
            Double.isNaN(d7);
            Double.isNaN(d2);
            sb.append(String.format(" %% ni discharging: %s %% ni charging: %s %% i discharging: %s %% i charging: %s %% not reported: %s\n", new Object[]{percentInstance.format(d3 / d2), percentInstance.format(d4 / d2), percentInstance.format(d5 / d2), percentInstance.format(d6 / d2), percentInstance.format(d7 / d2)}));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ");
        Date date = new Date();
        date.setTime(b2.p);
        String format = simpleDateFormat.format(date);
        date.setTime(b2.q);
        sb.append(String.format("First record date: %s Last record date: %s UID: %s\n", new Object[]{format, simpleDateFormat.format(date), Integer.valueOf(this.d)}));
        return sb.toString();
    }
}
