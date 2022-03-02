package defpackage;

import android.util.EventLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: acxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxe implements acwz {
    private final nz a = new nz();
    private int[] b;
    private final ArrayList c = new ArrayList();

    public acxe() {
        a((acxw) new acxv());
        a((acxw) new acxt());
        a((acxw) new acxu());
        a((acxw) new acxo());
        a((acxw) new acxn());
        a((acxw) new acxk());
        a((acxw) new acxh());
        a((acxw) new acxj());
        a((acxw) new acxp());
        a((acxw) new acxq());
        a((acxw) new acxi());
        a((acxw) new acxl());
        a((acxw) new acxb());
        a((acxw) new acxf());
        a((acxw) new acxg());
        a((acxw) new acxs());
        a((acxw) new acxr());
        a((acxw) new acxd());
    }

    public final boolean a() {
        return false;
    }

    public final void a(acxa acxa) {
        boolean c2 = azqq.c();
        if (azqq.d()) {
            try {
                if (this.b == null) {
                    this.b = new int[this.a.h];
                    int i = 0;
                    while (true) {
                        nz nzVar = this.a;
                        if (i >= nzVar.h) {
                            break;
                        }
                        this.b[i] = ((acxw) nzVar.c(i)).a();
                        i++;
                    }
                }
                int[] iArr = this.b;
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = new ArrayList();
                EventLog.readEvents(iArr, arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new acxc((EventLog.Event) it.next()));
                }
            } catch (IOException e) {
                apev.a(e);
            }
            if (c2) {
                int size = this.c.size();
                StringBuilder sb = new StringBuilder(34);
                sb.append("read this many events: ");
                sb.append(size);
                sb.toString();
            }
            EventLog.writeEvent(208000, new Object[0]);
        }
    }

    public final void b(acxa acxa) {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        ArrayList arrayList;
        Object[] objArr;
        acxe acxe = this;
        acxa acxa2 = acxa;
        boolean c2 = azqq.c();
        if (azqq.d()) {
            long j4 = 1000000;
            if (!acxe.c.isEmpty()) {
                ArrayList arrayList2 = acxe.c;
                int size = arrayList2.size();
                j2 = Long.MAX_VALUE;
                j3 = 0;
                int i2 = 0;
                i = 0;
                j = 0;
                while (i2 < size) {
                    acxc acxc = (acxc) arrayList2.get(i2);
                    boolean z2 = c2;
                    ArrayList arrayList3 = arrayList2;
                    long j5 = acxc.a / j4;
                    j2 = Math.min(j2, j5);
                    j = Math.max(j, j5);
                    if (acxc.b == 208000) {
                        i++;
                        j3 = Math.max(j3, j5);
                    }
                    i2++;
                    c2 = z2;
                    arrayList2 = arrayList3;
                    j4 = 1000000;
                }
                z = c2;
            } else {
                z = c2;
                j3 = 0;
                j2 = 0;
                i = 0;
                j = 0;
            }
            long j6 = j - j2;
            acxa2.a("tron_eventlog_horizon", j6 / 60000);
            acxa2.a("tron_hearts_seen", (long) i);
            if (i > 0) {
                acxa2.a("tron_last_heart_minutes", (j - j3) / 60000);
            }
            ArrayList arrayList4 = acxe.c;
            int size2 = arrayList4.size();
            int i3 = 0;
            while (i3 < size2) {
                acxc acxc2 = (acxc) arrayList4.get(i3);
                long j7 = acxc2.a / 1000000;
                if (j7 > j3) {
                    int i4 = acxc2.b;
                    acxw acxw = (acxw) acxe.a.get(Integer.valueOf(i4));
                    if (acxw != null) {
                        if (z) {
                            StringBuilder sb = new StringBuilder(24);
                            sb.append("parsing tag: ");
                            sb.append(i4);
                            sb.toString();
                        }
                        boolean c3 = azqq.c();
                        Object obj = acxc2.c;
                        if (obj instanceof Object[]) {
                            Object[] objArr2 = (Object[]) obj;
                            int i5 = 0;
                            while (true) {
                                arrayList = arrayList4;
                                if (i5 >= objArr2.length) {
                                    objArr = objArr2;
                                    break;
                                } else if (objArr2[i5] != null) {
                                    i5++;
                                    arrayList4 = arrayList;
                                } else if (c3) {
                                    int i6 = acxc2.b;
                                    StringBuilder sb2 = new StringBuilder(33);
                                    sb2.append("unexpected null value:");
                                    sb2.append(i6);
                                    sb2.toString();
                                }
                            }
                        } else {
                            objArr = new Object[]{obj};
                            arrayList = arrayList4;
                        }
                        acxw.a(acxa2, acxc2.a / 1000000, objArr);
                    } else {
                        arrayList = arrayList4;
                        if (z) {
                            StringBuilder sb3 = new StringBuilder(24);
                            sb3.append("unknown tag: ");
                            sb3.append(i4);
                            sb3.toString();
                        }
                    }
                } else {
                    arrayList = arrayList4;
                    if (z) {
                        StringBuilder sb4 = new StringBuilder(54);
                        sb4.append("old event: ");
                        sb4.append(j7);
                        sb4.append(" < ");
                        sb4.append(j3);
                        sb4.toString();
                    }
                }
                i3++;
                acxe = this;
                arrayList4 = arrayList;
            }
            long j8 = j6 / 2;
            if (i > 0) {
                double a2 = azqq.a.a().a();
                double d = (double) j8;
                Double.isNaN(d);
                double d2 = d * a2;
                double d3 = 1.0d - a2;
                double d4 = (double) (j - j3);
                Double.isNaN(d4);
                j8 = (long) (d2 + (d3 * d4));
            }
            if (j8 == 0) {
                j8 = azqq.a.a().f();
            }
            acxa2.a(j8);
            return;
        }
        boolean z3 = c2;
    }

    /* access modifiers changed from: package-private */
    public final void a(acxw acxw) {
        this.a.put(Integer.valueOf(acxw.a()), acxw);
        this.b = null;
    }
}
