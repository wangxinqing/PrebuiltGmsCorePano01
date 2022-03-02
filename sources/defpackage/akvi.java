package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: akvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvi implements Runnable {
    final /* synthetic */ PrintWriter a;
    final /* synthetic */ CountDownLatch b;
    final /* synthetic */ akvl c;

    public akvi(akvl akvl, PrintWriter printWriter, CountDownLatch countDownLatch) {
        this.c = akvl;
        this.a = printWriter;
        this.b = countDownLatch;
    }

    public final void run() {
        String str;
        akiy akiy = this.c.f;
        PrintWriter printWriter = this.a;
        akis akis = akiy.h;
        char c2 = 3;
        char c3 = 2;
        if (akis.b) {
            akis.a.a(printWriter);
            akhm akhm = akiy.b;
            akup akup = akhm.b;
            akup.b.a(printWriter);
            printWriter.println("\nActive SemanticLocationState:");
            for (allh println : akup.e) {
                printWriter.print("  ");
                printWriter.println(println);
            }
            aklo aklo = ((akjy) akup.d).j;
            printWriter.println("\nPlace Inference State Information:");
            int i = aklo.a;
            StringBuilder sb = new StringBuilder(38);
            sb.append(" counterNoInferenceNoRpc : ");
            sb.append(i);
            printWriter.println(sb.toString());
            int i2 = aklo.b;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append(" counterNoInferenceWithRpc : ");
            sb2.append(i2);
            printWriter.println(sb2.toString());
            int i3 = aklo.c;
            StringBuilder sb3 = new StringBuilder(46);
            sb3.append(" counterSuccessfulInferenceNoRpc : ");
            sb3.append(i3);
            printWriter.println(sb3.toString());
            int i4 = aklo.d;
            StringBuilder sb4 = new StringBuilder(48);
            sb4.append(" counterSuccessfulInferenceWithRpc : ");
            sb4.append(i4);
            printWriter.println(sb4.toString());
            int i5 = aklo.e;
            StringBuilder sb5 = new StringBuilder(36);
            sb5.append(" counterPrefetchingRpc : ");
            sb5.append(i5);
            printWriter.println(sb5.toString());
            int i6 = aklo.f;
            StringBuilder sb6 = new StringBuilder(48);
            sb6.append(" counterRpcRequiredButRecentlyMade : ");
            sb6.append(i6);
            printWriter.println(sb6.toString());
            int i7 = aklo.g;
            StringBuilder sb7 = new StringBuilder(47);
            sb7.append(" counterRpcRequiredButUserOnTheGo : ");
            sb7.append(i7);
            printWriter.println(sb7.toString());
            int i8 = aklo.h;
            StringBuilder sb8 = new StringBuilder(51);
            sb8.append(" counterRpcRequiredButGpsSpeedTooHigh : ");
            sb8.append(i8);
            printWriter.println(sb8.toString());
            int i9 = aklo.i;
            StringBuilder sb9 = new StringBuilder(31);
            sb9.append(" clearIndexBadTTL : ");
            sb9.append(i9);
            printWriter.println(sb9.toString());
            int i10 = aklo.j;
            StringBuilder sb10 = new StringBuilder(36);
            sb10.append(" clearIndexExceededTTL : ");
            sb10.append(i10);
            printWriter.println(sb10.toString());
            int i11 = aklo.k;
            StringBuilder sb11 = new StringBuilder(26);
            sb11.append(" freeSpaceL1 : ");
            sb11.append(i11);
            printWriter.println(sb11.toString());
            int i12 = aklo.m;
            StringBuilder sb12 = new StringBuilder(26);
            sb12.append(" freeSpaceL2 : ");
            sb12.append(i12);
            printWriter.println(sb12.toString());
            int i13 = aklo.l;
            StringBuilder sb13 = new StringBuilder(43);
            sb13.append(" loadedPlaceIndexSuccessfully : ");
            sb13.append(i13);
            printWriter.println(sb13.toString());
            printWriter.println();
            for (String valueOf : aklo.n) {
                String valueOf2 = String.valueOf(valueOf);
                printWriter.println(valueOf2.length() == 0 ? new String(" ") : " ".concat(valueOf2));
            }
            printWriter.println();
            int i14 = aklo.o;
            StringBuilder sb14 = new StringBuilder(36);
            sb14.append(" totalDataDownloadBytes: ");
            sb14.append(i14);
            printWriter.println(sb14.toString());
            printWriter.println();
            akls akls = ((akjy) akup.d).k.a;
            printWriter.println("\nSegmenterStateInformation:");
            Iterator it = akls.a.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                StringBuilder sb15 = new StringBuilder(String.valueOf(str2).length() + 29);
                sb15.append("  Invocation  ");
                sb15.append(i15);
                sb15.append(": [");
                sb15.append(str2);
                sb15.append("]");
                printWriter.println(sb15.toString());
                i15++;
            }
            akpb akpb = akhm.a;
            printWriter.println("\nActive NearbyAlertSubscriptions:");
            for (akpd akpd : akpb.e.keySet()) {
                printWriter.print("  ");
                printWriter.println(akpd);
                printWriter.print("      NearbyPlaceState count = ");
                printWriter.println(((List) akpb.e.get(akpd)).size());
                printWriter.println("      NearbyPlaceStates: (place ID, radius type, chain name, isBeaconRequired -> current state, current state timestamp | deterministic state, deterministic state timestamp)");
                for (akpu akpu : (List) akpb.e.get(akpd)) {
                    Object[] objArr = new Object[8];
                    objArr[0] = akpu.a.a;
                    objArr[1] = Integer.valueOf(akpd.b.e);
                    UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = akpd.b.c;
                    objArr[c3] = userLocationNearbyAlertFilter.c;
                    objArr[c2] = Boolean.valueOf(userLocationNearbyAlertFilter.d);
                    objArr[4] = Integer.valueOf(akpu.b);
                    objArr[5] = Long.valueOf(akpu.d);
                    objArr[6] = Integer.valueOf(akpu.c);
                    objArr[7] = Long.valueOf(akpu.e);
                    printWriter.printf("      %s, %d, %s, %b -> %d, %d | %d, %d\n", objArr);
                    c2 = 3;
                    c3 = 2;
                }
                c2 = 3;
                c3 = 2;
            }
            akrv akrv = akpb.a;
            printWriter.println(String.format(Locale.US, "\nCurrent highest power priority: %d", new Object[]{Integer.valueOf(akrv.c)}));
            printWriter.println(String.format(Locale.US, "\nNearby Alert Refresh Bounds: %s", new Object[]{akrv.e}));
            akrj akrj = akrv.d;
            if (akrj != null) {
                String valueOf3 = String.valueOf(akrj);
                StringBuilder sb16 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
                sb16.append("\n  My RefreshGeofence:");
                sb16.append(valueOf3);
                printWriter.println(sb16.toString());
            }
            akpa akpa = akpb.c;
            printWriter.println("\nActive NearbyAlertModules:");
            for (int i16 = 0; i16 < akpa.d.h; i16++) {
                Iterator it2 = akpa.e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((String) it2.next()).equals(akpa.d.b(i16))) {
                            printWriter.println(String.format("\n  ZeroPowerModule: %s", new Object[]{akpa.d.b(i16)}));
                            ((akrh) akpa.d.c(i16)).a(printWriter);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                Iterator it3 = akpa.f.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (((String) it3.next()).equals(akpa.d.b(i16))) {
                            printWriter.println(String.format("\n  HighPowerModule: %s", new Object[]{akpa.d.b(i16)}));
                            ((akrh) akpa.d.c(i16)).a(printWriter);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            akuc akuc = akhm.c;
            printWriter.println("\nActive PlacefencingStates:");
            for (akue println2 : akuc.a.keySet()) {
                printWriter.print("  ");
                printWriter.println(println2);
            }
        } else {
            printWriter.println("SubscriptionManager not yet initialized from cache");
        }
        akyn akyn = this.c.h;
        PrintWriter printWriter2 = this.a;
        printWriter2.println("SignalManager");
        int i17 = akyn.o;
        StringBuilder sb17 = new StringBuilder(26);
        sb17.append("  FLP WakeUps: ");
        sb17.append(i17);
        printWriter2.println(sb17.toString());
        int i18 = akyn.p;
        StringBuilder sb18 = new StringBuilder(25);
        sb18.append("  Wifi Scans: ");
        sb18.append(i18);
        printWriter2.println(sb18.toString());
        int i19 = akyn.q;
        StringBuilder sb19 = new StringBuilder(24);
        sb19.append("  Ble Scans: ");
        sb19.append(i19);
        printWriter2.println(sb19.toString());
        int i20 = akyn.r;
        StringBuilder sb20 = new StringBuilder(30);
        sb20.append("  Geofence Events: ");
        sb20.append(i20);
        printWriter2.println(sb20.toString());
        printWriter2.println();
        printWriter2.println("  Clients:");
        for (int i21 : akyn.a) {
            if (i21 == 0) {
                str = "NO_POWER";
            } else if (i21 == 1) {
                str = "LOW_POWER";
            } else if (i21 == 2) {
                str = "BALANCED_POWER";
            } else if (i21 != 3) {
                StringBuilder sb21 = new StringBuilder(21);
                sb21.append("UNKNOWN (");
                sb21.append(i21);
                sb21.append(")");
                str = sb21.toString();
            } else {
                str = "HIGH_POWER";
            }
            printWriter2.println(String.valueOf(str).concat(" Clients:"));
            List list = akyn.n;
            int size = list.size();
            int i22 = 0;
            for (int i23 = 0; i23 < size; i23++) {
                akym akym = (akym) list.get(i23);
                if (i21 == akym.a) {
                    i22++;
                    String valueOf4 = String.valueOf(akym.c.toString());
                    printWriter2.println(valueOf4.length() == 0 ? new String("    ") : "    ".concat(valueOf4));
                }
            }
            if (i22 == 0) {
                printWriter2.println("    None");
            }
        }
        akvl akvl = this.c;
        PrintWriter printWriter3 = this.a;
        printWriter3.println("\nPhenotype information");
        try {
            String valueOf5 = String.valueOf((ExperimentTokens) acws.a(yef.a(akvl.a).h("com.google.android.gms.places"), 3, TimeUnit.SECONDS));
            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf5).length() + 17);
            sb22.append("\nExperiment IDs: ");
            sb22.append(valueOf5);
            printWriter3.println(sb22.toString());
        } catch (Exception e) {
            String valueOf6 = String.valueOf(e);
            StringBuilder sb23 = new StringBuilder(String.valueOf(valueOf6).length() + 34);
            sb23.append("\nException getting experiment IDs:");
            sb23.append(valueOf6);
            printWriter3.println(sb23.toString());
        }
        printWriter3.println("\nPlaces flags:");
        for (Field field : akhk.class.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            if (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers)) {
                try {
                    Object obj = field.get(akhk.class);
                    if (obj instanceof agvx) {
                        agvx agvx = (agvx) obj;
                        String b2 = agvx.b();
                        String valueOf7 = String.valueOf(agvx.c());
                        StringBuilder sb24 = new StringBuilder(String.valueOf(b2).length() + 2 + String.valueOf(valueOf7).length());
                        sb24.append(b2);
                        sb24.append(": ");
                        sb24.append(valueOf7);
                        printWriter3.println(sb24.toString());
                    }
                } catch (Exception e2) {
                }
            }
        }
        this.b.countDown();
    }
}
