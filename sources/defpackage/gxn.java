package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.DropBoxManager;
import android.os.TransactionTooLargeException;
import android.util.EventLog;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: gxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gxn {
    public static final iwd a = gzk.a("EventLogAggregator");
    private static final Pattern b = Pattern.compile(",?([a-z_]+)(?:\\(([0-9]+)\\))?");
    private static final HashMap c = new HashMap();
    private static final SimpleDateFormat d = new SimpleDateFormat("MM-dd HH:mm:ss:SSS", Locale.US);
    private Object e;
    private int[] f = new int[0];
    private final HashMap g = new HashMap();

    static {
        c.put("count", new gww());
        c.put("sum", new gwy());
        c.put("mean", new gxa());
        c.put("min", new gxc());
        c.put("max", new gxe());
        c.put("group_by", new gxg());
        c.put("packages", new gxi());
    }

    private static long a(EventLog.Event event) {
        return (event.getTimeNanos() + 500000) / 1000000;
    }

    public static long a(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        throw new IllegalArgumentException("number expected");
    }

    public static Object a(Object obj, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("parameter required");
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (i < objArr.length) {
                return objArr[i];
            }
            throw new IllegalArgumentException("bad index");
        } else if (i <= 0) {
            return obj;
        } else {
            throw new IllegalArgumentException("list expected");
        }
    }

    static String a(long j) {
        return j >= 0 ? d.format(new Date(j)) : "-1";
    }

    private final synchronized void a(long j, long j2, List list, DropBoxManager dropBoxManager, int i) {
        gxj gxj = new gxj(dropBoxManager, i);
        if (j2 != j) {
            StringBuilder sb = new StringBuilder(41);
            sb.append(j2);
            sb.append(",0,0,event_log_start\n");
            gxj.a(sb.toString());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EventLog.Event event = (EventLog.Event) it.next();
            gxm gxm = (gxm) this.g.get(Integer.valueOf(event.getTag()));
            if (gxm != null && gxm.b) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a(event));
                sb2.append(',');
                sb2.append(event.getProcessId());
                sb2.append(',');
                sb2.append(event.getThreadId());
                sb2.append(',');
                sb2.append(gxm.a);
                try {
                    Object data = event.getData();
                    if (data instanceof Object[]) {
                        for (Object obj : (Object[]) data) {
                            sb2.append(',');
                            ish.a(obj.toString(), (Appendable) sb2);
                        }
                    } else if (data != null) {
                        sb2.append(',');
                        ish.a(data.toString(), (Appendable) sb2);
                    }
                } catch (IOException e2) {
                    a.f("IOException writing StringBuilder", e2, new Object[0]);
                }
                sb2.append(10);
                gxj.a(sb2.toString());
            }
        }
        gxj.a();
    }

    private final synchronized void a(ContentResolver contentResolver, boolean z) {
        Object a2 = aeeg.a(contentResolver);
        if (a2 != this.e) {
            this.g.clear();
            int i = 0;
            for (Map.Entry entry : gxo.a(aeeg.a(contentResolver, "event:"), "event:", z, aeeg.a(contentResolver, "checkin_event_whitelist")).entrySet()) {
                String substring = ((String) entry.getKey()).substring(6);
                int tagCode = EventLog.getTagCode(substring);
                if (tagCode < 0) {
                    if (!"checkin_event_log_entries".equals(substring)) {
                        iwd iwd = a;
                        String valueOf = String.valueOf(substring);
                        iwd.d(valueOf.length() == 0 ? new String("Unknown tag: ") : "Unknown tag: ".concat(valueOf), new Object[0]);
                    } else {
                        tagCode = 70220;
                    }
                }
                String str = (String) entry.getValue();
                if (str.length() > 0) {
                    try {
                        gxm gxm = new gxm();
                        Matcher matcher = b.matcher(str);
                        while (matcher.regionStart() < matcher.regionEnd()) {
                            if (!matcher.lookingAt()) {
                                String valueOf2 = String.valueOf(str.substring(matcher.regionStart()));
                                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("bad spec: ") : "bad spec: ".concat(valueOf2));
                            }
                            String group = matcher.group(1);
                            if (!group.equals("log")) {
                                String group2 = matcher.group(2);
                                int i2 = -1;
                                if (!(group2 == null || group2.length() == 0)) {
                                    i2 = Integer.parseInt(group2);
                                }
                                if (c.containsKey(group)) {
                                    gxm.d.add((gxk) c.get(group));
                                    ArrayList arrayList = gxm.e;
                                    Integer valueOf3 = Integer.valueOf(i2);
                                    arrayList.add(valueOf3);
                                    if (group.equals("group_by")) {
                                        gxm.c.add(valueOf3);
                                    }
                                } else {
                                    String valueOf4 = String.valueOf(group);
                                    throw new IllegalArgumentException(valueOf4.length() == 0 ? new String("bad function: ") : "bad function: ".concat(valueOf4));
                                }
                            } else {
                                gxm.b = true;
                            }
                            matcher.region(matcher.end(), matcher.regionEnd());
                        }
                        if (!gxm.b) {
                            if (gxm.d.isEmpty()) {
                            }
                        }
                        gxm.a = substring;
                        this.g.put(Integer.valueOf(tagCode), gxm);
                    } catch (IllegalArgumentException e2) {
                        iwd iwd2 = a;
                        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 13 + String.valueOf(str).length());
                        sb.append("Bad spec: ");
                        sb.append(substring);
                        sb.append(" = ");
                        sb.append(str);
                        iwd2.d(sb.toString(), e2, new Object[0]);
                    }
                } else {
                    continue;
                }
            }
            this.f = new int[(this.g.size() + 1)];
            for (Integer intValue : this.g.keySet()) {
                this.f[i] = intValue.intValue();
                i++;
            }
            int[] iArr = this.f;
            iArr[i] = 70200;
            if (i + 1 == iArr.length) {
                this.e = a2;
            } else {
                throw new AssertionError();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a(hol hol, Context context, long j, long j2, DropBoxManager dropBoxManager, jfc jfc, boolean z) {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        long j3;
        long j4;
        ArrayList arrayList2;
        long j5;
        long j6;
        Context context2;
        DropBoxManager dropBoxManager2;
        Context context3 = context;
        long j7 = j2;
        DropBoxManager dropBoxManager3 = dropBoxManager;
        jfc jfc2 = jfc;
        boolean z2 = z;
        synchronized (this) {
            ContentResolver contentResolver = context.getContentResolver();
            int a2 = aeeg.a(contentResolver, "checkin_log_event_max_buffer", 1000000);
            a(contentResolver, z2);
            long currentTimeMillis = System.currentTimeMillis();
            EventLog.writeEvent(70200, currentTimeMillis);
            ArrayList arrayList3 = new ArrayList();
            EventLog.readEvents(this.f, arrayList3);
            int size = arrayList3.size();
            int size2 = arrayList3.size();
            int size3 = arrayList3.size();
            iwd iwd = a;
            String a3 = a(j);
            int i4 = size;
            String a4 = a(j2);
            int i5 = size2;
            String a5 = a(currentTimeMillis);
            StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 77 + String.valueOf(a4).length() + String.valueOf(a5).length());
            sb.append("Event Aggregation Bookmarks, Event Count: ");
            sb.append(size3);
            sb.append("\nLogs : ");
            sb.append(a3);
            sb.append("\nData : ");
            sb.append(a4);
            sb.append("\nNew  : ");
            sb.append(a5);
            iwd.a(sb.toString(), new Object[0]);
            long j8 = currentTimeMillis;
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            long j9 = j8;
            while (true) {
                if (i8 >= size3) {
                    arrayList = arrayList3;
                    i = a2;
                    i2 = i7;
                    i3 = size3;
                    j3 = j9;
                    j4 = j8;
                    break;
                }
                EventLog.Event event = (EventLog.Event) arrayList3.get(i8);
                int tag = event.getTag();
                long a6 = a(event);
                iwd iwd2 = a;
                String a7 = a(a6);
                i = a2;
                String valueOf = String.valueOf(event.getData());
                arrayList = arrayList3;
                StringBuilder sb2 = new StringBuilder(String.valueOf(a7).length() + 51 + String.valueOf(valueOf).length());
                sb2.append("Event[");
                sb2.append(i8);
                sb2.append("]  Tag:  ");
                sb2.append(tag);
                sb2.append(" Time: ");
                sb2.append(a7);
                sb2.append(" Data: ");
                sb2.append(valueOf);
                iwd2.a(sb2.toString(), new Object[0]);
                if (i6 == size3) {
                    if (a6 >= j) {
                        if (a6 < j9) {
                            i6 = i8;
                            j9 = a6;
                        } else {
                            i6 = i8;
                        }
                    }
                }
                if (i7 == size3) {
                    if (a6 >= j7) {
                        if (a6 < j8) {
                            i7 = i8;
                            j8 = a6;
                        } else {
                            i7 = i8;
                        }
                    }
                }
                if (tag == 70200) {
                    Object data = event.getData();
                    if (data instanceof Long) {
                        long longValue = ((Long) data).longValue();
                        if (longValue == j) {
                            i6 = i8 + 1;
                            j9 = j;
                        }
                        if (longValue == j7) {
                            i7 = i8 + 1;
                            j8 = j7;
                        }
                        if (longValue == currentTimeMillis) {
                            i3 = i8;
                            i2 = i7;
                            j3 = j9;
                            j4 = j8;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i8++;
                Context context4 = context;
                DropBoxManager dropBoxManager4 = dropBoxManager;
                a2 = i;
                arrayList3 = arrayList;
            }
            if (j <= -1) {
                j5 = j4;
                arrayList2 = arrayList;
                j6 = currentTimeMillis;
            } else if (dropBoxManager != null) {
                try {
                    ArrayList arrayList4 = arrayList;
                    arrayList2 = arrayList4;
                    j5 = j4;
                    j6 = currentTimeMillis;
                    a(j, j3, arrayList4.subList(Math.min(i6, i3), i3), dropBoxManager, i);
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof TransactionTooLargeException) {
                        a.d("Dropbox write exceeds buffer limit.", e2.getCause(), new Object[0]);
                        gwd.b("Aggregation failure due to TransactionTooLargeException.");
                        throw new IOException(e2.getCause());
                    }
                    throw e2;
                }
            } else {
                j5 = j4;
                arrayList2 = arrayList;
                j6 = currentTimeMillis;
            }
            if (j7 > -1) {
                dropBoxManager2 = dropBoxManager;
                if (dropBoxManager2 != null) {
                    List<EventLog.Event> subList = arrayList2.subList(Math.min(i2, i3), i3);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("start=");
                    sb3.append(j7);
                    sb3.append("\nend=");
                    sb3.append(j6);
                    sb3.append(10);
                    if (j5 != j7) {
                        sb3.append("log_start=");
                        sb3.append(j5);
                        sb3.append(10);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    HashMap hashMap = new HashMap();
                    for (EventLog.Event event2 : subList) {
                        int tag2 = event2.getTag();
                        gxm gxm = (gxm) this.g.get(Integer.valueOf(tag2));
                        if (gxm != null && !gxm.d.isEmpty()) {
                            arrayList5.clear();
                            arrayList5.add(gxm.a);
                            Object data2 = event2.getData();
                            Iterator it = gxm.c.iterator();
                            while (it.hasNext()) {
                                arrayList5.add(a(data2, ((Integer) it.next()).intValue()));
                            }
                            try {
                                ArrayList arrayList6 = (ArrayList) hashMap.get(arrayList5);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList(gxm.d.size());
                                    for (int i9 = 0; i9 < gxm.d.size(); i9++) {
                                        arrayList6.add(((gxk) gxm.d.get(i9)).a(((Integer) gxm.e.get(i9)).intValue()));
                                    }
                                    hashMap.put(new ArrayList(arrayList5), arrayList6);
                                }
                                Iterator it2 = arrayList6.iterator();
                                while (it2.hasNext()) {
                                    ((gxl) it2.next()).a(data2);
                                }
                            } catch (IllegalArgumentException e3) {
                                iwd iwd3 = a;
                                String valueOf2 = String.valueOf(gxm.a);
                                iwd3.e(valueOf2.length() == 0 ? new String("Can't accumulate event: ") : "Can't accumulate event: ".concat(valueOf2), e3, new Object[0]);
                                this.g.remove(Integer.valueOf(tag2));
                            }
                        }
                    }
                    try {
                        sb3.append(10);
                        for (Map.Entry entry : hashMap.entrySet()) {
                            ish.a(((ArrayList) entry.getKey()).get(0).toString(), (Appendable) sb3);
                            Iterator it3 = ((ArrayList) entry.getValue()).iterator();
                            while (it3.hasNext()) {
                                gxl gxl = (gxl) it3.next();
                                sb3.append(',');
                                context2 = context;
                                try {
                                    gxl.a(sb3, context2);
                                } catch (IOException e4) {
                                    e = e4;
                                    a.f("IOException writing StringBuilder", e, new Object[0]);
                                    dropBoxManager2.addText("event_data", sb3.toString());
                                    iwd iwd4 = a;
                                    long c2 = awrh.c();
                                    StringBuilder sb4 = new StringBuilder(79);
                                    sb4.append("Upload log to clearcut scheduled to run in: ");
                                    sb4.append(c2);
                                    sb4.append(" millisecond(s)");
                                    iwd4.b(sb4.toString(), new Object[0]);
                                    jfc jfc3 = jfc;
                                    jfc3.a((Runnable) new gwt(context2, dropBoxManager2, hol, z), awrh.c(), TimeUnit.MILLISECONDS).a(gwu.a, jfc3);
                                    return j6;
                                }
                            }
                            Context context5 = context;
                            sb3.append(10);
                        }
                        context2 = context;
                    } catch (IOException e5) {
                        e = e5;
                        context2 = context;
                        a.f("IOException writing StringBuilder", e, new Object[0]);
                        dropBoxManager2.addText("event_data", sb3.toString());
                        iwd iwd42 = a;
                        long c22 = awrh.c();
                        StringBuilder sb42 = new StringBuilder(79);
                        sb42.append("Upload log to clearcut scheduled to run in: ");
                        sb42.append(c22);
                        sb42.append(" millisecond(s)");
                        iwd42.b(sb42.toString(), new Object[0]);
                        jfc jfc32 = jfc;
                        jfc32.a((Runnable) new gwt(context2, dropBoxManager2, hol, z), awrh.c(), TimeUnit.MILLISECONDS).a(gwu.a, jfc32);
                        return j6;
                    }
                    dropBoxManager2.addText("event_data", sb3.toString());
                } else {
                    context2 = context;
                }
            } else {
                context2 = context;
                dropBoxManager2 = dropBoxManager;
            }
            if (dropBoxManager2 != null && awrh.a.a().b()) {
                iwd iwd422 = a;
                long c222 = awrh.c();
                StringBuilder sb422 = new StringBuilder(79);
                sb422.append("Upload log to clearcut scheduled to run in: ");
                sb422.append(c222);
                sb422.append(" millisecond(s)");
                iwd422.b(sb422.toString(), new Object[0]);
                jfc jfc322 = jfc;
                jfc322.a((Runnable) new gwt(context2, dropBoxManager2, hol, z), awrh.c(), TimeUnit.MILLISECONDS).a(gwu.a, jfc322);
            }
        }
        return j6;
    }

    public final long a(hol hol, Context context, long j, long j2, DropBoxManager dropBoxManager, boolean z) {
        return a(hol, context, j, j2, dropBoxManager, new jfv(1, 10), z);
    }
}
