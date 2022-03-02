package defpackage;

import android.location.Location;
import android.os.Build;
import com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl;
import com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* renamed from: chu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chu {
    private static ActivityRecognitionResult a(ContextData contextData) {
        atrs atrs = (atrs) contextData.a((aubq) atrs.c);
        if (atrs == null) {
            ((anih) ((anih) bxk.a.b()).a("chu", "a", 186, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextDataParser] Unable to get DetectedActivity proto.");
            return null;
        } else if (atrs.a.size() <= 0) {
            return null;
        } else {
            jiq i = cbi.i();
            atrq[] atrqArr = (atrq[]) atrs.a.toArray(new atrq[0]);
            ArrayList arrayList = new ArrayList();
            for (atrq atrq : atrqArr) {
                atrp a = atrp.a(atrq.b);
                if (a == null) {
                    a = atrp.IN_VEHICLE;
                }
                arrayList.add(new DetectedActivity(a.x, atrq.c));
            }
            return new ActivityRecognitionResult(arrayList, i.a(), i.b());
        }
    }

    private static HeadphoneStateImpl b(ContextData contextData) {
        int a;
        atna atna = (atna) contextData.a((aubq) atna.i);
        if (!(atna == null || (a = atmt.a(atna.b)) == 0)) {
            int i = 1;
            if (a != 1) {
                int a2 = atmt.a(atna.b);
                if (a2 != 0) {
                    i = a2;
                }
                return new HeadphoneStateImpl(i - 1);
            }
        }
        ((anih) ((anih) bxk.a.b()).a("chu", "b", 206, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextDataParser] Audio Proto: %s", (Object) atna);
        return null;
    }

    private static Location c(ContextData contextData) {
        atus atus = (atus) contextData.a((aubq) atus.j);
        if (atus == null) {
            ((anih) ((anih) bxk.a.b()).a("chu", "c", 216, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextDataParser] Unable to get UserLocation proto.");
            return null;
        }
        jut j = contextData.j();
        Location location = new Location("Snapshot");
        location.setAccuracy(atus.g);
        location.setAltitude(atus.f);
        location.setLatitude(aell.b(atus.b));
        location.setLongitude(aell.b(atus.c));
        location.setSpeed(atus.d);
        if (j != null) {
            location.setTime(j.c());
            int i = Build.VERSION.SDK_INT;
            jiq i2 = cbi.i();
            location.setElapsedRealtimeNanos((i2.b() + (j.c() - i2.a())) * 1000000);
        }
        return location;
    }

    private static WeatherImpl d(ContextData contextData) {
        int[] iArr;
        atuv atuv = (atuv) contextData.a((aubq) atuv.d);
        if (atuv == null || (atuv.a & 1) == 0) {
            ((anih) ((anih) bxk.a.b()).a("chu", "d", 226, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextDataParser] Weather proto or current conditions is null");
            return null;
        }
        atuu atuu = atuv.b;
        if (atuu == null) {
            atuu = atuu.c;
        }
        atuz atuz = atuu.b;
        if (atuz == null) {
            atuz = atuz.f;
        }
        atuu atuu2 = atuv.b;
        if (atuu2 == null) {
            atuu2 = atuu.c;
        }
        if ((atuu2.a & 1) != 0) {
            if (atuz.e.size() != 0) {
                int size = atuz.e.size();
                int[] iArr2 = new int[size];
                for (int i = 0; i < size; i++) {
                    int a = atux.a(((atuy) atuz.e.get(i)).a);
                    if (a == 0) {
                        a = 1;
                    }
                    iArr2[i] = a - 1;
                }
                iArr = iArr2;
            } else {
                iArr = new int[]{0};
            }
            return new WeatherImpl(atuz.a, atuz.b, atuz.c, atuz.d, iArr);
        }
        ((anih) ((anih) bxk.a.b()).a("chu", "d", 231, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextDataParser] current state is null");
        return null;
    }

    private static TimeIntervalsImpl e(ContextData contextData) {
        int[] iArr;
        atrn atrn = (atrn) contextData.a((aubq) atrn.d);
        if (atrn == null) {
            ((anih) ((anih) bxk.a.b()).a("chu", "e", 255, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextDataParser] TimeIntervals proto is null");
            return null;
        }
        if (atrn.a.size() != 0) {
            int size = atrn.a.size();
            iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = ((atrm) atrn.b.a(Integer.valueOf(atrn.a.c(i)))).i;
            }
        } else {
            iArr = new int[0];
        }
        return new TimeIntervalsImpl(iArr);
    }
}
