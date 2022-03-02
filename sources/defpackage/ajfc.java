package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Message;
import com.google.android.location.quake.ShakeEvent;
import com.google.android.location.quake.ShakeVettingHints;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: ajfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajfc extends ajgs {
    private final Context a;
    private final ajfq b;
    private final ajfe c;
    private final ajeu d;
    private ajdb e;
    private final ajek i;

    public ajfc(Context context, ajfq ajfq, ajfe ajfe, ajeu ajeu, ajek ajek) {
        super("ResRep");
        this.a = context;
        this.b = ajfq;
        this.c = ajfe;
        this.d = ajeu;
        this.i = ajek;
    }

    public final void a() {
        jjg jjg = ajfj.a;
        ajdb ajdb = new ajdb(this.i.a.b);
        this.e = ajdb;
        ajdb.a();
        this.h.c();
    }

    public final void b() {
        ajdb ajdb = this.e;
        if (ajdb != null) {
            ajdb.b();
            this.e = null;
        }
    }

    public final boolean a(Message message) {
        ahyq ahyq;
        Location location;
        aqek aqek;
        if (this.e != null) {
            int i2 = message.what;
            if (i2 == 6) {
                jjg jjg = ajfj.a;
                if (!ayek.a.a().seismicSendSessionHeartbeat()) {
                    return false;
                }
                ajfm a2 = ((ajfh) this.c).a.a(ajdg.a(this.a), System.currentTimeMillis());
                ajdb ajdb = this.e;
                long j = a2.c;
                int i3 = a2.d;
                int i4 = a2.e;
                int i5 = a2.f;
                int i6 = a2.g;
                int i7 = a2.a;
                long j2 = a2.b;
                int i8 = ajdb.d;
                aqek aqek2 = new aqek(ajck.q);
                aqek2.a(1, 2);
                aqek2.a(2, j);
                aqek2.a(3, i3);
                aqek2.a(4, i4);
                aqek2.a(5, i5);
                aqek2.a(6, i6);
                aqek2.a(7, i7);
                if (ayek.a.a().seismicHeartbeatEnableS2CellReporting()) {
                    aqek2.a(8, j2);
                }
                aqek aqek3 = new aqek(ajck.n);
                aqek3.b(2, (Object) aqek2);
                ajdb.a(ajdb.a(aqek3, (aqek) null));
                return false;
            } else if (i2 == 8) {
                jjg jjg2 = ajfj.a;
                this.h.b.a(10, message.getData(), ayek.o() / 2);
                return false;
            } else if (i2 != 10) {
                return false;
            } else {
                jjg jjg3 = ajfj.a;
                if (this.e == null) {
                    return true;
                }
                ShakeEvent shakeEvent = (ShakeEvent) ajgt.b(message);
                arus f = this.d.f();
                long j3 = shakeEvent.a;
                long nanos = TimeUnit.MILLISECONDS.toNanos(ayek.o()) / 2;
                long j4 = j3 - f.i;
                ahyb ahyb = f.a;
                long j5 = j4 - nanos;
                int a3 = ahyb.a(j5, ahyb.a(j5));
                int a4 = f.a.a(j4 + nanos);
                if (a3 == -1) {
                    ahyq = null;
                } else if (a4 == -1) {
                    ahyq = null;
                } else if (a4 >= a3) {
                    int i9 = (a4 - a3) + 1;
                    long[] jArr = new long[i9];
                    int[] iArr = new int[2];
                    iArr[1] = i9;
                    iArr[0] = 3;
                    float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                    int i10 = 0;
                    while (i10 < i9) {
                        int i11 = a3 + i10;
                        jArr[i10] = f.a.a(i11) + f.i;
                        fArr[0][i10] = f.a.a(i11, 0);
                        fArr[1][i10] = f.a.a(i11, 1);
                        fArr[2][i10] = f.a.a(i11, 2);
                        i10++;
                        a3 = a3;
                    }
                    ahyq = new ahyq(jArr, fArr);
                } else {
                    ahyq = null;
                }
                ajdb ajdb2 = this.e;
                Location d2 = this.b.d();
                Location f2 = this.b.f();
                Location e2 = this.b.e();
                Long g = this.b.g();
                long millis = TimeUnit.NANOSECONDS.toMillis(shakeEvent.a);
                ShakeVettingHints shakeVettingHints = shakeEvent.b;
                ahyq ahyq2 = ahyq;
                long j6 = shakeVettingHints.a;
                boolean z = shakeVettingHints.b;
                boolean z2 = shakeVettingHints.c;
                Location location2 = f2;
                double d3 = shakeVettingHints.d;
                double d4 = shakeVettingHints.e;
                double d5 = shakeVettingHints.f;
                double d6 = shakeVettingHints.g;
                double d7 = shakeVettingHints.h;
                double d8 = shakeVettingHints.i;
                int i12 = shakeVettingHints.j;
                int i13 = ajdb.d;
                ajdb ajdb3 = ajdb2;
                aqek aqek4 = new aqek(ajck.o);
                if (d2 != null) {
                    location = d2;
                    aqek4.a(1, (Object) ajdb.a(d2));
                } else {
                    location = d2;
                }
                if (location2 != null) {
                    aqek4.a(2, (Object) ajdb.a(location2));
                }
                if (e2 != null) {
                    aqek4.a(3, (Object) ajdb.a(e2));
                }
                aqek4.a(4, millis);
                if (g != null) {
                    aqek4.a(5, g.longValue());
                }
                if (ayek.a.a().seismicReportActiveVibe()) {
                    aqek4.a(6, j6);
                }
                if (ayek.c()) {
                    aqek4.a(7, z);
                }
                if (ayek.d()) {
                    aqek4.a(8, z2);
                }
                if (ayek.a.a().seismicAccelReportAngles()) {
                    aqek aqek5 = new aqek(ajck.p);
                    aqek5.a(1, d3);
                    aqek5.a(2, d4);
                    aqek4.a(9, (Object) aqek5);
                }
                if (ayek.b() || ayek.f()) {
                    aqek4.a(10, d5);
                }
                if (ayek.f()) {
                    aqek4.a(11, d6);
                    aqek4.a(12, d7);
                    aqek4.a(13, d8);
                }
                if (ayek.x() == 1) {
                    aqek4.a(14, i12);
                }
                aqek aqek6 = new aqek(ajck.n);
                aqek6.a(1, (Object) aqek4);
                if (ahyq2 != null) {
                    aqek = new aqek(ajck.bz);
                    aqek.b(1, 0);
                    ahyq ahyq3 = ahyq2;
                    long a5 = ahyq3.a(0);
                    int i14 = 0;
                    while (i14 < ahyq3.b) {
                        aqek aqek7 = new aqek(ajck.bB);
                        long a6 = ahyq3.a(i14);
                        long a7 = ahyq3.a(i14);
                        aqek7.b(8, a6 - a5);
                        aqek7.b(1, ahyq3.a(i14, 0));
                        aqek7.b(2, ahyq3.a(i14, 1));
                        aqek7.b(3, ahyq3.a(i14, 2));
                        aqek.a(3, (Object) aqek7);
                        i14++;
                        a5 = a7;
                    }
                    if (location != null) {
                        aqek.a(8, (Object) ajdb.a(location));
                    }
                } else {
                    aqek = null;
                }
                aqek a8 = ajdb.a(aqek6, aqek);
                ajdb ajdb4 = ajdb3;
                ajdb4.a(a8);
                Context context = ajdb4.a;
                if (!ayek.l()) {
                    return true;
                }
                try {
                    File a9 = ajcu.a(context);
                    if (a9 == null) {
                        return true;
                    }
                    new FileOutputStream(new File(a9, String.valueOf(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss", Locale.getDefault()).format(new Date())).concat(".gloc"))).write(a8.b());
                    return true;
                } catch (IOException e3) {
                    return true;
                }
            }
        } else {
            return false;
        }
    }
}
