package defpackage;

import com.google.android.gms.people.profile.AvatarView;

/* renamed from: xje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xje implements Runnable {
    public final AvatarView a;
    public float b;
    public float c;
    public long d = -1;
    public boolean e;
    public boolean f;

    public xje(AvatarView avatarView) {
        this.a = avatarView;
    }

    public final void a() {
        this.e = false;
        this.f = true;
    }

    public final void run() {
        float f2;
        float f3;
        float f4;
        if (!this.f) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.d;
            if (j != -1) {
                f2 = (float) (currentTimeMillis - j);
            } else {
                f2 = 0.0f;
            }
            if (j == -1) {
                this.d = currentTimeMillis;
            }
            if (f2 < 100.0f) {
                float f5 = 100.0f - f2;
                f4 = (this.b / f5) * 10.0f;
                f3 = (this.c / f5) * 10.0f;
                if (Math.abs(f4) > Math.abs(this.b) || Float.isNaN(f4)) {
                    f4 = this.b;
                }
                if (Math.abs(f3) > Math.abs(this.c) || Float.isNaN(f3)) {
                    f3 = this.c;
                }
            } else {
                f4 = this.b;
                f3 = this.c;
            }
            this.a.a(f4, f3);
            float f6 = this.b - f4;
            this.b = f6;
            float f7 = this.c - f3;
            this.c = f7;
            if (f6 == 0.0f && f7 == 0.0f) {
                a();
            }
            if (!this.f) {
                this.a.post(this);
            }
        }
    }
}
