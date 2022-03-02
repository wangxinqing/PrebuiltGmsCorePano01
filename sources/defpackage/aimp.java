package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* renamed from: aimp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aimp extends aimr {
    final /* synthetic */ aing a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aimp(aing aing, aiml aiml) {
        super(aing, aiml);
        this.a = aing;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        if ((r8 > 0) == (r1.c > 0)) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10, boolean r11, boolean r12) {
        /*
            r9 = this;
            r0 = -1
            if (r10 > 0) goto L_0x0027
            int r1 = r9.c()
            int r2 = r9.d()
            if (r1 == r0) goto L_0x0022
            if (r2 != r0) goto L_0x0011
            r0 = r1
            goto L_0x0028
        L_0x0011:
            r0 = 20
            r3 = 1800(0x708, float:2.522E-42)
            int r1 = java.lang.Math.min(r1, r2)
            int r1 = java.lang.Math.min(r3, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0028
        L_0x0022:
            if (r2 != r0) goto L_0x0025
            goto L_0x0028
        L_0x0025:
            r0 = r2
            goto L_0x0028
        L_0x0027:
            r0 = r10
        L_0x0028:
            int r8 = r9.b()
            aing r1 = r9.a
            aimg r1 = r1.B
            ixy r2 = r1.a
            if (r2 == 0) goto L_0x0064
            boolean r2 = r2.a()
            r3 = 0
            r4 = 1
            if (r10 > 0) goto L_0x003e
            r5 = 0
            goto L_0x003f
        L_0x003e:
            r5 = 1
        L_0x003f:
            int r6 = r1.b
            if (r6 > 0) goto L_0x0045
            r6 = 0
            goto L_0x0046
        L_0x0045:
            r6 = 1
        L_0x0046:
            if (r5 == r6) goto L_0x004a
        L_0x0048:
            r3 = 1
            goto L_0x0058
        L_0x004a:
            if (r8 > 0) goto L_0x004e
            r5 = 0
            goto L_0x004f
        L_0x004e:
            r5 = 1
        L_0x004f:
            int r6 = r1.c
            if (r6 > 0) goto L_0x0055
            r6 = 0
            goto L_0x0056
        L_0x0055:
            r6 = 1
        L_0x0056:
            if (r5 != r6) goto L_0x0048
        L_0x0058:
            r1.b = r10
            r1.c = r8
            if (r2 == 0) goto L_0x005f
            goto L_0x0064
        L_0x005f:
            if (r3 != 0) goto L_0x0064
            if (r12 != 0) goto L_0x0064
            goto L_0x0088
        L_0x0064:
            aiml r1 = r9.b
            java.util.Collection r4 = r9.e()
            java.util.Collection r6 = r9.f()
            r2 = r0
            r3 = r11
            r5 = r8
            r7 = r12
            r1.a(r2, r3, r4, r5, r6, r7)
            aing r10 = r9.a
            aikk r11 = r10.q
            if (r11 == 0) goto L_0x0088
            ains r10 = r10.c()
            aimr r10 = (defpackage.aimr) r10
            aoaq r10 = r10.a()
            r11.a((defpackage.aoaq) r10, (int) r0, (int) r8)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aimp.a(int, boolean, boolean):void");
    }

    /* access modifiers changed from: protected */
    public boolean a(boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract int b();

    /* access modifiers changed from: protected */
    public boolean b(aimy aimy) {
        a(aimy);
        d(false);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean b(boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract int c();

    /* access modifiers changed from: protected */
    public void c(boolean z) {
        this.b.a(h());
        if (this.b.c()) {
            d(z);
            return;
        }
        aing aing = this.a;
        aing.b((ains) aing.a);
    }

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public void d(boolean z) {
        a(-1, z, false);
    }

    /* access modifiers changed from: protected */
    public Collection e() {
        Pair pair;
        HashSet hashSet = null;
        if (this.b.a()) {
            return null;
        }
        aiml aiml = this.b;
        double h = h();
        List<aijt> a2 = aiml.f.a(h, 100);
        List<aijt> b = aiml.f.b(100);
        if (!aiml.a((List) a2) || !aiml.a((List) b)) {
            hashSet = new HashSet();
            if (aiml.a((List) b)) {
                pair = Pair.create((aijt) a2.get(0), Integer.valueOf(((aijt) a2.get(0)).a(h)));
            } else if (aiml.a((List) a2)) {
                pair = Pair.create((aijt) b.get(0), Integer.valueOf(((aijt) b.get(0)).d()));
            } else {
                aijt aijt = (aijt) a2.get(0);
                aijt aijt2 = (aijt) b.get(0);
                int a3 = aijt.a(h);
                int d = aijt2.d();
                pair = a3 >= d ? Pair.create(aijt2, Integer.valueOf(d)) : Pair.create(aijt, Integer.valueOf(a3));
            }
            aiml.a((Collection) hashSet, ((aijt) pair.first).b);
            long max = (long) Math.max(60, ((((Integer) pair.second).intValue() + 1) * 3) / 2);
            if (a2 != null) {
                for (aijt aijt3 : a2) {
                    if (((long) aijt3.a(h)) <= max) {
                        aiml.a((Collection) hashSet, aijt3.b);
                    }
                }
            }
            if (b != null) {
                for (aijt aijt4 : b) {
                    if (((long) aijt4.d()) <= max) {
                        aiml.a((Collection) hashSet, aijt4.b);
                    }
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public Collection f() {
        aiml aiml = this.b;
        aijx aijx = aiml.f.e;
        ob<String> obVar = new ob();
        for (aijy aijy : aijx.d.keySet()) {
            obVar.add(aijy.a);
        }
        ArrayList arrayList = new ArrayList(obVar.b);
        for (String str : obVar) {
            try {
                arrayList.add(new ClientIdentity(jni.b(aiml.l).a(str, 0).uid, str));
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public abstract double h();

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void a(aimy aimy) {
        Pair pair;
        aimy aimy2 = aimy;
        if (this.a.y && aimy2.c == null && (pair = this.b.c.b) != null && aimy2.b.getAccuracy() > 30.0f) {
            double accuracy = (double) ((Location) pair.second).getAccuracy();
            Double.isNaN(accuracy);
            if (((double) aimy2.b.getAccuracy()) > accuracy * 3.0d) {
                if (!aybx.b()) {
                    aiko.a.a((aikn) new aikm(-826286066, aimy2.b, "Inaccurate location dropped"));
                } else {
                    aiko.a.a(-1809410856, aimy2.b, 6);
                }
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    aikq.a("GeofencerStateMachine", "Inaccurate location dropped.");
                    return;
                }
                return;
            }
        }
        Location location = aimy2.b;
        aijq a2 = this.b.a(aimy2.a, location, true, h(), aimy2.c);
        if (this.a.q != null) {
            List b = this.b.b(1);
            if (b != null && !b.isEmpty()) {
                ParcelableGeofence parcelableGeofence = ((aijt) b.get(0)).a;
                float[] fArr = new float[1];
                Location.distanceBetween(location.getLatitude(), location.getLongitude(), parcelableGeofence.d, parcelableGeofence.e, fArr);
                aing aing = this.a;
                aikk aikk = aing.q;
                aoaq a3 = ((aimr) aing.c()).a();
                float accuracy2 = location.getAccuracy();
                float f = fArr[0] - parcelableGeofence.f;
                if (aikk.d()) {
                    aucd e = aikk.e();
                    aucd o = aoas.e.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aoas aoas = (aoas) o.b;
                    aoas.b = a3.m;
                    int i = 1 | aoas.a;
                    aoas.a = i;
                    int i2 = i | 2;
                    aoas.a = i2;
                    aoas.c = accuracy2;
                    aoas.a = 4 | i2;
                    aoas.d = f;
                    aoas aoas2 = (aoas) o.i();
                    if (e.c) {
                        e.c();
                        e.c = false;
                    }
                    aoar aoar = (aoar) e.b;
                    aoar aoar2 = aoar.m;
                    aoas2.getClass();
                    aoar.j = aoas2;
                    aoar.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    aikk.a.a((aoar) e.i());
                }
            } else {
                return;
            }
        }
        if (a2 != null) {
            this.a.b(a2, location);
        }
    }

    /* access modifiers changed from: protected */
    public void a(LocationAvailability locationAvailability) {
        if (this.a.v != locationAvailability.a()) {
            this.a.v = locationAvailability.a();
            if (!this.a.v) {
                this.b.f.a();
            }
        }
    }

    public boolean a(aily aily) {
        return a(aily, 5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: android.location.Location} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.aily r14, int r15) {
        /*
            r13 = this;
            boolean r0 = defpackage.aikq.a
            aiml r0 = r13.b
            com.google.android.gms.location.GeofencingRequest r1 = r14.a
            android.app.PendingIntent r2 = r14.b
            android.util.Pair r0 = r0.a((com.google.android.gms.location.GeofencingRequest) r1, (android.app.PendingIntent) r2)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r14.a((java.lang.Object) r2)
            java.lang.Object r2 = r0.second
            if (r2 == 0) goto L_0x002e
            android.app.PendingIntent r2 = r14.b
            java.lang.String r2 = defpackage.ajqj.a(r2)
            com.google.android.gms.location.GeofencingRequest r14 = r14.a
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            r13.a(r2, r14, r0)
        L_0x002e:
            boolean r14 = defpackage.ayca.c()
            if (r14 != 0) goto L_0x0085
            aiml r2 = r13.b
            aikc r14 = r2.c
            android.util.Pair r14 = r14.b
            double r7 = r13.h()
            aikc r0 = r2.c
            android.util.Pair r0 = r0.b
            r10 = 0
            if (r0 != 0) goto L_0x0047
            r15 = r10
            goto L_0x0075
        L_0x0047:
            if (r15 < 0) goto L_0x0062
            long r3 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r5 = r0.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r3 = r3 - r5
            long r5 = (long) r15
            r11 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r11
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 >= 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r15 = r10
            goto L_0x0075
        L_0x0062:
            java.lang.Object r15 = r0.first
            java.lang.Long r15 = (java.lang.Long) r15
            long r3 = r15.longValue()
            java.lang.Object r15 = r0.second
            r5 = r15
            android.location.Location r5 = (android.location.Location) r5
            r6 = 0
            r9 = 0
            aijq r15 = r2.a(r3, r5, r6, r7, r9)
        L_0x0075:
            if (r15 == 0) goto L_0x0085
            aing r0 = r13.a
            if (r14 == 0) goto L_0x0081
            java.lang.Object r14 = r14.second
            r10 = r14
            android.location.Location r10 = (android.location.Location) r10
            goto L_0x0082
        L_0x0081:
        L_0x0082:
            r0.b(r15, r10)
        L_0x0085:
            if (r1 != 0) goto L_0x0089
            r14 = 1
            return r14
        L_0x0089:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aimp.a(aily, int):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean a(Intent intent) {
        this.b.a(intent);
        return false;
    }

    public boolean a(Message message) {
        Integer num;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        Integer num2;
        Message message2 = message;
        boolean z4 = aikq.a;
        int i = message2.what;
        if (i == 4) {
            z = false;
            num = null;
        } else {
            if (i != 5) {
                aiju aiju = this.b.f;
                aijx aijx = aiju.e;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                aijx.b = true;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = null;
                for (aikb aikb : aijx.e()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = aikb.c.iterator();
                    while (it.hasNext()) {
                        aijt aijt = (aijt) it.next();
                        Iterator it2 = it;
                        long j = aijt.a.b;
                        if (j < 0 || j >= elapsedRealtime) {
                            break;
                        }
                        boolean z5 = aikq.a;
                        aikb.a.a(aijt.j);
                        arrayList3.add(aijt);
                        it2.remove();
                        it = it2;
                    }
                    arrayList.addAll(arrayList3);
                    if (aikb.a() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aikb.b);
                    }
                }
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        aijx.a((Object) (aijy) arrayList2.get(i2));
                    }
                }
                aijx.b = false;
                if (!arrayList.isEmpty()) {
                    aijx.a(2);
                }
                if (!arrayList.isEmpty()) {
                    try {
                        aiju.b();
                    } catch (IOException e) {
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.b.a(h());
                    num = null;
                    z = a((String) null, arrayList);
                    if (z && !this.b.c()) {
                        this.a.a(message2);
                        aing aing = this.a;
                        aing.b((ains) aing.a);
                        return true;
                    }
                }
            }
            num = null;
            z = false;
        }
        if (i != 1) {
            if (i == 97) {
                a((LocationAvailability) message2.obj);
                z3 = false;
                z2 = true;
            } else if (i == 101) {
                boolean booleanValue = ((Boolean) message2.obj).booleanValue();
                if (!this.a.B.a()) {
                    return true;
                }
                a(-1, false, true);
                this.a.y = booleanValue;
                return true;
            } else if (i != 151) {
                switch (i) {
                    case 4:
                        z3 = a((aily) message2.obj);
                        z2 = true;
                        break;
                    case 5:
                        z3 = a((ainr) message2.obj);
                        z2 = true;
                        break;
                    case 6:
                        z3 = b((aimy) message2.obj);
                        z2 = true;
                        break;
                    case 7:
                        z3 = a((Pair) message2.obj);
                        z2 = true;
                        break;
                    case 8:
                        this.b.a(h());
                        d(true);
                        z3 = true;
                        z2 = true;
                        break;
                    case 9:
                        z3 = a((Intent) message2.obj);
                        z2 = true;
                        break;
                    case 10:
                        this.b.g();
                        z3 = false;
                        z2 = true;
                        break;
                    case 11:
                        this.a.b(a(this.b.h()));
                        this.a.d();
                        z3 = false;
                        z2 = true;
                        break;
                    default:
                        switch (i) {
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                                z3 = a(((Boolean) message2.obj).booleanValue());
                                z2 = true;
                                break;
                            case UrlRequest.Status.READING_RESPONSE /*14*/:
                                z3 = b(((Boolean) message2.obj).booleanValue());
                                z2 = true;
                                break;
                            case Service.START_CONTINUATION_MASK:
                                z3 = j();
                                z2 = true;
                                break;
                            case 16:
                                c(message2.arg1 == 1);
                                z3 = false;
                                z2 = true;
                                break;
                            default:
                                z2 = b(message);
                                z3 = false;
                                break;
                        }
                }
            } else {
                aimd aimd = this.b.k;
                arlw arlw = (arlw) message2.obj;
                if (!aimd.f()) {
                    if (Log.isLoggable("ChreGeofenceHardware", 4)) {
                        aikq.a("ChreGeofenceHardware", "Transition dropped because it was from old CHRE connection.");
                    }
                    z3 = false;
                    z2 = true;
                } else {
                    arlk arlk = arlw.a;
                    if (arlk == null) {
                        arlk = arlk.k;
                    }
                    int i3 = arlk.a;
                    if ((i3 & 4) == 0 || (i3 & 8) == 0 || (i3 & 2) == 0) {
                        if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                            aikq.c("ChreGeofenceHardware", "Invalid location received.");
                        }
                        z3 = false;
                        z2 = true;
                    } else {
                        int i4 = arlk.j;
                        if (i4 != 0) {
                            str = i4 != 1 ? i4 != 2 ? i4 != 3 ? "unknown" : "other" : "cell" : "wifi";
                        } else {
                            str = "gps";
                        }
                        Location location = new Location(str.length() == 0 ? new String("chre:") : "chre:".concat(str));
                        double d = (double) arlk.d;
                        Double.isNaN(d);
                        location.setLatitude(d / 1.0E7d);
                        double d2 = (double) arlk.e;
                        Double.isNaN(d2);
                        location.setLongitude(d2 / 1.0E7d);
                        location.setElapsedRealtimeNanos(arlk.c);
                        if ((arlk.a & 1) != 0) {
                            location.setTime(arlk.b / 1000000);
                        } else {
                            location.setTime(System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000));
                        }
                        if ((arlk.a & 16) != 0) {
                            location.setAccuracy((float) arlk.f);
                        }
                        if ((arlk.a & 32) != 0) {
                            location.setAltitude((double) arlk.g);
                        }
                        if ((arlk.a & 64) != 0) {
                            location.setSpeed(arlk.h);
                        }
                        if ((arlk.a & 128) != 0) {
                            location.setBearing(arlk.i);
                        }
                        nz nzVar = new nz();
                        for (int i5 = 0; i5 < aimd.a.size(); i5++) {
                            aijt aijt2 = (aijt) aimd.a.get(i5);
                            if (aijt2 != null) {
                                nzVar.put(aijt2, (byte) 0);
                            }
                        }
                        boolean z6 = false;
                        for (int i6 = 0; i6 < arlw.b.size(); i6++) {
                            int i7 = ((arlv) arlw.b.get(i6)).b;
                            if (i7 >= 0) {
                                if (i7 < aimd.a.size()) {
                                    aijt aijt3 = (aijt) aimd.a.get(i7);
                                    if (aijt3 != null) {
                                        if ((((arlv) arlw.b.get(i6)).a & 4) != 0) {
                                            num2 = Integer.valueOf(((arlv) arlw.b.get(i6)).d);
                                        } else {
                                            num2 = num;
                                        }
                                        byte b = (byte) ((arlv) arlw.b.get(i6)).c;
                                        if (aijt3 != aimd.l) {
                                            if (num2 == null || num2.intValue() == aijt3.j) {
                                                nzVar.put(aijt3, Byte.valueOf((byte) ((arlv) arlw.b.get(i6)).c));
                                            } else if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                                                aikq.c("ChreGeofenceHardware", "Transition dropped because unique ID mismatches.");
                                            }
                                        } else if (b == 2) {
                                            z6 = true;
                                        }
                                    }
                                }
                            }
                            if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                                aikq.c("ChreGeofenceHardware", "Geofence slot index out of range.");
                            }
                        }
                        Location location2 = aimd.k;
                        if (location2 != null && location2.getElapsedRealtimeNanos() == location.getElapsedRealtimeNanos()) {
                            z3 = false;
                            z2 = true;
                        } else {
                            aimd.k = location;
                            aimd.j.a(location, (Map) nzVar, z6);
                            z3 = false;
                            z2 = true;
                        }
                    }
                }
            }
            this.b.d.g.d();
            if (z && !z3) {
                boolean z7 = aikq.a;
                d(false);
            }
            return z2;
        } else if (!this.a.x.a()) {
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                aikq.a("GeofencerStateMachine", "Network location disabled.");
            }
            aing aing2 = this.a;
            aing2.b((ains) aing2.b);
            return true;
        } else if (this.a.x.b()) {
            return true;
        } else {
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                aikq.a("GeofencerStateMachine", "GPS disabled.");
            }
            i();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(Pair pair) {
        ains a2 = a((aisp) pair.second);
        irk.b(a2);
        if (!ayca.c()) {
            this.a.d();
        }
        this.a.b(a2);
        return false;
    }
}
