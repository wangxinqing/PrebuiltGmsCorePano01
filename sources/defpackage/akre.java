package defpackage;

import android.os.Bundle;
import com.google.android.gms.maps.model.LatLng;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: akre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akre extends akrh implements akrm {
    private final akrq b;
    private final Bundle c;
    private final akrf d = new akrf(Collections.emptySet(), 0, 0, 0, (String) null, false);
    private final Map e;
    private final Map f;
    private boolean g;

    public akre(akrg akrg, akrq akrq) {
        super(akrg);
        this.b = akrq;
        akrq.d = this;
        this.e = new HashMap();
        this.f = new HashMap();
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putString("nearby_alert_module_name", "Geofencing");
    }

    public final void a() {
        this.g = true;
    }

    public final void b() {
        this.g = false;
        HashSet hashSet = new HashSet();
        for (List addAll : this.e.values()) {
            hashSet.addAll(addAll);
        }
        this.b.a((Collection) hashSet, (Collection) Collections.EMPTY_SET);
        this.b.d = null;
        this.e.clear();
        this.f.clear();
    }

    /* JADX WARNING: type inference failed for: r22v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r20, int r21, java.util.Collection r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            boolean r4 = r0.g
            if (r4 == 0) goto L_0x00ed
            if (r1 == 0) goto L_0x0018
            akrg r2 = r0.a
            akrf r3 = r0.d
            android.os.Bundle r4 = r0.c
            r2.a(r1, r3, r4)
            return
        L_0x0018:
            if (r3 == 0) goto L_0x00ed
            boolean r1 = r22.isEmpty()
            if (r1 != 0) goto L_0x00ed
            r1 = 8
            r4 = 4
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == r7) goto L_0x0035
            if (r2 == r5) goto L_0x0033
            if (r2 == r4) goto L_0x0031
            if (r2 == r1) goto L_0x0030
            r1 = 0
            goto L_0x0036
        L_0x0030:
            goto L_0x0036
        L_0x0031:
            r1 = 4
            goto L_0x0036
        L_0x0033:
            r1 = 2
            goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            java.lang.String r5 = "Places"
            if (r1 == 0) goto L_0x00cf
            int r2 = r22.size()
            r7 = 0
        L_0x003f:
            if (r7 >= r2) goto L_0x00ce
            java.lang.Object r8 = r3.get(r7)
            akrj r8 = (defpackage.akrj) r8
            java.util.Map r9 = r0.e
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x0052:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0081
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.Map r12 = r0.e
            java.lang.Object r12 = r12.get(r11)
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x006a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x007d
            java.lang.Object r13 = r12.next()
            akrj r13 = (defpackage.akrj) r13
            boolean r13 = r13.equals(r8)
            if (r13 == 0) goto L_0x006a
            r10 = r11
        L_0x007d:
            if (r10 == 0) goto L_0x0052
            r12 = r10
            goto L_0x0082
        L_0x0081:
            r12 = r10
        L_0x0082:
            if (r12 == 0) goto L_0x00bd
            akri r9 = new akri
            com.google.android.gms.maps.model.LatLng r10 = r8.b
            double r13 = r10.a
            double r10 = r10.b
            float r15 = r8.c
            java.util.Collection r4 = r8.d
            r16 = r10
            r11 = r9
            r10 = r15
            r15 = r16
            r17 = r10
            r18 = r4
            r11.<init>(r12, r13, r15, r17, r18)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r4.add(r9)
            akrf r15 = new akrf
            int r11 = r8.f
            int r12 = r8.e
            java.lang.String r13 = r8.g
            boolean r14 = r8.h
            r8 = r15
            r9 = r4
            r10 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            akrg r4 = r0.a
            android.os.Bundle r8 = r0.c
            r4.a(r6, r15, r8)
            goto L_0x00ca
        L_0x00bd:
            r4 = 5
            boolean r8 = android.util.Log.isLoggable(r5, r4)
            if (r8 == 0) goto L_0x00ca
            java.lang.String r4 = "Ignoring PlaceGeofence, no matching place found for alert"
            android.util.Log.w(r5, r4)
        L_0x00ca:
            int r7 = r7 + 1
            goto L_0x003f
        L_0x00ce:
            return
        L_0x00cf:
            r1 = 5
            boolean r1 = android.util.Log.isLoggable(r5, r1)
            if (r1 == 0) goto L_0x00ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 56
            r1.<init>(r3)
            java.lang.String r3 = "Ignoring geofence alert, unknown event type: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r5, r1)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akre.a(int, int, java.util.Collection):void");
    }

    public final void b(akrf akrf) {
        akrj akrj;
        Set<akri> set = akrf.a;
        if (set != null && !set.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (akri akri : set) {
                arrayList.add(akri.a);
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str = (String) arrayList.get(i);
                if (this.e.containsKey(str)) {
                    Iterator it = ((List) this.e.get(str)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            akrj = null;
                            break;
                        }
                        akrj = (akrj) it.next();
                        if (akrj.e == akrf.d && akrj.f == akrf.c && ius.a(akrj.g, akrf.e)) {
                            break;
                        }
                    }
                    if (akrj != null) {
                        arrayList2.add(akrj);
                        List list = (List) this.e.get(str);
                        if (list.size() > 1) {
                            list.remove(akrj);
                            this.e.put(str, new ArrayList(list));
                        } else {
                            this.e.remove(str);
                        }
                    }
                }
            }
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                akrj akrj2 = (akrj) arrayList2.get(i2);
                if (this.f.containsKey(akrj2)) {
                    if (((Integer) this.f.get(akrj2)).intValue() == 1) {
                        this.f.remove(akrj2);
                        hashSet.add(akrj2);
                    } else {
                        Map map = this.f;
                        map.put(akrj2, Integer.valueOf(((Integer) map.get(akrj2)).intValue() - 1));
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                this.b.a((Collection) hashSet, (Collection) Collections.emptySet());
            }
        }
    }

    public final void a(akrf akrf) {
        Set<akri> set = akrf.a;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (akri akri : set) {
            akrj akrj = new akrj(new LatLng(akri.b, akri.c), akri.d, akrf.d, akrf.c, akrf.e, akrf.f, akri.e);
            arrayList.add(akrj);
            if (this.e.containsKey(akri.a)) {
                ((List) this.e.get(akri.a)).add(akrj);
            } else {
                this.e.put(akri.a, new ArrayList(Collections.singletonList(akrj)));
            }
            if (this.f.containsKey(akrj)) {
                Map map = this.f;
                map.put(akrj, Integer.valueOf(((Integer) map.get(akrj)).intValue() + 1));
            } else {
                this.f.put(akrj, 1);
                hashSet.add(akrj);
            }
        }
        if (!hashSet.isEmpty()) {
            this.b.a((Collection) Collections.emptySet(), (Collection) hashSet);
        }
    }

    public final void a(PrintWriter printWriter) {
        Map map = this.e;
        if (map != null) {
            int size = map.size();
            StringBuilder sb = new StringBuilder(105);
            sb.append("\nGeofenceNearbyAlertModule: tracking ");
            sb.append(size);
            sb.append(" places.\n (place ID -> number of tracked place geofences)");
            printWriter.println(sb.toString());
            for (String str : this.e.keySet()) {
                printWriter.printf(String.format(Locale.US, "  %s -> %d\n", new Object[]{str, Integer.valueOf(((List) this.e.get(str)).size())}), new Object[0]);
            }
        }
        akrq akrq = this.b;
        if (akrq != null) {
            printWriter.println("\nPlaceGeofencer:");
            int size2 = akrq.b.size();
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("  Tracking ");
            sb2.append(size2);
            sb2.append(" PlaceGeofences: ");
            printWriter.println(sb2.toString());
            for (akrj println : akrq.b) {
                printWriter.print("   ");
                printWriter.println(println);
            }
        }
    }
}
