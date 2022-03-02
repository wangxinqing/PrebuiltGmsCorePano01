package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: aifl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aifl extends aics implements aiew, jlc, ajpx {
    private final aifc a;
    private final jld b;
    private final aieq c;
    private aiew d;
    private ajpz f;
    private boolean g;
    private boolean h;
    private long i = Long.MIN_VALUE;
    private boolean j = false;
    private boolean k = true;
    private int l = 0;

    public aifl(aiex aiex, Context context, Looper looper, aifc aifc) {
        super(aiex);
        this.a = aifc;
        jld jld = new jld(context, looper);
        this.b = jld;
        jld.a = this;
        this.c = null;
    }

    public final Location a(boolean z) {
        Location a2 = this.e.a(z);
        aifc aifc = this.a;
        boolean z2 = this.h;
        boolean z3 = this.g;
        if (aifc.c()) {
            aifc.d();
        }
        if (aifc.a()) {
            if (a2 == null) {
                aifc.y++;
            } else {
                aifc.y = 0;
                aifc.j = aifc.a(a2);
            }
            if (((double) aifc.g.nextFloat()) < aydf.d() && ((long) aifc.q) < aydf.f()) {
                anzr a3 = aifc.a(a2, false, z2, z3, aifc.y, -1);
                aicy aicy = aifc.d;
                anyo a4 = aifc.a.a();
                aucd o = aoaa.m.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aoaa aoaa = (aoaa) o.b;
                aoaa.g = 2;
                int i2 = aoaa.a | 16;
                aoaa.a = i2;
                if (a4 != null) {
                    a4.getClass();
                    aoaa.f = a4;
                    i2 |= 8;
                    aoaa.a = i2;
                }
                if (a3 != null) {
                    a3.getClass();
                    aoaa.d = a3;
                    aoaa.a = i2 | 2;
                }
                aicy.a((aoaa) o.i());
                aifc.q++;
            }
        }
        return a2;
    }

    public final void b() {
        this.e.b();
        this.b.b();
        ajpz ajpz = this.f;
        if (ajpz != null) {
            ajpz.a((ajpx) this);
        }
    }

    public final void e(List list) {
        String str;
        int i2;
        int i3;
        int i4;
        Location location;
        Iterator it;
        float f2;
        List list2 = list;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Location location2 = (Location) it2.next();
            aifc aifc = this.a;
            if (aifc.c()) {
                aifc.d();
            }
            if (aifc.a()) {
                aiey aiey = aifc.c;
                if (aiey.d == Long.MIN_VALUE && aifc.i == null && location2 != null && aiey.e != Long.MIN_VALUE) {
                    int i5 = Build.VERSION.SDK_INT;
                    aiey.d = TimeUnit.NANOSECONDS.toMillis(location2.getElapsedRealtimeNanos()) - aiey.k.l;
                }
                Location location3 = aifc.i;
                if (location3 != null) {
                    int b2 = aifc.b(location3);
                    int b3 = aifc.b(location2);
                    long a2 = aifc.a(aifc.i, location2);
                    float distanceTo = location2.distanceTo(aifc.i);
                    if (a2 > 0) {
                        f2 = distanceTo / ((float) a2);
                    } else {
                        f2 = 0.0f;
                    }
                    float millis = f2 * ((float) TimeUnit.SECONDS.toMillis(1));
                    float abs = Math.abs(millis);
                    float locationQualityJumpSpeedThreshold = (float) aydf.a.a().locationQualityJumpSpeedThreshold();
                    if (abs <= locationQualityJumpSpeedThreshold) {
                        it = it2;
                    } else {
                        aiey aiey2 = aifc.c;
                        if (aiey2.c == null) {
                            aiey2.c = new ArrayList(15);
                        }
                        if (aiey2.c.size() < 15) {
                            ArrayList arrayList = aiey2.c;
                            float f3 = millis;
                            long a3 = aifc.a(location2);
                            aucd o = aoab.g.o();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aoab aoab = (aoab) o.b;
                            it = it2;
                            int i6 = aoab.a | 1;
                            aoab.a = i6;
                            aoab.b = a3;
                            int i7 = i6 | 2;
                            aoab.a = i7;
                            aoab.c = b2 - 1;
                            int i8 = i7 | 4;
                            aoab.a = i8;
                            aoab.d = b3 - 1;
                            int i9 = i8 | 8;
                            aoab.a = i9;
                            aoab.e = distanceTo;
                            aoab.a = i9 | 16;
                            aoab.f = f3;
                            arrayList.add((aoab) o.i());
                        } else {
                            it = it2;
                        }
                    }
                    aiey aiey3 = aifc.c;
                    float accuracy = location2.getAccuracy();
                    if (aiey3.a == null) {
                        aiey3.a = new SparseArray(4);
                    }
                    int i10 = b3 - 1;
                    aifa aifa = (aifa) aiey3.a.get(i10);
                    if (aifa == null) {
                        aifa = new aifa();
                        aiey3.a.put(i10, aifa);
                    }
                    int i11 = aifa.b;
                    int i12 = aifa.a;
                    int i13 = i12 + 1;
                    aifa.a = i13;
                    aifa.b = ((int) (((float) (i11 * i12)) + accuracy)) / i13;
                    if (rev.i(location2) == 3 && location2.hasAltitude()) {
                        aifc.c.j++;
                    }
                    int i14 = ((b2 - 1) * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS) + i10;
                    aiey aiey4 = aifc.c;
                    if (aiey4.b == null) {
                        aiey4.b = new SparseArray(16);
                    }
                    aifb aifb = (aifb) aiey4.b.get(i14);
                    if (aifb == null) {
                        aifb = new aifb();
                        aiey4.b.put(i14, aifb);
                    }
                    aifb.a++;
                    if (abs > locationQualityJumpSpeedThreshold) {
                        aifb.b++;
                    }
                } else {
                    it = it2;
                }
                aifc.i = location2;
            } else {
                it = it2;
            }
            aifc aifc2 = this.a;
            if (aifc2.c()) {
                aifc2.d();
            }
            if (!aifc2.a() || location2 == null) {
                it2 = it;
            } else if (aifc2.L == null || TimeUnit.MILLISECONDS.toSeconds(aifc.a(location2, aifc2.L)) > 10 || ((double) aifc2.g.nextFloat()) >= aydf.d() || ((long) aifc2.w) >= aydf.f()) {
                aifc2.L = location2;
                it2 = it;
            } else {
                aucd o2 = anzt.h.o();
                long a4 = aifc.a(location2);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzt anzt = (anzt) o2.b;
                anzt.a |= 1;
                anzt.b = a4;
                int b4 = aifc.b(aifc2.L) - 1;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzt anzt2 = (anzt) o2.b;
                anzt2.a |= 2;
                anzt2.c = b4;
                float accuracy2 = aifc2.L.getAccuracy();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzt anzt3 = (anzt) o2.b;
                anzt3.a |= 4;
                anzt3.d = accuracy2;
                int b5 = aifc.b(location2) - 1;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzt anzt4 = (anzt) o2.b;
                anzt4.a |= 8;
                anzt4.e = b5;
                float accuracy3 = location2.getAccuracy();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzt anzt5 = (anzt) o2.b;
                anzt5.a |= 16;
                anzt5.f = accuracy3;
                float distanceTo2 = location2.distanceTo(aifc2.L);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                anzt anzt6 = (anzt) o2.b;
                anzt6.a |= 32;
                anzt6.g = distanceTo2;
                anzt anzt7 = (anzt) o2.i();
                aicy aicy = aifc2.d;
                anyo a5 = aifc2.a.a();
                aucd o3 = aoaa.m.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aoaa aoaa = (aoaa) o3.b;
                aoaa.g = 7;
                int i15 = aoaa.a | 16;
                aoaa.a = i15;
                if (a5 != null) {
                    a5.getClass();
                    aoaa.f = a5;
                    i15 |= 8;
                    aoaa.a = i15;
                }
                if (anzt7 != null) {
                    anzt7.getClass();
                    aoaa.k = anzt7;
                    aoaa.a = i15 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                aicy.a((aoaa) o3.i());
                aifc2.w++;
                aifc2.L = location2;
                it2 = it;
            }
        }
        aifc aifc3 = this.a;
        boolean z = this.h;
        boolean z2 = this.g;
        if (aifc3.c()) {
            aifc3.d();
        }
        if (aifc3.a()) {
            if (list2 != null && !list.isEmpty()) {
                Location location4 = (Location) anbs.d(list);
                if (location4 != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Location location5 = (Location) it3.next();
                        if (location5 != null) {
                            aifc3.c.f++;
                            aifc3.z = 0;
                            aifc3.j = aifc.a(location5);
                        } else {
                            aifc3.c.g++;
                            aifc3.z++;
                        }
                    }
                } else {
                    aifc3.z = 0;
                }
                location = location4;
            } else {
                aifc3.z++;
                location = null;
            }
            if (((double) aifc3.g.nextFloat()) < aydf.d()) {
                if (((long) aifc3.r) < aydf.f()) {
                    aifi aifi = aifc3.b;
                    anzr a6 = aifc3.a(location, true, z, z2, aifc3.z, aifi != null ? aifi.f : -1);
                    aicy aicy2 = aifc3.d;
                    anyo a7 = aifc3.a.a();
                    aucd o4 = aoaa.m.o();
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    aoaa aoaa2 = (aoaa) o4.b;
                    aoaa2.g = 3;
                    int i16 = aoaa2.a | 16;
                    aoaa2.a = i16;
                    if (a7 != null) {
                        a7.getClass();
                        aoaa2.f = a7;
                        i16 |= 8;
                        aoaa2.a = i16;
                    }
                    if (a6 != null) {
                        a6.getClass();
                        aoaa2.e = a6;
                        aoaa2.a = i16 | 4;
                    }
                    aicy2.a((aoaa) o4.i());
                    aifc3.r++;
                }
            }
        }
        if (this.i >= 0 && this.j && !list.isEmpty()) {
            aifc aifc4 = this.a;
            Location location6 = (Location) list2.get(0);
            long j2 = this.i;
            boolean z3 = this.h;
            boolean z4 = this.g;
            if (aifc4.c()) {
                aifc4.d();
            }
            if (aifc4.a() && location6 != null && j2 >= 0) {
                int i17 = Build.VERSION.SDK_INT;
                long millis2 = TimeUnit.NANOSECONDS.toMillis(location6.getElapsedRealtimeNanos()) - j2;
                if (millis2 >= 0 && ((double) aifc4.g.nextFloat()) < aydf.d() && aifc4.s < 25) {
                    aucd o5 = anzs.g.o();
                    long a8 = aifc.a(location6);
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    anzs anzs = (anzs) o5.b;
                    anzs.a |= 1;
                    anzs.b = a8;
                    anzj a9 = aifc4.a(z3, z4);
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    anzs anzs2 = (anzs) o5.b;
                    a9.getClass();
                    anzs2.c = a9;
                    int i18 = anzs2.a | 2;
                    anzs2.a = i18;
                    anzs2.a = i18 | 4;
                    anzs2.d = millis2;
                    int b6 = aifc.b(location6) - 1;
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    anzs anzs3 = (anzs) o5.b;
                    int i19 = anzs3.a | 8;
                    anzs3.a = i19;
                    anzs3.e = b6;
                    anzs3.a = i19 | 16;
                    anzs3.f = false;
                    aifc4.d.a((anzs) o5.i(), aifc4.a.a());
                    aifc4.s++;
                }
            }
            this.i = Long.MIN_VALUE;
        }
        if (aydf.a.a().enableLoggingTtffInLatencyLogSample() && this.k && this.j) {
            aifc aifc5 = this.a;
            Location location7 = (Location) list2.get(0);
            boolean z5 = this.h;
            boolean z6 = this.g;
            if (aifc5.c()) {
                aifc5.d();
            }
            if (aifc5.a() && location7 != null && ((aifc5.l >= 0 || aifc5.k >= 0) && (aifc5.n >= 0 || aifc5.m >= 0))) {
                int i20 = Build.VERSION.SDK_INT;
                long millis3 = TimeUnit.NANOSECONDS.toMillis(location7.getElapsedRealtimeNanos()) - Math.max(aifc5.l, aifc5.n);
                if (millis3 >= 0 && ((double) aifc5.g.nextFloat()) < aydf.a.a().locationQualityFlpTtffSampleLogsSamplingRate()) {
                    aucd o6 = anzs.g.o();
                    long a10 = aifc.a(location7);
                    if (o6.c) {
                        o6.c();
                        o6.c = false;
                    }
                    anzs anzs4 = (anzs) o6.b;
                    anzs4.a |= 1;
                    anzs4.b = a10;
                    anzj a11 = aifc5.a(z5, z6);
                    if (o6.c) {
                        o6.c();
                        o6.c = false;
                    }
                    anzs anzs5 = (anzs) o6.b;
                    a11.getClass();
                    anzs5.c = a11;
                    int i21 = anzs5.a | 2;
                    anzs5.a = i21;
                    anzs5.a = i21 | 4;
                    anzs5.d = millis3;
                    int b7 = aifc.b(location7) - 1;
                    if (o6.c) {
                        o6.c();
                        o6.c = false;
                    }
                    anzs anzs6 = (anzs) o6.b;
                    int i22 = anzs6.a | 8;
                    anzs6.a = i22;
                    anzs6.e = b7;
                    anzs6.a = i22 | 16;
                    anzs6.f = true;
                    aifc5.d.a((anzs) o6.i(), aifc5.a.a());
                }
            }
        }
        this.k = false;
        aifc aifc6 = this.a;
        if (aifc6.c()) {
            aifc6.d();
        }
        if (aifc6.a() && ((double) aifc6.g.nextFloat()) < aydf.a.a().locationQualityBatteryUsageLogsSamplingRate() && aifc6.x < 25 && aifc6.b != null) {
            aucd o7 = anzo.i.o();
            int i23 = aifc6.b.h;
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            anzo anzo = (anzo) o7.b;
            int i24 = anzo.a | 1;
            anzo.a = i24;
            anzo.b = i23;
            aifi aifi2 = aifc6.b;
            int i25 = aifi2.i;
            int i26 = i24 | 2;
            anzo.a = i26;
            anzo.c = i25;
            long j3 = aifi2.f;
            anzo.a = i26 | 4;
            anzo.d = j3;
            if (aifc6.f.a()) {
                ArrayList arrayList2 = new ArrayList(aifc6.b.k);
                ArrayList arrayList3 = new ArrayList(aifc6.b.l);
                int size = arrayList2.size();
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                anzo anzo2 = (anzo) o7.b;
                anzo2.a |= 8;
                anzo2.e = size;
                if (!arrayList2.isEmpty()) {
                    Random random = aifc6.g;
                    if (!arrayList3.isEmpty()) {
                        Collections.shuffle(arrayList3, random);
                    }
                    if (arrayList2.size() > 10) {
                        Collections.shuffle(arrayList2, random);
                    }
                    int min = Math.min(arrayList2.size(), 10);
                    if (o7.c) {
                        o7.c();
                        o7.c = false;
                    }
                    ((anzo) o7.b).h = aucj.s();
                    int i27 = 0;
                    for (int i28 = 0; i28 < min; i28++) {
                        aucd o8 = anyc.j.o();
                        String str2 = ((ClientIdentity) arrayList2.get(i28)).b;
                        if (!"com.google.android.gms".equals(str2)) {
                            str = null;
                        } else if (arrayList3.isEmpty()) {
                            str = null;
                        } else if (i27 < arrayList3.size()) {
                            str = (String) arrayList3.get(i27);
                            i27++;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            if (str2 != null) {
                                StringBuilder sb = new StringBuilder(str2.length() + 1 + String.valueOf(str).length());
                                sb.append(str2);
                                sb.append(":");
                                sb.append(str);
                                String sb2 = sb.toString();
                                if (o8.c) {
                                    o8.c();
                                    o8.c = false;
                                }
                                anyc anyc = (anyc) o8.b;
                                sb2.getClass();
                                anyc.a |= 1;
                                anyc.b = sb2;
                            }
                        } else if (str2 != null) {
                            if (o8.c) {
                                o8.c();
                                o8.c = false;
                            }
                            anyc anyc2 = (anyc) o8.b;
                            str2.getClass();
                            anyc2.a |= 1;
                            anyc2.b = str2;
                        }
                        if (ayap.a.a().uploadLocationPermission()) {
                            String str3 = ((anyc) o8.b).b;
                            int i29 = (aifc6.a(str3, "android.permission.ACCESS_COARSE_LOCATION") || aifc6.a(str3, "android.permission.ACCESS_FINE_LOCATION")) ? (!jkr.h() || aifc6.a(str3, "android.permission.ACCESS_BACKGROUND_LOCATION")) ? 2 : 3 : 4;
                            if (o8.c) {
                                o8.c();
                                o8.c = false;
                            }
                            anyc anyc3 = (anyc) o8.b;
                            anyc3.h = i29 - 1;
                            anyc3.a |= 64;
                            String str4 = anyc3.b;
                            if (!aifc6.a(str4, "android.permission.ACCESS_FINE_LOCATION")) {
                                i4 = !aifc6.a(str4, "android.permission.ACCESS_COARSE_LOCATION") ? 2 : 3;
                            } else {
                                i4 = 4;
                            }
                            if (o8.c) {
                                o8.c();
                                o8.c = false;
                            }
                            anyc anyc4 = (anyc) o8.b;
                            anyc4.i = i4 - 1;
                            anyc4.a |= 128;
                        }
                        if (jkr.b()) {
                            if (!aifc6.e.a(((ClientIdentity) arrayList2.get(i28)).a)) {
                                i3 = 3;
                            } else {
                                i3 = 2;
                            }
                            if (o8.c) {
                                o8.c();
                                o8.c = false;
                            }
                            anyc anyc5 = (anyc) o8.b;
                            anyc5.g = i3 - 1;
                            anyc5.a |= 32;
                        } else {
                            if (!o8.c) {
                                i2 = 0;
                            } else {
                                o8.c();
                                i2 = 0;
                                o8.c = false;
                            }
                            anyc anyc6 = (anyc) o8.b;
                            anyc6.g = i2;
                            anyc6.a |= 32;
                        }
                        if (o7.c) {
                            o7.c();
                            o7.c = false;
                        }
                        anzo anzo3 = (anzo) o7.b;
                        anyc anyc7 = (anyc) o8.i();
                        anyc7.getClass();
                        if (!anzo3.h.a()) {
                            anzo3.h = aucj.a(anzo3.h);
                        }
                        anzo3.h.add(anyc7);
                    }
                }
            }
            boolean b8 = aifc6.b.b();
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            anzo anzo4 = (anzo) o7.b;
            int i30 = anzo4.a | 16;
            anzo4.a = i30;
            anzo4.f = b8;
            long j4 = aifc6.b.g;
            anzo4.a = i30 | 32;
            anzo4.g = j4;
            aicy aicy3 = aifc6.d;
            anzo anzo5 = (anzo) o7.i();
            anyo a12 = aifc6.a.a();
            aucd o9 = aoaa.m.o();
            if (o9.c) {
                o9.c();
                o9.c = false;
            }
            aoaa aoaa3 = (aoaa) o9.b;
            aoaa3.g = 6;
            int i31 = aoaa3.a | 16;
            aoaa3.a = i31;
            if (anzo5 != null) {
                anzo5.getClass();
                aoaa3.j = anzo5;
                i31 |= 128;
                aoaa3.a = i31;
            }
            if (a12 != null) {
                a12.getClass();
                aoaa3.f = a12;
                aoaa3.a = i31 | 8;
            }
            aicy3.a((aoaa) o9.i());
            aifc6.x++;
        }
        aiew aiew = this.d;
        if (aiew != null) {
            aiew.e(list2);
        }
    }

    public aifl(aiex aiex, Context context, Looper looper, aifc aifc, aieq aieq) {
        super(aiex);
        this.a = aifc;
        jld jld = new jld(context, looper);
        this.b = jld;
        jld.a = this;
        this.c = aieq;
        this.f = ayap.m() ? ajpz.a(context) : null;
    }

    public final void a() {
        this.e.a();
        this.b.a();
        ajpz ajpz = this.f;
        if (ajpz != null) {
            ajpz.a(this, aoqm.a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ahyn r21) {
        /*
            r20 = this;
            r0 = r21
            boolean r1 = defpackage.aydf.b()
            if (r1 == 0) goto L_0x01eb
            r1 = r20
            aieq r2 = r1.c
            if (r2 == 0) goto L_0x01ed
            boolean r3 = r2.d
            r4 = 24
            if (r3 != 0) goto L_0x0023
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r2.c
            long r6 = r6 - r8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            r2.a()
            return
        L_0x0023:
            int r3 = r21.a()
            r6 = 0
            r7 = 0
        L_0x0029:
            r8 = 8
            r9 = 2
            r10 = 4
            r11 = 1
            if (r7 < r3) goto L_0x00d9
            long r12 = android.os.SystemClock.elapsedRealtime()
            long r14 = r2.c
            long r12 = r12 - r14
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            long r3 = r0.toMillis(r4)
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00d8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map r3 = r2.a
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0050:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00bd
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            aiep r5 = (defpackage.aiep) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            anzx r7 = defpackage.anzx.f
            aucd r7 = r7.o()
            int r12 = r5.b
            boolean r13 = r7.c
            if (r13 != 0) goto L_0x0079
            goto L_0x007e
        L_0x0079:
            r7.c()
            r7.c = r6
        L_0x007e:
            aucj r13 = r7.b
            anzx r13 = (defpackage.anzx) r13
            int r12 = r12 + -1
            r13.b = r12
            int r12 = r13.a
            r12 = r12 | r11
            r13.a = r12
            int r14 = r5.c
            int r14 = r14 + -1
            r13.c = r14
            r12 = r12 | r9
            r13.a = r12
            int r5 = r5.a
            r12 = r12 | r10
            r13.a = r12
            r13.d = r5
            r5 = r12 | 8
            r13.a = r5
            r13.e = r4
            aucj r4 = r7.i()
            anzx r4 = (defpackage.anzx) r4
            r0.add(r4)
            int r4 = r0.size()
            long r4 = (long) r4
            aydf r7 = defpackage.aydf.a
            aydg r7 = r7.a()
            long r12 = r7.gnssStatusStatsMaxSatelliteCount()
            int r7 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0050
        L_0x00bd:
            aicy r3 = r2.b
            iby r4 = r3.a
            if (r4 == 0) goto L_0x00cf
            acwa r4 = r4.o()
            aicx r5 = new aicx
            r5.<init>(r3, r0)
            r4.a((defpackage.acvv) r5)
        L_0x00cf:
            java.util.Map r0 = r2.a
            r0.clear()
            r2.a()
            return
        L_0x00d8:
            return
        L_0x00d9:
            boolean r12 = r0.d(r7)
            if (r12 == 0) goto L_0x01e4
            int r12 = r0.a(r7)
            int r12 = defpackage.anzw.a(r12)
            int r13 = r0.b(r7)
            int r14 = r12 + -1
            if (r12 == 0) goto L_0x01e2
            float r15 = r0.e(r7)
            double r4 = (double) r15
            r15 = 10
            r16 = 7
            r17 = 9
            r6 = 5
            r8 = 3
            r9 = 6
            r18 = 0
            if (r14 == r11) goto L_0x0180
            if (r14 == r8) goto L_0x016c
            if (r14 == r10) goto L_0x014c
            if (r14 == r6) goto L_0x012d
            if (r14 == r9) goto L_0x010c
            r4 = 1
            goto L_0x019d
        L_0x010c:
            anfm r14 = defpackage.ahqc.b
            java.lang.Double r6 = java.lang.Double.valueOf(r4)
            boolean r14 = r14.a((java.lang.Comparable) r6)
            if (r14 != 0) goto L_0x012a
            anfm r14 = defpackage.ahqc.a
            boolean r6 = r14.a((java.lang.Comparable) r6)
            if (r6 != 0) goto L_0x0127
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x0127
            r4 = 1
            goto L_0x019d
        L_0x0127:
            r4 = 4
            goto L_0x019d
        L_0x012a:
            r4 = 5
            goto L_0x019d
        L_0x012d:
            anfm r6 = defpackage.ahqb.b
            java.lang.Double r14 = java.lang.Double.valueOf(r4)
            boolean r6 = r6.a((java.lang.Comparable) r14)
            if (r6 != 0) goto L_0x0149
            anfm r6 = defpackage.ahqb.a
            boolean r6 = r6.a((java.lang.Comparable) r14)
            if (r6 != 0) goto L_0x0147
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x0147
            r4 = 1
            goto L_0x019d
        L_0x0147:
            r4 = 7
            goto L_0x019d
        L_0x0149:
            r4 = 8
            goto L_0x019d
        L_0x014c:
            anfm r6 = defpackage.ahqf.b
            java.lang.Double r14 = java.lang.Double.valueOf(r4)
            boolean r6 = r6.a((java.lang.Comparable) r14)
            if (r6 != 0) goto L_0x0169
            anfm r6 = defpackage.ahqf.a
            boolean r6 = r6.a((java.lang.Comparable) r14)
            if (r6 != 0) goto L_0x0166
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x0166
            r4 = 1
            goto L_0x019d
        L_0x0166:
            r4 = 9
            goto L_0x019d
        L_0x0169:
            r4 = 10
            goto L_0x019d
        L_0x016c:
            anfm r6 = defpackage.ahqd.a
            java.lang.Double r14 = java.lang.Double.valueOf(r4)
            boolean r6 = r6.a((java.lang.Comparable) r14)
            if (r6 != 0) goto L_0x017e
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x017e
            r4 = 1
            goto L_0x019d
        L_0x017e:
            r4 = 6
            goto L_0x019d
        L_0x0180:
            anfm r6 = defpackage.ahqe.b
            java.lang.Double r14 = java.lang.Double.valueOf(r4)
            boolean r6 = r6.a((java.lang.Comparable) r14)
            if (r6 != 0) goto L_0x019c
            anfm r6 = defpackage.ahqe.a
            boolean r6 = r6.a((java.lang.Comparable) r14)
            if (r6 != 0) goto L_0x019a
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x019a
            r4 = 1
            goto L_0x019d
        L_0x019a:
            r4 = 2
            goto L_0x019d
        L_0x019c:
            r4 = 3
        L_0x019d:
            int r4 = r4 + -1
            switch(r4) {
                case 0: goto L_0x01b6;
                case 1: goto L_0x01b4;
                case 2: goto L_0x01b3;
                case 3: goto L_0x01b1;
                case 4: goto L_0x01af;
                case 5: goto L_0x01ad;
                case 6: goto L_0x01ab;
                case 7: goto L_0x01a8;
                case 8: goto L_0x01a5;
                default: goto L_0x01a2;
            }
        L_0x01a2:
            r8 = 10
            goto L_0x01b7
        L_0x01a5:
            r8 = 9
            goto L_0x01b7
        L_0x01a8:
            r8 = 8
            goto L_0x01b7
        L_0x01ab:
            r8 = 7
            goto L_0x01b7
        L_0x01ad:
            r8 = 6
            goto L_0x01b7
        L_0x01af:
            r8 = 5
            goto L_0x01b7
        L_0x01b1:
            r8 = 4
            goto L_0x01b7
        L_0x01b3:
            goto L_0x01b7
        L_0x01b4:
            r8 = 2
            goto L_0x01b7
        L_0x01b6:
            r8 = 1
        L_0x01b7:
            float r4 = r0.e(r7)
            double r4 = (double) r4
            int r6 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x01c1
            goto L_0x01c2
        L_0x01c1:
            r8 = 1
        L_0x01c2:
            aiep r4 = new aiep
            r4.<init>(r12, r8, r13)
            java.util.Map r5 = r2.a
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.util.Map r6 = r2.a
            if (r5 == 0) goto L_0x01d9
            int r5 = r5.intValue()
            int r11 = r11 + r5
            goto L_0x01da
        L_0x01d9:
        L_0x01da:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r6.put(r4, r5)
            goto L_0x01e4
        L_0x01e2:
            r0 = 0
            throw r0
        L_0x01e4:
            int r7 = r7 + 1
            r4 = 24
            r6 = 0
            goto L_0x0029
        L_0x01eb:
            r1 = r20
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aifl.a(ahyn):void");
    }

    public final void a(aiew aiew) {
        this.d = aiew;
        this.e.a((aiew) this);
    }

    public final void a(LocationAvailability locationAvailability) {
        if (!aydf.a.a().removeAvailabilityLogging()) {
            this.a.o = Integer.valueOf(locationAvailability.b);
            this.a.p = Integer.valueOf(locationAvailability.a);
            aifc aifc = this.a;
            Location a2 = this.e.a(false);
            boolean z = this.h;
            boolean z2 = this.g;
            int i2 = 3;
            int i3 = !locationAvailability.a() ? 3 : 2;
            if (aifc.c()) {
                aifc.d();
            }
            if (!aifc.a() && aifc.E == Long.MIN_VALUE) {
                aifc.M = i3;
                aifc.G = SystemClock.elapsedRealtime();
            } else {
                int i4 = aifc.M;
                if (i4 == 2) {
                    if (i3 == 2) {
                        if (((double) aifc.g.nextFloat()) < aydf.c() && aifc.u < 15) {
                            aifc.a(2, a2, 0, 0, (ArrayList) null, (ArrayList) null, aifc.a(z, z2));
                            aifc.b();
                        }
                    } else if (((double) aifc.g.nextFloat()) < aydf.c() && aifc.t < 15) {
                        aifc.N = 3;
                        aifc.D = true;
                        aifc.E = SystemClock.elapsedRealtime();
                        aifc.K = aifc.a(z, z2);
                        aifc.a(locationAvailability);
                        aifc.C++;
                        if (aifc.a()) {
                            aifc.A += aifc.E - aifc.F;
                        }
                        aifc.M = i2;
                        aifc.G = SystemClock.elapsedRealtime();
                    }
                } else if (i4 == 3) {
                    if (aifc.D) {
                        if (i3 == 2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            aifc.F = elapsedRealtime;
                            long j2 = elapsedRealtime - aifc.E;
                            aifc.a(aifc.N, a2, j2, aifc.H, aifc.I, aifc.J, aifc.K);
                            aifc.b();
                            if (aifc.a()) {
                                aifc.B += j2;
                            }
                        } else {
                            aifc.a(locationAvailability);
                            aifc.M = i2;
                            aifc.G = SystemClock.elapsedRealtime();
                        }
                    }
                } else if (i4 == 1) {
                    if (((double) aifc.g.nextFloat()) < aydf.c() && aifc.v < 15) {
                        if (i3 != 2) {
                            aifc.N = 4;
                            aifc.D = true;
                            aifc.E = aifc.l;
                            aifc.K = aifc.a(z, z2);
                            aifc.a(locationAvailability);
                            aifc.C++;
                            aifc.M = i2;
                            aifc.G = SystemClock.elapsedRealtime();
                        } else {
                            aifc.a(4, a2, SystemClock.elapsedRealtime() - aifc.l, 0, (ArrayList) null, (ArrayList) null, aifc.a(z, z2));
                            aifc.b();
                        }
                    }
                }
                i2 = i3;
                aifc.M = i2;
                aifc.G = SystemClock.elapsedRealtime();
            }
        }
        aiew aiew = this.d;
        if (aiew != null) {
            aiew.a(locationAvailability);
        }
    }

    public final void a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (aydf.a.a().addAggregateFlpStatsToDumpsys()) {
            aifc aifc = this.a;
            String[] strArr2 = aifc.h ? new String[]{aifc.a(2, "GPS"), aifc.a(17, "Wifi"), aifc.a(33, "Cell"), aifc.a(1, "Other")} : null;
            if (strArr2 != null) {
                printWriter.println("--LoggingLocationEngine--");
                int length = strArr2.length;
                for (int i2 = 0; i2 < 4; i2++) {
                    printWriter.println(strArr2[i2]);
                }
            }
        }
        this.e.a(fileDescriptor, printWriter, strArr);
    }

    public final void a(Collection collection, boolean z) {
        if (!collection.isEmpty()) {
            int i2 = Build.VERSION.SDK_INT;
            this.i = SystemClock.elapsedRealtime();
            this.j = z;
            if (this.k && this.l == 0) {
                aifc aifc = this.a;
                aifc.l = SystemClock.elapsedRealtime();
                aifc.k = System.currentTimeMillis();
            }
        } else {
            this.i = Long.MIN_VALUE;
            this.j = false;
        }
        this.l = collection.size();
        this.e.a(collection, z);
    }

    public final void a(boolean z, boolean z2) {
        boolean z3;
        if (this.a.a()) {
            boolean z4 = false;
            if (this.g || this.h) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                z4 = true;
            } else if (z2) {
                z4 = true;
            }
            if (!z3 && z4) {
                aifc aifc = this.a;
                aifc.n = SystemClock.elapsedRealtime();
                aifc.m = System.currentTimeMillis();
            }
            if (z != this.g) {
                this.g = z;
                this.a.c.i++;
            }
            if (z2 != this.h) {
                this.h = z2;
                this.a.c.h++;
            }
            if (!z3 || !z4) {
                this.k = true;
            }
        }
    }
}
