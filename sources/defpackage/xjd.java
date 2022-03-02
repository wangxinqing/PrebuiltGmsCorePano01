package defpackage;

import com.google.android.gms.people.profile.AvatarView;

/* renamed from: xjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xjd implements Runnable {
    public final AvatarView a;
    public float b;
    public float c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public long h;
    public boolean i;
    public boolean j;

    public xjd(AvatarView avatarView) {
        this.a = avatarView;
    }

    public final void a() {
        this.i = false;
        this.j = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r6.d == (r4 > r0)) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            boolean r0 = r6.j
            if (r0 != 0) goto L_0x0043
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.h
            float r4 = r6.f
            float r5 = r6.g
            long r0 = r0 - r2
            float r0 = (float) r0
            float r5 = r5 * r0
            float r4 = r4 + r5
            com.google.android.gms.people.profile.AvatarView r0 = r6.a
            float r1 = r6.b
            float r2 = r6.c
            r0.a(r4, r1, r2)
            float r0 = r6.e
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0023
            goto L_0x002e
        L_0x0023:
            boolean r1 = r6.d
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x002b
            r2 = 0
            goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            if (r1 != r2) goto L_0x003a
        L_0x002e:
            com.google.android.gms.people.profile.AvatarView r1 = r6.a
            float r2 = r6.b
            float r3 = r6.c
            r1.a(r0, r2, r3)
            r6.a()
        L_0x003a:
            boolean r0 = r6.j
            if (r0 != 0) goto L_0x0043
            com.google.android.gms.people.profile.AvatarView r0 = r6.a
            r0.post(r6)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xjd.run():void");
    }
}
