package defpackage;

import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* renamed from: ahis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahis {
    protected boolean a = false;
    public ahtp b;
    protected long c = 3200000000L;
    protected ahil d;
    protected ahiq e;
    protected boolean f;
    protected ahnc g;
    protected ahko h;
    protected boolean i;
    protected ahnx j;
    protected boolean k;
    protected ahpe l;
    public final ahli m;
    public double n;
    protected final aizl o;
    protected final ajqq p;
    protected final aicn q;

    public ahis(aizl aizl, ajqq ajqq, aicn aicn, ahli ahli) {
        this.o = aizl;
        this.p = ajqq;
        this.q = aicn;
        this.m = ahli;
        this.d = null;
        this.g = null;
        this.h = null;
        this.j = null;
        this.l = null;
    }

    static double a(ahyq ahyq) {
        int i2 = ahyq.b;
        if (i2 < 2) {
            return 0.0d;
        }
        double d2 = (double) (i2 - 2);
        Double.isNaN(d2);
        double d3 = d2 / 14.0d;
        long[] jArr = new long[15];
        for (int i3 = 0; i3 < 15; i3++) {
            double d4 = (double) i3;
            Double.isNaN(d4);
            int round = (int) Math.round(d4 * d3);
            jArr[i3] = ahyq.a(round + 1) - ahyq.a(round);
        }
        Arrays.sort(jArr);
        double d5 = (double) jArr[7];
        Double.isNaN(d5);
        return 1.0E9d / d5;
    }

    private static String c(ahyq ahyq) {
        if (ahyq.b == 0) {
            return "0 0";
        }
        long a2 = ahyq.a(ahyq.b - 1) - ahyq.a(0);
        int i2 = ahyq.b;
        Locale locale = Locale.ENGLISH;
        double d2 = (double) a2;
        Double.isNaN(d2);
        String format = String.format(locale, "%.2g", new Object[]{Double.valueOf(d2 / 1.0E9d)});
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 35);
        sb.append(i2);
        sb.append(" ");
        sb.append(a2);
        sb.append(" (");
        sb.append(format);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public abstract ahtp a(Map map, int i2, long j2, aizx aizx, boolean z);

    /* access modifiers changed from: protected */
    public final void b(ahyq ahyq) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(ahyq);
        ajqq ajqq = this.p;
        Intent intent = new Intent();
        intent.setAction("com.google.android.location.internal.SAMPLED_SENSOR");
        intent.putExtra("accelEvents", arrayList);
        alv.a(ajqq.a).a(intent);
    }

    protected static final ahip a(ahip ahip, ahip ahip2) {
        int i2 = ahip.a;
        if (i2 == 2) {
            return ahip;
        }
        int i3 = ahip2.a;
        if (i3 != 2) {
            if (i2 == 1) {
                return ahip;
            }
            if (i3 != 1) {
                return ahip.a(Math.min(ahip.a(), ahip2.a()));
            }
        }
        return ahip2;
    }

    static final ahyq a(ahyq ahyq, long j2) {
        int i2 = ahyq.b;
        if (i2 <= 1) {
            return ahyq;
        }
        long a2 = ahyq.a(i2 - 1);
        int i3 = ahyq.b - 1;
        while (i3 > 0 && a2 - ahyq.a(i3) < j2) {
            int i4 = i3 - 1;
            long a3 = ahyq.a(i3) - ahyq.a(i4);
            if (a3 <= 0 || a3 > 1000000000) {
                break;
            }
            i3 = i4;
        }
        return ahyq.b(i3, ahyq.b - i3);
    }

    protected static void a(ahyq ahyq, ahyq ahyq2) {
        String c2 = c(ahyq);
        String c3 = c(ahyq2);
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 30 + String.valueOf(c3).length());
        sb.append("originalAccel: ");
        sb.append(c2);
        sb.append(" trimmedAccel: ");
        sb.append(c3);
        sb.toString();
    }

    public static void a(aicn aicn, ActivityRecognitionResult activityRecognitionResult, boolean z) {
        DetectedActivity b2 = activityRecognitionResult.b();
        aicn.a((aicl) new ahio(aico.ACTIVITY_DETECTION_RESULT, aicn.b(), b2.a(), b2.e, z ? 1 : 0, activityRecognitionResult, z));
    }
}
