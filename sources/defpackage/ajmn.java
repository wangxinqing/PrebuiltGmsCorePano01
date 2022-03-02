package defpackage;

import android.location.Location;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiRate;

/* renamed from: ajmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmn {
    public long a;
    public ActivityRecognitionResult b;
    public ajmh c;
    public long d;
    public boolean e;
    public boolean f;
    public ajjp g;
    public boolean h;
    public boolean i;
    public boolean j;
    private long k = 0;
    private Location l;
    private ActivityRecognitionResult m;
    private long n;
    private Location o;
    private long p;
    private NetworkLocationStatus q;
    private ApiRate r;
    private ReportingConfig s;

    public ajmn() {
        a();
    }

    public final synchronized void a() {
        this.l = null;
        this.a = -1;
        this.m = null;
        this.b = null;
        this.n = -1;
        this.o = null;
        this.p = -1;
        this.q = null;
        this.r = null;
        this.c = null;
        this.d = -1;
        this.e = false;
        this.s = null;
        this.g = null;
        this.i = false;
        this.j = false;
    }

    public final synchronized void a(long j2) {
        this.n = j2;
        this.e = false;
    }

    public final synchronized void a(ajmh ajmh) {
        this.c = ajmh;
    }

    public final synchronized void a(Location location) {
        this.o = location;
    }

    public final synchronized void a(Location location, long j2) {
        this.l = location;
        this.a = j2;
    }

    public final synchronized void a(ActivityRecognitionResult activityRecognitionResult) {
        this.m = activityRecognitionResult;
    }

    public final synchronized void a(NetworkLocationStatus networkLocationStatus) {
        this.q = networkLocationStatus;
    }

    public final synchronized void a(ReportingConfig reportingConfig) {
        this.s = reportingConfig;
    }

    public final synchronized void a(ApiRate apiRate) {
        this.r = apiRate;
    }

    public final synchronized void a(ApiRate apiRate, ajmh ajmh, long j2) {
        this.r = apiRate;
        this.c = ajmh;
        this.d = j2;
    }

    public final synchronized void a(boolean z) {
        this.f = z;
    }

    public final synchronized long b() {
        return this.k;
    }

    public final synchronized void b(long j2) {
        this.p = j2;
    }

    public final synchronized void c() {
        this.k++;
    }

    public final synchronized Location d() {
        return this.l;
    }

    public final synchronized ActivityRecognitionResult e() {
        return this.m;
    }

    public final synchronized ActivityRecognitionResult f() {
        return this.b;
    }

    public final synchronized long g() {
        return this.n;
    }

    public final synchronized Location h() {
        return this.o;
    }

    public final synchronized long i() {
        return this.p;
    }

    public final synchronized NetworkLocationStatus j() {
        return this.q;
    }

    public final synchronized ApiRate k() {
        return this.r;
    }

    public final synchronized atda l() {
        return ajnq.a(this.r);
    }

    public final synchronized ReportingConfig m() {
        return this.s;
    }

    public final synchronized String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j2;
        long j3;
        String str6;
        String sb;
        synchronized (this) {
            ReportingConfig reportingConfig = this.s;
            if (reportingConfig != null) {
                StringBuilder sb2 = new StringBuilder();
                for (AccountConfig accountConfig : reportingConfig.a) {
                    atit a2 = atiu.a(accountConfig);
                    a2.a("account", rmp.a(accountConfig.a));
                    a2.a("restriction", Integer.valueOf(accountConfig.j));
                    a2.a("reporting", Integer.valueOf(accountConfig.a()));
                    a2.a("history", Integer.valueOf(accountConfig.b()));
                    a2.a("updateNumber", Long.valueOf(accountConfig.c));
                    a2.a("serverMillis", Long.valueOf(accountConfig.i));
                    a2.a("lastUploadTimeMs", accountConfig.q);
                    a2.a("reasons", accountConfig.e());
                    sb2.append(a2.toString());
                    sb2.append(";");
                }
                str = sb2.toString();
            } else {
                str = null;
            }
            Location location = this.l;
            if (location != null) {
                str2 = String.valueOf(location.getTime());
            } else {
                str2 = "null";
            }
            ActivityRecognitionResult activityRecognitionResult = this.m;
            if (activityRecognitionResult != null) {
                str3 = String.valueOf(activityRecognitionResult.c);
            } else {
                str3 = "null";
            }
            ActivityRecognitionResult activityRecognitionResult2 = this.b;
            if (activityRecognitionResult2 != null) {
                str4 = String.valueOf(activityRecognitionResult2.c);
            } else {
                str4 = "null";
            }
            Location location2 = this.o;
            if (location2 != null) {
                str5 = String.valueOf(location2.getTime());
            } else {
                str5 = "null";
            }
            long j4 = this.k;
            long j5 = this.a;
            long j6 = this.n;
            long j7 = this.p;
            String valueOf = String.valueOf(this.q);
            ajjp ajjp = this.g;
            if (ajjp != null) {
                j3 = j7;
                int i2 = ajjp.e;
                int i3 = ajjp.c;
                j2 = j6;
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("voltage: ");
                sb3.append(i2);
                sb3.append(", level: ");
                sb3.append(i3);
                str6 = sb3.toString();
            } else {
                j2 = j6;
                j3 = j7;
                str6 = null;
            }
            String valueOf2 = String.valueOf(this.r);
            String valueOf3 = String.valueOf(this.c);
            boolean z = this.e;
            boolean z2 = this.h;
            boolean z3 = this.i;
            boolean z4 = this.j;
            int length = String.valueOf(str2).length();
            int length2 = String.valueOf(str3).length();
            int length3 = String.valueOf(str4).length();
            int length4 = String.valueOf(str5).length();
            int length5 = String.valueOf(valueOf).length();
            int length6 = String.valueOf(str6).length();
            int length7 = String.valueOf(valueOf2).length();
            String str7 = str;
            StringBuilder sb4 = new StringBuilder(length + 513 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
            sb4.append("InternalState{numLocationsSinceStart=");
            sb4.append(j4);
            sb4.append(", lastLocationRecorded.time=");
            sb4.append(str2);
            sb4.append(", lastLocationRecordedRealtime=");
            sb4.append(j5);
            sb4.append(", lastActivityProcessedRealtime=");
            sb4.append(str3);
            sb4.append(", currentActivityProcessedRealtime=");
            sb4.append(str4);
            sb4.append(", lastWifiAttachedRealtime=");
            sb4.append(j2);
            sb4.append(", lastUploadAttemptRealtime=");
            sb4.append(j3);
            sb4.append(", lastUploadAttemptLocation.time=");
            sb4.append(str5);
            sb4.append(", lastLocationStatusRealtime=");
            sb4.append(valueOf);
            sb4.append(", currentBatteryCondition=");
            sb4.append(str6);
            sb4.append(", apiRateJson=");
            sb4.append(valueOf2);
            sb4.append(", sampleSpec=");
            sb4.append(valueOf3);
            sb4.append(", awaitingWifi=");
            sb4.append(z);
            sb4.append(", hasActiveBurstRequest=");
            sb4.append(z2);
            sb4.append(", reportingConfig=");
            sb4.append(str7);
            sb4.append(", isAtHome=");
            sb4.append(z3);
            sb4.append(", isAtWork=");
            sb4.append(z4);
            sb4.append('}');
            sb = sb4.toString();
        }
        return sb;
    }
}
