package defpackage;

import com.google.android.gms.location.FloorChangeEvent;
import java.util.List;

/* renamed from: ajbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajbv implements Runnable {
    final /* synthetic */ ajbw a;
    final /* synthetic */ arnt b;

    public ajbv(ajbw ajbw, arnt arnt) {
        this.a = ajbw;
        this.b = arnt;
    }

    public final void run() {
        ajbw ajbw = this.a;
        arnt arnt = this.b;
        int a2 = armf.a(arnt.a);
        int i = a2 - 1;
        if (a2 == 0) {
            throw null;
        } else if (i != 66) {
            int i2 = arnt.a;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Unknown message type: ");
            sb.append(i2);
            sb.toString();
        } else {
            arlf arlf = (arlf) arnt.a((auef) arlf.f.c(7));
            int a3 = arle.a(arlf.a);
            int i3 = 1;
            if (a3 == 0) {
                a3 = 1;
            }
            String valueOf = String.valueOf(Integer.toString(a3 - 1));
            float f = arlf.b;
            int i4 = arlf.d;
            int i5 = arlf.e;
            float f2 = arlf.c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 101);
            sb2.append("HandleFloorChange: type=");
            sb2.append(valueOf);
            sb2.append(", conf=");
            sb2.append(f);
            sb2.append(", time=[");
            sb2.append(i4);
            sb2.append(", ");
            sb2.append(i5);
            sb2.append("], elev=");
            sb2.append(f2);
            sb2.toString();
            int i6 = arlf.d;
            int i7 = arlf.e;
            if (i6 > i7) {
                StringBuilder sb3 = new StringBuilder(56);
                sb3.append("bad event, startTime(");
                sb3.append(i6);
                sb3.append(") > endTime(");
                sb3.append(i7);
                sb3.append(")");
                sb3.toString();
                return;
            }
            List list = ajbw.a;
            if (list != null && !list.isEmpty()) {
                List list2 = ajbw.a;
                int size = list2.size();
                int i8 = 0;
                while (i8 < size) {
                    ajal ajal = (ajal) list2.get(i8);
                    int a4 = arle.a(arlf.a);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i9 = a4 - 1;
                    int i10 = 3;
                    if (i9 == i3) {
                        i10 = 1;
                    } else if (i9 == 2) {
                        i10 = 2;
                    } else if (i9 != 3) {
                        StringBuilder sb4 = new StringBuilder(51);
                        sb4.append("Invalid floor change type from nanoapp: ");
                        sb4.append(i9);
                        sb4.toString();
                        i10 = 0;
                    }
                    int round = Math.round(arlf.b * 100.0f);
                    int i11 = 100;
                    if (round < 0) {
                        i11 = 0;
                    } else if (round <= 100) {
                        i11 = round;
                    }
                    long j = (long) arlf.d;
                    long j2 = (long) arlf.e;
                    arlf arlf2 = arlf;
                    FloorChangeEvent floorChangeEvent = r8;
                    FloorChangeEvent floorChangeEvent2 = new FloorChangeEvent(i10, i11, ((long) arlf.d) + ajbt.e(), ((long) arlf.e) + ajbt.e(), j, j2, arlf.c);
                    ajal.a(floorChangeEvent);
                    i8++;
                    list2 = list2;
                    arlf = arlf2;
                    i3 = 1;
                }
            }
        }
    }
}
