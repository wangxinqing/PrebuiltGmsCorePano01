package defpackage;

import com.google.android.gms.people.profile.AvatarView;

/* renamed from: xjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xjf implements Runnable {
    public final AvatarView a;
    public float b;
    public float c;
    public long d = -1;
    public boolean e;
    public boolean f;

    public xjf(AvatarView avatarView) {
        this.a = avatarView;
    }

    public final void a() {
        this.e = false;
        this.f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r0 > 0.0f) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r1 >= 0.0f) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r1 > 0.0f) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0 >= 0.0f) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            boolean r0 = r9.f
            if (r0 != 0) goto L_0x0077
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r9.d
            r4 = -1
            r6 = 1148846080(0x447a0000, float:1000.0)
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0018
            long r2 = r0 - r2
            float r2 = (float) r2
            float r2 = r2 / r6
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            com.google.android.gms.people.profile.AvatarView r3 = r9.a
            float r4 = r9.b
            float r4 = r4 * r2
            float r5 = r9.c
            float r5 = r5 * r2
            boolean r3 = r3.a(r4, r5)
            r9.d = r0
            float r2 = r2 * r6
            float r0 = r9.b
            int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0039
            float r0 = r0 - r2
            r9.b = r0
            int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x0040
            goto L_0x0043
        L_0x0039:
            float r0 = r0 + r2
            r9.b = r0
            int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0043
        L_0x0040:
            r9.b = r7
            r0 = 0
        L_0x0043:
            float r1 = r9.c
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0051
            float r1 = r1 - r2
            r9.c = r1
            int r2 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0058
            goto L_0x005b
        L_0x0051:
            float r1 = r1 + r2
            r9.c = r1
            int r2 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x005b
        L_0x0058:
            r9.c = r7
            r1 = 0
        L_0x005b:
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            if (r3 != 0) goto L_0x006e
        L_0x0066:
            r9.a()
            com.google.android.gms.people.profile.AvatarView r0 = r9.a
            r0.b()
        L_0x006e:
            boolean r0 = r9.f
            if (r0 != 0) goto L_0x0077
            com.google.android.gms.people.profile.AvatarView r0 = r9.a
            r0.post(r9)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjf.run():void");
    }
}
