package defpackage;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: aksf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksf implements aksb {
    final /* synthetic */ akpd a;
    final /* synthetic */ List b;
    final /* synthetic */ akpt c;
    private final List d;

    public aksf(akpt akpt, List list, akpd akpd, List list2) {
        this.c = akpt;
        this.a = akpd;
        this.b = list2;
        this.d = list;
    }

    private static assr a(akri akri) {
        aucd o = assr.e.o();
        String str = akri.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        assr assr = (assr) o.b;
        str.getClass();
        assr.a |= 1;
        assr.b = str;
        aucd o2 = avoq.c.o();
        double d2 = akri.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avoq avoq = (avoq) o2.b;
        avoq.a = d2;
        avoq.b = akri.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        assr assr2 = (assr) o.b;
        avoq avoq2 = (avoq) o2.i();
        avoq2.getClass();
        assr2.c = avoq2;
        assr2.a |= 2;
        float f = (float) azbk.f();
        if (o.c) {
            o.c();
            o.c = false;
        }
        assr assr3 = (assr) o.b;
        assr3.a |= 4;
        assr3.d = f;
        return (assr) o.i();
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r11) {
        /*
            r10 = this;
            java.util.List r11 = (java.util.List) r11
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x000b:
            boolean r1 = r11.hasNext()
            r2 = 5
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r11.next()
            assr r1 = (defpackage.assr) r1
            int r3 = r1.a
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0024
            java.lang.String r2 = r1.b
            r0.put(r2, r1)
            goto L_0x000b
        L_0x0024:
            java.lang.String r1 = "Places"
            boolean r2 = android.util.Log.isLoggable(r1, r2)
            if (r2 == 0) goto L_0x000b
            java.lang.String r2 = "Server sent a NearbyAlertData with null placeId"
            defpackage.alfy.c(r1, r2)
            goto L_0x000b
        L_0x0033:
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.List r1 = r10.d
            int r1 = r1.size()
            r11.<init>(r1)
            java.util.List r1 = r10.d
            java.util.Iterator r1 = r1.iterator()
        L_0x0044:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00c2
            java.lang.Object r3 = r1.next()
            akri r3 = (defpackage.akri) r3
            java.lang.String r4 = r3.a
            boolean r4 = r0.containsKey(r4)
            if (r4 == 0) goto L_0x00ba
            java.lang.String r4 = r3.a
            java.lang.Object r4 = r0.get(r4)
            assr r4 = (defpackage.assr) r4
            int r5 = r4.a
            r5 = r5 & 2
            if (r5 != 0) goto L_0x00b5
            java.lang.Object r5 = r4.c(r2)
            aucd r5 = (defpackage.aucd) r5
            r5.a((defpackage.aucj) r4)
            avoq r4 = defpackage.avoq.c
            aucd r4 = r4.o()
            double r6 = r3.b
            boolean r8 = r4.c
            r9 = 0
            if (r8 != 0) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            r4.c()
            r4.c = r9
        L_0x0082:
            aucj r8 = r4.b
            avoq r8 = (defpackage.avoq) r8
            r8.a = r6
            double r6 = r3.c
            r8.b = r6
            boolean r3 = r5.c
            if (r3 != 0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            r5.c()
            r5.c = r9
        L_0x0096:
            aucj r3 = r5.b
            assr r3 = (defpackage.assr) r3
            aucj r4 = r4.i()
            avoq r4 = (defpackage.avoq) r4
            assr r6 = defpackage.assr.e
            r4.getClass()
            r3.c = r4
            int r4 = r3.a
            r4 = r4 | 2
            r3.a = r4
            aucj r3 = r5.i()
            r4 = r3
            assr r4 = (defpackage.assr) r4
            goto L_0x00b6
        L_0x00b5:
        L_0x00b6:
            r11.add(r4)
            goto L_0x0044
        L_0x00ba:
            assr r3 = a((defpackage.akri) r3)
            r11.add(r3)
            goto L_0x0044
        L_0x00c2:
            r10.a((java.util.List) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aksf.a(java.lang.Object):void");
    }

    public final void a(Throwable th) {
        int i;
        if (th instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) th;
            jad.a(volleyError, "Places");
            i = aksc.a(volleyError);
        } else {
            i = 13;
        }
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("onFailure StatusCode: ");
            sb.append(i);
            sb.append(", Cause: ");
            sb.append(valueOf);
            alfy.c("Places", sb.toString());
            alfy.c("Places", "Falling back to default radius for all places");
        }
        ArrayList arrayList = new ArrayList();
        for (akri a2 : this.d) {
            arrayList.add(a(a2));
        }
        a((List) arrayList);
    }

    public final void a(List list) {
        if (this.c.a.contains(this.a)) {
            List<akri> list2 = this.b;
            HashMap hashMap = new HashMap();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                assr assr = (assr) list.get(i);
                hashMap.put(assr.b, Float.valueOf(assr.d));
            }
            for (akri akri : list2) {
                String str = akri.a;
                akri.d = hashMap.containsKey(str) ? ((Float) hashMap.get(str)).floatValue() : 80.0f;
            }
            this.c.i.a(this.a, this.b);
        }
    }
}
