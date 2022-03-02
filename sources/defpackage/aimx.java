package defpackage;

import android.os.Message;
import android.util.Log;

/* renamed from: aimx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aimx extends aimr {
    final /* synthetic */ aing a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aimx(aing aing, aiml aiml) {
        super(aing, aiml);
        this.a = aing;
    }

    private final void a(boolean z) {
        aucd aucd = this.a.D;
        if (aucd != null) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoal aoal = (aoal) aucd.b;
            aoal aoal2 = aoal.g;
            aoal.a |= 16;
            aoal.f = z;
        }
        if (!z) {
            this.a.b(a(this.b.h()));
        } else {
            aing aing = this.a;
            aing.b((ains) aing.j);
        }
        this.a.d(8);
    }

    public final String g() {
        return "HasGeofenceState";
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r9 = this;
            super.k()
            aiml r0 = r9.b
            aimd r0 = r0.k
            boolean r1 = r0.t
            r2 = 0
            if (r1 == 0) goto L_0x0100
            arnd r1 = r0.h
            r3 = 5147455389092024324(0x476f6f676c001004, double:1.3057659520462452E36)
            arnh r1 = r1.a((long) r3)
            r0.i = r1
            arnh r1 = r0.i
            if (r1 == 0) goto L_0x0100
            int r1 = r1.c()
            r0.q = r1
            r5 = 2
            r6 = 65536(0x10000, float:9.18355E-41)
            r7 = 1
            if (r1 >= r6) goto L_0x004d
            r1 = 5
            java.lang.String r3 = "ChreGeofenceHardware"
            boolean r1 = android.util.Log.isLoggable(r3, r1)
            if (r1 == 0) goto L_0x0102
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r1[r2] = r4
            int r0 = r0.q
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r7] = r0
            java.lang.String r0 = "CHRE is disabled because NanoApp version is too low. Expected 0x%08x and above, actual 0x%08x"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            defpackage.aikq.c(r3, r0)
            goto L_0x0102
        L_0x004d:
            axyx r1 = defpackage.axyx.a
            axyy r1 = r1.a()
            boolean r1 = r1.ignoreOldChreGeofenceVersions()
            if (r1 == 0) goto L_0x008b
            int r1 = r0.q
            r6 = 262151(0x40007, float:3.67352E-40)
            if (r1 < r6) goto L_0x0061
            goto L_0x008b
        L_0x0061:
            arlo r1 = defpackage.arlo.e
            aucd r1 = r1.o()
            arlm r1 = (defpackage.arlm) r1
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x006e
            goto L_0x0073
        L_0x006e:
            r1.c()
            r1.c = r2
        L_0x0073:
            aucj r3 = r1.b
            arlo r3 = (defpackage.arlo) r3
            r3.b = r2
            int r4 = r3.a
            r4 = r4 | r7
            r3.a = r4
            aucj r1 = r1.i()
            arlo r1 = (defpackage.arlo) r1
            r0.a((defpackage.arlo) r1)
            r0.g = r2
            goto L_0x0102
        L_0x008b:
            jfp r1 = new jfp
            r6 = 10
            java.lang.String r8 = "CHRE Handler"
            r1.<init>(r8, r6)
            r1.start()
            jfo r6 = new jfo
            r6.<init>(r1)
            arnd r1 = r0.h
            r1.a(r3, r0, r6)
            arnd r1 = r0.h
            r1.b((defpackage.arni) r0)
            arnh r1 = r0.i
            r1.a(r0, r6)
            r1 = -1
            r0.g = r1
            r0.r = r7
            arlo r3 = defpackage.arlo.e
            aucd r3 = r3.o()
            arlm r3 = (defpackage.arlm) r3
            boolean r4 = defpackage.axyu.b()
            if (r4 != 0) goto L_0x00c0
            r5 = 1
            goto L_0x00c1
        L_0x00c0:
        L_0x00c1:
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            r3.c()
            r3.c = r2
        L_0x00cb:
            aucj r4 = r3.b
            arlo r4 = (defpackage.arlo) r4
            int r5 = r5 + r1
            r4.b = r5
            int r1 = r4.a
            r1 = r1 | r7
            r4.a = r1
            aucj r1 = r3.i()
            arlo r1 = (defpackage.arlo) r1
            r0.a((defpackage.arlo) r1)
            aing r0 = r9.a
            aucd r0 = r0.C
            if (r0 == 0) goto L_0x00ff
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x00eb
            goto L_0x00f0
        L_0x00eb:
            r0.c()
            r0.c = r2
        L_0x00f0:
            aucj r0 = r0.b
            aoal r0 = (defpackage.aoal) r0
            aoal r1 = defpackage.aoal.g
            int r1 = r0.a
            r1 = r1 | 16
            r0.a = r1
            r0.f = r7
            return
        L_0x00ff:
            return
        L_0x0100:
            r0.g = r2
        L_0x0102:
            aing r0 = r9.a
            aucd r0 = r0.C
            if (r0 == 0) goto L_0x0120
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x010d
            goto L_0x0112
        L_0x010d:
            r0.c()
            r0.c = r2
        L_0x0112:
            aucj r0 = r0.b
            aoal r0 = (defpackage.aoal) r0
            aoal r1 = defpackage.aoal.g
            int r1 = r0.a
            r1 = r1 | 16
            r0.a = r1
            r0.f = r2
        L_0x0120:
            r9.a((boolean) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aimx.k():void");
    }

    public final aoaq a() {
        return aoaq.HAS_GEOFENCE;
    }

    public final boolean a(Message message) {
        boolean z = aikq.a;
        int i = message.what;
        if (i == 1) {
            if (!this.a.x.a()) {
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    aikq.a("GeofencerStateMachine", "Network location disabled.");
                }
                aing aing = this.a;
                aing.b((ains) aing.b);
            }
            return true;
        } else if (i == 4 || i == 8 || i == 16) {
            this.a.a(message);
            return true;
        } else if (i != 153) {
            return b(message);
        } else {
            a(((Boolean) message.obj).booleanValue());
            return true;
        }
    }
}
