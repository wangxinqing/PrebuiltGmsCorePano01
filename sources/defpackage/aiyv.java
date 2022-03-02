package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aiyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiyv implements Runnable {
    final /* synthetic */ aiyz a;
    final /* synthetic */ arnt b;

    public aiyv(aiyz aiyz, arnt arnt) {
        this.a = aiyz;
        this.b = arnt;
    }

    public final void run() {
        Object obj;
        arjg arjg;
        int i;
        Long l;
        int i2;
        aizd aizd;
        int i3;
        ajai ajai;
        Integer num;
        int[] iArr;
        Integer num2;
        String str;
        aiyy aiyy = this.a.d;
        arnt arnt = this.b;
        arjg arjg2 = arjg.UNKNOWN_MODEL;
        int a2 = armf.a(arnt.a);
        int i4 = a2 - 1;
        if (a2 == 0) {
            throw null;
        } else if (i4 == 113) {
            aril aril = (aril) arnt.a((auef) aril.f.c(7));
            if (aril != null) {
                aizc aizc = (aizc) aiyy;
                aiyt aiyt = aizc.l;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = aril.d;
                long j2 = (elapsedRealtime - j) - (aiyt.b - aiyt.a);
                boolean z = Math.abs(j2) > axyr.a.a().chreArClockDriftToResyncMs();
                long j3 = aiyt.a;
                long j4 = aiyt.b;
                arjg arjg3 = "null";
                StringBuilder sb = new StringBuilder(212);
                sb.append("onActivityResponse, syncedChreTimeMs=");
                sb.append(j3);
                sb.append(", syncedHostTimeMs=");
                sb.append(j4);
                sb.append(", nowChreTimeMs=");
                sb.append(j);
                sb.append(", nowHostTimeMs=");
                sb.append(elapsedRealtime);
                sb.append(", driftMs=");
                sb.append(j2);
                sb.append(", toSync=");
                sb.append(z);
                sb.toString();
                if (z) {
                    aiyt.b = elapsedRealtime;
                    aiyt.a = j;
                }
                aiyt.c = elapsedRealtime;
                aizc.a.a(aico.CHRE_AR_RESPONSE, (int) aril.d);
                if ((aril.a & 1) != 0) {
                    obj = Long.valueOf(aril.d);
                } else {
                    obj = arjg3;
                }
                String valueOf = String.valueOf(obj);
                if ((aril.a & 2) != 0) {
                    arjg = arjg.a(aril.e);
                    if (arjg == null) {
                        arjg = arjg.UNKNOWN_MODEL;
                    }
                } else {
                    arjg = arjg3;
                }
                String valueOf2 = String.valueOf(arjg);
                String arrays = Arrays.toString(new aucu(aril.b, aril.c).toArray());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length() + String.valueOf(arrays).length());
                sb2.append("ActivityResponse: time=");
                sb2.append(valueOf);
                sb2.append(", model=");
                sb2.append(valueOf2);
                sb2.append(", supportedActivities=");
                sb2.append(arrays);
                sb2.toString();
                arjg a3 = arjg.a(aril.e);
                if (a3 == null) {
                    a3 = arjg.UNKNOWN_MODEL;
                }
                aizc.f = a3;
                List list = aizc.b;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ajad ajad = (ajad) list.get(i5);
                    int ordinal = aizc.f.ordinal();
                    if (ordinal == 1) {
                        i = ahnk.CHRE_TREE_BAGGING.am;
                    } else if (ordinal == 2) {
                        i = ahnk.CHRE_DNN_V1.am;
                    } else if (ordinal == 3) {
                        i = ahnk.CHRE_DNN_GRU_V1.am;
                    } else if (ordinal != 4) {
                        i = ordinal != 5 ? ahnk.CHRE_UNKNOWN_MODEL.am : ahnk.CHRE_CNN_GRU_V1.am;
                    } else {
                        i = ahnk.CHRE_DNN_V2.am;
                    }
                    ajad.b(i);
                }
                return;
            }
            ((aizc) aiyy).h();
        } else if (i4 != 114) {
            int i6 = arnt.a;
            StringBuilder sb3 = new StringBuilder(33);
            sb3.append("Unknown message type: ");
            sb3.append(i6);
            sb3.toString();
        } else {
            ario ario = (ario) arnt.a((auef) ario.h.c(7));
            if (ario != null) {
                if ((ario.a & 1) != 0) {
                    l = Long.valueOf(ario.b);
                } else {
                    l = "null";
                }
                String valueOf3 = String.valueOf(l);
                int size2 = ario.d.size();
                int size3 = ario.c.size();
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 79);
                sb4.append("ActivityResult: baseTime=");
                sb4.append(valueOf3);
                sb4.append(", sampleCount=");
                sb4.append(size2);
                sb4.append(", transitionCount=");
                sb4.append(size3);
                sb4.toString();
                for (int i7 = 0; i7 < ario.d.size(); i7++) {
                    if ((((ariq) ario.d.get(i7)).a & 2) != 0) {
                        byte[] k = ((ariq) ario.d.get(i7)).c.k();
                        iArr = new int[k.length];
                        for (int i8 = 0; i8 < k.length; i8++) {
                            iArr[i8] = k[i8] & 255;
                        }
                    } else {
                        iArr = null;
                    }
                    if ((((ariq) ario.d.get(i7)).a & 1) != 0) {
                        num2 = Integer.valueOf(((ariq) ario.d.get(i7)).b);
                    } else {
                        num2 = "null";
                    }
                    String valueOf4 = String.valueOf(num2);
                    if (iArr == null) {
                        str = "null";
                    } else {
                        str = Arrays.toString(iArr);
                    }
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 46 + String.valueOf(str).length());
                    sb5.append("sample ");
                    sb5.append(i7);
                    sb5.append(": deltaTimeMs=");
                    sb5.append(valueOf4);
                    sb5.append(", confidences=");
                    sb5.append(str);
                    sb5.toString();
                }
                for (int i9 = 0; i9 < ario.c.size(); i9++) {
                    int i10 = ((aris) ario.c.get(i9)).a;
                    ariu a4 = ariu.a(((aris) ario.c.get(i9)).b);
                    if (a4 == null) {
                        a4 = ariu.INVALID_ACTIVITY;
                    }
                    String valueOf5 = String.valueOf(a4);
                    arji a5 = arji.a(((aris) ario.c.get(i9)).c);
                    if (a5 == null) {
                        a5 = arji.INVALID_TRANSITION;
                    }
                    String valueOf6 = String.valueOf(a5);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 68 + String.valueOf(valueOf6).length());
                    sb6.append("transition ");
                    sb6.append(i9);
                    sb6.append(": relativeTimeMs=");
                    sb6.append(i10);
                    sb6.append(", activity=");
                    sb6.append(valueOf5);
                    sb6.append(", type=");
                    sb6.append(valueOf6);
                    sb6.toString();
                }
                aizc aizc2 = (aizc) aiyy;
                aicn aicn = aizc2.a;
                if ((ario.a & 2) == 0) {
                    i2 = arin.UNKNOWN.ordinal();
                } else {
                    arin a6 = arin.a(ario.e);
                    if (a6 == null) {
                        a6 = arin.UNKNOWN;
                    }
                    i2 = a6.ordinal();
                }
                int size4 = ario.d.size();
                int size5 = ario.c.size();
                aicn.a((aicl) new aitl(aico.CHRE_AR_RESULT, aicn.b(), i2, size4, size5, i2, size4, size5));
                if (!aizc2.c || aizc2.b.isEmpty() || (aizd = aizc2.m) == null) {
                    aizc2.g = false;
                    return;
                }
                aucx aucx = ario.d;
                long j5 = ario.b;
                ArrayList arrayList = new ArrayList(aucx.size());
                int size6 = aucx.size();
                for (int i11 = 0; i11 < size6; i11++) {
                    ariq ariq = (ariq) aucx.get(i11);
                    auay auay = ariq.c;
                    int length = aizd.a.length;
                    float[] fArr = new float[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        fArr[i12] = ((float) (auay.a(aizd.a[i12]) & 255)) / 250.0f;
                    }
                    j5 += (long) ariq.b;
                    arrayList.add(new ajaf(aizd.b.a(j5), fArr));
                }
                if (ario.d.size() > 0) {
                    long j6 = ario.b;
                    aiyt aiyt2 = aizc2.l;
                    long j7 = aiyt2.a;
                    long j8 = aiyt2.b;
                    long j9 = aiyt2.c;
                    StringBuilder sb7 = new StringBuilder(119);
                    sb7.append("syncedChreTimeMs=");
                    sb7.append(j7);
                    sb7.append(", syncedHostTimeMs");
                    sb7.append(j8);
                    sb7.append(", lastCheckedHostTimeMs=");
                    sb7.append(j9);
                    String sb8 = sb7.toString();
                    StringBuilder sb9 = new StringBuilder(String.valueOf(sb8).length() + 52);
                    sb9.append("onActivityResult, eventTimeMs=");
                    sb9.append(j6);
                    sb9.append(", ");
                    sb9.append(sb8);
                    sb9.toString();
                }
                aizd aizd2 = aizc2.m;
                aucx aucx2 = ario.c;
                long j10 = ario.b;
                ArrayList arrayList2 = new ArrayList(aucx2.size());
                int size7 = aucx2.size();
                int i13 = 0;
                while (i13 < size7) {
                    aris aris = (aris) aucx2.get(i13);
                    long a7 = aizd2.b.a(((long) aris.a) + j10);
                    ariu a8 = ariu.a(aris.b);
                    if (a8 == null) {
                        a8 = ariu.INVALID_ACTIVITY;
                    }
                    int intValue = aiyu.a(a8).intValue();
                    arji a9 = arji.a(aris.c);
                    if (a9 == null) {
                        a9 = arji.INVALID_TRANSITION;
                    }
                    Iterator it = ((anaf) aiyu.a).entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            num = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry.getValue() == a9) {
                            num = (Integer) entry.getKey();
                            break;
                        }
                    }
                    arrayList2.add(new ajag(a7, intValue, num.intValue()));
                    i13++;
                }
                List list2 = aizc2.b;
                int size8 = list2.size();
                for (int i14 = 0; i14 < size8; i14++) {
                    ajad ajad2 = (ajad) list2.get(i14);
                    if (!arrayList.isEmpty()) {
                        ajad2.a(arrayList, aizc2.k.e());
                    }
                    if (!arrayList2.isEmpty()) {
                        ajad2.a((List) arrayList2);
                    }
                    if (axxd.c() && axxd.a.a().chreArAudioDiagnosticsLog() && (ario.a & 4) != 0) {
                        arip arip = ario.f;
                        if (arip == null) {
                            arip = arip.b;
                        }
                        aucx aucx3 = arip.a;
                        int size9 = aucx3.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size9) {
                                ajai = null;
                                break;
                            }
                            arjd arjd = (arjd) aucx3.get(i15);
                            int a10 = arjc.a(arjd.a);
                            if (a10 == 0) {
                                a10 = 1;
                            }
                            i15++;
                            if (a10 == 5) {
                                ajai = new ajai(arjd.b);
                                break;
                            }
                        }
                        String valueOf7 = String.valueOf(ajai);
                        StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf7).length() + 34);
                        sb10.append("Reporting diagnostics information:");
                        sb10.append(valueOf7);
                        sb10.toString();
                        ajad2.a(ajai);
                    }
                    if (axxd.c() && (ario.a & 8) != 0) {
                        ariz ariz = ario.g;
                        if (ariz == null) {
                            ariz = ariz.e;
                        }
                        int a11 = ariw.a(ariz.b);
                        if (a11 == 0) {
                            i3 = 1;
                        } else {
                            i3 = a11 == 2 ? 0 : 1;
                        }
                        int a12 = ariy.a(ariz.a);
                        ajah ajah = new ajah(i3, (a12 != 0 && a12 == 2) ? 1 : 0, ariz.c, aizc2.l.a(ariz.d));
                        aicn aicn2 = aizc2.a;
                        int i16 = ajah.a;
                        int i17 = ajah.b;
                        aicn2.a((aicl) new aitm(aico.CHRE_AR_AUDIO_FUSION_RESULT, aicn2.b(), i16, i17, i16, i17));
                        ajad2.a(ajah);
                    }
                    if (aizc2.g) {
                        ajad2.s();
                    }
                }
                aizc2.g = false;
                if (axxd.d() && (ario.a & 4) != 0) {
                    ahol a13 = ahol.a(aizc2.i);
                    amqt amqt = aizc2.h;
                    arip arip2 = ario.f;
                    if (arip2 == null) {
                        arip2 = arip.b;
                    }
                    arel arel = (arel) amqt.d(arip2);
                    aucd o = arec.q.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    arec arec = (arec) o.b;
                    arel.getClass();
                    arec.k = arel;
                    arec.a |= 1024;
                    hoi a14 = a13.a.a((audx) (arec) o.i());
                    a14.b(12);
                    a14.b();
                    return;
                }
                return;
            }
            ((aizc) aiyy).h();
        }
    }
}
