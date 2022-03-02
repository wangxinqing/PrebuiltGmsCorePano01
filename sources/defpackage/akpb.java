package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: akpb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akpb implements akru, akpe, akrg {
    public final akrv a;
    public final akpt b;
    public final akpa c;
    public volatile boolean d = false;
    public final Map e;
    public int f;
    private final akhj g;

    public akpb(Context context, Handler handler, akyn akyn, akoc akoc, aksc aksc, aktg aktg, aksa aksa, akhw akhw, akpy akpy, akhj akhj) {
        akyn akyn2 = akyn;
        akhj akhj2 = akhj;
        akpt akpt = new akpt(aksc, aktg, aksa, handler, akhw, akpy, akhj);
        akrq akrq = new akrq(akyn2, akhj2, jhg.i(context, "com.google.android.gms"));
        akpt akpt2 = akpt;
        akrv akrv = new akrv(handler, akyn, akrq, akoc, akhj2);
        akpa akpa = new akpa(akyn2, akrq);
        this.g = akhj2;
        this.b = akpt2;
        akpt2.i = this;
        this.a = akrv;
        akrv.b = this;
        this.c = akpa;
        akpa.a = this;
        this.e = new HashMap();
    }

    private static final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null && bundle.keySet().contains("nearby_alert_module_name")) {
            bundle2.putStringArray("nearby_alert_module_names", new String[]{bundle.getString("nearby_alert_module_name")});
        }
        return bundle2;
    }

    private static final boolean a(akpd akpd) {
        return (akpd.b.a & 8) == 8;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i, akrf akrf, Bundle bundle) {
        if (!this.d) {
            return;
        }
        if (i != 0) {
            for (akpd a2 : this.e.keySet()) {
                a(0, i, (List) null, a2, bundle);
            }
            return;
        }
        Set set = akrf.a;
        if (set != null) {
            for (akpd akpd : this.e.keySet()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (akpu akpu : (List) this.e.get(akpd)) {
                    if (set.contains(akpu.a)) {
                        arrayList.add(akpu.a);
                    }
                }
                if (!arrayList.isEmpty()) {
                    a(akrf.b, akrf.c, akrf.e, akrf.f, arrayList, akpd, bundle);
                }
            }
        } else if (Log.isLoggable("Places", 5)) {
            alfy.c("Places", "Ignoring unexpected nearby alert callback with successful statuscode but no triggered places.");
        }
    }

    private final void a(int i, int i2, String str, boolean z, List list, akpd akpd, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = akpd.b;
        if ((userLocationNearbyAlertRequest.a & i) == i && userLocationNearbyAlertRequest.e == i2) {
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = userLocationNearbyAlertRequest.c;
            if ((!userLocationNearbyAlertFilter.d || z) && ius.a(userLocationNearbyAlertFilter.c, str)) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    akri akri = (akri) list.get(i3);
                    UserLocationNearbyAlertFilter userLocationNearbyAlertFilter2 = akpd.b.c;
                    if (userLocationNearbyAlertFilter2.a.isEmpty() || userLocationNearbyAlertFilter2.a.contains(akri.a)) {
                        List list2 = userLocationNearbyAlertFilter2.b;
                        if (!list2.isEmpty()) {
                            List list3 = akri.e;
                            int size2 = list3.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    break;
                                }
                                int i5 = i4 + 1;
                                if (list2.contains((Integer) list3.get(i4))) {
                                    break;
                                }
                                i4 = i5;
                            }
                        }
                        arrayList.add(akri);
                    }
                }
                arrayList.isEmpty();
            }
        }
        if (!arrayList.isEmpty()) {
            a(i, 0, arrayList, akpd, !akpd.a ? null : bundle);
        }
    }

    private final void a(int i, int i2, List list, akpd akpd, Bundle bundle) {
        int i3 = 3;
        if (!azbk.a.a().r()) {
            akpd.c.a(i, i2, list, bundle);
        } else if (Log.isLoggable("Places", 5)) {
            Log.w("Places", String.format(Locale.US, "Due to flag, forgoing Nearby Alert for %d places, with transition: %d and status: %d.", new Object[]{Integer.valueOf(list.size()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = akpd.b;
        String str = userLocationNearbyAlertRequest.c.c;
        aoei c2 = akig.c(8, akpd.a());
        aucd aucd = (aucd) c2.c(5);
        aucd.a((aucj) c2);
        aucd o = aoet.h.o();
        if (i == 1) {
            i3 = 2;
        } else if (i != 2) {
            i3 = i != 4 ? 1 : 5;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoet aoet = (aoet) o.b;
        aoet.b = i3 - 1;
        int i4 = aoet.a | 1;
        aoet.a = i4;
        int i5 = i4 | 2;
        aoet.a = i5;
        aoet.c = i2;
        int i6 = userLocationNearbyAlertRequest.b;
        int i7 = 8 | i5;
        aoet.a = i7;
        aoet.e = (long) i6;
        UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = userLocationNearbyAlertRequest.c;
        if (userLocationNearbyAlertFilter != null) {
            boolean z = userLocationNearbyAlertFilter.d;
            i7 |= 32;
            aoet.a = i7;
            aoet.g = z;
        }
        if (str != null) {
            str.getClass();
            aoet.a = i7 | 16;
            aoet.f = str;
        }
        int a2 = akig.a(userLocationNearbyAlertRequest.e);
        if (a2 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoet aoet2 = (aoet) o.b;
            aoet2.d = a2 - 1;
            aoet2.a |= 4;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aoet aoet3 = (aoet) o.i();
        aoei aoei2 = aoei.w;
        aoet3.getClass();
        aoei.o = aoet3;
        aoei.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        this.g.a(akig.a((aoei) aucd.i()));
    }

    private static final boolean a(akpd akpd, akpu akpu, akrs akrs) {
        if (!akpu.a.a.equals(akrs.a.a)) {
            return false;
        }
        UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = akpd.b;
        if (userLocationNearbyAlertRequest.e != akrs.c) {
            return false;
        }
        UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = userLocationNearbyAlertRequest.c;
        return userLocationNearbyAlertFilter.d == akrs.e && userLocationNearbyAlertRequest.b == akrs.b && ius.a(userLocationNearbyAlertFilter.c, akrs.d) && ius.a(akpu.a.e, akrs.a());
    }

    public final void a(int i, akrf akrf, Bundle bundle) {
        HashSet hashSet;
        int i2;
        int i3 = i;
        akrf akrf2 = akrf;
        if (i3 == 0) {
            if (akrf2.a.isEmpty()) {
                hashSet = Collections.emptySet();
            } else {
                int i4 = akrf2.b;
                if (i4 == 1) {
                    HashSet hashSet2 = new HashSet();
                    for (akri akri : akrf2.a) {
                        akrs akrs = new akrs(akri, akrf2.d, akrf2.c, akrf2.e, akrf2.f);
                        for (akpd akpd : this.e.keySet()) {
                            for (akpu akpu : (List) this.e.get(akpd)) {
                                if (a(akpd, akpu, akrs)) {
                                    int i5 = akpu.b;
                                    if (i5 == 0 || i5 == 2) {
                                        hashSet2.add(akri);
                                        akpu.a(1);
                                        akpu.b(1);
                                    } else if (i5 == 4) {
                                        akpu.a(1);
                                        int i6 = akpu.c;
                                        if (i6 == 0 || i6 == 2) {
                                            hashSet2.add(akri);
                                            akpu.b(1);
                                        } else if (a(akpd)) {
                                            hashSet2.add(akri);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hashSet = hashSet2;
                } else if (i4 == 2) {
                    HashSet hashSet3 = new HashSet();
                    for (akri akri2 : akrf2.a) {
                        akrs akrs2 = new akrs(akri2, akrf2.d, akrf2.c, akrf2.e, akrf2.f);
                        for (akpd akpd2 : this.e.keySet()) {
                            for (akpu akpu2 : (List) this.e.get(akpd2)) {
                                if (a(akpd2, akpu2, akrs2)) {
                                    int i7 = akpu2.b;
                                    if (i7 == 1 || i7 == 3) {
                                        hashSet3.add(akri2);
                                        akpu2.a(2);
                                        akpu2.b(2);
                                    } else if (i7 == 0) {
                                        akpu2.a(2);
                                        akpu2.b(2);
                                    } else if (i7 == 4) {
                                        akpu2.a(2);
                                        int i8 = akpu2.c;
                                        if (i8 == 1 || i8 == 3) {
                                            hashSet3.add(akri2);
                                            akpu2.b(2);
                                        } else if (a(akpd2)) {
                                            hashSet3.add(akri2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    hashSet = hashSet3;
                } else if (i4 == 4) {
                    HashSet hashSet4 = new HashSet();
                    for (akri akri3 : akrf2.a) {
                        akrs akrs3 = new akrs(akri3, akrf2.d, akrf2.c, akrf2.e, akrf2.f);
                        for (akpd akpd3 : this.e.keySet()) {
                            for (akpu akpu3 : (List) this.e.get(akpd3)) {
                                if (a(akpd3, akpu3, akrs3) && akpu3.b == 1) {
                                    hashSet4.add(akri3);
                                    akpu3.a(3);
                                    akpu3.b(3);
                                }
                            }
                        }
                    }
                    hashSet = hashSet4;
                } else if (i4 != 8) {
                    hashSet = Collections.emptySet();
                } else {
                    HashSet hashSet5 = new HashSet();
                    for (akri akri4 : akrf2.a) {
                        akrs akrs4 = new akrs(akri4, akrf2.d, akrf2.c, akrf2.e, akrf2.f);
                        for (akpd akpd4 : this.e.keySet()) {
                            for (akpu akpu4 : (List) this.e.get(akpd4)) {
                                if (a(akpd4, akpu4, akrs4) && ((i2 = akpu4.b) == 1 || i2 == 2 || i2 == 3)) {
                                    akpu4.a(4);
                                    if (a(akpd4)) {
                                        hashSet5.add(akri4);
                                    }
                                }
                            }
                        }
                    }
                    hashSet = hashSet5;
                }
            }
            HashSet hashSet6 = new HashSet();
            if (azbk.e() && akrf2.b == 1) {
                hashSet6 = new HashSet();
                for (akri akri5 : akrf2.a) {
                    akrs akrs5 = new akrs(akri5, akrf2.d, akrf2.c, akrf2.e, akrf2.f);
                    for (akpd akpd5 : this.e.keySet()) {
                        for (akpu akpu5 : (List) this.e.get(akpd5)) {
                            if (a(akpd5, akpu5, akrs5) && akpu5.b == 1 && SystemClock.elapsedRealtime() - akpu5.d >= ((long) akrf2.d)) {
                                hashSet6.add(akri5);
                                akpu5.a(3);
                                akpu5.b(3);
                            }
                        }
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                b(0, new akrf(hashSet, akrf2.b, akrf2.c, akrf2.d, akrf2.e, akrf2.f), a(bundle));
            }
            if (azbk.e() && !hashSet6.isEmpty()) {
                b(0, new akrf(hashSet6, 4, akrf2.c, akrf2.d, akrf2.e, akrf2.f), a(bundle));
                return;
            }
            return;
        }
        if (i3 == 9102) {
            this.e.clear();
        }
        b(i3, akrf2, a(bundle));
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.akpd r20, java.util.List r21) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            java.util.Map r0 = r8.e
            boolean r0 = r0.containsKey(r9)
            r1 = 5
            java.lang.String r2 = "Places"
            if (r0 != 0) goto L_0x0020
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "NearbyAlert subscription was canceled after NearbyAlertData was retrieved"
            defpackage.alfy.c(r2, r0)
        L_0x001a:
            akpt r0 = r8.b
            r0.a(r9)
            return
        L_0x0020:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.HashSet r3 = new java.util.HashSet
            r4 = r21
            r3.<init>(r4)
            r0.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Map r4 = r8.e
            java.lang.Object r4 = r4.get(r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            r3.<init>(r4)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r11.addAll(r0)
            java.util.Map r4 = r8.e
            java.lang.Object r4 = r4.get(r9)
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0051:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x006f
            java.lang.Object r5 = r4.next()
            akpu r5 = (defpackage.akpu) r5
            akri r6 = r5.a
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x006b
            akri r5 = r5.a
            r11.remove(r5)
            goto L_0x0051
        L_0x006b:
            r3.add(r5)
            goto L_0x0051
        L_0x006f:
            boolean r4 = r3.isEmpty()
            r5 = 0
            if (r4 != 0) goto L_0x00b4
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            int r4 = r3.size()
            r6 = 0
        L_0x0080:
            if (r6 < r4) goto L_0x00a6
            akrf r3 = new akrf
            com.google.android.gms.userlocation.UserLocationNearbyAlertRequest r4 = r9.b
            int r14 = r4.a
            int r15 = r4.e
            int r6 = r4.b
            com.google.android.gms.userlocation.UserLocationNearbyAlertFilter r4 = r4.c
            java.lang.String r7 = r4.c
            boolean r4 = r4.d
            r12 = r3
            r16 = r6
            r17 = r7
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            akpa r4 = r8.c
            com.google.android.gms.userlocation.UserLocationNearbyAlertRequest r6 = r9.b
            int r6 = r6.f
            r4.a(r6, r3)
            goto L_0x00b4
        L_0x00a6:
            java.lang.Object r7 = r3.get(r6)
            akpu r7 = (defpackage.akpu) r7
            akri r7 = r7.a
            r13.add(r7)
            int r6 = r6 + 1
            goto L_0x0080
        L_0x00b4:
            java.util.Map r3 = r8.e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r0.size()
            r7 = 0
        L_0x00c0:
            if (r7 >= r6) goto L_0x00d3
            java.lang.Object r10 = r0.get(r7)
            akri r10 = (defpackage.akri) r10
            akpu r12 = new akpu
            r12.<init>(r10)
            r4.add(r12)
            int r7 = r7 + 1
            goto L_0x00c0
        L_0x00d3:
            r3.put(r9, r4)
            boolean r0 = r11.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x019f
            akrf r0 = new akrf
            com.google.android.gms.userlocation.UserLocationNearbyAlertRequest r4 = r9.b
            int r12 = r4.a
            int r13 = r4.e
            int r14 = r4.b
            com.google.android.gms.userlocation.UserLocationNearbyAlertFilter r4 = r4.c
            java.lang.String r15 = r4.c
            boolean r4 = r4.d
            r10 = r0
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            akpa r4 = r8.c
            com.google.android.gms.userlocation.UserLocationNearbyAlertRequest r6 = r9.b
            int r6 = r6.f
            java.util.List r6 = r4.a(r6)
            if (r6 == 0) goto L_0x019f
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x019f
            java.util.Iterator r6 = r6.iterator()
        L_0x0109:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x019f
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            ou r10 = r4.d
            boolean r10 = r10.containsKey(r7)
            if (r10 != 0) goto L_0x0192
            akrg r10 = r4.a
            r11 = 6
            r12 = 0
            if (r10 != 0) goto L_0x0130
            boolean r10 = android.util.Log.isLoggable(r2, r11)
            if (r10 == 0) goto L_0x012f
            java.lang.String r10 = "NearbyAlertModuleCallback is null"
            defpackage.alfy.a(r2, r10)
            goto L_0x0188
        L_0x012f:
            goto L_0x0188
        L_0x0130:
            int r13 = r7.hashCode()
            r14 = 273835101(0x1052645d, float:4.1492515E-29)
            if (r13 == r14) goto L_0x0149
            r14 = 353103893(0x150bf015, float:2.8260218E-26)
            if (r13 == r14) goto L_0x013f
            goto L_0x0153
        L_0x013f:
            java.lang.String r13 = "Distance"
            boolean r13 = r7.equals(r13)
            if (r13 == 0) goto L_0x0153
            r13 = 1
            goto L_0x0154
        L_0x0149:
            java.lang.String r13 = "Geofencing"
            boolean r13 = r7.equals(r13)
            if (r13 == 0) goto L_0x0153
            r13 = 0
            goto L_0x0154
        L_0x0153:
            r13 = -1
        L_0x0154:
            if (r13 == 0) goto L_0x0181
            if (r13 == r3) goto L_0x0179
            boolean r10 = android.util.Log.isLoggable(r2, r11)
            if (r10 == 0) goto L_0x0178
            java.lang.String r10 = java.lang.String.valueOf(r7)
            java.lang.String r11 = "The NearbyAlertModule is not implemented for: "
            int r13 = r10.length()
            if (r13 != 0) goto L_0x0170
            java.lang.String r10 = new java.lang.String
            r10.<init>(r11)
            goto L_0x0174
        L_0x0170:
            java.lang.String r10 = r11.concat(r10)
        L_0x0174:
            defpackage.alfy.a(r2, r10)
            goto L_0x0188
        L_0x0178:
            goto L_0x0188
        L_0x0179:
            akrd r12 = new akrd
            akyn r11 = r4.b
            r12.<init>(r10, r11)
            goto L_0x0188
        L_0x0181:
            akre r12 = new akre
            akrq r11 = r4.c
            r12.<init>(r10, r11)
        L_0x0188:
            if (r12 == 0) goto L_0x0109
            ou r10 = r4.d
            r10.put(r7, r12)
            r12.a()
        L_0x0192:
            ou r10 = r4.d
            java.lang.Object r7 = r10.get(r7)
            akrh r7 = (defpackage.akrh) r7
            r7.a((defpackage.akrf) r0)
            goto L_0x0109
        L_0x019f:
            com.google.android.gms.userlocation.UserLocationNearbyAlertRequest r0 = r9.b
            com.google.android.gms.userlocation.UserLocationNearbyAlertFilter r4 = r0.c
            java.lang.String r15 = r4.c
            int r13 = r0.e
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.Map r0 = r8.e
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01b6:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0210
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getKey()
            akpd r6 = (defpackage.akpd) r6
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x01b6
            java.lang.Object r6 = r4.getKey()
            akpd r6 = (defpackage.akpd) r6
            com.google.android.gms.userlocation.UserLocationNearbyAlertRequest r6 = r6.b
            com.google.android.gms.userlocation.UserLocationNearbyAlertFilter r6 = r6.c
            java.lang.String r6 = r6.c
            boolean r6 = defpackage.ius.a(r15, r6)
            if (r6 == 0) goto L_0x01b6
            java.lang.Object r6 = r4.getKey()
            akpd r6 = (defpackage.akpd) r6
            com.google.android.gms.userlocation.UserLocationNearbyAlertRequest r6 = r6.b
            int r6 = r6.e
            if (r13 != r6) goto L_0x01b6
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x01f6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01b6
            java.lang.Object r6 = r4.next()
            akpu r6 = (defpackage.akpu) r6
            int r7 = r6.b
            if (r7 != r3) goto L_0x0207
            goto L_0x020a
        L_0x0207:
            r10 = 3
            if (r7 != r10) goto L_0x01f6
        L_0x020a:
            akri r6 = r6.a
            r11.add(r6)
            goto L_0x01f6
        L_0x0210:
            java.util.Map r0 = r8.e
            java.lang.Object r0 = r0.get(r9)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x021c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0237
            java.lang.Object r4 = r0.next()
            akpu r4 = (defpackage.akpu) r4
            akri r6 = r4.a
            boolean r6 = r11.contains(r6)
            if (r6 == 0) goto L_0x021c
            r4.a(r3)
            r4.b(r3)
            goto L_0x021c
        L_0x0237:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x02b4
            akrf r0 = new akrf
            com.google.android.gms.userlocation.UserLocationNearbyAlertRequest r4 = r9.b
            r12 = 1
            int r14 = r4.b
            com.google.android.gms.userlocation.UserLocationNearbyAlertFilter r4 = r4.c
            boolean r4 = r4.d
            r10 = r0
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Class r4 = r19.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3[r5] = r4
            java.lang.String r4 = "nearby_alert_module_names"
            r7.putStringArray(r4, r3)
            java.util.Set r3 = r0.a
            if (r3 != 0) goto L_0x0274
            boolean r0 = android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L_0x02b4
            java.lang.String r0 = "Ignoring unexpected nearby alert callback with successful statuscode but no triggered places."
            defpackage.alfy.c(r2, r0)
            goto L_0x02b4
        L_0x0274:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r1 = r0.a
            java.util.Map r2 = r8.e
            java.lang.Object r2 = r2.get(r9)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0287:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x029f
            java.lang.Object r3 = r2.next()
            akpu r3 = (defpackage.akpu) r3
            akri r3 = r3.a
            boolean r4 = r1.contains(r3)
            if (r4 == 0) goto L_0x0287
            r5.add(r3)
            goto L_0x0287
        L_0x029f:
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x02b4
            int r1 = r0.b
            int r2 = r0.c
            java.lang.String r3 = r0.e
            boolean r4 = r0.f
            r0 = r19
            r6 = r20
            r0.a(r1, r2, r3, r4, r5, r6, r7)
        L_0x02b4:
            akpt r0 = r8.b
            r0.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akpb.a(akpd, java.util.List):void");
    }
}
