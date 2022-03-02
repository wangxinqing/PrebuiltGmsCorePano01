package defpackage;

import android.app.AlarmManager;
import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ahsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahsy implements Runnable {
    private final ahsw a;
    private final Set b;
    private final ahvk c;
    private final long d;
    private final long e;
    private final Context f;
    private final ahux g;
    private final ahtn h;

    public ahsy(Context context, ahux ahux, ahvk ahvk, Set set, long j, long j2, ahtn ahtn, ahsw ahsw) {
        this.a = ahsw;
        this.f = context;
        this.h = ahtn;
        this.g = ahux;
        this.b = set;
        this.c = ahvk;
        this.d = j;
        this.e = j2;
    }

    public final void run() {
        ahrv ahrv;
        int i;
        ArrayList arrayList = new ArrayList(this.b.size());
        Iterator it = this.b.iterator();
        while (true) {
            char c2 = 1;
            char c3 = 0;
            if (it.hasNext()) {
                ahup ahup = (ahup) it.next();
                ahsw ahsw = this.a;
                synchronized (((ahrx) ahsw).c) {
                    ahrv = (ahrv) ((ahrx) ahsw).f.get(ahup.x);
                }
                String str = ahup.z;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
                sb.append("Adding ");
                sb.append(str);
                sb.append(" buffer to replay list");
                sb.toString();
                if (ahrv != null) {
                    ahyb ahyb = ahrv.a;
                    long j = this.d;
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Scan duration past time ");
                    sb2.append(j);
                    sb2.toString();
                    if (ahyb.a()) {
                        String str2 = ahup.z;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 34);
                        sb3.append("Buffer is empty for scanner type ");
                        sb3.append(str2);
                        sb3.append(".");
                        sb3.toString();
                    } else if (this.d == Long.MAX_VALUE) {
                        arrayList.add(new ahsx(ahup, ahyb, 0));
                    } else {
                        long j2 = this.e;
                        if (j2 <= 0) {
                            j2 = ahyb.a(ahyb.c - 1) - TimeUnit.NANOSECONDS.convert(this.d, TimeUnit.MILLISECONDS);
                            i = ahyb.a(j2);
                        } else {
                            i = 1 + ahyb.a(j2);
                        }
                        long nanos = TimeUnit.MILLISECONDS.toNanos(500);
                        if (i < 0 || (i < ahyb.c && j2 - ahyb.a(i) > nanos)) {
                            i = ahyb.a(j2, i);
                        }
                        if (i >= 0 && i < ahyb.c) {
                            arrayList.add(new ahsx(ahup, ahyb, i));
                        } else {
                            String str3 = ahup.z;
                            long j3 = this.d;
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 81);
                            sb4.append("No data was collected for scanner type ");
                            sb4.append(str3);
                            sb4.append(" in last ");
                            sb4.append(j3);
                            sb4.append(" millisecond.");
                            sb4.toString();
                        }
                    }
                } else {
                    String str4 = ahup.z;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str4).length() + 36);
                    sb5.append("Batch for scanner type ");
                    sb5.append(str4);
                    sb5.append(" not enabled.");
                    sb5.toString();
                }
            } else {
                int i2 = 2;
                if (!this.c.c) {
                    long b2 = this.g.b();
                    while (!arrayList.isEmpty()) {
                        long j4 = Long.MAX_VALUE;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < arrayList.size()) {
                            ahsx ahsx = (ahsx) arrayList.get(i3);
                            long a2 = ahsx.b.a(ahsx.c);
                            long j5 = a2 < j4 ? a2 : j4;
                            if (a2 < j4) {
                                i4 = i3;
                            }
                            i3++;
                            j4 = j5;
                        }
                        ahsx ahsx2 = (ahsx) arrayList.get(i4);
                        int i5 = ahsx2.a.A;
                        amrl.b(i5 == ahsx2.b.a, (Object) "Sensor dimension mismatch.");
                        int i6 = ahsx2.c;
                        ahsx2.c = i6 + 1;
                        long a3 = ahsx2.b.a(i6);
                        long j6 = a3 - b2;
                        Sensor a4 = this.h.a(ahsx2.a);
                        if (a4 != null) {
                            if (i5 == 1) {
                                ahvk ahvk = this.c;
                                float a5 = ahsx2.b.a(i6, 0);
                                synchronized (ahvk.a) {
                                    aiba aiba = (aiba) ahvk.e.get(Integer.valueOf(a4.getType()));
                                    ahvk.k.put(Integer.valueOf(a4.getType()), Long.valueOf(a3));
                                    if (aiba != null) {
                                        ahus ahus = (ahus) aiba.a;
                                        Handler handler = (Handler) aiba.b;
                                        amrl.a((Object) ahus);
                                        amrl.a((Object) handler);
                                        handler.post(new ahvh(ahus, a4, a3, j6, a5));
                                    }
                                }
                            } else if (i5 == 3) {
                                ahvk ahvk2 = this.c;
                                float a6 = ahsx2.b.a(i6, 0);
                                float a7 = ahsx2.b.a(i6, 1);
                                float a8 = ahsx2.b.a(i6, 2);
                                synchronized (ahvk2.a) {
                                    aiba aiba2 = (aiba) ahvk2.e.get(Integer.valueOf(a4.getType()));
                                    ahvk2.k.put(Integer.valueOf(a4.getType()), Long.valueOf(a3));
                                    if (aiba2 != null) {
                                        ahus ahus2 = (ahus) aiba2.a;
                                        Handler handler2 = (Handler) aiba2.b;
                                        amrl.a((Object) ahus2);
                                        amrl.a((Object) handler2);
                                        handler2.post(new ahvi(ahus2, a4, a3, j6, a6, a7, a8));
                                    }
                                }
                            } else if (i5 == 6) {
                                ahvk ahvk3 = this.c;
                                float a9 = ahsx2.b.a(i6, 0);
                                float a10 = ahsx2.b.a(i6, 1);
                                float a11 = ahsx2.b.a(i6, 2);
                                float a12 = ahsx2.b.a(i6, 3);
                                float a13 = ahsx2.b.a(i6, 4);
                                float a14 = ahsx2.b.a(i6, 5);
                                synchronized (ahvk3.a) {
                                    aiba aiba3 = (aiba) ahvk3.e.get(Integer.valueOf(a4.getType()));
                                    ahvk3.k.put(Integer.valueOf(a4.getType()), Long.valueOf(a3));
                                    if (aiba3 != null) {
                                        ahus ahus3 = (ahus) aiba3.a;
                                        Handler handler3 = (Handler) aiba3.b;
                                        amrl.a((Object) ahus3);
                                        amrl.a((Object) handler3);
                                        handler3.post(new ahvj(ahus3, a4, a3, j6, a9, a10, a11, a12, a13, a14));
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Unknown sensor dimension.");
                            }
                        }
                        if (ahsx2.a()) {
                            arrayList.remove(i4);
                        }
                    }
                } else {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        ahsx ahsx3 = (ahsx) arrayList.get(i7);
                        long b3 = this.g.b();
                        ahyb ahyb2 = ahsx3.b;
                        int i8 = ahyb2.c;
                        int i9 = ahsx3.c;
                        int i10 = i8 - i9;
                        StringBuilder sb6 = new StringBuilder(46);
                        sb6.append("buffer.getCount()=");
                        sb6.append(i8);
                        sb6.append(", pos=");
                        sb6.append(i9);
                        sb6.toString();
                        int i11 = ahyb2.a;
                        int[] iArr = new int[i2];
                        iArr[c2] = i10;
                        iArr[c3] = i11;
                        float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                        long[] jArr = new long[i10];
                        long[] jArr2 = new long[i10];
                        int i12 = 0;
                        while (!ahsx3.a()) {
                            int i13 = ahsx3.c;
                            ahsx3.c = i13 + 1;
                            long a15 = ahyb2.a(i13);
                            long j7 = (a15 - b3) / 1000000;
                            for (int i14 = 0; i14 < ahyb2.a; i14++) {
                                fArr[i14][i12] = ahyb2.a(i13, i14);
                            }
                            jArr[i12] = a15;
                            jArr2[i12] = j7;
                            i12++;
                        }
                        StringBuilder sb7 = new StringBuilder(31);
                        sb7.append("Replay event count: ");
                        sb7.append(i12);
                        sb7.toString();
                        if (i12 == i10) {
                            Sensor a16 = this.h.a(ahsx3.a);
                            if (a16 != null) {
                                this.c.a(a16, jArr, jArr2, fArr);
                            }
                            i7++;
                            i2 = 2;
                            c2 = 1;
                            c3 = 0;
                        } else {
                            throw new IllegalStateException("Wrong event size.");
                        }
                    }
                }
                ahvk ahvk4 = this.c;
                if (ahvk4.d) {
                    Context context = this.f;
                    if (ahvk4.m.b(ajbe.COLLECTIONLIB_REPLAYER)) {
                        ahvk4.m.c(ajbe.COLLECTIONLIB_REPLAYER);
                    }
                    AlarmManager alarmManager = ahvk4.g;
                    if (alarmManager != null) {
                        context.registerReceiver(ahvk4.n, new IntentFilter(ahvk4.j));
                        ahvk.a(alarmManager, 0, SystemClock.elapsedRealtime() + 30000, ahvk4.h);
                        return;
                    }
                    return;
                }
                ahvk4.b();
                return;
            }
        }
        while (true) {
        }
    }
}
