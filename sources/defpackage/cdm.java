package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: cdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cdm extends ccy {
    public static final ccj b = new ccj(new cdj(), "DetectedActivityProducer", new int[]{6}, (int[]) null, true);
    private ContextData k = null;
    private atrs l;
    private SparseIntArray m;
    private int n;
    private int o;
    private PendingIntent p;
    private long q = awuz.a.a().f();
    private final cer r = new cer((agvx) null, (agvx) null, awvb.f);

    public cdm(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
        a(6);
    }

    private final void b(long j) {
        long j2 = this.q;
        if (j2 != j && this.o <= 0) {
            this.q = j;
            j();
            k();
            return;
        }
        new Object[1][0] = Long.valueOf(j2);
    }

    private final void l() {
        b(this.r.c);
    }

    private final ContextData m() {
        jti jti = new jti(this.k);
        jut j = this.k.j();
        iva.b(j.b());
        jti.a(jut.a(j.c(), System.currentTimeMillis()));
        return jti.a();
    }

    /* access modifiers changed from: protected */
    public final void a() {
        Intent intent = new Intent("com.google.android.contextmanager.producer.module.DetectedActivityProducer");
        intent.setPackage("com.google.android.gms");
        this.p = PendingIntent.getBroadcast(this.d, 0, intent, 134217728);
        k();
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.contextmanager.producer.module.DetectedActivityProducer");
        return intentFilter;
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        if (this.k != null) {
            c(m());
            this.k = null;
        }
        rcd.a(this.d).a(this.p).a((acvp) new bva("[DetectedActivityProducer] remove activity", new Object[0]));
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        new Object[1][0] = Long.valueOf(this.q);
        rck rck = new rck();
        rck.a(this.q);
        rck.e = "ContextManager";
        rcd.a(this.d).a(rck.a(), this.p).a((acvp) new bva("[DetectedActivityProducer] request activity", new Object[0]));
    }

    public final void a(Context context, Intent intent) {
        char c;
        atrq atrq;
        int i;
        if (!ActivityRecognitionResult.a(intent)) {
            ((anih) ((anih) bxk.a.c()).a("cdm", "a", 140, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[DetectedActivityProducer] Not a activityRecognitionIntentService.");
            return;
        }
        ActivityRecognitionResult b2 = ActivityRecognitionResult.b(intent);
        new Object[1][0] = b2;
        atrr atrr = (atrr) atrs.b.o();
        atrq[] atrqArr = new atrq[(b2.a.size() + 1)];
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (DetectedActivity detectedActivity : b2.a) {
            atrp a = atrp.a(detectedActivity.a());
            aucd o2 = atrq.d.o();
            if (a == null) {
                a = atrp.UNKNOWN;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atrq atrq2 = (atrq) o2.b;
            atrq2.b = a.x;
            int i3 = atrq2.a | 1;
            atrq2.a = i3;
            int i4 = detectedActivity.e;
            atrq2.a = 2 | i3;
            atrq2.c = i4;
            int i5 = i2 + 1;
            atrqArr[i2] = (atrq) o2.i();
            if (arrayList.isEmpty()) {
                arrayList.add((atrq) o2.i());
            } else if (((atrq) o2.b).c > ((atrq) arrayList.get(0)).c) {
                arrayList.clear();
                arrayList.add((atrq) o2.i());
            } else if (((atrq) o2.b).c == ((atrq) arrayList.get(0)).c) {
                arrayList.add((atrq) o2.i());
            }
            i2 = i5;
        }
        if (bxk.a(2) && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                atrq atrq3 = (atrq) arrayList.get(i7);
                Object[] objArr = new Object[2];
                Integer valueOf = Integer.valueOf(i6);
                objArr[0] = valueOf;
                atrp a2 = atrp.a(atrq3.b);
                if (a2 == null) {
                    a2 = atrp.IN_VEHICLE;
                }
                objArr[1] = Integer.valueOf(a2.x);
                Object[] objArr2 = {valueOf, Integer.valueOf(atrq3.c)};
                i6++;
            }
        }
        aucd o3 = atrq.d.o();
        atrp atrp = atrp.EXPERIMENTAL_EXTRA_PERSONAL_VEHICLE;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atrq atrq4 = (atrq) o3.b;
        atrq4.b = atrp.x;
        atrq4.a |= 1;
        atrp[] atrpArr = {atrp.STILL, atrp.IN_VEHICLE};
        int size2 = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 < size2) {
                atrq atrq5 = (atrq) arrayList.get(i8);
                int i9 = 0;
                while (true) {
                    i = i8 + 1;
                    if (i9 >= 2) {
                        break;
                    }
                    atrp atrp2 = atrpArr[i9];
                    atrp a3 = atrp.a(atrq5.b);
                    if (a3 == null) {
                        a3 = atrp.IN_VEHICLE;
                    }
                    if (a3 == atrp2) {
                        int a4 = rcm.a(b2.c());
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        atrq atrq6 = (atrq) o3.b;
                        atrq6.a |= 2;
                        atrq6.c = a4;
                        new Object[1][0] = Integer.valueOf(a4);
                    } else {
                        i9++;
                    }
                }
            } else {
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                atrq atrq7 = (atrq) o3.b;
                atrq7.a |= 2;
                atrq7.c = 0;
            }
            i8 = i;
        }
        atrqArr[i2] = (atrq) o3.i();
        atrr.a(Arrays.asList(atrqArr));
        atrs atrs = (atrs) atrr.i();
        aucd aucd = (aucd) atrs.c(5);
        aucd.a((aucj) atrs);
        atrr atrr2 = (atrr) aucd;
        atrp a5 = atrp.a(((atrq) ((atrs) atrr2.i()).a.get(0)).b);
        if (a5 == null) {
            a5 = atrp.IN_VEHICLE;
        }
        if (a5 != atrp.TILTING) {
            int e = (int) awuz.a.a().e();
            atrs atrs2 = this.l;
            if (atrs2 == null || e == 0) {
                this.l = (atrs) atrr2.i();
            } else {
                int i10 = this.o;
                if (i10 > 0) {
                    int i11 = i10 - 1;
                    this.o = i11;
                    new Object[1][0] = Integer.valueOf(i11);
                    for (atrq atrq8 : Collections.unmodifiableList(((atrs) atrr2.b).a)) {
                        SparseIntArray sparseIntArray = this.m;
                        atrp a6 = atrp.a(atrq8.b);
                        if (a6 == null) {
                            a6 = atrp.IN_VEHICLE;
                        }
                        int i12 = a6.x;
                        SparseIntArray sparseIntArray2 = this.m;
                        atrp a7 = atrp.a(atrq8.b);
                        if (a7 == null) {
                            a7 = atrp.IN_VEHICLE;
                        }
                        sparseIntArray.put(i12, sparseIntArray2.get(a7.x, 0) + atrq8.c);
                    }
                    if (this.o == 0) {
                        if (atrr2.c) {
                            atrr2.c();
                            atrr2.c = false;
                        }
                        ((atrs) atrr2.b).a = aucj.s();
                        for (int i13 = 0; i13 < this.m.size(); i13++) {
                            aucd o4 = atrq.d.o();
                            atrp a8 = atrp.a(this.m.keyAt(i13));
                            if (o4.c) {
                                o4.c();
                                o4.c = false;
                            }
                            atrq atrq9 = (atrq) o4.b;
                            atrq9.b = a8.x;
                            atrq9.a |= 1;
                            int valueAt = this.m.valueAt(i13) / this.n;
                            if (o4.c) {
                                o4.c();
                                o4.c = false;
                            }
                            atrq atrq10 = (atrq) o4.b;
                            atrq10.a |= 2;
                            atrq10.c = valueAt;
                            if (atrr2.c) {
                                atrr2.c();
                                atrr2.c = false;
                            }
                            atrs atrs3 = (atrs) atrr2.b;
                            atrq atrq11 = (atrq) o4.i();
                            atrq11.getClass();
                            atrs3.a();
                            atrs3.a.add(atrq11);
                        }
                        ArrayList arrayList2 = new ArrayList(Collections.unmodifiableList(((atrs) atrr2.b).a));
                        Collections.sort(arrayList2, cdl.a);
                        if (atrr2.c) {
                            atrr2.c();
                            atrr2.c = false;
                        }
                        ((atrs) atrr2.b).a = aucj.s();
                        atrr2.a(arrayList2);
                        if (bxk.a(2)) {
                            for (atrq atrq12 : Collections.unmodifiableList(((atrs) atrr2.b).a)) {
                                Object[] objArr3 = new Object[2];
                                atrp a9 = atrp.a(atrq12.b);
                                if (a9 == null) {
                                    a9 = atrp.IN_VEHICLE;
                                }
                                objArr3[0] = Integer.valueOf(a9.x);
                                objArr3[1] = Integer.valueOf(atrq12.c);
                            }
                        }
                        l();
                        this.l = (atrs) atrr2.i();
                    } else {
                        return;
                    }
                } else {
                    atrs atrs4 = (atrs) atrr2.i();
                    aucx aucx = atrs4.a;
                    int size3 = aucx.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size3) {
                            atrq = (atrq) aucx.get(i14);
                            if (atrq.c == 100) {
                                atrp a10 = atrp.a(atrq.b);
                                if (a10 == null) {
                                    a10 = atrp.IN_VEHICLE;
                                }
                                if (a10 == atrp.RUNNING) {
                                    break;
                                }
                                atrp a11 = atrp.a(atrq.b);
                                if (a11 == null) {
                                    a11 = atrp.IN_VEHICLE;
                                }
                                if (a11 != atrp.WALKING) {
                                    atrp a12 = atrp.a(atrq.b);
                                    if (a12 == null) {
                                        a12 = atrp.IN_VEHICLE;
                                    }
                                    if (a12 == atrp.TILTING) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i14++;
                        } else {
                            atrp a13 = atrp.a(((atrq) atrs4.a.get(0)).b);
                            if (a13 == null) {
                                a13 = atrp.IN_VEHICLE;
                            }
                            atrp a14 = atrp.a(((atrq) atrs2.a.get(0)).b);
                            if (a14 == null) {
                                a14 = atrp.IN_VEHICLE;
                            }
                            c = a13 != a14 ? a13 != atrp.UNKNOWN ? a13 == atrp.STILL ? (char) 1 : 2 : 1 : 0;
                        }
                    }
                    Object[] objArr4 = new Object[1];
                    atrp a15 = atrp.a(atrq.b);
                    if (a15 == null) {
                        a15 = atrp.IN_VEHICLE;
                    }
                    objArr4[0] = Integer.valueOf(a15.x);
                    c = 0;
                    if (c == 2) {
                        atrs atrs5 = (atrs) atrr2.i();
                        SparseIntArray sparseIntArray3 = this.m;
                        if (sparseIntArray3 == null) {
                            this.m = new SparseIntArray();
                        } else {
                            sparseIntArray3.clear();
                        }
                        aucx aucx2 = atrs5.a;
                        int size4 = aucx2.size();
                        for (int i15 = 0; i15 < size4; i15++) {
                            atrq atrq13 = (atrq) aucx2.get(i15);
                            SparseIntArray sparseIntArray4 = this.m;
                            atrp a16 = atrp.a(atrq13.b);
                            if (a16 == null) {
                                a16 = atrp.IN_VEHICLE;
                            }
                            sparseIntArray4.put(a16.x, atrq13.c);
                        }
                        b(awuz.a.a().d());
                        this.o = e;
                        this.n = e + 1;
                        return;
                    }
                    this.l = (atrs) atrr2.i();
                    if (c != 0) {
                        return;
                    }
                }
            }
            WriteBatchImpl b3 = juc.b();
            if (this.k != null) {
                b3.a(m());
            }
            long a17 = cbi.i().a();
            jti jti = new jti(1, 6, 2);
            jti.a(jut.b(a17));
            jti.a(atrs.c, (atrs) atrr2.i());
            ContextData a18 = jti.a();
            this.k = a18;
            b3.a(a18);
            if (bxk.a(2)) {
                for (atrq atrq14 : Collections.unmodifiableList(((atrs) atrr2.b).a)) {
                    Object[] objArr5 = new Object[2];
                    atrp a19 = atrp.a(atrq14.b);
                    if (a19 == null) {
                        a19 = atrp.IN_VEHICLE;
                    }
                    objArr5[0] = Integer.valueOf(a19.x);
                    objArr5[1] = Integer.valueOf(atrq14.c);
                }
            }
            a(b3);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        j();
    }

    public final void a(cas cas) {
        new Object[1][0] = cas;
        this.r.a(cas);
        l();
    }

    public final void a(cas cas, cas cas2) {
        Object[] objArr = {cas, cas2};
        this.r.a(cas, cas2);
        l();
    }
}
