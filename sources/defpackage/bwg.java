package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.contextmanager.fence.PlaceFenceHelper;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bwg extends cbe {
    public final Context a;

    public bwg(Context context) {
        this.a = context;
    }

    public static final void a(bwp bwp, bvp bvp) {
        bwp.b = bvp;
        cbi.b().a(bwp);
    }

    public static final void a(PrintWriter printWriter) {
        int i;
        String str;
        String str2;
        byd byd;
        String str3;
        PrintWriter printWriter2 = printWriter;
        String str4 = "        ";
        try {
            printWriter2.println("\n== Begin Context Manager State ==\n");
            clj C = cbi.C();
            jyk jyk = null;
            juk juk = new juk((bsz) null);
            juu juu = new juu();
            juu.b();
            juk.a(5, juu.a());
            ArrayList a2 = cbi.q().a(juk.a());
            printWriter.println();
            printWriter2.println(">>> WorkManager <<<");
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                try {
                    clj.a(printWriter2, (jyk) aucj.a((aucj) jyk.g, ((juj) it.next()).c(), aubs.c()));
                } catch (auda e) {
                    auda auda = e;
                    anih anih = (anih) bxk.a.b();
                    anih.a((Throwable) auda);
                    ((anih) anih.a("clj", "a", 115, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WorkManager] Could not parse work stats");
                }
            }
            synchronized (C.a) {
                if (!C.a.b()) {
                    jyk = C.a.c();
                }
            }
            if (jyk != null) {
                clj.a(printWriter2, jyk);
            }
            synchronized (C.b) {
                if (!C.b.isEmpty()) {
                    LinkedHashSet<bvp> linkedHashSet = new LinkedHashSet<>(C.b);
                    long b = cbi.i().b();
                    printWriter2.println("[Ongoing tasks]");
                    for (bvp bvp : linkedHashSet) {
                        long e2 = bvp.e();
                        long j = b - bvp.c;
                        if (e2 < 0) {
                            e2 = j;
                            j = -1 + j;
                        }
                        String str5 = bvp.a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 49);
                        sb.append("  \"");
                        sb.append(str5);
                        sb.append("\": ");
                        sb.append(e2);
                        sb.append("/");
                        sb.append(j - e2);
                        sb.append("ms");
                        printWriter2.println(sb.toString());
                    }
                }
            }
            byd E = cbi.E();
            printWriter.println();
            printWriter2.println(">>> FenceManager <<<");
            byg byg = E.b;
            int size = byg.c.size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Num fence listener consumers=");
            sb2.append(size);
            printWriter2.println(sb2.toString());
            Iterator it2 = byg.c.values().iterator();
            int i2 = 0;
            while (true) {
                i = 23;
                if (!it2.hasNext()) {
                    break;
                }
                bwc bwc = (bwc) it2.next();
                int i3 = i2 + 1;
                StringBuilder sb3 = new StringBuilder(23);
                sb3.append("Consumer[");
                sb3.append(i2);
                sb3.append("]: ");
                printWriter2.print(sb3.toString());
                String valueOf = String.valueOf(bwc.a);
                int size2 = bwc.b.size();
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb4.append("consumer={");
                sb4.append(valueOf);
                sb4.append("} (");
                sb4.append(size2);
                sb4.append(" fences)");
                printWriter2.println(sb4.toString());
                boolean a3 = byd.a(bwc.a.a);
                int i4 = 0;
                for (Map.Entry entry : bwc.b.entrySet()) {
                    String str6 = (String) entry.getKey();
                    bzm bzm = (bzm) entry.getValue();
                    String str7 = "";
                    if (!a3) {
                        str3 = str4;
                        byd = E;
                    } else {
                        long j2 = bzm.c;
                        String num = Integer.toString(bzm.q);
                        str3 = str4;
                        byd = E;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(num).length() + 24);
                        sb5.append(", ");
                        sb5.append(j2);
                        sb5.append(", ");
                        sb5.append(num);
                        str7 = sb5.toString();
                    }
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str6).length() + 35 + String.valueOf(str7).length());
                    sb6.append("  ");
                    sb6.append("Fence[");
                    sb6.append(i4);
                    sb6.append("]: fenceKey=\"");
                    sb6.append(str6);
                    sb6.append("\"");
                    sb6.append(str7);
                    sb6.append(");");
                    printWriter2.println(sb6.toString());
                    long j3 = bzm.p;
                    String a4 = FenceState.a(bzm.l);
                    long j4 = bzm.o;
                    int i5 = i4 + 1;
                    StringBuilder sb7 = new StringBuilder(String.valueOf(a4).length() + 62);
                    sb7.append("  ");
                    sb7.append("reg_time: ");
                    sb7.append(j3);
                    sb7.append("; state: ");
                    sb7.append(a4);
                    sb7.append("@");
                    sb7.append(j4);
                    printWriter2.println(sb7.toString());
                    printWriter2.println(bzm.b);
                    i4 = i5;
                    str4 = str3;
                    E = byd;
                }
                String str8 = str4;
                byd byd2 = E;
                i2 = i3;
            }
            byg.d.f.a(printWriter2);
            printWriter2.println("Geofences:");
            int i6 = 0;
            for (Map.Entry entry2 : byg.g.l()) {
                String str9 = (String) entry2.getKey();
                String valueOf2 = String.valueOf(entry2.getValue());
                StringBuilder sb8 = new StringBuilder(String.valueOf(str9).length() + 16 + String.valueOf(valueOf2).length());
                sb8.append(" ");
                sb8.append(i6);
                sb8.append(": ");
                sb8.append(str9);
                sb8.append(", ");
                sb8.append(valueOf2);
                printWriter2.println(sb8.toString());
                i6++;
                i = 23;
            }
            PlaceFenceHelper placeFenceHelper = E.e;
            printWriter.println();
            int size3 = placeFenceHelper.b.size();
            StringBuilder sb9 = new StringBuilder(38);
            sb9.append(">>> PlaceFenceHelper <<< (");
            sb9.append(size3);
            sb9.append(")");
            printWriter2.println(sb9.toString());
            for (byy byy : placeFenceHelper.b.keySet()) {
                String valueOf3 = String.valueOf(byy);
                StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf3).length() + 6);
                sb10.append("  key ");
                sb10.append(valueOf3);
                printWriter2.println(sb10.toString());
                printWriter2.print("   ");
                for (bzv identityHashCode : ((byz) placeFenceHelper.b.get(byy)).a.keySet()) {
                    String hexString = Integer.toHexString(System.identityHashCode(identityHashCode));
                    StringBuilder sb11 = new StringBuilder(String.valueOf(hexString).length() + 3);
                    sb11.append(" @");
                    sb11.append(hexString);
                    sb11.append(",");
                    printWriter2.print(sb11.toString());
                }
                printWriter.println();
                printWriter.println();
            }
            cap r = cbi.r();
            printWriter.println();
            int size4 = r.a.size();
            StringBuilder sb12 = new StringBuilder(50);
            sb12.append(">>> InterestManager (num accounts=");
            sb12.append(size4);
            sb12.append(") <<<");
            printWriter2.println(sb12.toString());
            Iterator it3 = r.a.entrySet().iterator();
            int i7 = 0;
            while (true) {
                int i8 = 17;
                if (!it3.hasNext()) {
                    break;
                }
                Map.Entry entry3 = (Map.Entry) it3.next();
                int i9 = i7 + 1;
                String bsz = ((bsz) entry3.getKey()).toString();
                StringBuilder sb13 = new StringBuilder(String.valueOf(bsz).length() + i);
                sb13.append("Account[");
                sb13.append(i7);
                sb13.append("] : ");
                sb13.append(bsz);
                printWriter2.println(sb13.toString());
                cax cax = (cax) entry3.getValue();
                int size5 = cax.a.size();
                StringBuilder sb14 = new StringBuilder(36);
                sb14.append("  Num interest records = ");
                sb14.append(size5);
                printWriter2.println(sb14.toString());
                if (size5 != 0) {
                    SparseArray sparseArray = new SparseArray();
                    for (cas cas : cax.a.values()) {
                        List list = (List) sparseArray.get(cas.b().bA);
                        if (list == null) {
                            list = new ArrayList();
                            sparseArray.put(cas.b().bA, list);
                        }
                        list.add(cas);
                    }
                    int i10 = 0;
                    while (i10 < sparseArray.size()) {
                        int keyAt = sparseArray.keyAt(i10);
                        List<cas> list2 = (List) sparseArray.valueAt(i10);
                        String num2 = Integer.toString(keyAt);
                        int size6 = list2.size();
                        StringBuilder sb15 = new StringBuilder(String.valueOf(num2).length() + 15);
                        sb15.append("  ");
                        sb15.append(num2);
                        sb15.append("(");
                        sb15.append(size6);
                        sb15.append(")");
                        printWriter2.println(sb15.toString());
                        int i11 = 0;
                        for (cas a5 : list2) {
                            StringBuilder sb16 = new StringBuilder(i8);
                            sb16.append("  [");
                            sb16.append(i11);
                            sb16.append("]: ");
                            printWriter2.print(sb16.toString());
                            a5.a(printWriter2);
                            i11++;
                            i8 = 17;
                        }
                        i10++;
                        i8 = 17;
                    }
                }
                i7 = i9;
                i = 23;
            }
            if (r.d) {
                int size7 = r.b.a.size();
                StringBuilder sb17 = new StringBuilder(38);
                sb17.append("\nPending InterestRecords (");
                sb17.append(size7);
                sb17.append(")");
                printWriter2.println(sb17.toString());
                Iterator it4 = new ArrayList(r.b.a).iterator();
                int i12 = 0;
                while (it4.hasNext()) {
                    StringBuilder sb18 = new StringBuilder(16);
                    sb18.append("   ");
                    sb18.append(i12);
                    sb18.append(": ");
                    printWriter2.print(sb18.toString());
                    ((cas) it4.next()).a(printWriter2);
                    i12++;
                }
                int size8 = r.e.size();
                StringBuilder sb19 = new StringBuilder(44);
                sb19.append("\nLocationBased InterestRecords (");
                sb19.append(size8);
                sb19.append(")");
                printWriter2.println(sb19.toString());
                Iterator it5 = new ArrayList(r.e).iterator();
                int i13 = 0;
                while (it5.hasNext()) {
                    StringBuilder sb20 = new StringBuilder(16);
                    sb20.append("   ");
                    sb20.append(i13);
                    sb20.append(": ");
                    printWriter2.print(sb20.toString());
                    ((cas) it5.next()).a(printWriter2);
                    i13++;
                }
            }
            ccg t = cbi.t();
            printWriter.println();
            int size9 = t.b.size();
            StringBuilder sb21 = new StringBuilder(50);
            sb21.append(">>> ProducerManager (num accounts=");
            sb21.append(size9);
            sb21.append(") <<<");
            printWriter2.println(sb21.toString());
            int i14 = 0;
            for (Map.Entry entry4 : t.b.entrySet()) {
                int i15 = i14 + 1;
                String valueOf4 = String.valueOf(entry4.getKey());
                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf4).length() + 23);
                sb22.append("Account[");
                sb22.append(i14);
                sb22.append("] : ");
                sb22.append(valueOf4);
                printWriter2.println(sb22.toString());
                for (cck cck : ((ccl) entry4.getValue()).b.values()) {
                    String valueOf5 = String.valueOf(cck.a.c);
                    printWriter2.print(valueOf5.length() == 0 ? new String("  ") : "  ".concat(valueOf5));
                    if (cck.a.d()) {
                        printWriter2.println(" (Singleton)");
                        if (!jir.a((Collection) cck.a.h)) {
                            printWriter2.println("   Reporting Accounts:");
                            for (bsz valueOf6 : cck.a.h) {
                                String valueOf7 = String.valueOf(valueOf6);
                                StringBuilder sb23 = new StringBuilder(String.valueOf(valueOf7).length() + 4);
                                sb23.append("    ");
                                sb23.append(valueOf7);
                                printWriter2.println(sb23.toString());
                            }
                        }
                    }
                    if (cck.b.size() > 1) {
                        printWriter2.print("\n   Dependent Contexts:");
                        Iterator it6 = cck.b.iterator();
                        while (it6.hasNext()) {
                            String valueOf8 = String.valueOf(Integer.toString(((Integer) it6.next()).intValue()));
                            printWriter2.print(valueOf8.length() == 0 ? new String(" ") : " ".concat(valueOf8));
                        }
                    }
                    printWriter.println();
                }
                printWriter.println();
                i14 = i15;
            }
            bxo u = cbi.u();
            printWriter.println();
            int size10 = u.a.size();
            StringBuilder sb24 = new StringBuilder(45);
            sb24.append(">>> Dispatcher (num accounts=");
            sb24.append(size10);
            sb24.append(") <<<");
            printWriter2.println(sb24.toString());
            int i16 = 0;
            for (Map.Entry entry5 : u.a.entrySet()) {
                int i17 = i16 + 1;
                String valueOf9 = String.valueOf(entry5.getKey());
                StringBuilder sb25 = new StringBuilder(String.valueOf(valueOf9).length() + 23);
                sb25.append("Account[");
                sb25.append(i16);
                sb25.append("] : ");
                sb25.append(valueOf9);
                printWriter2.print(sb25.toString());
                bxm bxm = (bxm) entry5.getValue();
                int size11 = bxm.a.size();
                StringBuilder sb26 = new StringBuilder(50);
                sb26.append(" (num dispatchable interest records = ");
                sb26.append(size11);
                sb26.append(")");
                printWriter2.println(sb26.toString());
                if (bxm.a.size() != 0) {
                    for (int i18 = 0; i18 < bxm.a.size(); i18++) {
                        int keyAt2 = bxm.a.keyAt(i18);
                        Set<cas> set = (Set) bxm.a.valueAt(i18);
                        String num3 = Integer.toString(keyAt2);
                        int size12 = set.size();
                        StringBuilder sb27 = new StringBuilder(String.valueOf(num3).length() + 16);
                        sb27.append("  ");
                        sb27.append(num3);
                        sb27.append(" (");
                        sb27.append(size12);
                        sb27.append(")");
                        printWriter2.println(sb27.toString());
                        for (cas a6 : set) {
                            StringBuilder sb28 = new StringBuilder(17);
                            sb28.append("  [0]: ");
                            printWriter2.print(sb28.toString());
                            a6.a(printWriter2);
                        }
                    }
                }
                i16 = i17;
            }
            buc F = cbi.F();
            printWriter.println();
            printWriter2.println(">>> BatteryStatsCollector <<<");
            for (int i19 = 0; i19 < F.b.size(); i19++) {
                StringBuilder sb29 = new StringBuilder(17);
                sb29.append("[PS");
                sb29.append(i19);
                sb29.append("]: ");
                printWriter2.print(sb29.toString());
                bui bui = (bui) F.b.valueAt(i19);
                String num4 = Integer.toString(bui.a.bA);
                String str10 = !bui.c ? ", Inactive" : ", Active";
                StringBuilder sb30 = new StringBuilder(String.valueOf(num4).length() + 14 + str10.length());
                sb30.append("contextName = ");
                sb30.append(num4);
                sb30.append(str10);
                printWriter2.println(sb30.toString());
                Iterator it7 = bui.b.iterator();
                int i20 = 0;
                while (it7.hasNext()) {
                    buh buh = (buh) it7.next();
                    StringBuilder sb31 = new StringBuilder(22);
                    sb31.append("    [PAI");
                    sb31.append(i20);
                    sb31.append("]: ");
                    printWriter2.write(sb31.toString());
                    if (buh.b) {
                        String a7 = cku.a(((atos) buh.e.b).b);
                        int i21 = buh.c;
                        int i22 = buh.d;
                        StringBuilder sb32 = new StringBuilder(String.valueOf(a7).length() + 48);
                        sb32.append("ONGOING(");
                        sb32.append(a7);
                        sb32.append("), dataCnt = ");
                        sb32.append(i21);
                        sb32.append("/err:");
                        sb32.append(i22);
                        printWriter2.println(sb32.toString());
                    } else {
                        String a8 = cku.a(((atos) buh.e.b).b);
                        String a9 = cku.a(((atos) buh.e.b).c);
                        int i23 = buh.c;
                        int i24 = buh.d;
                        StringBuilder sb33 = new StringBuilder(String.valueOf(a8).length() + 48 + String.valueOf(a9).length());
                        sb33.append("CLOSED(");
                        sb33.append(a8);
                        sb33.append(",");
                        sb33.append(a9);
                        sb33.append("), dataCnt = ");
                        sb33.append(i23);
                        sb33.append("/err:");
                        sb33.append(i24);
                        printWriter2.println(sb33.toString());
                    }
                    int i25 = 0;
                    for (Map.Entry value : buh.a.a.entrySet()) {
                        for (bty bty : ((HashMap) value.getValue()).values()) {
                            StringBuilder sb34 = new StringBuilder(str4.length() + 17);
                            sb34.append(str4);
                            sb34.append("[AI");
                            sb34.append(i25);
                            sb34.append("]: ");
                            printWriter2.print(sb34.toString());
                            atoj atoj = (atoj) bty.c.b;
                            String str11 = atoj.b;
                            String str12 = atoj.c;
                            if (!bty.b) {
                                str2 = "Closed";
                            } else {
                                str2 = "Ongoing";
                            }
                            StringBuilder sb35 = new StringBuilder(String.valueOf(str11).length() + 8 + String.valueOf(str12).length() + str2.length());
                            sb35.append("App (");
                            sb35.append(str11);
                            sb35.append(",");
                            sb35.append(str12);
                            sb35.append(") ");
                            sb35.append(str2);
                            printWriter2.println(sb35.toString());
                            printWriter2.write(str4.concat("    "));
                            cas cas2 = bty.a;
                            str4.concat("    ");
                            cas2.a(printWriter2);
                            i25++;
                        }
                    }
                    i20++;
                }
                printWriter.println();
            }
            cba s = cbi.s();
            printWriter.println();
            printWriter2.println(">>> InterestSynchronizerManager <<<");
            caz caz = s.a;
            int size13 = caz.b.size();
            StringBuilder sb36 = new StringBuilder(39);
            sb36.append("Synchronizable contexts (");
            sb36.append(size13);
            sb36.append("): ");
            printWriter2.print(sb36.toString());
            boolean z = true;
            for (Integer intValue : caz.b) {
                int intValue2 = intValue.intValue();
                if (!z) {
                    printWriter2.print(", ");
                }
                printWriter2.print(Integer.toString(intValue2));
                z = false;
            }
            printWriter.println();
            int size14 = caz.c.size();
            StringBuilder sb37 = new StringBuilder(25);
            sb37.append("Num accounts: ");
            sb37.append(size14);
            printWriter2.println(sb37.toString());
            int i26 = 0;
            for (Map.Entry entry6 : caz.c.entrySet()) {
                SparseArray sparseArray2 = (SparseArray) entry6.getValue();
                int i27 = i26 + 1;
                String valueOf10 = String.valueOf((bsz) entry6.getKey());
                int size15 = sparseArray2.size();
                StringBuilder sb38 = new StringBuilder(String.valueOf(valueOf10).length() + 39);
                sb38.append("Account[");
                sb38.append(i26);
                sb38.append("]: ");
                sb38.append(valueOf10);
                sb38.append(", num=");
                sb38.append(size15);
                printWriter2.println(sb38.toString());
                for (int i28 = 0; i28 < sparseArray2.size(); i28++) {
                    String num5 = Integer.toString(sparseArray2.keyAt(i28));
                    String valueOf11 = String.valueOf((cay) sparseArray2.valueAt(i28));
                    StringBuilder sb39 = new StringBuilder(String.valueOf(num5).length() + 4 + String.valueOf(valueOf11).length());
                    sb39.append("  ");
                    sb39.append(num5);
                    sb39.append(": ");
                    sb39.append(valueOf11);
                    printWriter2.println(sb39.toString());
                }
                i26 = i27;
            }
            chn v = cbi.v();
            printWriter.println();
            printWriter2.println(">>> RegistrationManager <<<");
            int size16 = v.a.size();
            StringBuilder sb40 = new StringBuilder(45);
            sb40.append("Cached registration for ");
            sb40.append(size16);
            sb40.append(" accounts.");
            printWriter2.println(sb40.toString());
            int i29 = 0;
            for (Map.Entry entry7 : v.a.entrySet()) {
                String valueOf12 = String.valueOf((bsz) entry7.getKey());
                StringBuilder sb41 = new StringBuilder(String.valueOf(valueOf12).length() + 18);
                sb41.append("[");
                sb41.append(i29);
                sb41.append("]: ");
                sb41.append(valueOf12);
                sb41.append(" - ");
                printWriter2.print(sb41.toString());
                printWriter2.println(((chm) entry7.getValue()).toString());
                i29++;
            }
            cbi.q();
            printWriter.println();
            printWriter2.println(">>> FeatureStore <<<");
            if (!awuz.a.a().af()) {
                printWriter2.println("ACL inclusion in context manager state dump disabled");
            } else {
                printWriter2.println("Anonymous:");
                cjo.a(printWriter2, awup.b());
                printWriter2.println("\nAccount-based:");
                cjo.a(printWriter2, awup.c());
            }
            cjd p = cbi.p();
            printWriter.println();
            ciq ciq = p.b;
            int size17 = ciq.a.size();
            StringBuilder sb42 = new StringBuilder(53);
            sb42.append(">>> ContextDataCache (num accounts = ");
            sb42.append(size17);
            sb42.append(") <<<");
            printWriter2.println(sb42.toString());
            if (size17 != 0) {
                int i30 = 0;
                for (Map.Entry entry8 : ciq.a.entrySet()) {
                    int i31 = i30 + 1;
                    String valueOf13 = String.valueOf(entry8.getKey());
                    StringBuilder sb43 = new StringBuilder(String.valueOf(valueOf13).length() + 23);
                    sb43.append("Account[");
                    sb43.append(i30);
                    sb43.append("] : ");
                    sb43.append(valueOf13);
                    printWriter2.println(sb43.toString());
                    SparseArray sparseArray3 = (SparseArray) entry8.getValue();
                    for (int i32 = 0; i32 < sparseArray3.size(); i32++) {
                        printWriter.println();
                        int keyAt3 = sparseArray3.keyAt(i32);
                        cih cih = (cih) sparseArray3.valueAt(i32);
                        String num6 = Integer.toString(keyAt3);
                        if (!cih.a) {
                            str = " not";
                        } else {
                            str = "";
                        }
                        StringBuilder sb44 = new StringBuilder(String.valueOf(num6).length() + 14 + str.length());
                        sb44.append(num6);
                        sb44.append(": is");
                        sb44.append(str);
                        sb44.append(" producing");
                        printWriter2.println(sb44.toString());
                        for (cij cij : cih.a()) {
                            printWriter2.println(cij.a.toString());
                        }
                    }
                    i30 = i31;
                }
            }
            printWriter2.println("\n== End ContextManager State ==\n");
        } catch (ConcurrentModificationException e3) {
            String valueOf14 = String.valueOf(e3);
            StringBuilder sb45 = new StringBuilder(String.valueOf(valueOf14).length() + 57);
            sb45.append("ConcurrentModificationException in context manager dump: ");
            sb45.append(valueOf14);
            printWriter2.println(sb45.toString());
        } catch (Throwable th) {
            while (true) {
            }
            throw th;
        }
    }

    public final void a(jxf jxf, ContextManagerClientInfo contextManagerClientInfo, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        new Object[1][0] = contextManagerClientInfo;
        a(new bxh(jxf, contextManagerClientInfo, fenceUpdateRequestImpl), bvq.a("UpdateFenceRegistration", this.a, contextManagerClientInfo.b));
    }
}
