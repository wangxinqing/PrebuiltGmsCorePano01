package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aiwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiwt implements aizv, arne, arnb {
    arnh a = null;
    public boolean b = false;
    private final arnd c;
    private final jfp d;
    private final jfo e;
    private final List f = new ArrayList();
    private final ajbg g;
    private final Context h;
    private aizt i = null;
    private int j;

    public aiwt(Context context, arnd arnd, ajbg ajbg) {
        this.h = context;
        this.c = arnd;
        this.g = ajbg;
        jfp jfp = new jfp("Chre_Sleep_Handler", 10);
        this.d = jfp;
        jfp.start();
        this.e = new jfo(this.d);
        this.j = 3;
    }

    public static synchronized aiwt a(arnf arnf, Context context, ajbg ajbg) {
        synchronized (aiwt.class) {
            arnd a2 = arnf.a(context);
            if (a2 == null) {
                return null;
            }
            aiwt aiwt = new aiwt(context, a2, ajbg);
            aiwt.c.a(5147455389092024335L, aiwt, aiwt.e);
            return aiwt;
        }
    }

    private final synchronized void d() {
        arnh a2 = this.c.a(5147455389092024335L);
        this.a = a2;
        if (a2 != null) {
            aucd o = armq.c.o();
            aucd o2 = armn.a.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            armq armq = (armq) o.b;
            armn armn = (armn) o2.i();
            armn.getClass();
            armq.b = armn;
            armq.a = 2;
            a((armq) o.i());
            amrl.a((Object) this.a);
            this.a.b(this);
        }
        aizt aizt = this.i;
        if (aizt != null) {
            this.f.remove(aizt);
        }
        this.a = null;
        this.j = 2;
    }

    private final void e() {
        arnh arnh = this.a;
        if (arnh != null) {
            arnh.b(this);
            this.a = null;
            aizt aizt = this.i;
            if (aizt != null) {
                this.f.remove(aizt);
            }
        }
        this.j = 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void f() {
        /*
            r7 = this;
            monitor-enter(r7)
            arnd r0 = r7.c     // Catch:{ all -> 0x0128 }
            r1 = 5147455389092024335(0x476f6f676c00100f, double:1.3057659520462469E36)
            arnh r0 = r0.a((long) r1)     // Catch:{ all -> 0x0128 }
            r7.a = r0     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x0126
            jfo r1 = r7.e     // Catch:{ all -> 0x0128 }
            r0.a(r7, r1)     // Catch:{ all -> 0x0128 }
            android.content.Context r0 = r7.h     // Catch:{ all -> 0x0128 }
            ahol r0 = defpackage.ahol.a((android.content.Context) r0)     // Catch:{ all -> 0x0128 }
            armq r1 = defpackage.armq.c     // Catch:{ all -> 0x0128 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x0128 }
            armp r2 = defpackage.armp.a     // Catch:{ all -> 0x0128 }
            aucd r2 = r2.o()     // Catch:{ all -> 0x0128 }
            boolean r3 = r1.c     // Catch:{ all -> 0x0128 }
            r4 = 0
            if (r3 == 0) goto L_0x0031
            r1.c()     // Catch:{ all -> 0x0128 }
            r1.c = r4     // Catch:{ all -> 0x0128 }
        L_0x0031:
            aucj r3 = r1.b     // Catch:{ all -> 0x0128 }
            armq r3 = (defpackage.armq) r3     // Catch:{ all -> 0x0128 }
            aucj r2 = r2.i()     // Catch:{ all -> 0x0128 }
            armp r2 = (defpackage.armp) r2     // Catch:{ all -> 0x0128 }
            r2.getClass()     // Catch:{ all -> 0x0128 }
            r3.b = r2     // Catch:{ all -> 0x0128 }
            r2 = 1
            r3.a = r2     // Catch:{ all -> 0x0128 }
            aucj r1 = r1.i()     // Catch:{ all -> 0x0128 }
            armq r1 = (defpackage.armq) r1     // Catch:{ all -> 0x0128 }
            boolean r1 = r7.a((defpackage.armq) r1)     // Catch:{ all -> 0x0128 }
            if (r1 == 0) goto L_0x00f6
            boolean r1 = defpackage.ayfc.e()     // Catch:{ all -> 0x0128 }
            r3 = 3
            if (r1 == 0) goto L_0x0079
            arfw r1 = defpackage.arfw.g     // Catch:{ all -> 0x0128 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x0128 }
            boolean r5 = r1.c     // Catch:{ all -> 0x0128 }
            if (r5 == 0) goto L_0x0065
            r1.c()     // Catch:{ all -> 0x0128 }
            r1.c = r4     // Catch:{ all -> 0x0128 }
        L_0x0065:
            aucj r5 = r1.b     // Catch:{ all -> 0x0128 }
            arfw r5 = (defpackage.arfw) r5     // Catch:{ all -> 0x0128 }
            r5.b = r3     // Catch:{ all -> 0x0128 }
            int r6 = r5.a     // Catch:{ all -> 0x0128 }
            r6 = r6 | r2
            r5.a = r6     // Catch:{ all -> 0x0128 }
            aucj r1 = r1.i()     // Catch:{ all -> 0x0128 }
            arfw r1 = (defpackage.arfw) r1     // Catch:{ all -> 0x0128 }
            r0.a((defpackage.arfw) r1)     // Catch:{ all -> 0x0128 }
        L_0x0079:
            aizt r1 = r7.i     // Catch:{ all -> 0x0128 }
            if (r1 == 0) goto L_0x008c
            java.util.List r5 = r7.f     // Catch:{ all -> 0x0128 }
            boolean r1 = r5.contains(r1)     // Catch:{ all -> 0x0128 }
            if (r1 != 0) goto L_0x008c
            java.util.List r1 = r7.f     // Catch:{ all -> 0x0128 }
            aizt r5 = r7.i     // Catch:{ all -> 0x0128 }
            r1.add(r5)     // Catch:{ all -> 0x0128 }
        L_0x008c:
            r7.j = r2     // Catch:{ all -> 0x0128 }
            boolean r1 = defpackage.ayfc.c()     // Catch:{ all -> 0x0128 }
            if (r1 == 0) goto L_0x00f4
            armq r1 = defpackage.armq.c     // Catch:{ all -> 0x0128 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x0128 }
            armo r5 = defpackage.armo.a     // Catch:{ all -> 0x0128 }
            aucd r5 = r5.o()     // Catch:{ all -> 0x0128 }
            boolean r6 = r1.c     // Catch:{ all -> 0x0128 }
            if (r6 != 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            r1.c()     // Catch:{ all -> 0x0128 }
            r1.c = r4     // Catch:{ all -> 0x0128 }
        L_0x00aa:
            aucj r6 = r1.b     // Catch:{ all -> 0x0128 }
            armq r6 = (defpackage.armq) r6     // Catch:{ all -> 0x0128 }
            aucj r5 = r5.i()     // Catch:{ all -> 0x0128 }
            armo r5 = (defpackage.armo) r5     // Catch:{ all -> 0x0128 }
            r5.getClass()     // Catch:{ all -> 0x0128 }
            r6.b = r5     // Catch:{ all -> 0x0128 }
            r6.a = r3     // Catch:{ all -> 0x0128 }
            aucj r1 = r1.i()     // Catch:{ all -> 0x0128 }
            armq r1 = (defpackage.armq) r1     // Catch:{ all -> 0x0128 }
            boolean r1 = r7.a((defpackage.armq) r1)     // Catch:{ all -> 0x0128 }
            if (r1 == 0) goto L_0x00f4
            boolean r1 = defpackage.ayfc.e()     // Catch:{ all -> 0x0128 }
            if (r1 == 0) goto L_0x00f4
            arfw r1 = defpackage.arfw.g     // Catch:{ all -> 0x0128 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x0128 }
            boolean r3 = r1.c     // Catch:{ all -> 0x0128 }
            if (r3 != 0) goto L_0x00d8
            goto L_0x00dd
        L_0x00d8:
            r1.c()     // Catch:{ all -> 0x0128 }
            r1.c = r4     // Catch:{ all -> 0x0128 }
        L_0x00dd:
            aucj r3 = r1.b     // Catch:{ all -> 0x0128 }
            arfw r3 = (defpackage.arfw) r3     // Catch:{ all -> 0x0128 }
            r4 = 4
            r3.b = r4     // Catch:{ all -> 0x0128 }
            int r4 = r3.a     // Catch:{ all -> 0x0128 }
            r2 = r2 | r4
            r3.a = r2     // Catch:{ all -> 0x0128 }
            aucj r1 = r1.i()     // Catch:{ all -> 0x0128 }
            arfw r1 = (defpackage.arfw) r1     // Catch:{ all -> 0x0128 }
            r0.a((defpackage.arfw) r1)     // Catch:{ all -> 0x0128 }
            monitor-exit(r7)
            return
        L_0x00f4:
            monitor-exit(r7)
            return
        L_0x00f6:
            r1 = 0
            r7.a = r1     // Catch:{ all -> 0x0128 }
            boolean r1 = defpackage.ayfc.e()     // Catch:{ all -> 0x0128 }
            if (r1 == 0) goto L_0x0126
            arfw r1 = defpackage.arfw.g     // Catch:{ all -> 0x0128 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x0128 }
            boolean r3 = r1.c     // Catch:{ all -> 0x0128 }
            if (r3 != 0) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            r1.c()     // Catch:{ all -> 0x0128 }
            r1.c = r4     // Catch:{ all -> 0x0128 }
        L_0x010f:
            aucj r3 = r1.b     // Catch:{ all -> 0x0128 }
            arfw r3 = (defpackage.arfw) r3     // Catch:{ all -> 0x0128 }
            r4 = 5
            r3.b = r4     // Catch:{ all -> 0x0128 }
            int r4 = r3.a     // Catch:{ all -> 0x0128 }
            r2 = r2 | r4
            r3.a = r2     // Catch:{ all -> 0x0128 }
            aucj r1 = r1.i()     // Catch:{ all -> 0x0128 }
            arfw r1 = (defpackage.arfw) r1     // Catch:{ all -> 0x0128 }
            r0.a((defpackage.arfw) r1)     // Catch:{ all -> 0x0128 }
            monitor-exit(r7)
            return
        L_0x0126:
            monitor-exit(r7)
            return
        L_0x0128:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiwt.f():void");
    }

    public final synchronized void a(aizt aizt) {
        this.i = aizt;
    }

    public final void b() {
        boolean h2 = ayfc.h();
        boolean d2 = ayfc.d();
        int i2 = this.j;
        if (i2 != 1 && this.b && h2 && d2) {
            f();
        } else if (i2 == 1 && (!this.b || !h2 || !d2)) {
            d();
        }
        String a2 = aiws.a(this.j);
        StringBuilder sb = new StringBuilder(a2.length() + 22);
        sb.append("updated NanoAppState: ");
        sb.append(a2);
        sb.toString();
    }

    public final synchronized void be() {
        b();
    }

    private static final boolean a(arnk arnk) {
        try {
            int intValue = ((Integer) arnk.get(1, TimeUnit.SECONDS)).intValue();
            if (intValue == 0) {
                return true;
            }
            StringBuilder sb = new StringBuilder(61);
            sb.append("Failed to send message to nanoapp: request result=");
            sb.append(intValue);
            sb.toString();
            return false;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() == 0) {
                new String("Failed to send message to nanoapp: ");
                return false;
            }
            "Failed to send message to nanoapp: ".concat(valueOf);
            return false;
        }
    }

    public final synchronized void b(int i2) {
        e();
    }

    public final synchronized void a(int i2) {
        e();
    }

    public final synchronized void a(arnd arnd, arnh arnh, arnt arnt) {
        if (arnh != null) {
            int i2 = arnt.a;
            int i3 = 1;
            if (i2 != 0) {
                i3 = i2 != 1 ? i2 != 2 ? 0 : 3 : 2;
            }
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 != 2) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown message type: ");
                sb.append(i2);
                sb.toString();
            } else {
                b();
                arml arml = (arml) arnt.a((auef) arml.i.c(7));
                if (!ayfc.c() && (arml.a & 64) != 0) {
                    aucd o = armq.c.o();
                    aucd o2 = armm.a.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    armq armq = (armq) o.b;
                    armm armm = (armm) o2.i();
                    armm.getClass();
                    armq.b = armm;
                    armq.a = 4;
                    a((armq) o.i());
                }
                arnh.c();
                aizu aizu = new aizu(arml.b, arml.c, arml.g, arml.d, (arml.a & 64) != 0 ? arml.e : -1.0f, arml.f, arml.h);
                List list = this.f;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    this.g.a((Runnable) new aiwr((aizt) list.get(i5), aizu));
                }
            }
        }
    }

    public final synchronized boolean a() {
        String a2 = aiws.a(this.j);
        StringBuilder sb = new StringBuilder(a2.length() + 22);
        sb.append("Sleep nanoapp status: ");
        sb.append(a2);
        sb.toString();
        return this.j == 1;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(armq armq) {
        arnk a2;
        arnh arnh = this.a;
        if (arnh == null || (a2 = arnh.a(1, 1, (audx) armq)) == null) {
            return false;
        }
        return a(a2);
    }
}
