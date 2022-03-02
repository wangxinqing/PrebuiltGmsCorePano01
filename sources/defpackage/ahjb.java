package defpackage;

import com.google.android.gms.location.FloorChangeEvent;
import com.google.android.gms.location.SleepSegmentEvent;

/* renamed from: ahjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjb {
    public static void a(aicn aicn, int i) {
        aicn.a(new aicl(aico.ACTIVITY_INSUFFICIENT_SAMPLES, aicn.b(), "%2$d", i));
    }

    public static void a(aicn aicn, FloorChangeEvent floorChangeEvent) {
        aicn.a((aicl) new aicm(aico.FLOOR_CHANGE_DETECTED, aicn.b(), (String) null, floorChangeEvent, floorChangeEvent.a, floorChangeEvent.b, Float.floatToRawIntBits(floorChangeEvent.g)));
    }

    public static void a(aicn aicn, SleepSegmentEvent sleepSegmentEvent, int i) {
        aicn.a((aicl) new aicm(aico.SLEEP_SEGMENT_FAILURE, aicn.b(), (String) null, sleepSegmentEvent, i, -1, -1));
    }
}
