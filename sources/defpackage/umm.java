package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;

/* renamed from: umm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class umm {
    public usp a;
    public usu b;
    public uml c = uml.NONE;
    private final aoru d = tid.b();
    private final aoru e = tid.a(6);
    private final Context f;
    private utj g;
    private tfu h;
    private final ScheduledExecutorService i = tid.a();
    private usu j;
    private usx k;
    private SessionDescription l;
    private final List m = new ArrayList();
    private final ulv n = new ulv(this);
    private final ulw o = new ulw(this);
    private final umh p = new umh(this);

    public umm(Context context) {
        this.f = context;
    }

    private static utj a(Context context, usu usu, String str) {
        if (!aymi.a.a().aY()) {
            return new uti(new ute(context), usu, str);
        }
        return new utd(new ute(context), usu, str);
    }

    private final void b(String str) {
        ((anih) ((anih) ulh.a.c()).a("umm", "b", 175, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopping WebRTC signaling: %s", (Object) str);
        k();
    }

    private final boolean j() {
        return (this.c == uml.NONE || this.j == null || this.b == null) ? false : true;
    }

    private final synchronized void k() {
        this.c = uml.NONE;
        this.l = null;
        this.m.clear();
        this.j = null;
        this.b = null;
        tfu tfu = this.h;
        if (tfu != null) {
            tfu.b();
            this.h = null;
        }
        utj utj = this.g;
        if (utj != null) {
            utj.a((Executor) this.d);
            this.g = null;
        }
        if (this.k == null) {
            m();
        }
    }

    private final void l() {
        usx usx = this.k;
        if (usx != null) {
            jjt.a((Closeable) usx);
            this.k = null;
        }
    }

    private final void m() {
        usp usp = this.a;
        if (usp != null) {
            usp.c();
            this.a = null;
        }
    }

    public final void c() {
        k();
        l();
        m();
    }

    public final synchronized boolean d() {
        return this.c == uml.OFFERER;
    }

    public final synchronized void e() {
        if (!d()) {
            ((anih) ((anih) ulh.a.d()).a("umm", "e", 236, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Skipping stop accepting connections: we are not currently accepting WebRTC connections.");
            return;
        }
        k();
        ((anih) ((anih) ulh.a.d()).a("umm", "e", 242, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped accepting WebRTC connections.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "umm"
            java.lang.String r1 = "f"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r3 = r5.d()     // Catch:{ all -> 0x0072 }
            if (r3 != 0) goto L_0x0024
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x0072 }
            anie r3 = r3.d()     // Catch:{ all -> 0x0072 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0072 }
            r4 = 491(0x1eb, float:6.88E-43)
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x0072 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "Skipping restart listening for tachyon inbox messages since we are not accepting connections."
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x0072 }
            monitor-exit(r5)
            return
        L_0x0024:
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x0072 }
            anie r3 = r3.d()     // Catch:{ all -> 0x0072 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0072 }
            r4 = 497(0x1f1, float:6.96E-43)
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r2)     // Catch:{ all -> 0x0072 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "Restarting listening for tachyon inbox messages."
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x0072 }
            utj r0 = r5.g     // Catch:{ all -> 0x0072 }
            r0.b()     // Catch:{ all -> 0x0072 }
            android.content.Context r0 = r5.f     // Catch:{ all -> 0x0072 }
            usu r1 = r5.j     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = r1.a     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = defpackage.usz.a(r0, r1)     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "Unable to get droid guard result"
            r5.a((java.lang.String) r0)     // Catch:{ all -> 0x0072 }
            monitor-exit(r5)
            return
        L_0x0051:
            android.content.Context r1 = r5.f     // Catch:{ all -> 0x0072 }
            usu r2 = r5.j     // Catch:{ all -> 0x0072 }
            utj r0 = a(r1, r2, r0)     // Catch:{ all -> 0x0072 }
            r5.g = r0     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006e
            utj r0 = r5.g     // Catch:{ all -> 0x0072 }
            ulv r1 = r5.n     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.a((defpackage.ulv) r1)     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            monitor-exit(r5)
            return
        L_0x006e:
            r5.c()     // Catch:{ all -> 0x0072 }
            goto L_0x006c
        L_0x0072:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x0076
        L_0x0075:
            throw r0
        L_0x0076:
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umm.f():void");
    }

    public final synchronized void g() {
        k();
        l();
        m();
    }

    public final synchronized void h() {
        a("The WebRTC data channel was closed.");
    }

    public final synchronized void i() {
        usx usx = this.k;
        if (usx == null) {
            a("Data channel buffer changed without a WebRtcSocket.");
        } else {
            usx.d();
        }
    }

    public final synchronized void b() {
        tid.a(this.d, "WebRtc.singleThreadedSignalingOffloader");
        tid.a(this.e, "WebRtc.multiThreadedSignalingOffloader");
        tid.a(this.i, "WebRtc.restartTachyonReceiveMessagesExecutor");
        c();
    }

    private final void a(String str) {
        ((anih) ((anih) ulh.a.c()).a("umm", "a", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Disconnecting WebRTC: %s", (Object) str);
        c();
    }

    private final void a(String str, Throwable th) {
        anih anih = (anih) ulh.a.c();
        anih.a(th);
        ((anih) anih.a("umm", "a", 170, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Disconnecting WebRTC: %s", (Object) str);
        c();
    }

    public final synchronized void b(byte[] bArr) {
        usx usx = this.k;
        if (usx != null) {
            try {
                usx.f.write(bArr);
                usx.f.flush();
            } catch (IOException e2) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("usx", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to write to WebRtcSocket pipe.");
                usx.c();
            }
        } else {
            a("Received a data channel message without a WebRTC socket.");
        }
    }

    private final boolean a(SessionDescription sessionDescription) {
        if (sessionDescription == null) {
            a("Unable to get local session description.");
            return false;
        } else if (this.a.a(sessionDescription) != null) {
            return true;
        } else {
            a("Unable to set local session description.");
            return false;
        }
    }

    public final aorr a(aorr aorr, umk umk) {
        aorr a2 = aopr.a(aorr, (amqy) new ulz(this), (Executor) aoqm.a);
        aorl.a(a2, new umj(this, umk), aoqm.a);
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        ((defpackage.anih) ((defpackage.anih) defpackage.ulh.a.d()).a("umm", "a", 265, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Attempting to make a WebRTC connection to %s.", (java.lang.Object) r7);
        r7 = (defpackage.usx) defpackage.thr.c("WebRtc.connect", a((defpackage.aorr) r6.a.b, defpackage.uly.a), defpackage.aymi.a.a().aR());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        if (r7 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.usx a(defpackage.usu r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.a()     // Catch:{ all -> 0x0086 }
            r1 = 0
            if (r0 == 0) goto L_0x0081
            uml r0 = r6.c     // Catch:{ all -> 0x0086 }
            uml r2 = defpackage.uml.NONE     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "a"
            java.lang.String r5 = "umm"
            if (r0 == r2) goto L_0x002d
            jjg r7 = defpackage.ulh.a     // Catch:{ all -> 0x0086 }
            anie r7 = r7.c()     // Catch:{ all -> 0x0086 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x0086 }
            r0 = 254(0xfe, float:3.56E-43)
            anie r7 = r7.a((java.lang.String) r5, (java.lang.String) r4, (int) r0, (java.lang.String) r3)     // Catch:{ all -> 0x0086 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "Cannot connect with WebRTC because we are already acting as a %s."
            uml r2 = r6.c     // Catch:{ all -> 0x0086 }
            r7.a((java.lang.String) r0, (java.lang.Object) r2)     // Catch:{ all -> 0x0086 }
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            return r1
        L_0x002d:
            r6.b = r7     // Catch:{ all -> 0x0086 }
            uml r0 = defpackage.uml.ANSWERER     // Catch:{ all -> 0x0086 }
            r2 = 64
            byte[] r2 = defpackage.ulu.b(r2)     // Catch:{ all -> 0x0086 }
            usu r2 = defpackage.usu.a(r2)     // Catch:{ all -> 0x0086 }
            boolean r0 = r6.a((defpackage.uml) r0, (defpackage.usu) r2)     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x007f
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            jjg r0 = defpackage.ulh.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            r1 = 265(0x109, float:3.71E-43)
            anie r0 = r0.a((java.lang.String) r5, (java.lang.String) r4, (int) r1, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Attempting to make a WebRTC connection to %s."
            r0.a((java.lang.String) r1, (java.lang.Object) r7)
            usp r7 = r6.a
            aosh r7 = r7.b
            umk r0 = defpackage.uly.a
            aorr r7 = r6.a((defpackage.aorr) r7, (defpackage.umk) r0)
            aymi r0 = defpackage.aymi.a
            aymj r0 = r0.a()
            long r0 = r0.aR()
            java.lang.String r2 = "WebRtc.connect"
            java.lang.Object r7 = defpackage.thr.c(r2, r7, r0)
            usx r7 = (defpackage.usx) r7
            if (r7 != 0) goto L_0x007e
            monitor-enter(r6)
            r6.c()     // Catch:{ all -> 0x007b }
            monitor-exit(r6)     // Catch:{ all -> 0x007b }
            goto L_0x007e
        L_0x007b:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007b }
            throw r7
        L_0x007e:
            return r7
        L_0x007f:
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            return r1
        L_0x0081:
            r6.c()     // Catch:{ all -> 0x0086 }
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            return r1
        L_0x0086:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umm.a(usu):usx");
    }

    public final void a(Runnable runnable) {
        this.d.execute(runnable);
    }

    public final synchronized void a(IceCandidate iceCandidate) {
        if (j()) {
            this.g.a(this.e, this.b, usv.a(this.j, Arrays.asList(new IceCandidate[]{iceCandidate})).k());
            return;
        }
        this.m.add(iceCandidate);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.usx r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L_0x000a
            java.lang.String r2 = "Unable to get WebRtcSocket."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0018 }
            monitor-exit(r1)
            return
        L_0x000a:
            usx r0 = r1.k     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0015
            java.lang.String r2 = "Tried to create a new WebRTC socket without closing the existing one."
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0018 }
        L_0x0013:
            monitor-exit(r1)
            return
        L_0x0015:
            r1.k = r2     // Catch:{ all -> 0x0018 }
            goto L_0x0013
        L_0x0018:
            r2 = move-exception
            monitor-exit(r1)
            goto L_0x001c
        L_0x001b:
            throw r2
        L_0x001c:
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umm.a(usx):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0257, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02cc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(byte[] r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            usp r0 = r11.a     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x0328
            aubs r0 = defpackage.aubs.c()     // Catch:{ auda -> 0x0302 }
            asmu r1 = defpackage.asmu.f     // Catch:{ auda -> 0x0302 }
            aucj r12 = defpackage.aucj.a((defpackage.aucj) r1, (byte[]) r12, (defpackage.aubs) r0)     // Catch:{ auda -> 0x0302 }
            asmu r12 = (defpackage.asmu) r12     // Catch:{ auda -> 0x0302 }
            int r0 = r12.a     // Catch:{ all -> 0x032f }
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L_0x02fb
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r2 = "a"
            java.lang.String r3 = "umm"
            int r4 = r12.b     // Catch:{ all -> 0x032f }
            r5 = 6
            if (r4 != r5) goto L_0x004d
            usu r4 = r11.b     // Catch:{ all -> 0x032f }
            if (r4 != 0) goto L_0x004d
            usu r4 = new usu     // Catch:{ all -> 0x032f }
            asmq r6 = r12.d     // Catch:{ all -> 0x032f }
            if (r6 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            asmq r6 = defpackage.asmq.c     // Catch:{ all -> 0x032f }
        L_0x002f:
            java.lang.String r6 = r6.b     // Catch:{ all -> 0x032f }
            r4.<init>(r6)     // Catch:{ all -> 0x032f }
            r11.b = r4     // Catch:{ all -> 0x032f }
            jjg r4 = defpackage.ulh.a     // Catch:{ all -> 0x032f }
            anie r4 = r4.d()     // Catch:{ all -> 0x032f }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x032f }
            r6 = 339(0x153, float:4.75E-43)
            anie r4 = r4.a((java.lang.String) r3, (java.lang.String) r2, (int) r6, (java.lang.String) r0)     // Catch:{ all -> 0x032f }
            anih r4 = (defpackage.anih) r4     // Catch:{ all -> 0x032f }
            java.lang.String r6 = "Peer %s is ready for WebRTC signaling."
            usu r7 = r11.b     // Catch:{ all -> 0x032f }
            r4.a((java.lang.String) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x032f }
        L_0x004d:
            boolean r4 = r11.j()     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x02e4
            asmq r4 = r12.d     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            asmq r4 = defpackage.asmq.c     // Catch:{ all -> 0x032f }
        L_0x005a:
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x032f }
            usu r6 = r11.b     // Catch:{ all -> 0x032f }
            java.lang.String r6 = r6.a     // Catch:{ all -> 0x032f }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x02cd
            int r0 = r12.b     // Catch:{ all -> 0x032f }
            r2 = 3
            r3 = 2
            r4 = 0
            r6 = 0
            if (r0 != r5) goto L_0x0175
            org.webrtc.SessionDescription r12 = r11.l     // Catch:{ all -> 0x032f }
            if (r12 == 0) goto L_0x016e
            utj r0 = r11.g     // Catch:{ all -> 0x032f }
            usu r5 = r11.b     // Catch:{ all -> 0x032f }
            usu r7 = r11.j     // Catch:{ all -> 0x032f }
            asmu r8 = defpackage.asmu.f     // Catch:{ all -> 0x032f }
            aucd r8 = r8.o()     // Catch:{ all -> 0x032f }
            boolean r9 = r8.c     // Catch:{ all -> 0x032f }
            if (r9 == 0) goto L_0x0087
            r8.c()     // Catch:{ all -> 0x032f }
            r8.c = r6     // Catch:{ all -> 0x032f }
        L_0x0087:
            aucj r9 = r8.b     // Catch:{ all -> 0x032f }
            asmu r9 = (defpackage.asmu) r9     // Catch:{ all -> 0x032f }
            r9.e = r1     // Catch:{ all -> 0x032f }
            int r10 = r9.a     // Catch:{ all -> 0x032f }
            r3 = r3 | r10
            r9.a = r3     // Catch:{ all -> 0x032f }
            asmq r3 = defpackage.usv.a(r7)     // Catch:{ all -> 0x032f }
            boolean r7 = r8.c     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            r8.c()     // Catch:{ all -> 0x032f }
            r8.c = r6     // Catch:{ all -> 0x032f }
        L_0x00a0:
            aucj r7 = r8.b     // Catch:{ all -> 0x032f }
            asmu r7 = (defpackage.asmu) r7     // Catch:{ all -> 0x032f }
            r3.getClass()     // Catch:{ all -> 0x032f }
            r7.d = r3     // Catch:{ all -> 0x032f }
            int r3 = r7.a     // Catch:{ all -> 0x032f }
            r3 = r3 | r1
            r7.a = r3     // Catch:{ all -> 0x032f }
            asmp r3 = defpackage.asmp.c     // Catch:{ all -> 0x032f }
            aucd r3 = r3.o()     // Catch:{ all -> 0x032f }
            asms r7 = defpackage.asms.c     // Catch:{ all -> 0x032f }
            aucd r7 = r7.o()     // Catch:{ all -> 0x032f }
            java.lang.String r12 = r12.b     // Catch:{ all -> 0x032f }
            boolean r9 = r7.c     // Catch:{ all -> 0x032f }
            if (r9 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r7.c()     // Catch:{ all -> 0x032f }
            r7.c = r6     // Catch:{ all -> 0x032f }
        L_0x00c6:
            aucj r9 = r7.b     // Catch:{ all -> 0x032f }
            asms r9 = (defpackage.asms) r9     // Catch:{ all -> 0x032f }
            r12.getClass()     // Catch:{ all -> 0x032f }
            int r10 = r9.a     // Catch:{ all -> 0x032f }
            r10 = r10 | r1
            r9.a = r10     // Catch:{ all -> 0x032f }
            r9.b = r12     // Catch:{ all -> 0x032f }
            boolean r12 = r3.c     // Catch:{ all -> 0x032f }
            if (r12 != 0) goto L_0x00d9
            goto L_0x00de
        L_0x00d9:
            r3.c()     // Catch:{ all -> 0x032f }
            r3.c = r6     // Catch:{ all -> 0x032f }
        L_0x00de:
            aucj r12 = r3.b     // Catch:{ all -> 0x032f }
            asmp r12 = (defpackage.asmp) r12     // Catch:{ all -> 0x032f }
            aucj r7 = r7.i()     // Catch:{ all -> 0x032f }
            asms r7 = (defpackage.asms) r7     // Catch:{ all -> 0x032f }
            r7.getClass()     // Catch:{ all -> 0x032f }
            r12.b = r7     // Catch:{ all -> 0x032f }
            int r7 = r12.a     // Catch:{ all -> 0x032f }
            r1 = r1 | r7
            r12.a = r1     // Catch:{ all -> 0x032f }
            boolean r12 = r8.c     // Catch:{ all -> 0x032f }
            if (r12 != 0) goto L_0x00f7
            goto L_0x00fc
        L_0x00f7:
            r8.c()     // Catch:{ all -> 0x032f }
            r8.c = r6     // Catch:{ all -> 0x032f }
        L_0x00fc:
            aucj r12 = r8.b     // Catch:{ all -> 0x032f }
            asmu r12 = (defpackage.asmu) r12     // Catch:{ all -> 0x032f }
            aucj r1 = r3.i()     // Catch:{ all -> 0x032f }
            asmp r1 = (defpackage.asmp) r1     // Catch:{ all -> 0x032f }
            r1.getClass()     // Catch:{ all -> 0x032f }
            r12.c = r1     // Catch:{ all -> 0x032f }
            r12.b = r2     // Catch:{ all -> 0x032f }
            aucj r12 = r8.i()     // Catch:{ all -> 0x032f }
            asmu r12 = (defpackage.asmu) r12     // Catch:{ all -> 0x032f }
            byte[] r12 = r12.k()     // Catch:{ all -> 0x032f }
            boolean r12 = r0.a(r5, r12)     // Catch:{ all -> 0x032f }
            if (r12 != 0) goto L_0x0148
            usu r12 = r11.b     // Catch:{ all -> 0x032f }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x032f }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x032f }
            int r0 = r0.length()     // Catch:{ all -> 0x032f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x032f }
            int r0 = r0 + 25
            r1.<init>(r0)     // Catch:{ all -> 0x032f }
            java.lang.String r0 = "Unable to send offer to "
            r1.append(r0)     // Catch:{ all -> 0x032f }
            r1.append(r12)     // Catch:{ all -> 0x032f }
            java.lang.String r12 = "."
            r1.append(r12)     // Catch:{ all -> 0x032f }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x032f }
            r11.a((java.lang.String) r12)     // Catch:{ all -> 0x032f }
            monitor-exit(r11)
            return
        L_0x0148:
            r11.l = r4     // Catch:{ all -> 0x032f }
            java.util.List r12 = r11.m     // Catch:{ all -> 0x032f }
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x032f }
            if (r12 != 0) goto L_0x016c
            utj r12 = r11.g     // Catch:{ all -> 0x032f }
            aoru r0 = r11.e     // Catch:{ all -> 0x032f }
            usu r1 = r11.b     // Catch:{ all -> 0x032f }
            usu r2 = r11.j     // Catch:{ all -> 0x032f }
            java.util.List r3 = r11.m     // Catch:{ all -> 0x032f }
            asmu r2 = defpackage.usv.a(r2, r3)     // Catch:{ all -> 0x032f }
            byte[] r2 = r2.k()     // Catch:{ all -> 0x032f }
            r12.a(r0, r1, r2)     // Catch:{ all -> 0x032f }
            java.util.List r12 = r11.m     // Catch:{ all -> 0x032f }
            r12.clear()     // Catch:{ all -> 0x032f }
        L_0x016c:
            monitor-exit(r11)
            return
        L_0x016e:
            java.lang.String r12 = "Unable to send pending offer to remote peer: we never created an offer."
            r11.a((java.lang.String) r12)     // Catch:{ all -> 0x032f }
            monitor-exit(r11)
            return
        L_0x0175:
            r5 = 4
            if (r0 != r2) goto L_0x0258
            java.lang.Object r12 = r12.c     // Catch:{ all -> 0x032f }
            asmp r12 = (defpackage.asmp) r12     // Catch:{ all -> 0x032f }
            asms r12 = r12.b     // Catch:{ all -> 0x032f }
            if (r12 == 0) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            asms r12 = defpackage.asms.c     // Catch:{ all -> 0x032f }
        L_0x0183:
            int r0 = r12.a     // Catch:{ all -> 0x032f }
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0192
            org.webrtc.SessionDescription r4 = new org.webrtc.SessionDescription     // Catch:{ all -> 0x032f }
            org.webrtc.SessionDescription$Type r0 = org.webrtc.SessionDescription.Type.OFFER     // Catch:{ all -> 0x032f }
            java.lang.String r12 = r12.b     // Catch:{ all -> 0x032f }
            r4.<init>(r0, r12)     // Catch:{ all -> 0x032f }
            goto L_0x0193
        L_0x0192:
        L_0x0193:
            usp r12 = r11.a     // Catch:{ all -> 0x032f }
            r12.c(r4)     // Catch:{ all -> 0x032f }
            usp r12 = r11.a     // Catch:{ all -> 0x032f }
            org.webrtc.SessionDescription r12 = r12.b()     // Catch:{ all -> 0x032f }
            boolean r0 = r11.a((org.webrtc.SessionDescription) r12)     // Catch:{ all -> 0x032f }
            if (r0 == 0) goto L_0x0256
            utj r0 = r11.g     // Catch:{ all -> 0x032f }
            usu r2 = r11.b     // Catch:{ all -> 0x032f }
            usu r4 = r11.j     // Catch:{ all -> 0x032f }
            asmu r7 = defpackage.asmu.f     // Catch:{ all -> 0x032f }
            aucd r7 = r7.o()     // Catch:{ all -> 0x032f }
            boolean r8 = r7.c     // Catch:{ all -> 0x032f }
            if (r8 == 0) goto L_0x01b9
            r7.c()     // Catch:{ all -> 0x032f }
            r7.c = r6     // Catch:{ all -> 0x032f }
        L_0x01b9:
            aucj r8 = r7.b     // Catch:{ all -> 0x032f }
            asmu r8 = (defpackage.asmu) r8     // Catch:{ all -> 0x032f }
            r8.e = r3     // Catch:{ all -> 0x032f }
            int r9 = r8.a     // Catch:{ all -> 0x032f }
            r3 = r3 | r9
            r8.a = r3     // Catch:{ all -> 0x032f }
            asmq r3 = defpackage.usv.a(r4)     // Catch:{ all -> 0x032f }
            boolean r4 = r7.c     // Catch:{ all -> 0x032f }
            if (r4 != 0) goto L_0x01cd
            goto L_0x01d2
        L_0x01cd:
            r7.c()     // Catch:{ all -> 0x032f }
            r7.c = r6     // Catch:{ all -> 0x032f }
        L_0x01d2:
            aucj r4 = r7.b     // Catch:{ all -> 0x032f }
            asmu r4 = (defpackage.asmu) r4     // Catch:{ all -> 0x032f }
            r3.getClass()     // Catch:{ all -> 0x032f }
            r4.d = r3     // Catch:{ all -> 0x032f }
            int r3 = r4.a     // Catch:{ all -> 0x032f }
            r3 = r3 | r1
            r4.a = r3     // Catch:{ all -> 0x032f }
            asmm r3 = defpackage.asmm.c     // Catch:{ all -> 0x032f }
            aucd r3 = r3.o()     // Catch:{ all -> 0x032f }
            asms r4 = defpackage.asms.c     // Catch:{ all -> 0x032f }
            aucd r4 = r4.o()     // Catch:{ all -> 0x032f }
            java.lang.String r12 = r12.b     // Catch:{ all -> 0x032f }
            boolean r8 = r4.c     // Catch:{ all -> 0x032f }
            if (r8 != 0) goto L_0x01f3
            goto L_0x01f8
        L_0x01f3:
            r4.c()     // Catch:{ all -> 0x032f }
            r4.c = r6     // Catch:{ all -> 0x032f }
        L_0x01f8:
            aucj r8 = r4.b     // Catch:{ all -> 0x032f }
            asms r8 = (defpackage.asms) r8     // Catch:{ all -> 0x032f }
            r12.getClass()     // Catch:{ all -> 0x032f }
            int r9 = r8.a     // Catch:{ all -> 0x032f }
            r9 = r9 | r1
            r8.a = r9     // Catch:{ all -> 0x032f }
            r8.b = r12     // Catch:{ all -> 0x032f }
            boolean r12 = r3.c     // Catch:{ all -> 0x032f }
            if (r12 != 0) goto L_0x020b
            goto L_0x0210
        L_0x020b:
            r3.c()     // Catch:{ all -> 0x032f }
            r3.c = r6     // Catch:{ all -> 0x032f }
        L_0x0210:
            aucj r12 = r3.b     // Catch:{ all -> 0x032f }
            asmm r12 = (defpackage.asmm) r12     // Catch:{ all -> 0x032f }
            aucj r4 = r4.i()     // Catch:{ all -> 0x032f }
            asms r4 = (defpackage.asms) r4     // Catch:{ all -> 0x032f }
            r4.getClass()     // Catch:{ all -> 0x032f }
            r12.b = r4     // Catch:{ all -> 0x032f }
            int r4 = r12.a     // Catch:{ all -> 0x032f }
            r1 = r1 | r4
            r12.a = r1     // Catch:{ all -> 0x032f }
            boolean r12 = r7.c     // Catch:{ all -> 0x032f }
            if (r12 != 0) goto L_0x0229
            goto L_0x022e
        L_0x0229:
            r7.c()     // Catch:{ all -> 0x032f }
            r7.c = r6     // Catch:{ all -> 0x032f }
        L_0x022e:
            aucj r12 = r7.b     // Catch:{ all -> 0x032f }
            asmu r12 = (defpackage.asmu) r12     // Catch:{ all -> 0x032f }
            aucj r1 = r3.i()     // Catch:{ all -> 0x032f }
            asmm r1 = (defpackage.asmm) r1     // Catch:{ all -> 0x032f }
            r1.getClass()     // Catch:{ all -> 0x032f }
            r12.c = r1     // Catch:{ all -> 0x032f }
            r12.b = r5     // Catch:{ all -> 0x032f }
            aucj r12 = r7.i()     // Catch:{ all -> 0x032f }
            asmu r12 = (defpackage.asmu) r12     // Catch:{ all -> 0x032f }
            byte[] r12 = r12.k()     // Catch:{ all -> 0x032f }
            boolean r12 = r0.a(r2, r12)     // Catch:{ all -> 0x032f }
            if (r12 != 0) goto L_0x0256
            java.lang.String r12 = "Failed to send answer to peer."
            r11.a((java.lang.String) r12)     // Catch:{ all -> 0x032f }
            monitor-exit(r11)
            return
        L_0x0256:
            monitor-exit(r11)
            return
        L_0x0258:
            if (r0 != r5) goto L_0x027c
            java.lang.Object r12 = r12.c     // Catch:{ all -> 0x032f }
            asmm r12 = (defpackage.asmm) r12     // Catch:{ all -> 0x032f }
            asms r12 = r12.b     // Catch:{ all -> 0x032f }
            if (r12 == 0) goto L_0x0263
            goto L_0x0265
        L_0x0263:
            asms r12 = defpackage.asms.c     // Catch:{ all -> 0x032f }
        L_0x0265:
            int r0 = r12.a     // Catch:{ all -> 0x032f }
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0274
            org.webrtc.SessionDescription r4 = new org.webrtc.SessionDescription     // Catch:{ all -> 0x032f }
            org.webrtc.SessionDescription$Type r0 = org.webrtc.SessionDescription.Type.ANSWER     // Catch:{ all -> 0x032f }
            java.lang.String r12 = r12.b     // Catch:{ all -> 0x032f }
            r4.<init>(r0, r12)     // Catch:{ all -> 0x032f }
            goto L_0x0275
        L_0x0274:
        L_0x0275:
            usp r12 = r11.a     // Catch:{ all -> 0x032f }
            r12.b(r4)     // Catch:{ all -> 0x032f }
            monitor-exit(r11)
            return
        L_0x027c:
            r1 = 5
            if (r0 != r1) goto L_0x02cb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x032f }
            r0.<init>()     // Catch:{ all -> 0x032f }
            int r2 = r12.b     // Catch:{ all -> 0x032f }
            if (r2 != r1) goto L_0x02be
            java.lang.Object r12 = r12.c     // Catch:{ all -> 0x032f }
            asmo r12 = (defpackage.asmo) r12     // Catch:{ all -> 0x032f }
            aucx r12 = r12.a     // Catch:{ all -> 0x032f }
            int r1 = r12.size()     // Catch:{ all -> 0x032f }
        L_0x0292:
            if (r6 >= r1) goto L_0x02be
            java.lang.Object r2 = r12.get(r6)     // Catch:{ all -> 0x032f }
            asmn r2 = (defpackage.asmn) r2     // Catch:{ all -> 0x032f }
            int r3 = r2.a     // Catch:{ all -> 0x032f }
            r5 = r3 & 1
            if (r5 == 0) goto L_0x02b4
            r5 = r3 & 2
            if (r5 == 0) goto L_0x02b4
            r3 = r3 & 4
            if (r3 == 0) goto L_0x02b4
            org.webrtc.IceCandidate r3 = new org.webrtc.IceCandidate     // Catch:{ all -> 0x032f }
            java.lang.String r5 = r2.c     // Catch:{ all -> 0x032f }
            int r7 = r2.d     // Catch:{ all -> 0x032f }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x032f }
            r3.<init>(r5, r7, r2)     // Catch:{ all -> 0x032f }
            goto L_0x02b5
        L_0x02b4:
            r3 = r4
        L_0x02b5:
            if (r3 != 0) goto L_0x02b8
            goto L_0x02bb
        L_0x02b8:
            r0.add(r3)     // Catch:{ all -> 0x032f }
        L_0x02bb:
            int r6 = r6 + 1
            goto L_0x0292
        L_0x02be:
            usp r12 = r11.a     // Catch:{ all -> 0x032f }
            boolean r12 = r12.a((java.util.List) r0)     // Catch:{ all -> 0x032f }
            if (r12 != 0) goto L_0x02cb
            java.lang.String r12 = "Could not add remote ice candidates."
            r11.a((java.lang.String) r12)     // Catch:{ all -> 0x032f }
        L_0x02cb:
            monitor-exit(r11)
            return
        L_0x02cd:
            jjg r12 = defpackage.ulh.a     // Catch:{ all -> 0x032f }
            anie r12 = r12.d()     // Catch:{ all -> 0x032f }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x032f }
            r1 = 349(0x15d, float:4.89E-43)
            anie r12 = r12.a((java.lang.String) r3, (java.lang.String) r2, (int) r1, (java.lang.String) r0)     // Catch:{ all -> 0x032f }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x032f }
            java.lang.String r0 = "Ignoring WebRTC frame: we are only listening for another peer."
            r12.a((java.lang.String) r0)     // Catch:{ all -> 0x032f }
            monitor-exit(r11)
            return
        L_0x02e4:
            jjg r12 = defpackage.ulh.a     // Catch:{ all -> 0x032f }
            anie r12 = r12.d()     // Catch:{ all -> 0x032f }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x032f }
            r1 = 343(0x157, float:4.8E-43)
            anie r12 = r12.a((java.lang.String) r3, (java.lang.String) r2, (int) r1, (java.lang.String) r0)     // Catch:{ all -> 0x032f }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x032f }
            java.lang.String r0 = "Ignoring WebRTC frame: we are not currently listening for signaling messages."
            r12.a((java.lang.String) r0)     // Catch:{ all -> 0x032f }
            monitor-exit(r11)
            return
        L_0x02fb:
            java.lang.String r12 = "Invalid WebRTC frame: sender id is missing."
            r11.a((java.lang.String) r12)     // Catch:{ all -> 0x032f }
            monitor-exit(r11)
            return
        L_0x0302:
            r12 = move-exception
            jjg r0 = defpackage.ulh.a     // Catch:{ all -> 0x032f }
            anie r0 = r0.c()     // Catch:{ all -> 0x032f }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x032f }
            r0.a((java.lang.Throwable) r12)     // Catch:{ all -> 0x032f }
            java.lang.String r12 = "umm"
            java.lang.String r1 = "a"
            r2 = 170(0xaa, float:2.38E-43)
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r12 = r0.a((java.lang.String) r12, (java.lang.String) r1, (int) r2, (java.lang.String) r3)     // Catch:{ all -> 0x032f }
            anih r12 = (defpackage.anih) r12     // Catch:{ all -> 0x032f }
            java.lang.String r0 = "Disconnecting WebRTC: %s"
            java.lang.String r1 = "Failed to parse tachyon signaling frame."
            r12.a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x032f }
            r11.c()     // Catch:{ all -> 0x032f }
            monitor-exit(r11)
            return
        L_0x0328:
            java.lang.String r12 = "We received a WebRTC frame before we started signaling."
            r11.a((java.lang.String) r12)     // Catch:{ all -> 0x032f }
            monitor-exit(r11)
            return
        L_0x032f:
            r12 = move-exception
            monitor-exit(r11)
            goto L_0x0333
        L_0x0332:
            throw r12
        L_0x0333:
            goto L_0x0332
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umm.a(byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = ((android.net.ConnectivityManager) r2.f.getSystemService("connectivity")).getActiveNetworkInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r2 = this;
            aymi r0 = defpackage.aymi.a
            aymj r0 = r0.a()
            boolean r0 = r0.aH()
            if (r0 == 0) goto L_0x0024
            android.content.Context r0 = r2.f
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0024
            r0 = 1
            return r0
        L_0x0024:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umm.a():boolean");
    }

    public final boolean a(uml uml, usu usu) {
        this.c = uml;
        this.j = usu;
        if (this.a == null) {
            String a2 = usz.a(this.f, usu.a);
            if (a2 == null) {
                a("Unable to get droid guard result.");
                return false;
            } else if (this.g == null) {
                utj a3 = a(this.f, usu, a2);
                this.g = a3;
                if (!a3.a() || !this.g.a(this.n)) {
                    c();
                    return false;
                }
                if (uml == uml.ANSWERER) {
                    utj utj = this.g;
                    usu usu2 = this.b;
                    aucd o2 = asmu.f.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    asmu asmu = (asmu) o2.b;
                    asmu.e = 4;
                    asmu.a |= 2;
                    asmq a4 = usv.a(usu);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    asmu asmu2 = (asmu) o2.b;
                    a4.getClass();
                    asmu2.d = a4;
                    asmu2.a |= 1;
                    asmr asmr = asmr.a;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    asmu asmu3 = (asmu) o2.b;
                    asmr.getClass();
                    asmu3.c = asmr;
                    asmu3.b = 6;
                    if (!utj.a(usu2, ((asmu) o2.i()).k())) {
                        String valueOf = String.valueOf(this.b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        sb.append("Could not send signaling poke to peer ");
                        sb.append(valueOf);
                        sb.append(".");
                        a(sb.toString());
                        return false;
                    }
                }
                List c2 = this.g.c();
                if (c2.isEmpty()) {
                    a("Failed to retrieve any ice servers from tachyon.");
                    return false;
                }
                this.a = new usp(this.f, this.o, this.p, c2, this.d);
                return true;
            } else {
                b("Tried to initialize WebRTC without shutting down signaling first.");
                return false;
            }
        } else {
            b("Tried to initialize WebRTC without shutting down the previous connection.");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(defpackage.usu r9, defpackage.umk r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "umm"
            java.lang.String r1 = "a"
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            boolean r3 = r8.a()     // Catch:{ all -> 0x00ae }
            r4 = 0
            if (r3 != 0) goto L_0x0028
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x00ae }
            anie r9 = r9.d()     // Catch:{ all -> 0x00ae }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x00ae }
            r10 = 194(0xc2, float:2.72E-43)
            anie r9 = r9.a((java.lang.String) r0, (java.lang.String) r1, (int) r10, (java.lang.String) r2)     // Catch:{ all -> 0x00ae }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x00ae }
            java.lang.String r10 = "Cannot start accepting WebRTC connections because WebRTC is not available."
            r9.a((java.lang.String) r10)     // Catch:{ all -> 0x00ae }
            r8.c()     // Catch:{ all -> 0x00ae }
            monitor-exit(r8)
            return r4
        L_0x0028:
            boolean r3 = r8.d()     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x0045
            jjg r10 = defpackage.ulh.a     // Catch:{ all -> 0x00ae }
            anie r10 = r10.d()     // Catch:{ all -> 0x00ae }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x00ae }
            r3 = 201(0xc9, float:2.82E-43)
            anie r10 = r10.a((java.lang.String) r0, (java.lang.String) r1, (int) r3, (java.lang.String) r2)     // Catch:{ all -> 0x00ae }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "We are already accepting WebRTC connections for %s"
            r10.a((java.lang.String) r0, (java.lang.Object) r9)     // Catch:{ all -> 0x00ae }
            monitor-exit(r8)
            return r4
        L_0x0045:
            uml r3 = r8.c     // Catch:{ all -> 0x00ae }
            uml r5 = defpackage.uml.NONE     // Catch:{ all -> 0x00ae }
            if (r3 == r5) goto L_0x0064
            jjg r9 = defpackage.ulh.a     // Catch:{ all -> 0x00ae }
            anie r9 = r9.c()     // Catch:{ all -> 0x00ae }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x00ae }
            r10 = 206(0xce, float:2.89E-43)
            anie r9 = r9.a((java.lang.String) r0, (java.lang.String) r1, (int) r10, (java.lang.String) r2)     // Catch:{ all -> 0x00ae }
            anih r9 = (defpackage.anih) r9     // Catch:{ all -> 0x00ae }
            java.lang.String r10 = "Cannot start accepting WebRTC connections because we are already acting as a %s."
            uml r0 = r8.c     // Catch:{ all -> 0x00ae }
            r9.a((java.lang.String) r10, (java.lang.Object) r0)     // Catch:{ all -> 0x00ae }
            monitor-exit(r8)
            return r4
        L_0x0064:
            uml r3 = defpackage.uml.OFFERER     // Catch:{ all -> 0x00ae }
            boolean r3 = r8.a((defpackage.uml) r3, (defpackage.usu) r9)     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x00ac
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x00ae }
            ulx r3 = new ulx     // Catch:{ all -> 0x00ae }
            r3.<init>(r8)     // Catch:{ all -> 0x00ae }
            long r5 = defpackage.aymi.E()     // Catch:{ all -> 0x00ae }
            java.util.concurrent.ScheduledExecutorService r7 = r8.i     // Catch:{ all -> 0x00ae }
            tfu r3 = defpackage.tfu.a(r3, r5, r7)     // Catch:{ all -> 0x00ae }
            r8.h = r3     // Catch:{ all -> 0x00ae }
            usp r3 = r8.a     // Catch:{ all -> 0x00ae }
            org.webrtc.SessionDescription r3 = r3.a()     // Catch:{ all -> 0x00ae }
            boolean r5 = r8.a((org.webrtc.SessionDescription) r3)     // Catch:{ all -> 0x00ae }
            if (r5 == 0) goto L_0x00ac
            r8.l = r3     // Catch:{ all -> 0x00ae }
            usp r3 = r8.a     // Catch:{ all -> 0x00ae }
            aosh r3 = r3.b     // Catch:{ all -> 0x00ae }
            r8.a((defpackage.aorr) r3, (defpackage.umk) r10)     // Catch:{ all -> 0x00ae }
            jjg r10 = defpackage.ulh.a     // Catch:{ all -> 0x00ae }
            anie r10 = r10.d()     // Catch:{ all -> 0x00ae }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x00ae }
            r3 = 230(0xe6, float:3.22E-43)
            anie r10 = r10.a((java.lang.String) r0, (java.lang.String) r1, (int) r3, (java.lang.String) r2)     // Catch:{ all -> 0x00ae }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "Started listening for WebRTC connections as %s."
            r10.a((java.lang.String) r0, (java.lang.Object) r9)     // Catch:{ all -> 0x00ae }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x00ac:
            monitor-exit(r8)
            return r4
        L_0x00ae:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.umm.a(usu, umk):boolean");
    }
}
