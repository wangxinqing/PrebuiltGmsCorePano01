package defpackage;

import com.google.android.gms.people.profile.AvatarView;

/* renamed from: xjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xjc implements Runnable {
    private final AvatarView a;
    private float b;
    private long c;
    private boolean d;

    public xjc(AvatarView avatarView) {
        this.a = avatarView;
    }

    public final void run() {
        long j;
        if (!this.d) {
            if (this.b != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = this.c;
                if (j2 != -1) {
                    j = currentTimeMillis - j2;
                } else {
                    j = 0;
                }
                float f = ((float) j) * 0.0f;
                float f2 = this.b;
                if ((f2 < 0.0f && f2 + f > 0.0f) || (f2 > 0.0f && f2 + f < 0.0f)) {
                    f = -f2;
                }
                AvatarView avatarView = this.a;
                avatarView.r += f;
                avatarView.c.postRotate(f, (float) (avatarView.getWidth() / 2), (float) (avatarView.getHeight() / 2));
                avatarView.invalidate();
                float f3 = this.b + f;
                this.b = f3;
                if (f3 == 0.0f) {
                    this.d = true;
                }
                this.c = currentTimeMillis;
            }
            if (!this.d) {
                this.a.post(this);
            }
        }
    }
}
