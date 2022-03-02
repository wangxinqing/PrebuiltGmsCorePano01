package defpackage;

import com.google.android.gms.R;

/* renamed from: dep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum dep {
    INSTANT(0, 0),
    PUSH(R.anim.as_slide_in_from_end, R.anim.as_stay_put, true),
    POP(0, R.anim.as_slide_out_to_end),
    OPEN(R.anim.as_slide_in_from_below, R.anim.as_stay_put, true),
    CLOSE(0, R.anim.as_slide_out_to_below),
    PAN_START(R.anim.as_slide_in_from_start, R.anim.as_slide_out_to_end),
    PAN_END(R.anim.as_slide_in_from_end, R.anim.as_slide_out_to_start),
    FADE_IN(R.anim.as_fade_in, R.anim.as_stay_put),
    CROSS_FADE(R.anim.as_fade_in, R.anim.as_fade_out);
    
    public final int j;
    public final int k;
    public final boolean l;

    private dep(int i, int i2) {
        this(r7, r8, i, i2, false);
    }

    private dep(int i, int i2, boolean z) {
        this.j = i;
        this.k = i2;
        this.l = z;
    }
}
