package defpackage;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.io.IOException;

/* renamed from: hsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hsa {
    private boolean a = awsx.c();
    private long b = awsx.b();
    private hsd c = null;
    private boolean d = false;
    private int e = 2;
    private hpq f = null;

    private static avqy a(hrz hrz) {
        aucd o = avqy.ab.o();
        o.getClass();
        a((hrv) new hrr(o), hrz.a(hry.EVENTS_CREATED));
        o.getClass();
        a((hrv) new hrs(o), hrz.a(hry.EVENTS_LOGGED));
        o.getClass();
        a((hrv) new hrt(o), hrz.a(hry.EVENTS_CLIENT_EXECUTED));
        o.getClass();
        a((hrv) new hru(o), hrz.a(hry.EVENTS_MODIFIED));
        o.getClass();
        a((hrv) new hpv(o), hrz.a(hry.EVENTS_CLIENT_SAMPLED));
        o.getClass();
        a((hrv) new hpw(o), hrz.a(hry.EVENTS_CLIENT_SERIALIZED));
        o.getClass();
        a((hrv) new hpx(o), hrz.a(hry.EVENTS_CLIENT_SENT));
        o.getClass();
        a((hrv) new hpy(o), hrz.a(hry.DROPS_BY_MODIFIER_EXCEPTION));
        o.getClass();
        a((hrv) new hpz(o), hrz.a(hry.DROPS_BY_MODIFIER));
        o.getClass();
        a((hrv) new hqa(o), hrz.a(hry.DROPS_BY_CLIENT_SAMPLING));
        o.getClass();
        a((hrv) new hqb(o), hrz.a(hry.DROPS_BY_CLIENT_SERIALIZATION_EXCEPTION));
        o.getClass();
        a((hrv) new hqc(o), hrz.a(hry.EVENTS_SERVICE_RECEIVED));
        o.getClass();
        a((hrv) new hqd(o), hrz.a(hry.EVENTS_SERVICE_EXECUTED));
        o.getClass();
        a((hrv) new hqe(o), hrz.a(hry.EVENTS_AFTER_SIDEWINDER));
        o.getClass();
        a((hrv) new hqg(o), hrz.a(hry.EVENTS_SERVICE_SAMPLED));
        o.getClass();
        a((hrv) new hqh(o), hrz.a(hry.EVENTS_SERVICE_SERIALIZED));
        o.getClass();
        a((hrv) new hqi(o), hrz.a(hry.EVENTS_WRITTEN));
        o.getClass();
        a((hrv) new hqj(o), hrz.a(hry.EVENTS_SERVICE_LOGGED));
        o.getClass();
        a((hrv) new hqk(o), hrz.a(hry.DROPS_BY_SIDEWINDER));
        o.getClass();
        a((hrv) new hql(o), hrz.a(hry.DROPS_BY_SERVICE_SAMPLING));
        o.getClass();
        a((hrv) new hqm(o), hrz.a(hry.DROPS_BY_QOS_TIER_OVERRIDE));
        o.getClass();
        a((hrv) new hqn(o), hrz.a(hry.DROPS_BY_LOG_CAP));
        o.getClass();
        a((hrv) new hqo(o), hrz.a(hry.DROPS_BY_OVERFLOW));
        o.getClass();
        a((hrv) new hqp(o), hrz.a(hry.DROPS_BY_STORAGE_SIZE_EXCEPTION));
        o.getClass();
        a((hrv) new hqr(o), hrz.a(hry.DROPS_BY_EVENT_SIZE));
        o.getClass();
        a((hrv) new hqs(o), hrz.a(hry.DROPS_BY_WRITE_FAILURE));
        o.getClass();
        a((hrv) new hqt(o), hrz.a(hry.DROPS_BY_WRITE_EXCEPTION));
        o.getClass();
        a((hrv) new hqu(o), hrz.a(hry.WRITE_EXCEPTIONS));
        o.getClass();
        a((hrv) new hqv(o), hrz.a(hry.EVENTS_UPLOADED));
        o.getClass();
        a((hrv) new hqw(o), hrz.a(hry.DROPS_BY_BAD_REQUEST));
        o.getClass();
        a((hrv) new hqx(o), hrz.a(hry.DROPS_BY_PARTIAL_FAILURE_WITHOUT_STATUS));
        o.getClass();
        a((hrv) new hqy(o), hrz.a(hry.DROPS_BY_OVERSIZE));
        o.getClass();
        a((hrv) new hqz(o), hrz.a(hry.DROPS_BY_PLC_HASH_COLLISION));
        o.getClass();
        a((hrv) new hra(o), hrz.a(hry.DROPS_BY_PLC_TO_BYTES_FAIL));
        o.getClass();
        a((hrv) new hrc(o), hrz.a(hry.DROPS_BY_LOG_FILE_TOO_OLD));
        o.getClass();
        a((hrv) new hrd(o), hrz.a(hry.DROPS_BY_CORRUPTED_PLC_FILE));
        o.getClass();
        a((hrv) new hre(o), hrz.a(hry.DROPS_BY_FAIL_TO_DELETE_PLC_DIR));
        o.getClass();
        a((hrv) new hrf(o), hrz.a(hry.DROPS_BY_DIR_HAS_NO_PLC_FILE));
        o.getClass();
        a((hrv) new hrg(o), hrz.a(hry.DROPS_BY_CORRUPTED_LOG_FILE_NAME));
        o.getClass();
        a((hrv) new hrh(o), hrz.a(hry.DROPS_BY_CORRUPTED_LOG_FILE_CONTENTS));
        o.getClass();
        a((hrv) new hri(o), hrz.a(hry.DROPS_BY_FAIL_TO_READ_PLC_FILE));
        o.getClass();
        a((hrv) new hrj(o), hrz.a(hry.DROPS_BY_FAIL_TO_PARSE_PLC_DIR_NAME));
        o.getClass();
        a((hrv) new hrk(o), hrz.a(hry.DROPS_BY_PLC_HASH_MISMATCH));
        o.getClass();
        a((hrv) new hrl(o), hrz.a(hry.DROPS_BY_FAIL_TO_PARSE_PLC_PROTO));
        o.getClass();
        a((hrv) new hrn(o), hrz.a(hry.DROPS_BY_DIR_TRAVERSAL_ATTACK));
        o.getClass();
        a((hrv) new hro(o), hrz.a(hry.DROPS_BY_RESTRICTION));
        o.getClass();
        a((hrv) new hrp(o), hrz.a(hry.EVENTS_SERVICE_DISPATCHED));
        return (avqy) o.i();
    }

    private static avqu b(int i) {
        aucd o = avqu.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avqu avqu = (avqu) o.b;
        avqu.b = i - 1;
        avqu.a |= 1;
        return (avqu) o.i();
    }

    private final synchronized boolean f() {
        return this.b != awsx.b();
    }

    private final synchronized avqx g() {
        aucd o;
        o = avqx.e.o();
        o.getClass();
        a((hrv) new hrb(o), this.c.a(hsb.INCREMENTS_DROPPED_BY_INVALID_SOURCE));
        o.getClass();
        a((hrv) new hrm(o), this.c.a(hsb.INCREMENTS_DROPPED_BY_SOURCE_CAPACITY));
        o.getClass();
        a((hrv) new hrq(o), this.c.a(hsb.INVALID_INCREMENTS));
        return (avqx) o.i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0210, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.avqu c() {
        /*
            r15 = this;
            monitor-enter(r15)
            int r0 = r15.e     // Catch:{ all -> 0x0211 }
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L_0x020f
            boolean r3 = r15.d     // Catch:{ all -> 0x0211 }
            if (r3 == 0) goto L_0x020f
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0208
            r0 = 6
            r5 = 5
            hsd r6 = r15.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r7 = r6.f     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r7 != r4) goto L_0x001d
            avqu r0 = b(r5)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            monitor-exit(r15)
            return r0
        L_0x001d:
            if (r7 != r3) goto L_0x0025
            avqu r0 = b(r0)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            monitor-exit(r15)
            return r0
        L_0x0025:
            boolean r3 = r6.c()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r3 == 0) goto L_0x01eb
            avqu r3 = defpackage.avqu.j     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            aucd r3 = r3.o()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r6 = r3.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r7 = 0
            if (r6 != 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            r3.c()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r3.c = r7     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x003c:
            aucj r6 = r3.b     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqu r6 = (defpackage.avqu) r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r8 = 1
            r6.b = r8     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r9 = r6.a     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r9 = r9 | r8
            r6.a = r9     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hsd r6 = r15.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6.f()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hpq r6 = r6.g     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r9 = 16
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r9)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r11 = 12
            long r11 = r6.c(r11)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10.putLong(r7, r11)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r11 = 20
            long r11 = r6.c(r11)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6 = 8
            r10.putLong(r6, r11)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            byte[] r10 = r10.array()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            auay r10 = defpackage.auay.a((byte[]) r10)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r11 = r3.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r11 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            r3.c()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r3.c = r7     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x007b:
            aucj r11 = r3.b     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqu r11 = (defpackage.avqu) r11     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10.getClass()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r12 = r11.a     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r12 = r12 | r2
            r11.a = r12     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r11.c = r10     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r3.getClass()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hpu r10 = new hpu     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10.<init>(r3)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hsd r11 = r15.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r11 = r11.d()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            a((defpackage.hrv) r10, (int) r11)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hsd r10 = r15.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10.f()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hpq r10 = r10.g     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r11 = 32
            long r12 = r10.c(r11)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r10 = r3.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r10 != 0) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            r3.c()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r3.c = r7     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x00b1:
            aucj r10 = r3.b     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqu r10 = (defpackage.avqu) r10     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r14 = r10.a     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6 = r6 | r14
            r10.a = r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10.e = r12     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hsd r6 = r15.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6.f()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hpq r6 = r6.g     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10 = 40
            long r12 = r6.c(r10)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r6 = r3.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r6 != 0) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            r3.c()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r3.c = r7     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x00d3:
            aucj r6 = r3.b     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqu r6 = (defpackage.avqu) r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r10 = r6.a     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r9 = r9 | r10
            r6.a = r9     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6.f = r12     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqx r6 = r15.g()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r9 = r3.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r9 != 0) goto L_0x00e7
            goto L_0x00ec
        L_0x00e7:
            r3.c()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r3.c = r7     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x00ec:
            aucj r9 = r3.b     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqu r9 = (defpackage.avqu) r9     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6.getClass()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r9.g = r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r6 = r9.a     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6 = r6 | r11
            r9.a = r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hsd r6 = r15.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6.getClass()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hqf r9 = new hqf     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r9.<init>(r6)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqy r6 = a((defpackage.hrz) r9)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r9 = r3.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r9 != 0) goto L_0x010d
            goto L_0x0112
        L_0x010d:
            r3.c()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r3.c = r7     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x0112:
            aucj r9 = r3.b     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqu r9 = (defpackage.avqu) r9     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6.getClass()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r9.h = r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r6 = r9.a     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6 = r6 | 64
            r9.a = r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hsd r6 = r15.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r9 = r6.f()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r9 = defpackage.hsc.b(r9)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r9 == 0) goto L_0x0130
            hsf r6 = r6.e     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            goto L_0x0132
        L_0x0130:
            hsf r6 = r6.d     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x0132:
            int r9 = r6.a()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r9 == 0) goto L_0x013e
            hse r9 = new hse     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r9.<init>(r6)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            goto L_0x013f
        L_0x013e:
            r9 = r1
        L_0x013f:
            if (r9 != 0) goto L_0x0149
            aucj r1 = r3.i()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqu r1 = (defpackage.avqu) r1     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            monitor-exit(r15)
            return r1
        L_0x0149:
            avqv r6 = defpackage.avqv.d     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            aucd r6 = r6.o()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            java.lang.String r10 = r9.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r11 = r6.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r11 != 0) goto L_0x0156
            goto L_0x015b
        L_0x0156:
            r6.c()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6.c = r7     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x015b:
            aucj r11 = r6.b     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqv r11 = (defpackage.avqv) r11     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10.getClass()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r12 = r11.a     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r12 = r12 | r8
            r11.a = r12     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r11.b = r10     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r9.getClass()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hqq r10 = new hqq     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10.<init>(r9)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqy r10 = a((defpackage.hrz) r10)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r11 = r6.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r11 != 0) goto L_0x017a
            goto L_0x017f
        L_0x017a:
            r6.c()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6.c = r7     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x017f:
            aucj r11 = r6.b     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqv r11 = (defpackage.avqv) r11     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10.getClass()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r11.c = r10     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r10 = r11.a     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10 = r10 | r2
            r11.a = r10     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            aucj r6 = r6.i()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqv r6 = (defpackage.avqv) r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r10 = r3.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r10 != 0) goto L_0x0198
            goto L_0x019d
        L_0x0198:
            r3.c()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r3.c = r7     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x019d:
            aucj r10 = r3.b     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            avqu r10 = (defpackage.avqu) r10     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r6.getClass()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            aucx r11 = r10.i     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            boolean r11 = r11.a()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r11 == 0) goto L_0x01ad
            goto L_0x01b5
        L_0x01ad:
            aucx r11 = r10.i     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10.i = r11     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x01b5:
            aucx r10 = r10.i     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r10.add(r6)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r6 = r9.a     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r6 = r6 + r8
            r9.a = r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hsf r10 = r9.e     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r10 = r10.a()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            if (r6 >= r10) goto L_0x01e8
            int r6 = r9.d     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            hsf r10 = r9.e     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r11 = r10.d     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r6 = r6 + r11
            r9.b = r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            java.lang.String r6 = r10.a(r6)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r9.c = r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r6 = r9.b     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            java.lang.String r10 = r9.c     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r10 = r10.length()     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            int r6 = r6 + r10
            int r6 = r6 + r8
            int r6 = defpackage.hpp.a(r6)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            r9.d = r6     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            goto L_0x013f
        L_0x01e8:
            r9 = r1
            goto L_0x013f
        L_0x01eb:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            java.lang.String r2 = "store has no snapshot"
            r1.<init>(r2)     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
            throw r1     // Catch:{ IOException -> 0x0201, hpt -> 0x01fa, IllegalStateException -> 0x01f3 }
        L_0x01f3:
            r0 = move-exception
            avqu r0 = b(r4)     // Catch:{ all -> 0x0211 }
            monitor-exit(r15)
            return r0
        L_0x01fa:
            r1 = move-exception
            avqu r0 = b(r0)     // Catch:{ all -> 0x0211 }
            monitor-exit(r15)
            return r0
        L_0x0201:
            r0 = move-exception
            avqu r0 = b(r5)     // Catch:{ all -> 0x0211 }
            monitor-exit(r15)
            return r0
        L_0x0208:
            avqu r0 = b(r3)     // Catch:{ all -> 0x0211 }
            monitor-exit(r15)
            return r0
        L_0x020f:
            monitor-exit(r15)
            return r1
        L_0x0211:
            r0 = move-exception
            monitor-exit(r15)
            goto L_0x0215
        L_0x0214:
            throw r0
        L_0x0215:
            goto L_0x0214
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsa.c():avqu");
    }

    public final synchronized void d() {
        this.d = false;
        if (this.e == 1) {
            this.c.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0074, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = defpackage.awsx.c()     // Catch:{ all -> 0x0075 }
            r1 = 2
            if (r0 == 0) goto L_0x0032
            int r0 = r4.e     // Catch:{ all -> 0x0075 }
            if (r0 == r1) goto L_0x002c
            r1 = 3
            r2 = 1
            if (r0 == r1) goto L_0x0026
            hsd r0 = r4.c     // Catch:{ all -> 0x0075 }
            int r0 = r0.f     // Catch:{ all -> 0x0075 }
            if (r0 == r2) goto L_0x001b
            r4.a((int) r2)     // Catch:{ all -> 0x0075 }
            monitor-exit(r4)
            return
        L_0x001b:
            boolean r0 = r4.f()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0024
            r4.a((int) r2)     // Catch:{ all -> 0x0075 }
        L_0x0024:
            monitor-exit(r4)
            return
        L_0x0026:
            r4.a((int) r2)     // Catch:{ all -> 0x0075 }
            monitor-exit(r4)
            return
        L_0x002c:
            r4.a((int) r1)     // Catch:{ all -> 0x0075 }
            monitor-exit(r4)
            return
        L_0x0032:
            int r0 = r4.e     // Catch:{ all -> 0x0075 }
            if (r0 == r1) goto L_0x0073
            hpq r0 = r4.f     // Catch:{ IOException -> 0x0041 }
            r2 = 0
            int r3 = r0.a()     // Catch:{ IOException -> 0x0041 }
            defpackage.hpr.a(r0, r2, r3)     // Catch:{ IOException -> 0x0041 }
            goto L_0x0049
        L_0x0041:
            r0 = move-exception
            java.lang.String r0 = "Funnel"
            java.lang.String r2 = "Failed to clear the buffer."
            android.util.Log.e(r0, r2)     // Catch:{ all -> 0x0075 }
        L_0x0049:
            ihs r0 = defpackage.ihs.b()     // Catch:{ all -> 0x0075 }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x0075 }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = "clearcut"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0075 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = "funnel"
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0075 }
            boolean r0 = r0.delete()     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = "Funnel"
            java.lang.String r2 = "Failed to delete the buffer file."
            android.util.Log.e(r0, r2)     // Catch:{ all -> 0x0075 }
        L_0x006c:
            r4.e = r1     // Catch:{ all -> 0x0075 }
            r0 = 0
            r4.f = r0     // Catch:{ all -> 0x0075 }
            r4.c = r0     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r4)
            return
        L_0x0075:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsa.e():void");
    }

    public final synchronized void b() {
        this.d = true;
        if (this.e == 1) {
            try {
                if (this.c.c() && ((long) this.c.d()) >= awsx.a.a().d()) {
                    Log.w("Funnel", "Exceeded max retries, clearing snapshot.");
                    this.c.b();
                }
                this.c.a();
            } catch (hpt | IOException e2) {
                Log.w("Funnel", "Exception while snapshotting.", e2);
            }
        }
    }

    public final synchronized void b(String str, hry hry, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        hsf hsf;
        hse hse;
        int i5;
        int i6;
        String str2 = str;
        hry hry2 = hry;
        int i7 = i;
        synchronized (this) {
            if (this.e == 1) {
                hsd hsd = this.c;
                if (hry2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                iva.b(z);
                if (hsd.f == 1) {
                    if (i7 > 0) {
                        try {
                            boolean b2 = hsc.b(hsd.e());
                            if (!b2) {
                                i3 = hsd.c;
                            } else {
                                i3 = hsd.b;
                            }
                            hpr.b(hsd.g, i3 + hry2.ad, i7);
                            if (hsg.a(str)) {
                                if (!b2) {
                                    hsf = hsd.e;
                                } else {
                                    hsf = hsd.d;
                                }
                                iva.b(hsg.a(str));
                                int a2 = hsf.a();
                                int i8 = hsf.b;
                                int i9 = 0;
                                loop0:
                                while (true) {
                                    if (i9 < a2) {
                                        int b3 = hsf.b(i8);
                                        int i10 = i8 + 1;
                                        int a3 = hpp.a(i10 + b3);
                                        if (b3 == str.length()) {
                                            int i11 = 0;
                                            while (i11 < b3) {
                                                i6 = a2;
                                                if (str2.charAt(i11) == ((char) hsf.e.a(i10 + i11))) {
                                                    i11++;
                                                    a2 = i6;
                                                }
                                            }
                                            hse = new hse(hsf, i9, i8, a3, str);
                                            break loop0;
                                        }
                                        i6 = a2;
                                        i8 = a3 + hsf.d;
                                        i9++;
                                        a2 = i6;
                                    } else {
                                        iva.b(true);
                                        iva.b(i8 >= 0);
                                        iva.b(str2 != null);
                                        int i12 = i8 + 1;
                                        int a4 = hpp.a(str.length() + i12);
                                        if (hsf.d + a4 <= hsf.c) {
                                            hsf.e.a(i8, (byte) str.length());
                                            int i13 = i12;
                                            int i14 = 0;
                                            while (i14 < str.length()) {
                                                hsf.e.a(i13, (byte) str2.charAt(i14));
                                                i14++;
                                                i13++;
                                            }
                                            hpr.a(hsf.e, a4, hsf.d);
                                            hpr.b(hsf.e, hsf.a, 1);
                                            hse = new hse(hsf, i9, i8, a4, str);
                                        } else {
                                            hse = null;
                                        }
                                    }
                                }
                                if (hse != null) {
                                    hpr.b(hse.e.e, hse.d + hry2.ad, i7);
                                    return;
                                }
                                if (!b2) {
                                    i5 = hsd.a;
                                } else {
                                    i5 = 80;
                                }
                                hpr.b(hsd.g, i5 + hsb.INCREMENTS_DROPPED_BY_SOURCE_CAPACITY.l, i7);
                                return;
                            }
                            if (!b2) {
                                i4 = hsd.a;
                            } else {
                                i4 = 80;
                            }
                            hpr.b(hsd.g, i4 + hsb.INCREMENTS_DROPPED_BY_INVALID_SOURCE.l, i7);
                        } catch (IOException e2) {
                            hsd.f = 3;
                        } catch (hpt e3) {
                            hsd.f = 4;
                        }
                    } else {
                        hsb hsb = hsb.INVALID_INCREMENTS;
                        if (!hsc.b(hsd.e())) {
                            i2 = hsd.a;
                        } else {
                            i2 = 80;
                        }
                        hpr.b(hsd.g, i2 + hsb.l, 1);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a(int r15) {
        /*
            r14 = this;
            monitor-enter(r14)
            r0 = 2
            r1 = 1
            if (r15 == r0) goto L_0x0006
            goto L_0x0012
        L_0x0006:
            boolean r2 = defpackage.awsx.c()     // Catch:{ all -> 0x0126 }
            if (r2 == 0) goto L_0x0128
            int r2 = r14.e     // Catch:{ all -> 0x0126 }
            if (r2 != r1) goto L_0x0012
            monitor-exit(r14)
            return
        L_0x0012:
            r14.e = r0     // Catch:{ all -> 0x0126 }
            r0 = 0
            r14.f = r0     // Catch:{ all -> 0x0126 }
            r14.c = r0     // Catch:{ all -> 0x0126 }
            boolean r2 = defpackage.awsx.c()     // Catch:{ all -> 0x0126 }
            r14.a = r2     // Catch:{ all -> 0x0126 }
            long r2 = defpackage.awsx.b()     // Catch:{ all -> 0x0126 }
            r14.b = r2     // Catch:{ all -> 0x0126 }
            r2 = 0
            r14.d = r2     // Catch:{ all -> 0x0126 }
            boolean r3 = r14.a     // Catch:{ all -> 0x0126 }
            if (r3 == 0) goto L_0x0052
            ihs r3 = defpackage.ihs.b()     // Catch:{ all -> 0x0126 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0126 }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x0126 }
            java.lang.String r5 = "clearcut"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0126 }
            boolean r3 = r4.exists()     // Catch:{ all -> 0x0126 }
            r5 = 3
            if (r3 != 0) goto L_0x0054
            boolean r3 = r4.mkdir()     // Catch:{ all -> 0x0126 }
            if (r3 == 0) goto L_0x0049
            goto L_0x0054
        L_0x0049:
            java.lang.String r15 = "Funnel"
            java.lang.String r0 = "Failed find or create clearcut directory."
            android.util.Log.e(r15, r0)     // Catch:{ all -> 0x0126 }
            r14.e = r5     // Catch:{ all -> 0x0126 }
        L_0x0052:
            monitor-exit(r14)
            return
        L_0x0054:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0126 }
            java.lang.String r6 = "funnel"
            r3.<init>(r4, r6)     // Catch:{ all -> 0x0126 }
            long r6 = r14.b     // Catch:{ IOException -> 0x0118 }
            int r4 = (int) r6     // Catch:{ IOException -> 0x0118 }
            boolean r6 = r3.exists()     // Catch:{ IOException -> 0x0118 }
            if (r6 != 0) goto L_0x0065
        L_0x0064:
            goto L_0x007d
        L_0x0065:
            long r6 = r3.length()     // Catch:{ IOException -> 0x0118 }
            long r8 = (long) r4     // Catch:{ IOException -> 0x0118 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0064
            boolean r6 = r3.delete()     // Catch:{ IOException -> 0x0118 }
            if (r6 == 0) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            java.io.IOException r15 = new java.io.IOException     // Catch:{ IOException -> 0x0118 }
            java.lang.String r1 = "failed to delete existing file"
            r15.<init>(r1)     // Catch:{ IOException -> 0x0118 }
            throw r15     // Catch:{ IOException -> 0x0118 }
        L_0x007d:
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0118 }
            java.lang.String r7 = "rw"
            r6.<init>(r3, r7)     // Catch:{ IOException -> 0x0118 }
            java.nio.channels.FileChannel r3 = r6.getChannel()     // Catch:{ all -> 0x010e }
            long r7 = r6.length()     // Catch:{ all -> 0x0102 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0093
        L_0x0092:
            goto L_0x009d
        L_0x0093:
            long r7 = r6.length()     // Catch:{ all -> 0x0102 }
            long r9 = (long) r4     // Catch:{ all -> 0x0102 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x00fa
            goto L_0x0092
        L_0x009d:
            java.nio.channels.FileChannel$MapMode r9 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ all -> 0x0102 }
            r10 = 0
            long r12 = (long) r4     // Catch:{ all -> 0x0102 }
            r8 = r3
            java.nio.MappedByteBuffer r4 = r8.map(r9, r10, r12)     // Catch:{ all -> 0x0102 }
            if (r3 != 0) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r3.close()     // Catch:{ all -> 0x010e }
        L_0x00ad:
            r6.close()     // Catch:{ IOException -> 0x0118 }
            hpq r3 = new hpq     // Catch:{ IOException -> 0x0118 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0118 }
            r14.f = r3     // Catch:{ IOException -> 0x0118 }
            if (r15 == r1) goto L_0x00ba
            goto L_0x00c2
        L_0x00ba:
            int r15 = r3.a()     // Catch:{ IOException -> 0x0118 }
            defpackage.hpr.a(r3, r2, r15)     // Catch:{ IOException -> 0x0118 }
        L_0x00c2:
            hsd r15 = new hsd     // Catch:{ all -> 0x0126 }
            hrx r2 = defpackage.hrx.RESERVED_8     // Catch:{ all -> 0x0126 }
            hry r3 = defpackage.hry.RESERVED_8     // Catch:{ all -> 0x0126 }
            hpq r4 = r14.f     // Catch:{ all -> 0x0126 }
            r15.<init>(r2, r3, r4)     // Catch:{ all -> 0x0126 }
            r14.c = r15     // Catch:{ all -> 0x0126 }
            int r2 = r15.f     // Catch:{ all -> 0x0126 }
            if (r2 == r1) goto L_0x00e2
            java.lang.String r15 = "Funnel"
            java.lang.String r1 = "Failed to initialize funnel store."
            android.util.Log.e(r15, r1)     // Catch:{ all -> 0x0126 }
            r14.e = r5     // Catch:{ all -> 0x0126 }
            r14.f = r0     // Catch:{ all -> 0x0126 }
            r14.c = r0     // Catch:{ all -> 0x0126 }
            monitor-exit(r14)
            return
        L_0x00e2:
            r14.e = r1     // Catch:{ all -> 0x0126 }
            boolean r15 = r15.c()     // Catch:{ IOException -> 0x00ee, hpt -> 0x00ec }
            r14.d = r15     // Catch:{ IOException -> 0x00ee, hpt -> 0x00ec }
            monitor-exit(r14)
            return
        L_0x00ec:
            r15 = move-exception
            goto L_0x00ef
        L_0x00ee:
            r15 = move-exception
        L_0x00ef:
            java.lang.String r0 = "Funnel"
            java.lang.String r2 = "failed to get snapshotted state during initialization"
            android.util.Log.e(r0, r2, r15)     // Catch:{ all -> 0x0126 }
            r14.d = r1     // Catch:{ all -> 0x0126 }
            monitor-exit(r14)
            return
        L_0x00fa:
            java.io.IOException r15 = new java.io.IOException     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "unexpected file size"
            r15.<init>(r1)     // Catch:{ all -> 0x0102 }
            throw r15     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r15 = move-exception
            if (r3 == 0) goto L_0x010d
            r3.close()     // Catch:{ all -> 0x0109 }
            goto L_0x010d
        L_0x0109:
            r1 = move-exception
            defpackage.apev.a((java.lang.Throwable) r15, (java.lang.Throwable) r1)     // Catch:{ all -> 0x010e }
        L_0x010d:
            throw r15     // Catch:{ all -> 0x010e }
        L_0x010e:
            r15 = move-exception
            r6.close()     // Catch:{ all -> 0x0113 }
            goto L_0x0117
        L_0x0113:
            r1 = move-exception
            defpackage.apev.a((java.lang.Throwable) r15, (java.lang.Throwable) r1)     // Catch:{ IOException -> 0x0118 }
        L_0x0117:
            throw r15     // Catch:{ IOException -> 0x0118 }
        L_0x0118:
            r15 = move-exception
            java.lang.String r15 = "Funnel"
            java.lang.String r1 = "Failed find or create funnel file."
            android.util.Log.e(r15, r1)     // Catch:{ all -> 0x0126 }
            r14.e = r5     // Catch:{ all -> 0x0126 }
            r14.f = r0     // Catch:{ all -> 0x0126 }
            monitor-exit(r14)
            return
        L_0x0126:
            r15 = move-exception
            goto L_0x012a
        L_0x0128:
            monitor-exit(r14)
            return
        L_0x012a:
            monitor-exit(r14)
            goto L_0x012d
        L_0x012c:
            throw r15
        L_0x012d:
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsa.a(int):void");
    }

    public static void a(LogEventParcelable logEventParcelable, hry hry) {
        if (awsx.c()) {
            hrw.a.b(hwt.a(logEventParcelable.a), hry, 1);
        }
    }

    private static void a(hrv hrv, int i) {
        if (i != 0) {
            hrv.a(i);
        }
    }

    public static void a(String str, hry hry) {
        if (awsx.c()) {
            hrw.a.b(str, hry, 1);
        }
    }

    public static void a(String str, hry hry, int i) {
        if (awsx.c()) {
            hrw.a.b(str, hry, i);
        }
    }

    public final synchronized void a() {
        a(2);
    }

    public final synchronized boolean a(String str) {
        return this.e == 1 ? this.c.a(str) : false;
    }
}
