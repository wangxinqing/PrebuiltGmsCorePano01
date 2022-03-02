package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: uo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uo implements TimeInterpolator {
    public int a;
    private int[] b;
    private int c;

    public uo(AnimationDrawable animationDrawable, boolean z) {
        int i;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.c = numberOfFrames;
        int[] iArr = this.b;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.b = new int[numberOfFrames];
        }
        int[] iArr2 = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < numberOfFrames; i3++) {
            if (z) {
                i = (numberOfFrames - i3) - 1;
            } else {
                i = i3;
            }
            int duration = animationDrawable.getDuration(i);
            iArr2[i3] = duration;
            i2 += duration;
        }
        this.a = i2;
    }

    public final float getInterpolation(float f) {
        int i = (int) ((f * ((float) this.a)) + 0.5f);
        int i2 = this.c;
        int[] iArr = this.b;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.a) : 0.0f);
    }
}
