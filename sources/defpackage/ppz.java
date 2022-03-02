package defpackage;

import android.os.SystemClock;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: ppz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ppz {
    private static final long a = SystemClock.elapsedRealtime();
    private static final Map b = new IdentityHashMap();
    private static final Map c = new HashMap();
    private static final Queue d = amyh.a(30);

    private ppz() {
    }

    public static aolh a() {
        aucd o = aolh.f.o();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (ppz.class) {
            for (Map.Entry entry : b.entrySet()) {
                ppr ppr = (ppr) entry.getKey();
                aucd o2 = aolf.d.o();
                aucd o3 = aolg.d.o();
                aonk aonk = ppr.g;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aolg aolg = (aolg) o3.b;
                aolg.b = aonk.a();
                aolg.a |= 1;
                String str = ppr.j;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aolg aolg2 = (aolg) o3.b;
                str.getClass();
                aolg2.a |= 2;
                aolg2.c = str;
                aolg aolg3 = (aolg) o3.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aolf aolf = (aolf) o2.b;
                aolg3.getClass();
                aolf.b = aolg3;
                aolf.a |= 1;
                long j = elapsedRealtime - ((ppy) entry.getValue()).b;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aolf aolf2 = (aolf) o2.b;
                aolf2.a |= 2;
                aolf2.c = j;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aolh aolh = (aolh) o.b;
                aolf aolf3 = (aolf) o2.i();
                aolf3.getClass();
                if (!aolh.b.a()) {
                    aolh.b = aucj.a(aolh.b);
                }
                aolh.b.add(aolf3);
            }
            for (ppv ppv : d) {
                aucd o4 = aole.e.o();
                aolg b2 = b(ppv.a);
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                aole aole = (aole) o4.b;
                b2.getClass();
                aole.b = b2;
                int i = aole.a | 1;
                aole.a = i;
                long j2 = ppv.c.b;
                long j3 = ppv.b.b;
                int i2 = i | 2;
                aole.a = i2;
                aole.c = j2 - j3;
                aole.a = i2 | 4;
                aole.d = elapsedRealtime - j3;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aolh aolh2 = (aolh) o.b;
                aole aole2 = (aole) o4.i();
                aole2.getClass();
                if (!aolh2.c.a()) {
                    aolh2.c = aucj.a(aolh2.c);
                }
                aolh2.c.add(aole2);
            }
            for (Map.Entry entry2 : c.entrySet()) {
                ppx ppx = (ppx) entry2.getValue();
                aucd o5 = aold.e.o();
                aolg b3 = b((ppw) entry2.getKey());
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aold aold = (aold) o5.b;
                b3.getClass();
                aold.b = b3;
                int i3 = aold.a | 1;
                aold.a = i3;
                int i4 = ppx.b;
                int i5 = i3 | 2;
                aold.a = i5;
                aold.c = i4;
                long j4 = ppx.a;
                aold.a = i5 | 4;
                aold.d = j4;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aolh aolh3 = (aolh) o.b;
                aold aold2 = (aold) o5.i();
                aold2.getClass();
                if (!aolh3.d.a()) {
                    aolh3.d = aucj.a(aolh3.d);
                }
                aolh3.d.add(aold2);
            }
        }
        long j5 = elapsedRealtime - a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aolh aolh4 = (aolh) o.b;
        aolh4.a |= 1;
        aolh4.e = j5;
        return (aolh) o.i();
    }

    private static aolg b(ppw ppw) {
        aucd o = aolg.d.o();
        aonk aonk = ppw.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aolg aolg = (aolg) o.b;
        aolg.b = aonk.a();
        aolg.a |= 1;
        String str = ppw.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aolg aolg2 = (aolg) o.b;
        str.getClass();
        aolg2.a |= 2;
        aolg2.c = str;
        return (aolg) o.i();
    }

    private static String c(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(j));
    }

    private static String b(long j) {
        if (j < 0) {
            return "";
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes - TimeUnit.HOURS.toMinutes(hours)), Long.valueOf(seconds - TimeUnit.MINUTES.toSeconds(minutes)), Long.valueOf(j - TimeUnit.SECONDS.toMillis(seconds))});
    }

    public static void b(ppr ppr) {
        if (axrm.c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ppy ppy = new ppy(currentTimeMillis, elapsedRealtime);
            synchronized (ppz.class) {
                ppy ppy2 = (ppy) b.remove(ppr);
                if (ppy2 != null) {
                    ppw ppw = new ppw(ppr);
                    d.add(new ppv(ppw, ppy2, ppy));
                    ppx ppx = (ppx) c.get(ppw);
                    if (ppx == null) {
                        ppx = new ppx();
                        c.put(ppw, ppx);
                    }
                    ppx.b++;
                    ppx.a += elapsedRealtime - ppy2.b;
                    return;
                }
                oso.e("Task not running: %s", (Object) ppr.toString());
            }
        }
    }

    private static String a(ppw ppw) {
        return String.format(Locale.US, "%-40s | %s", new Object[]{ppw.b.name(), ppw.a});
    }

    public static void a(PrintWriter printWriter) {
        if (axrm.c()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (ppz.class) {
                if (!b.isEmpty()) {
                    ArrayList<Map.Entry> arrayList = new ArrayList<>(b.entrySet());
                    Collections.sort(arrayList, new pps());
                    printWriter.println("\nRunning Tasks:");
                    printWriter.format("%-23s | %s | %-40s | %s\n", new Object[]{"Start Time", "Duration (hh:mm:ss.fff)", "Task Name", "Package Name"});
                    for (Map.Entry entry : arrayList) {
                        ppy ppy = (ppy) entry.getValue();
                        printWriter.format("%s | %-23s | %s\n", new Object[]{c(ppy.a), b(elapsedRealtime - ppy.b), a(new ppw((ppr) entry.getKey()))});
                    }
                }
                if (!d.isEmpty()) {
                    ArrayList<ppv> arrayList2 = new ArrayList<>(d);
                    Collections.sort(arrayList2, new ppt());
                    printWriter.println("\nRecent Finished Tasks:");
                    printWriter.format("%-23s | %-23s | %s | %-40s | %s\n", new Object[]{"Start Time", "End Time", "Duration (hh:mm:ss.fff)", "Task Name", "Package Name"});
                    for (ppv ppv : arrayList2) {
                        printWriter.format("%s | %s | %-23s | %s\n", new Object[]{c(ppv.b.a), c(ppv.c.a), b(ppv.c.b - ppv.b.b), a(ppv.a)});
                    }
                }
                if (!c.isEmpty()) {
                    ArrayList<Map.Entry> arrayList3 = new ArrayList<>(c.entrySet());
                    Collections.sort(arrayList3, new ppu());
                    String b2 = b(elapsedRealtime - a);
                    StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 42);
                    sb.append("\nAggregated Task Stats (total duration: ");
                    sb.append(b2);
                    sb.append("):");
                    printWriter.println(sb.toString());
                    printWriter.format("%s | %-11s | %-40s | %s\n", new Object[]{"Total Duration (hh:mm:ss.fff)", "Runs", "Task Name", "Package Name"});
                    for (Map.Entry entry2 : arrayList3) {
                        ppx ppx = (ppx) entry2.getValue();
                        printWriter.format("%-29s | (%3d times) | %s\n", new Object[]{b(ppx.a), Integer.valueOf(ppx.b), a((ppw) entry2.getKey())});
                    }
                }
            }
        }
    }

    public static void a(ppr ppr) {
        if (axrm.c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (ppz.class) {
                if (b.put(ppr, new ppy(currentTimeMillis, elapsedRealtime)) != null) {
                    oso.e("Task already running: %s", (Object) ppr.toString());
                }
            }
        }
    }

    public static boolean a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (ppz.class) {
            for (Map.Entry value : b.entrySet()) {
                if (elapsedRealtime - ((ppy) value.getValue()).b > j) {
                    return true;
                }
            }
            return false;
        }
    }
}
