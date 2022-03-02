package defpackage;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.stats.radio.NetworkActivityEvent;
import com.google.android.gms.common.stats.radio.NetworkLatencyEvent;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: jeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jeo {
    public static final String a = String.format("%25.25s\t%10.10s\t%6s\t%5s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%6s\t%6s", new Object[]{"Component", "Tag", "Network", "State", "Wakeups", "Min Lat", "Med Lat", "Max Lat", "TTL Lat", "Std dev", "TTL Evt", "TTL Fail"});

    private static aucd a(NetworkActivityEvent networkActivityEvent, int i) {
        aucd o = aoid.m.o();
        int i2 = networkActivityEvent.tag;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoid aoid = (aoid) o.b;
        int i3 = aoid.a | 1;
        aoid.a = i3;
        aoid.b = i2;
        int i4 = networkActivityEvent.deviceState;
        aoid.a = i3 | 2;
        aoid.c = i4;
        int a2 = aoic.a(i);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoid aoid2 = (aoid) o.b;
        int i5 = a2 - 2;
        if (a2 != 0) {
            aoid2.d = i5;
            int i6 = aoid2.a | 4;
            aoid2.a = i6;
            aoid2.a = i6 | 8;
            aoid2.e = 0;
            return o;
        }
        throw null;
    }

    public static List a(long j, long j2, int i) {
        jie jie;
        Cursor a2;
        Throwable th;
        int i2 = i;
        jes a3 = jes.a();
        RadiosTracingLoggerProvider.NetworkActivityLogger networkActivityLogger = ihs.b().getNetworkActivityLogger();
        if (a3 == null || networkActivityLogger.isNopLogger()) {
            return Collections.emptyList();
        }
        int i3 = Build.VERSION.SDK_INT;
        RadiosTracingLoggerProvider.NetworkActivityLogger networkActivityLogger2 = networkActivityLogger;
        long j3 = j;
        long j4 = j2;
        List events = networkActivityLogger2.getEvents(j3, j4, -1, -1);
        events.addAll(networkActivityLogger2.getEvents(j3, j4, i, -1));
        boolean z = false;
        String[] strArr = {"event_time_ms"};
        String[] strArr2 = {String.valueOf(i), String.valueOf(j), String.valueOf(j2)};
        TreeSet treeSet = new TreeSet();
        try {
            a2 = a3.a.a("radio_activity", strArr, "network_type = ? AND event_time_ms BETWEEN ? AND ?", strArr2, "event_time_ms ASC", (String) null);
            if (a2 != null) {
                int columnIndexOrThrow = a2.getColumnIndexOrThrow("event_time_ms");
                while (a2.moveToNext()) {
                    treeSet.add(Long.valueOf(a2.getLong(columnIndexOrThrow)));
                }
            }
            if (a2 != null) {
                a2.close();
            }
            jie = a3.a;
        } catch (IllegalArgumentException e) {
            try {
                Log.e("WLRadioListnr", "Unable to query radio logs: ", e);
                jie = a3.a;
            } catch (Throwable th2) {
                a3.a.a();
                throw th2;
            }
        } catch (Throwable th3) {
            apev.a(th, th3);
        }
        jie.a();
        if (events.isEmpty() || treeSet.isEmpty()) {
            return Collections.emptyList();
        }
        Collections.sort(events, jen.a);
        long b = axbe.a.a().b();
        HashMap hashMap = new HashMap();
        Iterator it = treeSet.iterator();
        long longValue = ((Long) it.next()).longValue();
        Iterator it2 = events.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NetworkActivityEvent networkActivityEvent = (NetworkActivityEvent) it2.next();
            if (!networkActivityEvent.isNetworkActive) {
                if (it.hasNext()) {
                    while (true) {
                        long j5 = networkActivityEvent.eventTimeMillis;
                        long j6 = j5 + b;
                        if (longValue <= j6) {
                            if (j5 > longValue || longValue > j6) {
                                if (!it.hasNext()) {
                                    a(hashMap, networkActivityEvent, i2, false);
                                    break;
                                }
                                longValue = ((Long) it.next()).longValue();
                            } else {
                                a(hashMap, networkActivityEvent, i2, true);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    a(hashMap, networkActivityEvent, i2, false);
                    break;
                }
            } else {
                a(hashMap, networkActivityEvent, i2, false);
            }
        }
        RadiosTracingLoggerProvider.NetworkLatencyLogger networkLatencyLogger = ihs.b().getNetworkLatencyLogger();
        if (axbe.a.a().m() && !networkLatencyLogger.isNopLogger()) {
            Iterator it3 = hashMap.values().iterator();
            while (it3.hasNext()) {
                for (aucd aucd : ((Map) it3.next()).values()) {
                    int a4 = aoic.a(((aoid) aucd.b).d);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    aoid aoid = (aoid) aucd.b;
                    List<NetworkLatencyEvent> events2 = networkLatencyLogger.getEvents(j, j2, a4 - 2, aoid.b, aoid.c, -1);
                    if (!events2.isEmpty()) {
                        Collections.sort(events2, jem.a);
                        int size = events2.size();
                        double d = (double) size;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = z;
                        }
                        aoid aoid2 = (aoid) aucd.b;
                        aoid aoid3 = aoid.m;
                        aoid2.a |= 512;
                        aoid2.k = d;
                        long j7 = ((NetworkLatencyEvent) events2.get(z ? 1 : 0)).latencyMillis;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = z;
                        }
                        aoid aoid4 = (aoid) aucd.b;
                        aoid4.a |= 16;
                        aoid4.f = j7;
                        int i4 = size - 1;
                        long j8 = ((NetworkLatencyEvent) events2.get(i4)).latencyMillis;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = z;
                        }
                        aoid aoid5 = (aoid) aucd.b;
                        aoid5.a |= 32;
                        aoid5.g = j8;
                        if (size % 2 != 0) {
                            long j9 = ((NetworkLatencyEvent) events2.get(i4 / 2)).latencyMillis;
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = z;
                            }
                            aoid aoid6 = (aoid) aucd.b;
                            aoid6.a |= 128;
                            aoid6.i = j9;
                        } else {
                            int i5 = size / 2;
                            long j10 = (((NetworkLatencyEvent) events2.get(i5 - 1)).latencyMillis + ((NetworkLatencyEvent) events2.get(i5)).latencyMillis) / 2;
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            aoid aoid7 = (aoid) aucd.b;
                            aoid7.a |= 128;
                            aoid7.i = j10;
                        }
                        aoid aoid8 = (aoid) aucd.b;
                        aoid8.a |= 1024;
                        double d2 = 0.0d;
                        aoid8.l = 0.0d;
                        double d3 = 0.0d;
                        for (NetworkLatencyEvent networkLatencyEvent : events2) {
                            Iterator it4 = it3;
                            double d4 = (double) networkLatencyEvent.latencyMillis;
                            Double.isNaN(d4);
                            d3 += d4;
                            if (!networkLatencyEvent.successful) {
                                double d5 = ((aoid) aucd.b).l + 1.0d;
                                if (aucd.c) {
                                    aucd.c();
                                    aucd.c = false;
                                }
                                aoid aoid9 = (aoid) aucd.b;
                                aoid9.a |= 1024;
                                aoid9.l = d5;
                            }
                            it3 = it4;
                        }
                        Iterator it5 = it3;
                        Double.isNaN(d);
                        double d6 = d3 / d;
                        long round = Math.round(d6);
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aoid aoid10 = (aoid) aucd.b;
                        int i6 = aoid10.a | 64;
                        aoid10.a = i6;
                        aoid10.h = round;
                        if (size <= 1) {
                            aoid10.a = i6 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            aoid10.j = 0.0d;
                            it3 = it5;
                            z = false;
                        } else {
                            for (NetworkLatencyEvent networkLatencyEvent2 : events2) {
                                double d7 = (double) networkLatencyEvent2.latencyMillis;
                                Double.isNaN(d7);
                                double d8 = d7 - d6;
                                d2 += d8 * d8;
                            }
                            double d9 = (double) i4;
                            Double.isNaN(d9);
                            double d10 = d2 / d9;
                            if (!aucd.c) {
                                z = false;
                            } else {
                                aucd.c();
                                z = false;
                                aucd.c = false;
                            }
                            aoid aoid11 = (aoid) aucd.b;
                            aoid11.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            aoid11.j = d10;
                            it3 = it5;
                        }
                    } else {
                        Iterator it6 = it3;
                    }
                }
                Iterator it7 = it3;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map values : hashMap.values()) {
            for (aucd g : values.values()) {
                arrayList.add((aoid) g.i());
            }
        }
        return arrayList;
        throw th;
    }

    private static void a(Map map, NetworkActivityEvent networkActivityEvent, int i, boolean z) {
        Map map2 = (Map) map.get(Integer.valueOf(networkActivityEvent.tag));
        if (map2 == null) {
            aucd a2 = a(networkActivityEvent, i);
            if (z) {
                long j = ((aoid) a2.b).e + 1;
                if (a2.c) {
                    a2.c();
                    a2.c = false;
                }
                aoid aoid = (aoid) a2.b;
                aoid aoid2 = aoid.m;
                aoid.a |= 8;
                aoid.e = j;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(networkActivityEvent.deviceState), a2);
            map.put(Integer.valueOf(networkActivityEvent.tag), hashMap);
            return;
        }
        aucd aucd = (aucd) map2.get(Integer.valueOf(networkActivityEvent.deviceState));
        if (aucd == null) {
            aucd = a(networkActivityEvent, i);
            map2.put(Integer.valueOf(networkActivityEvent.deviceState), aucd);
        }
        if (z) {
            long j2 = ((aoid) aucd.b).e + 1;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoid aoid3 = (aoid) aucd.b;
            aoid aoid4 = aoid.m;
            aoid3.a |= 8;
            aoid3.e = j2;
        }
    }
}
