package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: asw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asw implements TypeEvaluator {
    public static final asw a = new asw();

    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        double pow4 = Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        double pow5 = Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d);
        double pow6 = Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d);
        return Integer.valueOf((Math.round((f2 + (f * ((((float) ((intValue2 >> 24) & 255)) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow + ((((float) pow4) - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow((double) (pow2 + ((((float) pow5) - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) (pow3 + ((((float) pow6) - pow3) * f)), 0.45454545454545453d)) * 255.0f));
    }
}
