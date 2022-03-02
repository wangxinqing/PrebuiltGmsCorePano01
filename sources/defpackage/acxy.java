package defpackage;

import android.metrics.LogMaker;
import android.metrics.MetricsReader;
import android.util.Log;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: acxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxy implements acwz {
    private static acxx e;
    final acxz a = new acxz();
    final MetricsReader b = new MetricsReader();
    public long c;
    public long d = 0;
    private long f = Long.MAX_VALUE;

    public static final void c(acxa acxa) {
        acxa.a(10800000);
    }

    public final void b() {
        this.f = Long.MAX_VALUE;
        this.d = 0;
        this.b.reset();
        while (this.b.hasNext()) {
            LogMaker next = this.b.next();
            this.f = Math.min(this.f, next.getTimestamp());
            this.d = Math.max(this.d, next.getTimestamp());
        }
    }

    public final void a(acxa acxa) {
        boolean c2 = azqq.c();
        if (azqq.d()) {
            this.b.read(0);
            this.c = System.currentTimeMillis();
            b();
            acxx acxx = e;
            if (acxx == null || !acxx.isAlive()) {
                azqq.c();
                long j = this.c;
                if (j == 0) {
                    j = System.currentTimeMillis();
                    this.c = j;
                }
                long j2 = this.d;
                if (j2 != 0) {
                    j = j2;
                }
                acxx acxx2 = new acxx(acxa, this, j);
                e = acxx2;
                acxx2.start();
            } else {
                azqq.c();
            }
            c(acxa);
        }
    }

    public final void b(acxa acxa) {
        int i;
        acxa acxa2 = acxa;
        boolean c2 = azqq.c();
        if (azqq.d()) {
            long c3 = acxa2.c("oc.lastProcessing");
            if (c3 > 0) {
                c3 = Math.min(c3, System.currentTimeMillis());
            }
            this.b.reset();
            boolean z = true;
            boolean z2 = true;
            int i2 = 0;
            while (this.b.hasNext()) {
                LogMaker next = this.b.next();
                if (next.getTimestamp() > c3) {
                    acxz acxz = this.a;
                    int category = next.getCategory();
                    if (category == 803) {
                        azqq.c();
                        String counterName = next.getCounterName();
                        if (counterName != null) {
                            acxa2.b(counterName.length() == 0 ? new String("tron_varz_") : "tron_varz_".concat(counterName), next.getCounterValue());
                        }
                    } else if (category != 804) {
                        boolean c4 = azqq.c();
                        try {
                            aucd b2 = acxa.b();
                            Object[] serialize = next.serialize();
                            for (int i3 = 0; i3 < serialize.length; i3 += 2) {
                                acxz.a.a(((Integer) serialize[i3]).intValue(), serialize[i3 + 1], b2);
                            }
                            acya acya = acxz.a;
                            int i4 = acya.b;
                            if (azqq.c() && (i = acya.b) > 0) {
                                StringBuilder sb = new StringBuilder(44);
                                sb.append("Attempted to log ");
                                sb.append(i);
                                sb.append(" problem fields.");
                                sb.toString();
                            }
                            acya.b = 0;
                            acxa2.a(b2);
                            if (i4 != 0) {
                                bbl a2 = bbl.a(((avqd) b2.b).d);
                                if (a2 == null) {
                                    a2 = bbl.VIEW_UNKNOWN;
                                }
                                acxa2.a("tron_bad_fields", a2.CA);
                            }
                        } catch (ClassCastException e2) {
                            if (c4) {
                                Log.e("SysuiMultiActionParser", "unexpected operand type: ", e2);
                            }
                        }
                    } else {
                        azqq.c();
                        String counterName2 = next.getCounterName();
                        if (counterName2 != null) {
                            String str = counterName2.length() == 0 ? new String("tron_varz_") : "tron_varz_".concat(counterName2);
                            if (next.isLongCounterBucket()) {
                                acxa2.a(str, next.getCounterBucket());
                            } else {
                                acxa2.a(str, (int) next.getCounterBucket());
                            }
                        }
                    }
                    i2++;
                    z = false;
                }
                z2 = false;
            }
            acxa2.a("tron_items_per_collection", i2);
            long j = this.d;
            if (j == 0) {
                j = this.c;
            }
            if (c3 != 0) {
                acxa2.a("tron_last_heart_minutes", (j - c3) / 60000);
            }
            acxa2.b("oc.lastProcessing", Math.max(c3, j));
            if (c2 && !z2 && !z) {
                String format = DateFormat.getDateTimeInstance().format(new Date(this.f));
                String format2 = DateFormat.getDateTimeInstance().format(new Date(this.d));
                StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + 23 + String.valueOf(format2).length());
                sb2.append("MetricsReader from ");
                sb2.append(format);
                sb2.append(" to ");
                sb2.append(format2);
                sb2.toString();
            }
        }
    }

    public final boolean a() {
        acxx acxx = e;
        return acxx != null && acxx.isAlive();
    }
}
