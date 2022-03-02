package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: vbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vbp {
    public static final vbo a = vbh.a;
    public static final vbo b = vbi.a;
    public static final vbo c = vbj.a;
    public final vbt d;
    public final uyt e;
    public final vak f;
    public final val g = new val(this.h, "nearby_messages", "nearby_background_messages.db");
    private final Context h;
    private final uyz i;
    private final uyc j;

    public vbp(Context context) {
        this.h = context;
        vak vak = (vak) thl.a(context, vak.class);
        this.f = vak;
        vak.a((vaj) new vbk(this));
        uyt uyt = (uyt) thl.a(context, uyt.class);
        this.e = uyt;
        uyt.a((uys) new vbl(this));
        this.d = new vbt(context, new vbg(this));
        this.i = (uyz) thl.a(context, uyz.class);
        this.j = (uyc) thl.a(this.h, uyc.class);
    }

    public static NearbyDevice a(vai vai) {
        return new NearbyDevice(vai.a, vai.b);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Integer] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(defpackage.avae r10) {
        /*
            java.lang.String r0 = "null"
            if (r10 == 0) goto L_0x00c8
            auzr r1 = r10.c
            if (r1 != 0) goto L_0x000a
            auzr r1 = defpackage.auzr.e
        L_0x000a:
            if (r1 == 0) goto L_0x004e
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r4 = r1.a
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x001c
            auzu r4 = r1.b
            if (r4 != 0) goto L_0x001d
            auzu r4 = defpackage.auzu.d
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            r6 = 0
            if (r4 == 0) goto L_0x0031
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r8 = r4.b
            r7[r6] = r8
            java.lang.String r4 = r4.c
            r7[r5] = r4
            java.lang.String r4 = "%s/%s"
            java.lang.String r4 = java.lang.String.format(r4, r7)
            goto L_0x0032
        L_0x0031:
            r4 = r0
        L_0x0032:
            r3[r6] = r4
            int r4 = r1.a
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0044
            auay r0 = r1.c
            int r0 = r0.a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0045
        L_0x0044:
        L_0x0045:
            r3[r5] = r0
            java.lang.String r0 = "Message{type=%s, payload=<%s bytes>}"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            aucx r1 = r10.b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            aucx r2 = r10.d
            java.lang.String r2 = defpackage.uzu.a((java.lang.Iterable) r2)
            aucx r3 = r10.e
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r10 = r10.f
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r2)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r10)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r4 = r4 + 80
            int r4 = r4 + r5
            int r4 = r4 + r6
            int r4 = r4 + r7
            int r4 = r4 + r8
            r9.<init>(r4)
            java.lang.String r4 = "SubscribedMessage{publishedMessage="
            r9.append(r4)
            r9.append(r0)
            java.lang.String r0 = ", subscriptionIds="
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = ", beaconIds="
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = ", urls="
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = ", etag="
            r9.append(r0)
            r9.append(r10)
            java.lang.String r10 = "}"
            r9.append(r10)
            java.lang.String r10 = r9.toString()
            return r10
        L_0x00c8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbp.b(avae):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0209 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.google.android.gms.nearby.messages.ClientAppIdentifier r12, defpackage.aucf r13) {
        /*
            r11 = this;
            vbt r0 = r11.d
            vbu r0 = r0.a(r12)
            r1 = 0
            r0.f = r1
            jjg r0 = defpackage.tgc.a
            aucj r0 = r13.i()
            avae r0 = (defpackage.avae) r0
            b((defpackage.avae) r0)
            vbt r0 = r11.d
            vbu r0 = r0.a(r12)
            boolean r1 = defpackage.aync.i()
            r2 = 0
            if (r1 != 0) goto L_0x006b
            aucj r1 = r13.b
            avae r1 = (defpackage.avae) r1
            aucx r1 = r1.b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            uyt r3 = r0.b
            r3.getClass()
            vbq r4 = new vbq
            r4.<init>(r3)
            java.util.Collection r3 = defpackage.amxi.a((java.util.Collection) r1, (defpackage.amrm) r4)
            r3.size()
            r1.size()
            boolean r1 = r13.c
            if (r1 != 0) goto L_0x0044
            goto L_0x0049
        L_0x0044:
            r13.c()
            r13.c = r2
        L_0x0049:
            aucj r1 = r13.b
            avae r1 = (defpackage.avae) r1
            avae r4 = defpackage.avae.h
            aucx r4 = defpackage.aucj.s()
            r1.b = r4
            r13.a((java.lang.Iterable) r3)
            aucj r1 = r13.b
            avae r1 = (defpackage.avae) r1
            aucx r1 = r1.b
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0065
            goto L_0x006b
        L_0x0065:
            java.util.Set r0 = java.util.Collections.emptySet()
            goto L_0x00e7
        L_0x006b:
            boolean r1 = defpackage.aync.h()
            if (r1 != 0) goto L_0x0083
            aucj r1 = r13.i()
            avae r1 = (defpackage.avae) r1
            boolean r1 = r0.a((defpackage.avae) r1)
            if (r1 != 0) goto L_0x007e
            goto L_0x0083
        L_0x007e:
            java.util.Set r0 = java.util.Collections.emptySet()
            goto L_0x00e7
        L_0x0083:
            oi r0 = r0.a
            aucj r1 = r13.b
            avae r1 = (defpackage.avae) r1
            auzr r1 = r1.c
            if (r1 != 0) goto L_0x008f
            auzr r1 = defpackage.auzr.e
        L_0x008f:
            aucj r3 = r13.i()
            avae r3 = (defpackage.avae) r3
            java.lang.Object r0 = r0.a((java.lang.Object) r1, (java.lang.Object) r3)
            avae r0 = (defpackage.avae) r0
            boolean r1 = defpackage.aync.i()
            if (r1 != 0) goto L_0x00da
            java.util.HashSet r1 = new java.util.HashSet
            aucj r3 = r13.b
            avae r3 = (defpackage.avae) r3
            aucx r3 = r3.b
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.<init>(r3)
            if (r0 == 0) goto L_0x00d7
            aucx r0 = r0.b
            r1.removeAll(r0)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r1)
            r3.addAll(r0)
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x00c4
            goto L_0x00c9
        L_0x00c4:
            r13.c()
            r13.c = r2
        L_0x00c9:
            aucj r0 = r13.b
            avae r0 = (defpackage.avae) r0
            aucx r4 = defpackage.aucj.s()
            r0.b = r4
            r13.a((java.lang.Iterable) r3)
            goto L_0x00d8
        L_0x00d7:
        L_0x00d8:
            r0 = r1
            goto L_0x00e7
        L_0x00da:
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = "0"
            java.util.Set r0 = java.util.Collections.singleton(r0)
            goto L_0x00e7
        L_0x00e3:
            java.util.Set r0 = java.util.Collections.emptySet()
        L_0x00e7:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0209
            vdx r1 = new vdx
            r1.<init>()
            aucj r3 = r13.i()
            avae r3 = (defpackage.avae) r3
            com.google.android.gms.nearby.messages.Message r3 = r11.a((defpackage.avae) r3)
            r1.b = r3
            r1.c()
            vak r3 = r11.f
            aucj r4 = r13.b
            avae r4 = (defpackage.avae) r4
            aucx r4 = r4.d
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            java.util.List r3 = r3.b(r4)
            vak r4 = r11.f
            aucj r5 = r13.b
            avae r5 = (defpackage.avae) r5
            aucx r5 = r5.e
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)
            arwg r6 = r4.l
            r6.b()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x012b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x015b
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map r8 = r4.g
            java.util.Collection r8 = r8.values()
            java.util.Iterator r8 = r8.iterator()
        L_0x0141:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x012b
            java.lang.Object r9 = r8.next()
            vai r9 = (defpackage.vai) r9
            java.util.Set r10 = r9.c()
            boolean r10 = r10.contains(r7)
            if (r10 == 0) goto L_0x0141
            r6.add(r9)
            goto L_0x0141
        L_0x015b:
            java.util.Collections.sort(r6)
            r3.addAll(r6)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x01f3
            java.lang.Object r2 = r3.get(r2)
            vai r2 = (defpackage.vai) r2
            com.google.android.gms.nearby.messages.devices.NearbyDevice r3 = a((defpackage.vai) r2)
            r1.a((com.google.android.gms.nearby.messages.devices.NearbyDevice) r3)
            aucj r3 = r13.b
            avae r3 = (defpackage.avae) r3
            avah r3 = r3.g
            if (r3 == 0) goto L_0x017d
            goto L_0x017f
        L_0x017d:
            avah r3 = defpackage.avah.b
        L_0x017f:
            double r3 = r3.a
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0195
            boolean r5 = r2.a()
            if (r5 == 0) goto L_0x0194
            double r5 = r2.g
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0194
            goto L_0x0195
        L_0x0194:
            return
        L_0x0195:
            boolean r3 = r2.a()
            if (r3 != 0) goto L_0x019c
            goto L_0x01a6
        L_0x019c:
            com.google.android.gms.nearby.messages.internal.DistanceImpl r3 = new com.google.android.gms.nearby.messages.internal.DistanceImpl
            double r4 = r2.g
            r3.<init>(r4)
            r1.a((com.google.android.gms.nearby.messages.internal.DistanceImpl) r3)
        L_0x01a6:
            aucj r3 = r13.b
            avae r3 = (defpackage.avae) r3
            aucx r3 = r3.d
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x01b4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01c9
            java.lang.Object r4 = r3.next()
            auzf r4 = (defpackage.auzf) r4
            com.google.android.gms.nearby.messages.internal.BleSignalImpl r4 = r2.a((defpackage.auzf) r4)
            if (r4 == 0) goto L_0x01b4
            r1.a((com.google.android.gms.nearby.messages.internal.BleSignalImpl) r4)
        L_0x01c9:
            aucj r13 = r13.b
            avae r13 = (defpackage.avae) r13
            aucx r13 = r13.e
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            java.util.Iterator r13 = r13.iterator()
        L_0x01d7:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x01ec
            java.lang.Object r3 = r13.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.nearby.messages.internal.BleSignalImpl r3 = r2.a((java.lang.String) r3)
            if (r3 == 0) goto L_0x01d7
            r1.a((com.google.android.gms.nearby.messages.internal.BleSignalImpl) r3)
        L_0x01ec:
            uzx r13 = r2.h()
            r1.a((defpackage.uzx) r13)
        L_0x01f3:
            boolean r13 = defpackage.aync.i()
            if (r13 == 0) goto L_0x0201
            com.google.android.gms.nearby.messages.internal.Update r13 = r1.a()
            r11.a((com.google.android.gms.nearby.messages.internal.Update) r13, (com.google.android.gms.nearby.messages.ClientAppIdentifier) r12)
            return
        L_0x0201:
            com.google.android.gms.nearby.messages.internal.Update r12 = r1.a()
            r11.a((com.google.android.gms.nearby.messages.internal.Update) r12, (java.util.Set) r0)
            return
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbp.a(com.google.android.gms.nearby.messages.ClientAppIdentifier, aucf):void");
    }

    private final void b(Update update, uyq uyq) {
        ClientAppIdentifier a2;
        if (aynf.b() && ((anih) tgc.a.d()).l()) {
            if (update.a(1)) {
                ((anih) ((anih) tgc.a.d()).a("vbp", "b", 334, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s found %s", (Object) "MessageHandler: ", (Object) update.a());
            } else if (update.a(2)) {
                ((anih) ((anih) tgc.a.d()).a("vbp", "b", 336, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s lost %s", (Object) "MessageHandler: ", (Object) update.a());
            }
        }
        if (update.a(1) && (a2 = this.e.a(uyq)) != null) {
            uyb uyb = new uyb(a2, 6);
            uyc uyc = this.j;
            Message message = update.c;
            List singletonList = Collections.singletonList(uyq.a);
            aucd o = auwz.n.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwz auwz = (auwz) o.b;
            auwz.b = 5;
            auwz.a |= 1;
            int a3 = uyb.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwz auwz2 = (auwz) o.b;
            auwz2.a = 2 | auwz2.a;
            auwz2.c = a3;
            auwp auwp = (auwp) auwq.d.o();
            auxm a4 = uyc.a(message);
            if (auwp.c) {
                auwp.c();
                auwp.c = false;
            }
            auwq auwq = (auwq) auwp.b;
            a4.getClass();
            auwq.b = a4;
            auwq.a |= 1;
            auwp.a(singletonList);
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwz auwz3 = (auwz) o.b;
            auwq auwq2 = (auwq) auwp.i();
            auwq2.getClass();
            auwz3.l = auwq2;
            auwz3.a |= 1024;
            uyc.a(uyb, (auwz) o.i());
        }
    }

    public final val b(ClientAppIdentifier clientAppIdentifier) {
        vbu a2 = this.d.a(clientAppIdentifier);
        if (a2.e == null) {
            Context context = a2.c;
            String valueOf = String.valueOf(a2.d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append(valueOf);
            sb.append("_nearby_background_messages.db");
            a2.e = new val(context, "nearby_messages", sb.toString());
        }
        return a2.e;
    }

    private final void a(Update update, ClientAppIdentifier clientAppIdentifier) {
        for (uyq uyq : this.e.a(clientAppIdentifier)) {
            if (uyq.c.a(update.c)) {
                a(update, uyq);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v26, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.google.android.gms.nearby.messages.internal.Update r18, java.util.Collection r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.Iterator r2 = r19.iterator()
        L_0x0008:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0257
            java.lang.Object r3 = r2.next()
            uyq r3 = (defpackage.uyq) r3
            com.google.android.gms.nearby.messages.Message r4 = r1.c
            uyt r5 = r0.e
            com.google.android.gms.nearby.messages.ClientAppIdentifier r5 = r5.a((defpackage.uyq) r3)
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0027
            r8 = 3
            boolean r8 = r5.a((int) r8)
            if (r8 != 0) goto L_0x003e
        L_0x0027:
            com.google.android.gms.nearby.messages.Message r8 = new com.google.android.gms.nearby.messages.Message
            byte[] r10 = r4.b
            java.lang.String r11 = r4.d
            java.lang.String r12 = r4.c
            com.google.android.gms.nearby.messages.devices.NearbyDevice[] r13 = new com.google.android.gms.nearby.messages.devices.NearbyDevice[r7]
            com.google.android.gms.nearby.messages.devices.NearbyDevice r4 = r4.c()
            r13[r6] = r4
            r14 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            r4 = r8
        L_0x003e:
            com.google.android.gms.nearby.messages.Message r8 = r1.c
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0052
            vdx r8 = new vdx
            r8.<init>(r1)
            r8.b = r4
            com.google.android.gms.nearby.messages.internal.Update r4 = r8.a()
            goto L_0x0053
        L_0x0052:
            r4 = r1
        L_0x0053:
            uyp r8 = r3.b
            android.content.Context r9 = r0.h
            boolean r8 = r8.a((android.content.Context) r9, (com.google.android.gms.nearby.messages.internal.Update) r4)
            r9 = 5
            r10 = 2
            if (r8 != 0) goto L_0x0066
            uyt r4 = r0.e
            r4.b((defpackage.uyq) r3)
            goto L_0x0158
        L_0x0066:
            boolean r8 = defpackage.aync.i()
            if (r8 == 0) goto L_0x0071
            val r5 = r0.b((com.google.android.gms.nearby.messages.ClientAppIdentifier) r5)
            goto L_0x0073
        L_0x0071:
            val r5 = r0.g
        L_0x0073:
            boolean r8 = defpackage.aync.i()
            if (r8 != 0) goto L_0x007c
            java.lang.String r8 = r3.a
            goto L_0x007e
        L_0x007c:
            java.lang.String r8 = "0"
        L_0x007e:
            boolean r11 = r3.a()
            if (r11 == 0) goto L_0x0158
            boolean r11 = r4.a(r7)
            if (r11 != 0) goto L_0x00f5
            boolean r11 = r4.a(r10)
            if (r11 == 0) goto L_0x0158
            com.google.android.gms.nearby.messages.Message r4 = r4.c
            java.lang.String r4 = defpackage.val.a((com.google.android.gms.nearby.messages.Message) r4)
            java.lang.Object r11 = r5.a((java.lang.String) r4)
            avae r11 = (defpackage.avae) r11
            if (r11 == 0) goto L_0x0158
            java.lang.Object r12 = r11.c(r9)
            aucd r12 = (defpackage.aucd) r12
            r12.a((defpackage.aucj) r11)
            aucf r12 = (defpackage.aucf) r12
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            r12.c()
            r12.c = r6
        L_0x00b3:
            aucj r13 = r12.b
            avae r13 = (defpackage.avae) r13
            aucx r14 = defpackage.aucj.s()
            r13.b = r14
            aucx r11 = r11.b
            int r13 = r11.size()
            r14 = 0
        L_0x00c4:
            if (r14 < r13) goto L_0x00e2
            aucj r8 = r12.b
            avae r8 = (defpackage.avae) r8
            aucx r8 = r8.b
            int r8 = r8.size()
            if (r8 == 0) goto L_0x00dd
            aucj r8 = r12.i()
            avae r8 = (defpackage.avae) r8
            r5.a(r4, r8)
            goto L_0x0158
        L_0x00dd:
            r5.b((java.lang.String) r4)
            goto L_0x0158
        L_0x00e2:
            java.lang.Object r15 = r11.get(r14)
            java.lang.String r15 = (java.lang.String) r15
            boolean r16 = r8.equals(r15)
            if (r16 == 0) goto L_0x00ef
            goto L_0x00f2
        L_0x00ef:
            r12.a((java.lang.String) r15)
        L_0x00f2:
            int r14 = r14 + 1
            goto L_0x00c4
        L_0x00f5:
            com.google.android.gms.nearby.messages.Message r4 = r4.c
            java.lang.String r11 = defpackage.val.a((com.google.android.gms.nearby.messages.Message) r4)
            java.lang.Object r12 = r5.a((java.lang.String) r11)
            avae r12 = (defpackage.avae) r12
            if (r12 != 0) goto L_0x012f
            avae r12 = defpackage.avae.h
            aucd r12 = r12.o()
            aucf r12 = (defpackage.aucf) r12
            auzr r4 = defpackage.vem.a((com.google.android.gms.nearby.messages.Message) r4)
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x0114
            goto L_0x0119
        L_0x0114:
            r12.c()
            r12.c = r6
        L_0x0119:
            aucj r13 = r12.b
            avae r13 = (defpackage.avae) r13
            r4.getClass()
            r13.c = r4
            int r4 = r13.a
            r4 = r4 | r7
            r13.a = r4
            aucj r4 = r12.i()
            r12 = r4
            avae r12 = (defpackage.avae) r12
            goto L_0x0130
        L_0x012f:
        L_0x0130:
            java.lang.Object r4 = r12.c(r9)
            aucd r4 = (defpackage.aucd) r4
            r4.a((defpackage.aucj) r12)
            aucf r4 = (defpackage.aucf) r4
            aucj r12 = r4.b
            avae r12 = (defpackage.avae) r12
            aucx r12 = r12.b
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            boolean r12 = r12.contains(r8)
            if (r12 != 0) goto L_0x014f
            r4.a((java.lang.String) r8)
        L_0x014f:
            aucj r4 = r4.i()
            avae r4 = (defpackage.avae) r4
            r5.a(r11, r4)
        L_0x0158:
            boolean r4 = defpackage.aynf.b()
            if (r4 == 0) goto L_0x01b4
            jjg r4 = defpackage.tgc.a
            anie r4 = r4.d()
            anih r4 = (defpackage.anih) r4
            boolean r4 = r4.l()
            if (r4 == 0) goto L_0x01b4
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r5 = "b"
            java.lang.String r8 = "vbp"
            boolean r11 = r1.a(r7)
            java.lang.String r12 = "MessageHandler: "
            if (r11 == 0) goto L_0x0194
            jjg r11 = defpackage.tgc.a
            anie r11 = r11.d()
            anih r11 = (defpackage.anih) r11
            r13 = 334(0x14e, float:4.68E-43)
            anie r4 = r11.a((java.lang.String) r8, (java.lang.String) r5, (int) r13, (java.lang.String) r4)
            anih r4 = (defpackage.anih) r4
            java.lang.String r5 = r18.a()
            java.lang.String r8 = "%s found %s"
            r4.a((java.lang.String) r8, (java.lang.Object) r12, (java.lang.Object) r5)
            goto L_0x01b4
        L_0x0194:
            boolean r11 = r1.a(r10)
            if (r11 == 0) goto L_0x01b4
            jjg r11 = defpackage.tgc.a
            anie r11 = r11.d()
            anih r11 = (defpackage.anih) r11
            r13 = 336(0x150, float:4.71E-43)
            anie r4 = r11.a((java.lang.String) r8, (java.lang.String) r5, (int) r13, (java.lang.String) r4)
            anih r4 = (defpackage.anih) r4
            java.lang.String r5 = r18.a()
            java.lang.String r8 = "%s lost %s"
            r4.a((java.lang.String) r8, (java.lang.Object) r12, (java.lang.Object) r5)
        L_0x01b4:
            boolean r4 = r1.a(r7)
            if (r4 == 0) goto L_0x0008
            uyt r4 = r0.e
            com.google.android.gms.nearby.messages.ClientAppIdentifier r4 = r4.a((defpackage.uyq) r3)
            if (r4 == 0) goto L_0x0008
            uyb r5 = new uyb
            r8 = 6
            r5.<init>(r4, r8)
            uyc r4 = r0.j
            com.google.android.gms.nearby.messages.Message r8 = r1.c
            java.lang.String r3 = r3.a
            java.util.List r3 = java.util.Collections.singletonList(r3)
            auwz r11 = defpackage.auwz.n
            aucd r11 = r11.o()
            boolean r12 = r11.c
            if (r12 == 0) goto L_0x01e2
            r11.c()
            r11.c = r6
        L_0x01e2:
            aucj r12 = r11.b
            auwz r12 = (defpackage.auwz) r12
            r12.b = r9
            int r9 = r12.a
            r9 = r9 | r7
            r12.a = r9
            int r9 = r5.a()
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x01f6
            goto L_0x01fb
        L_0x01f6:
            r11.c()
            r11.c = r6
        L_0x01fb:
            aucj r12 = r11.b
            auwz r12 = (defpackage.auwz) r12
            int r13 = r12.a
            r10 = r10 | r13
            r12.a = r10
            r12.c = r9
            auwq r9 = defpackage.auwq.d
            aucd r9 = r9.o()
            auwp r9 = (defpackage.auwp) r9
            auxm r8 = r4.a((com.google.android.gms.nearby.messages.Message) r8)
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x0217
            goto L_0x021c
        L_0x0217:
            r9.c()
            r9.c = r6
        L_0x021c:
            aucj r10 = r9.b
            auwq r10 = (defpackage.auwq) r10
            r8.getClass()
            r10.b = r8
            int r8 = r10.a
            r7 = r7 | r8
            r10.a = r7
            r9.a(r3)
            boolean r3 = r11.c
            if (r3 != 0) goto L_0x0232
            goto L_0x0237
        L_0x0232:
            r11.c()
            r11.c = r6
        L_0x0237:
            aucj r3 = r11.b
            auwz r3 = (defpackage.auwz) r3
            aucj r6 = r9.i()
            auwq r6 = (defpackage.auwq) r6
            r6.getClass()
            r3.l = r6
            int r6 = r3.a
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r3.a = r6
            aucj r3 = r11.i()
            auwz r3 = (defpackage.auwz) r3
            r4.a((defpackage.uyb) r5, (defpackage.auwz) r3)
            goto L_0x0008
        L_0x0257:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbp.a(com.google.android.gms.nearby.messages.internal.Update, java.util.Collection):void");
    }

    private final void a(Update update, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            uyq a2 = this.e.a((String) it.next());
            if (a2 == null) {
                jjg jjg = tgc.a;
            } else {
                hashSet.add(a2);
            }
        }
        a(update, (Collection) hashSet);
    }

    private final avae[] a(avae[] avaeArr) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (avae avae : avaeArr) {
            auzr auzr = avae.c;
            if (auzr == null) {
                auzr = auzr.e;
            }
            auzu auzu = auzr.b;
            if (auzu == null) {
                auzu = auzu.d;
            }
            if ("com.google.nearby.discoverer".equals(auzu.b)) {
                try {
                    auzr auzr2 = avae.c;
                    if (auzr2 == null) {
                        auzr2 = auzr.e;
                    }
                    auzv auzv = (auzv) aucj.a((aucj) auzv.x, auzr2.c);
                    int i2 = 5;
                    aucd aucd = (aucd) auzv.c(5);
                    aucd.a((aucj) auzv);
                    avbx a2 = avbx.a(((auzv) ((aucf) aucd).b).b);
                    if (a2 == null) {
                        a2 = avbx.NEARBY_TYPE_UNKNOWN;
                    }
                    if (a2 == avbx.NEARBY_DEVICE) {
                        try {
                            Set<vai> a3 = this.f.a((auzf[]) avae.d.toArray(new auzf[0]));
                            if (a3.size() > 1) {
                                int i3 = 1;
                                for (vai vai : a3) {
                                    aucf aucf = (aucf) auzv.x.o();
                                    auzr auzr3 = avae.c;
                                    if (auzr3 == null) {
                                        auzr3 = auzr.e;
                                    }
                                    aucf.b(auzr3.c.k(), aubs.c());
                                    avae avae2 = (avae) aucj.a((aucj) avae.h, avae.k());
                                    aucd aucd2 = (aucd) avae2.c(i2);
                                    aucd2.a((aucj) avae2);
                                    aucf aucf2 = (aucf) aucd2;
                                    String str2 = ((auzv) aucf.b).c;
                                    String str3 = vai.b;
                                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                                    sb.append(str2);
                                    sb.append("_");
                                    sb.append(str3);
                                    String sb2 = sb.toString();
                                    if (aucf.c) {
                                        aucf.c();
                                        aucf.c = false;
                                    }
                                    auzv auzv2 = (auzv) aucf.b;
                                    sb2.getClass();
                                    auzv2.a |= 2;
                                    auzv2.c = sb2;
                                    if (aymw.m()) {
                                        str = ((auzv) aucf.b).d;
                                    } else {
                                        String str4 = ((auzv) aucf.b).d;
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 14);
                                        sb3.append("(");
                                        sb3.append(i3);
                                        sb3.append(") ");
                                        sb3.append(str4);
                                        str = sb3.toString();
                                    }
                                    if (aucf.c) {
                                        aucf.c();
                                        aucf.c = false;
                                    }
                                    auzv auzv3 = (auzv) aucf.b;
                                    str.getClass();
                                    auzv3.a |= 4;
                                    auzv3.d = str;
                                    if (aucf2.c) {
                                        aucf2.c();
                                        aucf2.c = false;
                                    }
                                    ((avae) aucf2.b).d = aucj.s();
                                    aucf2.a(vai.i());
                                    auzr auzr4 = ((avae) aucf2.b).c;
                                    if (auzr4 == null) {
                                        auzr4 = auzr.e;
                                    }
                                    aucd aucd3 = (aucd) auzr4.c(5);
                                    aucd3.a((aucj) auzr4);
                                    auay au = ((auzv) aucf.i()).au();
                                    if (aucd3.c) {
                                        aucd3.c();
                                        aucd3.c = false;
                                    }
                                    auzr auzr5 = (auzr) aucd3.b;
                                    au.getClass();
                                    auzr5.a |= 2;
                                    auzr5.c = au;
                                    if (aucf2.c) {
                                        aucf2.c();
                                        aucf2.c = false;
                                    }
                                    avae avae3 = (avae) aucf2.b;
                                    auzr auzr6 = (auzr) aucd3.i();
                                    auzr6.getClass();
                                    avae3.c = auzr6;
                                    avae3.a |= 1;
                                    arrayList.add((avae) aucf2.i());
                                    i3++;
                                    i2 = 5;
                                }
                            }
                        } catch (auda e2) {
                            e = e2;
                            anih anih = (anih) tgc.a.b();
                            anih.a((Throwable) e);
                            ((anih) anih.a("vbp", "a", 726, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Parsing proto message from bytes failed, skipping.");
                        }
                    }
                } catch (auda e3) {
                    e = e3;
                    anih anih2 = (anih) tgc.a.b();
                    anih2.a((Throwable) e);
                    ((anih) anih2.a("vbp", "a", 726, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Parsing proto message from bytes failed, skipping.");
                }
            }
            arrayList.add(avae);
        }
        return (avae[]) arrayList.toArray(new avae[0]);
    }

    public final Message a(avae avae) {
        auzr auzr = avae.c;
        if (auzr == null) {
            auzr = auzr.e;
        }
        List b2 = this.f.b(avae.d);
        NearbyDevice[] nearbyDeviceArr = new NearbyDevice[b2.size()];
        for (int i2 = 0; i2 < b2.size(); i2++) {
            nearbyDeviceArr[i2] = a((vai) b2.get(i2));
        }
        return vem.a(auzr, nearbyDeviceArr);
    }

    public final String a(ClientAppIdentifier clientAppIdentifier) {
        return this.d.a(clientAppIdentifier).f;
    }

    public final void a(int i2, vai vai, Map map, Map map2, vbo vbo) {
        Message a2;
        for (Object next : map.keySet()) {
            vdx vdx = new vdx();
            if (vak.a(i2, 4)) {
                vdx.a(new DistanceImpl(vai.g));
            }
            if (vak.a(i2, 16)) {
                BleSignalImpl bleSignalImpl = (BleSignalImpl) map2.get(next);
                if (!ius.a((BleSignalImpl) map.get(next), bleSignalImpl)) {
                    vdx.a(bleSignalImpl);
                }
            }
            if (!vdx.b() && (a2 = vbo.a(next, a(vai))) != null) {
                vdx.b = a2;
                a(vdx.a(), (uyq) null);
            }
        }
    }

    public final void a(aucf aucf) {
        HashSet<ClientAppIdentifier> hashSet = new HashSet<>();
        for (String a2 : Collections.unmodifiableList(((avae) aucf.b).b)) {
            uyt uyt = this.e;
            ClientAppIdentifier a3 = uyt.a(uyt.a(a2));
            if (a3 != null) {
                hashSet.add(a3);
            }
        }
        for (ClientAppIdentifier a4 : hashSet) {
            a(a4, aucf);
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.nearby.messages.ClientAppIdentifier r19, defpackage.avae[] r20, java.lang.String r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            jjg r3 = defpackage.tgc.a
            r3 = 0
            if (r0 == 0) goto L_0x0023
            int r4 = r0.length
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r6 = 0
        L_0x0012:
            if (r6 >= r4) goto L_0x0020
            r7 = r0[r6]
            java.lang.String r7 = b((defpackage.avae) r7)
            r5.add(r7)
            int r6 = r6 + 1
            goto L_0x0012
        L_0x0020:
            r5.toString()
        L_0x0023:
            if (r0 == 0) goto L_0x0027
            r4 = r0
            goto L_0x002a
        L_0x0027:
            avae[] r0 = new defpackage.avae[r3]
            r4 = r0
        L_0x002a:
            android.content.Context r0 = r1.h
            boolean r0 = defpackage.tga.a((android.content.Context) r0)
            r5 = 5
            if (r0 == 0) goto L_0x0240
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r4.length
            r8 = 0
        L_0x003a:
            if (r8 < r7) goto L_0x0048
            avae[] r0 = new defpackage.avae[r3]
            java.lang.Object[] r0 = r6.toArray(r0)
            r4 = r0
            avae[] r4 = (defpackage.avae[]) r4
            r5 = 0
            goto L_0x0241
        L_0x0048:
            r0 = r4[r8]
            auzr r9 = r0.c
            if (r9 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            auzr r9 = defpackage.auzr.e
        L_0x0051:
            auzu r9 = r9.b
            if (r9 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            auzu r9 = defpackage.auzu.d
        L_0x0058:
            java.lang.String r9 = r9.b
            java.lang.String r10 = "com.google.nearby.discoverer"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0236
            auzr r9 = r0.c     // Catch:{ auda -> 0x0215 }
            if (r9 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            auzr r9 = defpackage.auzr.e     // Catch:{ auda -> 0x0215 }
        L_0x0069:
            auay r9 = r9.c     // Catch:{ auda -> 0x0215 }
            auzv r10 = defpackage.auzv.x     // Catch:{ auda -> 0x0215 }
            aucj r9 = defpackage.aucj.a((defpackage.aucj) r10, (defpackage.auay) r9)     // Catch:{ auda -> 0x0215 }
            auzv r9 = (defpackage.auzv) r9     // Catch:{ auda -> 0x0215 }
            java.lang.Object r10 = r9.c(r5)     // Catch:{ auda -> 0x0215 }
            aucd r10 = (defpackage.aucd) r10     // Catch:{ auda -> 0x0215 }
            r10.a((defpackage.aucj) r9)     // Catch:{ auda -> 0x0215 }
            aucf r10 = (defpackage.aucf) r10     // Catch:{ auda -> 0x0215 }
            aucj r9 = r10.b     // Catch:{ auda -> 0x0215 }
            auzv r9 = (defpackage.auzv) r9     // Catch:{ auda -> 0x0215 }
            int r9 = r9.b     // Catch:{ auda -> 0x0215 }
            avbx r9 = defpackage.avbx.a(r9)     // Catch:{ auda -> 0x0215 }
            if (r9 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            avbx r9 = defpackage.avbx.NEARBY_TYPE_UNKNOWN     // Catch:{ auda -> 0x0215 }
        L_0x008d:
            avbx r10 = defpackage.avbx.NEARBY_DEVICE     // Catch:{ auda -> 0x0215 }
            if (r9 != r10) goto L_0x0213
            vak r9 = r1.f     // Catch:{ auda -> 0x0215 }
            aucx r10 = r0.d     // Catch:{ auda -> 0x0215 }
            auzf[] r11 = new defpackage.auzf[r3]     // Catch:{ auda -> 0x0215 }
            java.lang.Object[] r10 = r10.toArray(r11)     // Catch:{ auda -> 0x0215 }
            auzf[] r10 = (defpackage.auzf[]) r10     // Catch:{ auda -> 0x0215 }
            java.util.Set r9 = r9.a((defpackage.auzf[]) r10)     // Catch:{ auda -> 0x0215 }
            int r10 = r9.size()     // Catch:{ auda -> 0x0215 }
            r11 = 1
            if (r10 <= r11) goto L_0x0211
            java.util.Iterator r9 = r9.iterator()     // Catch:{ auda -> 0x0215 }
            r10 = 1
        L_0x00ad:
            boolean r12 = r9.hasNext()     // Catch:{ auda -> 0x0215 }
            if (r12 == 0) goto L_0x020f
            java.lang.Object r12 = r9.next()     // Catch:{ auda -> 0x0215 }
            vai r12 = (defpackage.vai) r12     // Catch:{ auda -> 0x0215 }
            auzv r13 = defpackage.auzv.x     // Catch:{ auda -> 0x0215 }
            aucd r13 = r13.o()     // Catch:{ auda -> 0x0215 }
            aucf r13 = (defpackage.aucf) r13     // Catch:{ auda -> 0x0215 }
            auzr r14 = r0.c     // Catch:{ auda -> 0x0215 }
            if (r14 == 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            auzr r14 = defpackage.auzr.e     // Catch:{ auda -> 0x0215 }
        L_0x00c8:
            auay r14 = r14.c     // Catch:{ auda -> 0x0215 }
            byte[] r14 = r14.k()     // Catch:{ auda -> 0x0215 }
            aubs r15 = defpackage.aubs.c()     // Catch:{ auda -> 0x0215 }
            r13.b(r14, r15)     // Catch:{ auda -> 0x0215 }
            byte[] r14 = r0.k()     // Catch:{ auda -> 0x0215 }
            avae r15 = defpackage.avae.h     // Catch:{ auda -> 0x0215 }
            aucj r14 = defpackage.aucj.a((defpackage.aucj) r15, (byte[]) r14)     // Catch:{ auda -> 0x0215 }
            avae r14 = (defpackage.avae) r14     // Catch:{ auda -> 0x0215 }
            java.lang.Object r15 = r14.c(r5)     // Catch:{ auda -> 0x0215 }
            aucd r15 = (defpackage.aucd) r15     // Catch:{ auda -> 0x0215 }
            r15.a((defpackage.aucj) r14)     // Catch:{ auda -> 0x0215 }
            aucf r15 = (defpackage.aucf) r15     // Catch:{ auda -> 0x0215 }
            aucj r14 = r13.b     // Catch:{ auda -> 0x0215 }
            auzv r14 = (defpackage.auzv) r14     // Catch:{ auda -> 0x0215 }
            java.lang.String r14 = r14.c     // Catch:{ auda -> 0x0215 }
            java.lang.String r5 = r12.b     // Catch:{ auda -> 0x0215 }
            java.lang.String r16 = java.lang.String.valueOf(r14)     // Catch:{ auda -> 0x0215 }
            int r16 = r16.length()     // Catch:{ auda -> 0x0215 }
            int r16 = r16 + 1
            java.lang.String r17 = java.lang.String.valueOf(r5)     // Catch:{ auda -> 0x0215 }
            int r17 = r17.length()     // Catch:{ auda -> 0x0215 }
            int r11 = r16 + r17
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ auda -> 0x0215 }
            r3.<init>(r11)     // Catch:{ auda -> 0x0215 }
            r3.append(r14)     // Catch:{ auda -> 0x0215 }
            java.lang.String r11 = "_"
            r3.append(r11)     // Catch:{ auda -> 0x0215 }
            r3.append(r5)     // Catch:{ auda -> 0x0215 }
            java.lang.String r3 = r3.toString()     // Catch:{ auda -> 0x0215 }
            boolean r5 = r13.c     // Catch:{ auda -> 0x0215 }
            if (r5 != 0) goto L_0x0121
            goto L_0x0127
        L_0x0121:
            r13.c()     // Catch:{ auda -> 0x0215 }
            r5 = 0
            r13.c = r5     // Catch:{ auda -> 0x020d }
        L_0x0127:
            aucj r5 = r13.b     // Catch:{ auda -> 0x0215 }
            auzv r5 = (defpackage.auzv) r5     // Catch:{ auda -> 0x0215 }
            r3.getClass()     // Catch:{ auda -> 0x0215 }
            int r11 = r5.a     // Catch:{ auda -> 0x0215 }
            r11 = r11 | 2
            r5.a = r11     // Catch:{ auda -> 0x0215 }
            r5.c = r3     // Catch:{ auda -> 0x0215 }
            boolean r3 = defpackage.aymw.m()     // Catch:{ auda -> 0x0215 }
            if (r3 == 0) goto L_0x0143
            aucj r3 = r13.b     // Catch:{ auda -> 0x0215 }
            auzv r3 = (defpackage.auzv) r3     // Catch:{ auda -> 0x0215 }
            java.lang.String r3 = r3.d     // Catch:{ auda -> 0x0215 }
            goto L_0x016c
        L_0x0143:
            aucj r3 = r13.b     // Catch:{ auda -> 0x0215 }
            auzv r3 = (defpackage.auzv) r3     // Catch:{ auda -> 0x0215 }
            java.lang.String r3 = r3.d     // Catch:{ auda -> 0x0215 }
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ auda -> 0x0215 }
            int r5 = r5.length()     // Catch:{ auda -> 0x0215 }
            int r5 = r5 + 14
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ auda -> 0x0215 }
            r11.<init>(r5)     // Catch:{ auda -> 0x0215 }
            java.lang.String r5 = "("
            r11.append(r5)     // Catch:{ auda -> 0x0215 }
            r11.append(r10)     // Catch:{ auda -> 0x0215 }
            java.lang.String r5 = ") "
            r11.append(r5)     // Catch:{ auda -> 0x0215 }
            r11.append(r3)     // Catch:{ auda -> 0x0215 }
            java.lang.String r3 = r11.toString()     // Catch:{ auda -> 0x0215 }
        L_0x016c:
            boolean r5 = r13.c     // Catch:{ auda -> 0x0215 }
            if (r5 != 0) goto L_0x0171
            goto L_0x0177
        L_0x0171:
            r13.c()     // Catch:{ auda -> 0x0215 }
            r5 = 0
            r13.c = r5     // Catch:{ auda -> 0x020d }
        L_0x0177:
            aucj r5 = r13.b     // Catch:{ auda -> 0x0215 }
            auzv r5 = (defpackage.auzv) r5     // Catch:{ auda -> 0x0215 }
            r3.getClass()     // Catch:{ auda -> 0x0215 }
            int r11 = r5.a     // Catch:{ auda -> 0x0215 }
            r11 = r11 | 4
            r5.a = r11     // Catch:{ auda -> 0x0215 }
            r5.d = r3     // Catch:{ auda -> 0x0215 }
            boolean r3 = r15.c     // Catch:{ auda -> 0x0215 }
            if (r3 != 0) goto L_0x018b
            goto L_0x0191
        L_0x018b:
            r15.c()     // Catch:{ auda -> 0x0215 }
            r3 = 0
            r15.c = r3     // Catch:{ auda -> 0x0215 }
        L_0x0191:
            aucj r3 = r15.b     // Catch:{ auda -> 0x0215 }
            avae r3 = (defpackage.avae) r3     // Catch:{ auda -> 0x0215 }
            aucx r5 = defpackage.aucj.s()     // Catch:{ auda -> 0x0215 }
            r3.d = r5     // Catch:{ auda -> 0x0215 }
            auzf r3 = r12.i()     // Catch:{ auda -> 0x0215 }
            r15.a((defpackage.auzf) r3)     // Catch:{ auda -> 0x0215 }
            aucj r3 = r15.b     // Catch:{ auda -> 0x0215 }
            avae r3 = (defpackage.avae) r3     // Catch:{ auda -> 0x0215 }
            auzr r3 = r3.c     // Catch:{ auda -> 0x0215 }
            if (r3 == 0) goto L_0x01ab
            goto L_0x01ad
        L_0x01ab:
            auzr r3 = defpackage.auzr.e     // Catch:{ auda -> 0x0215 }
        L_0x01ad:
            r5 = 5
            java.lang.Object r11 = r3.c(r5)     // Catch:{ auda -> 0x0215 }
            aucd r11 = (defpackage.aucd) r11     // Catch:{ auda -> 0x0215 }
            r11.a((defpackage.aucj) r3)     // Catch:{ auda -> 0x0215 }
            aucj r3 = r13.i()     // Catch:{ auda -> 0x0215 }
            auzv r3 = (defpackage.auzv) r3     // Catch:{ auda -> 0x0215 }
            auay r3 = r3.au()     // Catch:{ auda -> 0x0215 }
            boolean r5 = r11.c     // Catch:{ auda -> 0x0215 }
            if (r5 != 0) goto L_0x01c7
            goto L_0x01cd
        L_0x01c7:
            r11.c()     // Catch:{ auda -> 0x0215 }
            r5 = 0
            r11.c = r5     // Catch:{ auda -> 0x020d }
        L_0x01cd:
            aucj r5 = r11.b     // Catch:{ auda -> 0x0215 }
            auzr r5 = (defpackage.auzr) r5     // Catch:{ auda -> 0x0215 }
            r3.getClass()     // Catch:{ auda -> 0x0215 }
            int r12 = r5.a     // Catch:{ auda -> 0x0215 }
            r12 = r12 | 2
            r5.a = r12     // Catch:{ auda -> 0x0215 }
            r5.c = r3     // Catch:{ auda -> 0x0215 }
            boolean r3 = r15.c     // Catch:{ auda -> 0x0215 }
            if (r3 != 0) goto L_0x01e2
            r5 = 0
            goto L_0x01e8
        L_0x01e2:
            r15.c()     // Catch:{ auda -> 0x0215 }
            r5 = 0
            r15.c = r5     // Catch:{ auda -> 0x020d }
        L_0x01e8:
            aucj r3 = r15.b     // Catch:{ auda -> 0x020d }
            avae r3 = (defpackage.avae) r3     // Catch:{ auda -> 0x020d }
            aucj r11 = r11.i()     // Catch:{ auda -> 0x020d }
            auzr r11 = (defpackage.auzr) r11     // Catch:{ auda -> 0x020d }
            r11.getClass()     // Catch:{ auda -> 0x020d }
            r3.c = r11     // Catch:{ auda -> 0x020d }
            int r11 = r3.a     // Catch:{ auda -> 0x020d }
            r12 = 1
            r11 = r11 | r12
            r3.a = r11     // Catch:{ auda -> 0x020d }
            aucj r3 = r15.i()     // Catch:{ auda -> 0x020d }
            avae r3 = (defpackage.avae) r3     // Catch:{ auda -> 0x020d }
            r6.add(r3)     // Catch:{ auda -> 0x020d }
            int r10 = r10 + 1
            r3 = 0
            r5 = 5
            r11 = 1
            goto L_0x00ad
        L_0x020d:
            r0 = move-exception
            goto L_0x0217
        L_0x020f:
            r5 = 0
            goto L_0x023a
        L_0x0211:
            r5 = 0
            goto L_0x0237
        L_0x0213:
            r5 = 0
            goto L_0x0237
        L_0x0215:
            r0 = move-exception
            r5 = 0
        L_0x0217:
            jjg r3 = defpackage.tgc.a
            anie r3 = r3.b()
            anih r3 = (defpackage.anih) r3
            r3.a((java.lang.Throwable) r0)
            r0 = 726(0x2d6, float:1.017E-42)
            java.lang.String r9 = "vbp"
            java.lang.String r10 = "a"
            java.lang.String r11 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r3.a((java.lang.String) r9, (java.lang.String) r10, (int) r0, (java.lang.String) r11)
            anih r0 = (defpackage.anih) r0
            java.lang.String r3 = "Parsing proto message from bytes failed, skipping."
            r0.a((java.lang.String) r3)
            goto L_0x023a
        L_0x0236:
            r5 = 0
        L_0x0237:
            r6.add(r0)
        L_0x023a:
            int r8 = r8 + 1
            r3 = 0
            r5 = 5
            goto L_0x003a
        L_0x0240:
            r5 = 0
        L_0x0241:
            vbn r0 = new vbn
            r0.<init>(r1)
            java.util.Arrays.sort(r4, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            int r6 = r4.length
            r7 = 0
        L_0x0255:
            if (r7 < r6) goto L_0x02bf
            uyz r6 = r1.i
            r7 = 0
            r8 = 9
            r6.a((java.lang.String) r7, (int) r8, (java.util.Set) r3, (java.util.Set) r0)
            vbt r0 = r1.d
            vbu r0 = r0.a(r2)
            java.util.Map r3 = r0.b()
            int r6 = r4.length
        L_0x026a:
            if (r5 >= r6) goto L_0x0289
            r7 = r4[r5]
            r8 = 5
            java.lang.Object r9 = r7.c(r8)
            aucd r9 = (defpackage.aucd) r9
            r9.a((defpackage.aucj) r7)
            aucf r9 = (defpackage.aucf) r9
            r1.a((com.google.android.gms.nearby.messages.ClientAppIdentifier) r2, (defpackage.aucf) r9)
            auzr r7 = r7.c
            if (r7 != 0) goto L_0x0283
            auzr r7 = defpackage.auzr.e
        L_0x0283:
            r3.remove(r7)
            int r5 = r5 + 1
            goto L_0x026a
        L_0x0289:
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0291:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02b4
            java.lang.Object r4 = r3.next()
            auzr r4 = (defpackage.auzr) r4
            auzu r5 = r4.b
            if (r5 == 0) goto L_0x02a2
            goto L_0x02a4
        L_0x02a2:
            auzu r5 = defpackage.auzu.d
        L_0x02a4:
            java.lang.String r5 = r5.c
            java.lang.String r6 = "__audio_bytes"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x0291
            oi r5 = r0.a
            r5.b(r4)
            goto L_0x0291
        L_0x02b4:
            vbt r0 = r1.d
            vbu r0 = r0.a(r2)
            r9 = r21
            r0.f = r9
            return
        L_0x02bf:
            r9 = r21
            r8 = 5
            r10 = r4[r7]
            aucx r10 = r10.b
            r3.addAll(r10)
            int r7 = r7 + 1
            goto L_0x0255
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbp.a(com.google.android.gms.nearby.messages.ClientAppIdentifier, avae[], java.lang.String):void");
    }

    public final void a(Update update, uyq uyq) {
        if (uyq == null) {
            uyt uyt = this.e;
            Message message = update.c;
            uyt.g.b();
            ob obVar = new ob();
            for (uyq uyq2 : uyt.e.values()) {
                if (uyq2.c.a(message)) {
                    obVar.add(uyq2);
                }
            }
            a(update, (Collection) obVar);
        } else if (uyq.c.a(update.c)) {
            a(update, (Collection) Collections.singleton(uyq));
        }
    }

    public final void a(vai vai, Map map, Map map2, vbo vbo) {
        for (Object next : map2.keySet()) {
            if (!map.containsKey(next)) {
                NearbyDevice a2 = a(vai);
                vdx vdx = new vdx();
                vdx.c();
                vdx.a(a2);
                if (vai.a()) {
                    vdx.a(new DistanceImpl(vai.g));
                }
                if (map2.get(next) != null) {
                    vdx.a((BleSignalImpl) map2.get(next));
                }
                Message a3 = vbo.a(next, a2);
                if (a3 != null) {
                    vdx.b = a3;
                    a(vdx.a(), (uyq) null);
                }
            }
        }
    }

    public final void a(vdx vdx, avae avae, ClientAppIdentifier clientAppIdentifier) {
        vdx.b = a(avae);
        Update a2 = vdx.a();
        if (!aync.i()) {
            a(a2, (Set) anax.a((Collection) avae.b));
        } else {
            a(a2, clientAppIdentifier);
        }
    }

    public final void a(vdx vdx, NearbyDevice nearbyDevice, Set set, Set set2, Set set3, uyq uyq) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Message a2 = a.a((auzf) it.next(), nearbyDevice);
            if (a2 != null) {
                vdx.b = a2;
                a(vdx.a(), uyq);
            }
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            vdx.b = b.a((String) it2.next(), nearbyDevice);
            a(vdx.a(), uyq);
        }
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            vdx.b = c.a((uzx) it3.next(), nearbyDevice);
            a(vdx.a(), uyq);
        }
    }
}
