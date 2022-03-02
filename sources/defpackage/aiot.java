package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aiot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiot extends aipz implements ahzv {
    public static final /* synthetic */ int g = 0;
    public long a;
    public final int[] b;
    public final boolean c;
    public final boolean d;
    public final long e;
    final /* synthetic */ aiov f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiot(aiov aiov, PendingIntent pendingIntent, long j, long j2, ajbg ajbg, ajrb ajrb, boolean z, String str, int[] iArr, boolean z2) {
        super(pendingIntent, j, j2, ajbg, ajrb, z, false, str);
        boolean z3;
        aiov aiov2 = aiov;
        long j3 = j;
        int[] iArr2 = iArr;
        this.f = aiov2;
        this.a = SystemClock.elapsedRealtime() - j3;
        if (!a(9) || a(pendingIntent.getTargetPackage())) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.c = z3;
        this.d = z2;
        if (iArr2 != null) {
            this.b = iArr2;
        } else if (a(pendingIntent.getTargetPackage())) {
            this.b = new int[]{9};
        } else {
            this.b = new int[0];
        }
        this.e = j3;
        aiov2.h.a(new aiou(ajrb, str, j2), j3);
    }

    private final boolean a(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aiov aiov = this.f;
        long j = elapsedRealtime - aiov.b;
        if (aiov.a == null || j > 600000) {
            aiov.b = elapsedRealtime;
            String offBodyEligibleApps = axwo.a.a().offBodyEligibleApps();
            if (!TextUtils.isEmpty(offBodyEligibleApps)) {
                ArrayList arrayList = new ArrayList(r2);
                for (String trim : offBodyEligibleApps.split(",")) {
                    String trim2 = trim.trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        arrayList.add(trim2);
                    }
                }
                this.f.a = new String[arrayList.size()];
                aiov aiov2 = this.f;
                aiov2.a = (String[]) arrayList.toArray(aiov2.a);
            } else {
                this.f.a = new String[0];
            }
            String valueOf = String.valueOf(Arrays.toString(this.f.a));
            if (valueOf.length() == 0) {
                new String("New off body eligible apps generated: ");
            } else {
                "New off body eligible apps generated: ".concat(valueOf);
            }
        }
        for (String equals : this.f.a) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public final ActivityRecognitionResult a(ActivityRecognitionResult activityRecognitionResult) {
        String str;
        if (!this.p && activityRecognitionResult.a().a() == 6) {
            return null;
        }
        int a2 = this.f.m.a(this.h.getTargetPackage());
        ArrayList arrayList = new ArrayList();
        for (DetectedActivity detectedActivity : activityRecognitionResult.a) {
            int a3 = detectedActivity.a();
            if (a2 >= 4400000) {
                if (a2 >= 5100000) {
                    if (a2 < 11200000) {
                        if (a3 != 16) {
                            if (a3 == 17) {
                            }
                        }
                    }
                } else if (a3 > 8) {
                }
            } else if (a3 > 6) {
            }
            if ((this.p || ((1 << a3) & 4161088) == 0) && ((a3 != 5 || !aixc.q()) && ((((1 << a3) & 32256) == 0 || a(a3)) && (axwr.c() || !(a3 == 16 || a3 == 17))))) {
                if (!this.p || (str = this.m) == null || !str.contains("fitness") || a3 <= 8) {
                    arrayList.add(detectedActivity);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return new ActivityRecognitionResult((List) arrayList, activityRecognitionResult.b, activityRecognitionResult.c, activityRecognitionResult.d, activityRecognitionResult.c());
        }
        return null;
    }

    public final void a() {
        this.f.h.b(new aiou(this.n, this.m, this.i), this.q);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        this.f.h.b(new aiou(this.n, this.m, this.i), this.q);
        this.q = j;
        this.f.h.a(new aiou(this.n, this.m, this.i), this.q);
    }

    public final boolean a(int i) {
        if (this.b != null) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.b;
                if (i2 >= iArr.length) {
                    break;
                } else if (i == iArr[i2]) {
                    return true;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final boolean a(Context context, Intent intent) {
        int a2 = this.f.m.a(this.h.getTargetPackage());
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) intent.getParcelableExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (activityRecognitionResult == null) {
                return false;
            }
            if (a2 >= 7500000) {
                StringBuilder sb = new StringBuilder(94);
                sb.append("ActivityIntentReceiver.deliverIntent: Send byte array to new client. clientVersion=");
                sb.append(a2);
                sb.toString();
                intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", ivy.a(activityRecognitionResult));
            } else {
                intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT", activityRecognitionResult);
            }
            return super.a(context, intent);
        } else if (ActivityRecognitionResult.c(intent)) {
            return super.a(context, intent);
        } else {
            return true;
        }
    }
}
