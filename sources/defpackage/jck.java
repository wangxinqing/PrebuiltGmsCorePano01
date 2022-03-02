package defpackage;

import android.content.ComponentName;
import android.text.TextUtils;
import com.google.android.gms.common.stats.WakeLockEvent;

/* renamed from: jck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jck {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public jck() {
        int i;
        int i2;
        int i3;
        boolean z = false;
        try {
            i3 = ((Integer) jcc.a.c()).intValue();
            i2 = ((Integer) jcf.a.c()).intValue();
            i = ((Integer) jcb.a.c()).intValue();
        } catch (SecurityException e) {
            ComponentName componentName = jcl.a;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        this.b = i2;
        this.a = i3;
        this.c = i;
        ComponentName componentName2 = jcl.a;
        this.d = (i == 0 && i2 == 0 && i3 == 0) ? z : true;
    }

    public final boolean a(WakeLockEvent wakeLockEvent) {
        int i = wakeLockEvent.c;
        if (i != 7) {
            if (i != 8) {
                if (i != 10) {
                    if (i != 11) {
                        return i == 16 && (this.b & jcl.b) != 0 && TextUtils.isEmpty(wakeLockEvent.l);
                    }
                }
            }
            return (this.b & jcl.d) != 0 && TextUtils.isEmpty(wakeLockEvent.l);
        }
        return (this.b & jcl.c) != 0 && TextUtils.isEmpty(wakeLockEvent.l);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = r5.d
            r1 = 0
            if (r0 == 0) goto L_0x0064
            int r0 = r6.hashCode()
            r2 = -1415196606(0xffffffffaba5d042, float:-1.1781758E-12)
            r3 = 2
            r4 = 1
            if (r0 == r2) goto L_0x002f
            r2 = 383497604(0x16dbb584, float:3.549591E-25)
            if (r0 == r2) goto L_0x0025
            r2 = 1696996043(0x65261acb, float:4.9025442E22)
            if (r0 == r2) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r0 = "service_connections"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0025:
            java.lang.String r0 = "wakelocks"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0039
            r0 = 2
            goto L_0x003a
        L_0x002f:
            java.lang.String r0 = "alarms"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0039
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = -1
        L_0x003a:
            if (r0 == 0) goto L_0x005c
            if (r0 == r4) goto L_0x0054
            if (r0 != r3) goto L_0x0048
            int r6 = r5.b
            android.content.ComponentName r0 = defpackage.jcl.a
            if (r6 == 0) goto L_0x0047
            return r4
        L_0x0047:
            return r1
        L_0x0048:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = " is not a valid type"
            java.lang.String r6 = r6.concat(r1)
            r0.<init>(r6)
            throw r0
        L_0x0054:
            int r6 = r5.a
            android.content.ComponentName r0 = defpackage.jcl.a
            if (r6 == 0) goto L_0x005b
            return r4
        L_0x005b:
            return r1
        L_0x005c:
            int r6 = r5.c
            android.content.ComponentName r0 = defpackage.jcl.a
            if (r6 == 0) goto L_0x0063
            return r4
        L_0x0063:
            return r1
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jck.a(java.lang.String):boolean");
    }

    public jck(byte[] bArr) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        ComponentName componentName = jcl.a;
        this.d = false;
    }
}
