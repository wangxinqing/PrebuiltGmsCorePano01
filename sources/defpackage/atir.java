package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.ActivityRecognitionRequest;

/* renamed from: atir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atir {
    public final Intent a;

    public atir(String str) {
        Intent intent = new Intent("com.google.android.location.internal.GMS_NLP");
        intent.setPackage(str);
        this.a = intent;
    }

    public static void a() {
        throw new UnsupportedOperationException("Can't request and remove floor change detection updates at the same time.");
    }

    public static void b() {
        throw new UnsupportedOperationException("Can't request and remove sleep segment detection updates at the same time.");
    }

    public static void c() {
        throw new UnsupportedOperationException("Can't request and remove activity transition updates at the same time.");
    }

    private static void d() {
        throw new UnsupportedOperationException("Can't request and remove activity detection updates at the same time. If you where trying to update the rate of an existing activity detection, simply call requestActivityUpdates with the new rate (you don't need to call requestRemovalOfActivityUpdates).");
    }

    public final ComponentName a(Context context) {
        return context.startService(this.a);
    }

    public final void b(PendingIntent pendingIntent) {
        if (this.a.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PERIOD_MILLIS")) {
            d();
        }
        this.a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT", pendingIntent);
        this.a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_REMOVE", true);
    }

    public final void c(PendingIntent pendingIntent) {
        this.a.putExtra("nlp.WIFI_SCAN_INTENT", pendingIntent);
    }

    public final void a(long j, long j2, PendingIntent pendingIntent, String str) {
        this.a.putExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT", pendingIntent);
        this.a.putExtra("com.google.android.location.internal.EXTRA_PERIOD_MILLIS", j);
        this.a.putExtra("com.google.android.location.internal.EXTRA_LOCATION_TAG", str);
        if (j2 > j) {
            this.a.putExtra("com.google.android.location.internal.EXTRA_BATCH_DURATION_MILLIS", j2);
        }
    }

    public final void c(boolean z) {
        this.a.putExtra("com.google.android.location.internal.EXTRA_LOCATION_FORCE_NOW", z);
    }

    public final void b(boolean z) {
        this.a.putExtra("locationSettingsIgnored", z);
    }

    public final void a(PendingIntent pendingIntent) {
        this.a.putExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT", pendingIntent);
        this.a.putExtra("com.google.android.location.internal.EXTRA_LOCATION_REMOVE", true);
    }

    public final void a(WorkSource workSource) {
        if (workSource != null) {
            int i = Build.VERSION.SDK_INT;
            this.a.putExtra("com.google.android.location.internal.EXTRA_LOCATION_WORK_SOURCE", workSource);
        }
    }

    public final void a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent) {
        if (this.a.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_REMOVE")) {
            d();
        }
        this.a.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_PENDING_INTENT", pendingIntent);
        ivy.a((SafeParcelable) activityRecognitionRequest, this.a, "com.google.android.location.internal.EXTRA_ACTIVITY_RECOGNITION_REQUEST");
    }

    public final void a(boolean z) {
        this.a.putExtra("com.google.android.location.internal.EXTRA_IS_FROM_FIRST_PARTY", z);
    }
}
