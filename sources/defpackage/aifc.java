package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: aifc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aifc {
    public long A;
    public long B;
    public int C;
    public boolean D = false;
    public long E = Long.MIN_VALUE;
    public long F;
    public long G;
    public int H;
    public ArrayList I;
    public ArrayList J;
    public anzj K;
    public Location L;
    public int M = 1;
    public int N = 1;
    private final Context O;
    private long P;
    private boolean Q = true;
    private final aicw R;
    public final aiez a;
    public final aifi b;
    final aiey c;
    public final aicy d;
    public final jhl e;
    public final ahyl f;
    public final Random g;
    public boolean h;
    public Location i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public Integer o;
    public Integer p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public long y;
    public long z;

    public aifc(aicy aicy, aicw aicw, Context context, aifi aifi, jhl jhl, ahyl ahyl) {
        this.d = aicy;
        this.R = aicw;
        this.b = aifi;
        this.g = new Random();
        this.h = false;
        this.a = new aiez();
        this.c = new aiey(this);
        this.O = context;
        this.P = Long.MIN_VALUE;
        this.i = null;
        this.j = 0;
        this.k = Long.MIN_VALUE;
        this.l = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
        this.m = Long.MIN_VALUE;
        this.e = jhl;
        this.f = ahyl;
    }

    public static long a(Location location) {
        return aema.a(aema.a(location.getLatitude(), location.getLongitude()), 9);
    }

    static int b(Location location) {
        int i2 = rev.i(location);
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 1 : 17;
        }
        return 33;
    }

    private final void e() {
        aiey aiey = this.c;
        aiey.a = null;
        aiey.b = null;
        aiey.c = null;
        aiey.d = Long.MIN_VALUE;
        aiey.e = Long.MIN_VALUE;
        aiey.i = 0;
        aiey.h = 0;
        aiey.g = 0;
        aiey.f = 0;
        aiey.j = 0;
        this.i = null;
        this.j = 0;
        this.L = null;
        this.h = false;
        this.q = 0;
        this.y = 0;
        this.r = 0;
        this.z = 0;
        this.o = 1;
        this.p = 1;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.x = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.w = 0;
    }

    public final void b() {
        this.N = 1;
        this.D = false;
        this.E = Long.MIN_VALUE;
        this.F = 0;
        this.K = null;
        this.H = 0;
        this.I = null;
        this.J = null;
        this.Q = true;
    }

    public final boolean c() {
        return this.P < 0 || SystemClock.elapsedRealtime() - this.P > aydf.e();
    }

    public final void d() {
        boolean z2;
        aiez aiez;
        long j2;
        anzn anzn;
        boolean z3 = null;
        if (a()) {
            Location location = this.i;
            if (location != null) {
                j2 = a(location);
            } else {
                j2 = -1;
            }
            aucd o2 = anzy.p.o();
            if (aydf.a.a().disablePositiveNumberCheckForS2CellId() || j2 > 0) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzy anzy = (anzy) o2.b;
                anzy.a |= 1;
                anzy.b = j2;
            }
            long j3 = this.c.f;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzy anzy2 = (anzy) o2.b;
            int i2 = anzy2.a | 4;
            anzy2.a = i2;
            anzy2.f = j3;
            aiey aiey = this.c;
            long j4 = aiey.g;
            int i3 = i2 | 8;
            anzy2.a = i3;
            anzy2.g = j4;
            long j5 = aiey.j;
            anzy2.a = i3 | 1024;
            anzy2.n = j5;
            if (!aydf.a.a().disableLoggingTtffInTheAggregateLog()) {
                long j6 = this.c.d;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzy anzy3 = (anzy) o2.b;
                anzy3.a |= 2;
                anzy3.e = j6;
            }
            aicw aicw = this.R;
            if (ayam.b()) {
                anzk anzk = (anzk) anzn.i.o();
                anzk.d(aook.a(aicw.a.a()));
                anzk.b(aook.a(aicw.b.a()));
                anzk.a(aook.a(aicw.c.a()));
                anzk.c(aook.a(aicw.d.a()));
                int i4 = aicw.e;
                if (anzk.c) {
                    anzk.c();
                    anzk.c = false;
                }
                anzn anzn2 = (anzn) anzk.b;
                anzn2.a |= 1;
                anzn2.f = i4;
                if (ayam.b()) {
                    int i5 = aicw.f;
                    if (anzk.c) {
                        anzk.c();
                        anzk.c = false;
                    }
                    anzn anzn3 = (anzn) anzk.b;
                    int i6 = i5 - 1;
                    if (i5 != 0) {
                        anzn3.g = i6;
                        int i7 = anzn3.a | 2;
                        anzn3.a = i7;
                        int i8 = aicw.g;
                        int i9 = i8 - 1;
                        if (i8 != 0) {
                            anzn3.h = i9;
                            anzn3.a = i7 | 4;
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
                aicw.e = 0;
                anzn = (anzn) anzk.i();
            } else {
                int i10 = aicw.e;
                aicw.e = 0;
                anzk anzk2 = (anzk) anzn.i.o();
                anzk2.d(aook.a(aicw.a.a()));
                anzk2.b(aook.a(aicw.b.a()));
                anzk2.a(aook.a(aicw.c.a()));
                anzk2.c(aook.a(aicw.d.a()));
                if (anzk2.c) {
                    anzk2.c();
                    anzk2.c = false;
                }
                anzn anzn4 = (anzn) anzk2.b;
                anzn4.a |= 1;
                anzn4.f = i10;
                anzn = (anzn) anzk2.i();
            }
            if (anzn != null) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzy anzy4 = (anzy) o2.b;
                anzn.getClass();
                anzy4.o = anzn;
                anzy4.a |= 2048;
            }
            int i11 = this.c.h;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzy anzy5 = (anzy) o2.b;
            int i12 = anzy5.a | 16;
            anzy5.a = i12;
            anzy5.h = i11;
            int i13 = this.c.i;
            anzy5.a = i12 | 32;
            anzy5.i = i13;
            long minutes = TimeUnit.MILLISECONDS.toMinutes(this.A);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzy anzy6 = (anzy) o2.b;
            anzy6.a |= 64;
            anzy6.j = minutes;
            long minutes2 = TimeUnit.MILLISECONDS.toMinutes(this.B);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzy anzy7 = (anzy) o2.b;
            int i14 = anzy7.a | 128;
            anzy7.a = i14;
            anzy7.k = minutes2;
            int i15 = this.C;
            anzy7.a = i14 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            anzy7.l = i15;
            long minutes3 = TimeUnit.MILLISECONDS.toMinutes(aydf.e());
            if (minutes3 < 2147483647L) {
                int i16 = (int) minutes3;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzy anzy8 = (anzy) o2.b;
                anzy8.a |= 512;
                anzy8.m = i16;
            } else {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzy anzy9 = (anzy) o2.b;
                anzy9.a |= 512;
                anzy9.m = Integer.MAX_VALUE;
            }
            SparseArray sparseArray = this.c.a;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i17 = 0; i17 < size; i17++) {
                    aifa aifa = (aifa) this.c.a.valueAt(i17);
                    int keyAt = this.c.a.keyAt(i17);
                    long j7 = (long) aifa.a;
                    int i18 = aifa.b;
                    aucd o3 = aoac.e.o();
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aoac aoac = (aoac) o3.b;
                    int i19 = aoac.a | 1;
                    aoac.a = i19;
                    aoac.b = keyAt;
                    int i20 = i19 | 2;
                    aoac.a = i20;
                    aoac.c = j7;
                    aoac.a = i20 | 4;
                    aoac.d = i18;
                    aoac aoac2 = (aoac) o3.i();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anzy anzy10 = (anzy) o2.b;
                    aoac2.getClass();
                    if (!anzy10.c.a()) {
                        anzy10.c = aucj.a(anzy10.c);
                    }
                    anzy10.c.add(aoac2);
                }
            }
            SparseArray sparseArray2 = this.c.b;
            if (sparseArray2 != null) {
                int size2 = sparseArray2.size();
                for (int i21 = 0; i21 < size2; i21++) {
                    aifb aifb = (aifb) this.c.b.valueAt(i21);
                    int keyAt2 = this.c.b.keyAt(i21);
                    int i22 = keyAt2 / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                    int i23 = keyAt2 % ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                    long j8 = (long) aifb.a;
                    long j9 = (long) aifb.b;
                    aucd o4 = aoad.f.o();
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    aoad aoad = (aoad) o4.b;
                    int i24 = aoad.a | 1;
                    aoad.a = i24;
                    aoad.b = i22;
                    int i25 = i24 | 2;
                    aoad.a = i25;
                    aoad.c = i23;
                    int i26 = i25 | 4;
                    aoad.a = i26;
                    aoad.d = j8;
                    aoad.a = i26 | 8;
                    aoad.e = j9;
                    aoad aoad2 = (aoad) o4.i();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anzy anzy11 = (anzy) o2.b;
                    aoad2.getClass();
                    if (!anzy11.d.a()) {
                        anzy11.d = aucj.a(anzy11.d);
                    }
                    anzy11.d.add(aoad2);
                }
            }
            anzy anzy12 = (anzy) o2.i();
            aicy aicy = this.d;
            ArrayList arrayList = this.c.c;
            anyo a2 = this.a.a();
            if (!(anzy12 == null && arrayList == null)) {
                aucd o5 = aoaa.m.o();
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aoaa aoaa = (aoaa) o5.b;
                aoaa.g = 1;
                int i27 = aoaa.a | 16;
                aoaa.a = i27;
                if (a2 != null) {
                    a2.getClass();
                    aoaa.f = a2;
                    i27 |= 8;
                    aoaa.a = i27;
                }
                if (anzy12 != null) {
                    anzy12.getClass();
                    aoaa.b = anzy12;
                    aoaa.a = i27 | 1;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    aoaa aoaa2 = (aoaa) o5.b;
                    if (!aoaa2.c.a()) {
                        aoaa2.c = aucj.a(aoaa2.c);
                    }
                    auab.a((Iterable) arrayList, (List) aoaa2.c);
                }
                aicy.a((aoaa) o5.i());
            }
            e();
        }
        this.P = SystemClock.elapsedRealtime();
        if (((double) this.g.nextFloat()) < aydf.a.a().locationQualityFlpStatsSamplingRate()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        this.h = z2 & rns.a(this.O);
        if (a()) {
            this.a.a = Integer.toString(2023);
            int a3 = ajqk.a(this.O);
            if (a3 == 0) {
                aiez = this.a;
            } else if (a3 != 1) {
                this.a.b = true;
                return;
            } else {
                aiez = this.a;
                z3 = false;
            }
            aiez.b = z3;
        }
    }

    public static long a(Location location, Location location2) {
        int i2 = Build.VERSION.SDK_INT;
        return TimeUnit.NANOSECONDS.toMillis(location2.getElapsedRealtimeNanos() - location.getElapsedRealtimeNanos());
    }

    public final anzj a(boolean z2, boolean z3) {
        aucd o2 = anzj.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anzj anzj = (anzj) o2.b;
        int i2 = anzj.a | 1;
        anzj.a = i2;
        anzj.b = z2;
        anzj.a = i2 | 2;
        anzj.c = z3;
        Integer num = this.o;
        if (num != null) {
            int intValue = num.intValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzj anzj2 = (anzj) o2.b;
            anzj2.a |= 4;
            anzj2.d = intValue;
        }
        Integer num2 = this.p;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzj anzj3 = (anzj) o2.b;
            anzj3.a |= 8;
            anzj3.e = intValue2;
        }
        return (anzj) o2.i();
    }

    public final anzr a(Location location, boolean z2, boolean z3, boolean z4, long j2, long j3) {
        long j4 = j3;
        aucd o2 = anzr.p.o();
        long j5 = this.j;
        if (j5 != 0) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzr anzr = (anzr) o2.b;
            anzr.a |= 1;
            anzr.b = j5;
        }
        if (location != null) {
            int b2 = b(location) - 1;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzr anzr2 = (anzr) o2.b;
            int i2 = anzr2.a | 1024;
            anzr2.a = i2;
            anzr2.j = b2;
            anzr2.a = i2 | 512;
            anzr2.i = false;
            if (z2) {
                if (location.getAccuracy() > 0.0f) {
                    int accuracy = (int) location.getAccuracy();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anzr anzr3 = (anzr) o2.b;
                    anzr3.a |= 16384;
                    anzr3.n = accuracy;
                }
                if (Build.VERSION.SDK_INT >= 26 && location.getVerticalAccuracyMeters() > 0.0f) {
                    int verticalAccuracyMeters = (int) location.getVerticalAccuracyMeters();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anzr anzr4 = (anzr) o2.b;
                    anzr4.a |= 32768;
                    anzr4.o = verticalAccuracyMeters;
                }
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzr anzr5 = (anzr) o2.b;
            anzr5.a |= 512;
            anzr5.i = false;
            int i3 = Build.VERSION.SDK_INT;
            long elapsedRealtime = SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzr anzr6 = (anzr) o2.b;
            anzr6.a |= 64;
            anzr6.g = elapsedRealtime;
        } else {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzr anzr7 = (anzr) o2.b;
            int i4 = anzr7.a | 512;
            anzr7.a = i4;
            anzr7.i = true;
            anzr7.a = i4 | 2048;
            anzr7.k = j2;
        }
        anzr anzr8 = (anzr) o2.b;
        int i5 = anzr8.a | 4;
        anzr8.a = i5;
        anzr8.c = z3;
        anzr8.a = i5 | 8;
        anzr8.d = z4;
        Integer num = this.o;
        if (num != null) {
            int intValue = num.intValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzr anzr9 = (anzr) o2.b;
            anzr9.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            anzr9.l = intValue;
        }
        Integer num2 = this.p;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzr anzr10 = (anzr) o2.b;
            anzr10.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            anzr10.m = intValue2;
        }
        if (j4 > 0) {
            anzr anzr11 = (anzr) o2.b;
            anzr11.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            anzr11.h = j4;
        }
        if (aydf.a.a().fixTimeSinceLocationEnabledForOldVersion()) {
            int i6 = Build.VERSION.SDK_INT;
        }
        if (this.n > 0) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.n;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzr anzr12 = (anzr) o2.b;
            anzr12.a |= 16;
            anzr12.e = elapsedRealtime2;
        } else if (this.m > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.m;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzr anzr13 = (anzr) o2.b;
            anzr13.a |= 16;
            anzr13.e = currentTimeMillis;
        }
        if (this.l > 0) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - this.l;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzr anzr14 = (anzr) o2.b;
            anzr14.a |= 32;
            anzr14.f = elapsedRealtime3;
        }
        return (anzr) o2.i();
    }

    public final String a(int i2, String str) {
        aifa aifa;
        SparseArray sparseArray = this.c.a;
        if (sparseArray == null || (aifa = (aifa) sparseArray.get(i2 - 1)) == null) {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("0 ");
            sb.append(str);
            sb.append(" locations");
            return sb.toString();
        }
        int i3 = aifa.a;
        int i4 = aifa.b;
        StringBuilder sb2 = new StringBuilder(str.length() + 48);
        sb2.append(i3);
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" locations, avg accuracy ");
        sb2.append(i4);
        return sb2.toString();
    }

    public final void a(int i2, Location location, long j2, int i3, ArrayList arrayList, ArrayList arrayList2, anzj anzj) {
        int i4 = i2;
        long j3 = j2;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        if (j3 >= 0) {
            aucd o2 = anzq.j.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anzq anzq = (anzq) o2.b;
            int i5 = i4 - 1;
            if (i4 != 0) {
                anzq.b = i5;
                anzq.a |= 1;
                if (location != null) {
                    long a2 = a(location);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anzq anzq2 = (anzq) o2.b;
                    anzq2.a |= 2;
                    anzq2.c = a2;
                    int b2 = b(location) - 1;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anzq anzq3 = (anzq) o2.b;
                    anzq3.a |= 32;
                    anzq3.i = b2;
                }
                anzq anzq4 = (anzq) o2.b;
                anzj.getClass();
                anzq4.d = anzj;
                int i6 = anzq4.a | 4;
                anzq4.a = i6;
                if (j3 > 0) {
                    int i7 = i6 | 8;
                    anzq4.a = i7;
                    anzq4.e = j3;
                    if (this.Q) {
                        anzq4.a = i7 | 16;
                        anzq4.f = i3;
                    }
                    if (arrayList3 != null) {
                        if (!anzq4.g.a()) {
                            anzq4.g = aucj.a(anzq4.g);
                        }
                        auab.a((Iterable) arrayList3, (List) anzq4.g);
                    }
                    if (arrayList4 != null) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        anzq anzq5 = (anzq) o2.b;
                        if (!anzq5.h.a()) {
                            anzq5.h = aucj.a(anzq5.h);
                        }
                        auab.a((Iterable) arrayList4, (List) anzq5.h);
                    }
                }
                aicy aicy = this.d;
                anzq anzq6 = (anzq) o2.i();
                anyo a3 = this.a.a();
                aucd o3 = aoaa.m.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aoaa aoaa = (aoaa) o3.b;
                aoaa.g = 5;
                int i8 = aoaa.a | 16;
                aoaa.a = i8;
                if (anzq6 != null) {
                    anzq6.getClass();
                    aoaa.i = anzq6;
                    i8 |= 64;
                    aoaa.a = i8;
                }
                if (a3 != null) {
                    a3.getClass();
                    aoaa.f = a3;
                    aoaa.a = i8 | 8;
                }
                aicy.a((aoaa) o3.i());
                if (i4 == 3) {
                    this.t++;
                } else if (i4 == 2) {
                    this.u++;
                } else {
                    this.v++;
                }
            } else {
                throw null;
            }
        }
    }

    public final void a(LocationAvailability locationAvailability) {
        long j2;
        if (this.I == null) {
            this.I = new ArrayList();
        }
        this.I.add(Integer.valueOf(locationAvailability.b));
        if (this.J == null) {
            this.J = new ArrayList();
        }
        this.J.add(Integer.valueOf(locationAvailability.a));
        aifi aifi = this.b;
        if (aifi != null) {
            j2 = aifi.f;
        } else {
            j2 = 0;
        }
        if (j2 == 0) {
            this.Q = false;
            this.H = 0;
        }
        if (!this.Q) {
            return;
        }
        if (this.G > 0) {
            this.H = (int) (((long) this.H) + ((SystemClock.elapsedRealtime() - this.G) / j2));
        } else {
            this.H = (int) (((long) this.H) + ((SystemClock.elapsedRealtime() - this.l) / j2));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (!rns.a(this.O)) {
            e();
            this.h = false;
        }
        return this.h;
    }

    public final boolean a(String str, String str2) {
        return jni.b(this.O).a(str2, str) == 0;
    }
}
