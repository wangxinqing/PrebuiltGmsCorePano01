package defpackage;

import java.io.PrintWriter;
import java.text.FieldPosition;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* renamed from: aicn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aicn {
    private final LinkedList a = new LinkedList();
    private final aicp b;
    private final String c;
    private final aicc d;
    private final aicl[] e;
    private final int[] f;
    private final long[] g;
    private final long h;
    private aicl i;
    private aicl j;

    public aicn(String str, String str2, int i2, aicp aicp, aicc aicc) {
        new FieldPosition(0);
        new SimpleDateFormat("yyyy.MM.dd HH:mm:ss ", Locale.ENGLISH);
        this.e = new aicl[aico.values().length];
        this.f = new int[aico.values().length];
        long[] jArr = new long[aico.values().length];
        this.g = jArr;
        this.c = str2;
        this.b = aicp;
        this.d = aicc;
        Arrays.fill(jArr, -1);
        this.h = aicp.a();
        this.i = null;
        this.j = null;
        a(new aicl(aico.EVENT_LOG_CREATE, this.h, (String) null, str, i2, -1, -1));
    }

    public final String a(String str) {
        this.c.equals(str);
        return "";
    }

    public final long b() {
        return this.b.a();
    }

    public final void a() {
        aicl aicl;
        synchronized (this) {
            aicl = this.i;
            this.i = null;
            this.j = null;
        }
        new Date();
        while (aicl != null) {
            aico aico = aicl.e;
            aicl aicl2 = aicl.l;
            if (!(this.d == null || aico == aico.LOG)) {
                this.d.a(aico, aicl.j, aicl.f, aicl.g, aicl.h, aicl.i);
            }
            aicl = aicl2;
        }
    }

    public final void b(aico aico, boolean z) {
        a(new aicl(aico, this.b.a(), !z ? "off" : "on", z ? 1 : 0));
    }

    public final synchronized void a(aicl aicl) {
        if (this.a.size() > 0) {
            this.g[((aicl) this.a.getLast()).e.ordinal()] = aicl.j;
        }
        this.e[aicl.e.ordinal()] = aicl;
        int[] iArr = this.f;
        int ordinal = aicl.e.ordinal();
        iArr[ordinal] = iArr[ordinal] + 1;
        if (aicl.e == aico.GPS_LOCATION && this.a.size() >= 2 && ((aicl) this.a.getLast()).e == aico.GPS_LOCATION) {
            LinkedList linkedList = this.a;
            if (((aicl) linkedList.get(linkedList.size() - 2)).e == aico.GPS_LOCATION) {
                this.a.removeLast();
            }
        }
        this.a.addLast(aicl);
        while (this.a.size() > 200) {
            this.a.removeFirst();
        }
        int i2 = aicl.e.bC;
        aicl.l = null;
        if (this.i != null) {
            aicl aicl2 = this.j;
            if (aicl2 != null) {
                aicl2.l = aicl;
            }
        } else {
            this.i = aicl;
        }
        this.j = aicl;
    }

    public final void a(aico aico) {
        a(new aicl(aico, this.b.a()));
    }

    public final void a(aico aico, int i2) {
        a(new aicl(aico, this.b.a(), i2));
    }

    public final void a(aico aico, int i2, int i3) {
        a(new aicl(aico, this.b.a(), i2, i3));
    }

    public final void a(aico aico, int i2, int i3, int i4) {
        a(new aicl(aico, this.b.a(), (String) null, (Object) null, i2, i3, i4));
    }

    public final void a(aico aico, int i2, String str) {
        a((aicl) new aick(aico, this.b.a(), "", i2, str));
    }

    public final void a(aico aico, boolean z) {
        a(new aicl(aico, this.b.a(), !z ? "disabled" : "enabled", z ? 1 : 0));
    }

    public final synchronized void a(Format format, long j2, PrintWriter printWriter) {
        PrintWriter printWriter2 = printWriter;
        synchronized (this) {
            long a2 = this.b.a();
            StringBuilder sb = new StringBuilder(36);
            sb.append("elapsedRealtime ");
            sb.append(a2);
            printWriter2.println(sb.toString());
            long j3 = this.h;
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("Process restart time: ");
            sb2.append(j3);
            printWriter2.println(sb2.toString());
            printWriter.flush();
            Date date = new Date(0);
            long j4 = -600000 + a2;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                aicl aicl = (aicl) it.next();
                if (aicl.j >= j4) {
                    if (aicl.e.bC == 1) {
                        printWriter2.print(10);
                    }
                    date.setTime(j2);
                    date.setTime(date.getTime() + aicl.j);
                    printWriter2.print(format.format(date));
                    printWriter2.print(' ');
                    printWriter2.print('@');
                    printWriter2.print(aicl.j);
                    printWriter2.print(' ');
                    printWriter2.print(aicl.e.toString());
                    printWriter2.print(' ');
                    aicl.a(printWriter2);
                    printWriter2.print(10);
                    j4 = j4;
                } else {
                    Format format2 = format;
                    long j5 = j2;
                    long j6 = j4;
                }
            }
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("elapsedRealtime ");
            sb3.append(a2);
            printWriter2.println(sb3.toString());
            printWriter.flush();
            aicc aicc = this.d;
            if (aicc != null) {
                aicc.a(printWriter2, a2);
                StringBuilder sb4 = new StringBuilder(36);
                sb4.append("elapsedRealtime ");
                sb4.append(a2);
                printWriter2.println(sb4.toString());
            }
        }
    }
}
