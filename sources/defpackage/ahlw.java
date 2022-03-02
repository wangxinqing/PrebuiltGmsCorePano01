package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Date;
import java.util.List;

/* renamed from: ahlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahlw implements aiao {
    public final aizy a;
    public final ajbg b;
    public final ahix c;
    public final ahlu d = new ahlu(this);
    public ahlr e;
    public long f;
    private final ahjc g;
    private final aicn h;
    private final List i;

    public ahlw(ahjc ahjc, aizy aizy, aicn aicn, ajbg ajbg, ahix ahix, List list) {
        ahlq ahlq = new ahlq(this);
        this.e = ahlq;
        this.f = -1;
        this.g = ahjc;
        this.a = aizy;
        this.h = aicn;
        this.b = ajbg;
        this.c = ahix;
        this.i = list;
        this.d.a(ahlq, SystemClock.elapsedRealtime());
    }

    public static boolean a(ActivityRecognitionResult activityRecognitionResult) {
        DetectedActivity a2 = activityRecognitionResult.a();
        return a2.a() == 2 && ((long) a2.e) >= axzj.a.a().arVehicleExitOnFootConfidenceThreshold();
    }

    public static boolean b(ActivityRecognitionResult activityRecognitionResult) {
        return activityRecognitionResult.a().a() == 0;
    }

    public final void a(long j) {
        if (j != this.f) {
            this.f = j;
            String valueOf = String.valueOf(new Date(ajbt.e() + j));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Alarm set to: ");
            sb.append(j);
            sb.append(" ");
            sb.append(valueOf);
            sb.toString();
            this.b.a(ajbe.VEHICLE_EXIT_DETECTOR, j, (aizx) null);
        }
    }

    public final void a(ahlr ahlr) {
        ahlr ahlr2 = ahlr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String b2 = this.e.b();
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 40);
        sb.append("Leaving state: ");
        sb.append(b2);
        sb.append(" at: ");
        sb.append(elapsedRealtime);
        sb.toString();
        aicn aicn = this.h;
        String b3 = this.e.b();
        String b4 = ahlr.b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(b3).length() + 4 + String.valueOf(b4).length());
        sb2.append(b3);
        sb2.append(" -> ");
        sb2.append(b4);
        String sb3 = sb2.toString();
        aicn.a(new aicl(aico.VEHICLE_EXIT_STATE_CHANGE, aicn.b(), sb3, sb3.hashCode()));
        this.e.a(ahlr2);
        this.e = ahlr2;
        String b5 = ahlr.b();
        StringBuilder sb4 = new StringBuilder(String.valueOf(b5).length() + 41);
        sb4.append("Entering state: ");
        sb4.append(b5);
        sb4.append(" at: ");
        sb4.append(elapsedRealtime);
        sb4.toString();
        this.d.a(ahlr2, elapsedRealtime);
        this.e.a();
        List list = this.i;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ahlt) list.get(i2)).a(ahlr2);
            }
        }
    }

    public final void a(boolean z) {
        Bundle bundle;
        this.h.a(aico.VEHICLE_EXIT_DETECTED);
        int i2 = ahnk.VEHICLE_EXIT_TALA.am;
        DetectedActivity detectedActivity = new DetectedActivity(6, 100);
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z) {
            bundle = rcm.a((Bundle) null, "vehicle_personal_confidence");
        } else {
            bundle = null;
        }
        this.g.a(new ActivityRecognitionResult(detectedActivity, currentTimeMillis, elapsedRealtime, i2, bundle));
        List list = this.i;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((ahlt) list.get(i3)).a(z);
            }
        }
        a((ahlr) new ahlv(this));
    }

    public final void a(boolean z, int i2, aiaf aiaf) {
        if (z && i2 == 1) {
            this.e.c();
        }
    }
}
