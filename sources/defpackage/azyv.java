package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* renamed from: azyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azyv {
    public static final Logger a = Logger.getLogger(azyv.class.getName());
    public static final azyv b = new azyv();
    public final ConcurrentNavigableMap c = new ConcurrentSkipListMap();
    public final ConcurrentMap d = new ConcurrentHashMap();
    public final ConcurrentMap e = new ConcurrentHashMap();

    public azyv() {
        new ConcurrentSkipListMap();
        new ConcurrentHashMap();
    }

    public static void a(Map map, azyw azyw) {
        azyw azyw2 = (azyw) map.put(Long.valueOf(azyw.b().a), azyw);
    }

    public static void b(Map map, azyw azyw) {
        azyw azyw2 = (azyw) map.remove(Long.valueOf(azyw.b().a));
    }
}
