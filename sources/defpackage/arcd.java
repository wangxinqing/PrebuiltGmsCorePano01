package defpackage;

import android.content.Context;

/* renamed from: arcd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arcd {
    private static final String[] a = {"ia_low_quality_sensor_timing.binaryproto", "ia_high_quality_sensor_timing.binaryproto", "ia_high_quality_sensor_timing_background_magcal.binaryproto", "ia_resilient_low_quality_sensor_timing.binaryproto", "ia_resilient_high_quality_sensor_timing.binaryproto", "ia_gb_resilient_low_quality_sensor_timing.binaryproto", "ia_gb_resilient_high_quality_sensor_timing.binaryproto", "ia_blue_pixel.binaryproto"};
    private static final String[] b = {"ia_heading_uncertainty_model_empirical_uncal_low_stddev.binaryproto", "ia_heading_uncertainty_model_empirical_uncal_med_stddev.binaryproto", "ia_heading_uncertainty_model_empirical_uncal_high_stddev.binaryproto"};

    public static arcr a(Context context, Integer num) {
        if (num.intValue() >= a.length || num.intValue() < 0) {
            num = 0;
        }
        return (arcr) aucj.a((aucj) arcr.f, jjt.b(context.getAssets().open(a[num.intValue()])));
    }

    public static arcp b(Context context, Integer num) {
        if (num.intValue() >= b.length || num.intValue() < 0) {
            num = 0;
        }
        return (arcp) aucj.a((aucj) arcp.a, jjt.b(context.getAssets().open(b[num.intValue()])));
    }
}
