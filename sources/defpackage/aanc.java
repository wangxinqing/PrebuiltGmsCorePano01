package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.security.snet.SafetyNetClientChimeraService;

/* renamed from: aanc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aanc extends allm {
    public static final String[] a;
    public boolean b = false;
    public final aanb c = new aanb(this);
    private final Context d;
    private final zzw e;

    static {
        aanc.class.getSimpleName();
        String[] strArr = new String[22];
        a = strArr;
        strArr[0] = "unknown";
        strArr[1] = "ransomware";
        strArr[2] = "phishing";
        strArr[3] = "trojan";
        strArr[4] = "uncommon";
        strArr[5] = "sms_fraud";
        strArr[6] = "toll_fraud";
        strArr[7] = "wap_fraud";
        strArr[8] = "call_fraud";
        strArr[9] = "backdoor";
        strArr[10] = "spyware";
        strArr[11] = "generic_malware";
        strArr[12] = "harmful_site";
        strArr[13] = "windows_malware";
        strArr[14] = "hostile_downloader";
        strArr[15] = "non_android_threat";
        strArr[16] = "rooting";
        strArr[17] = "privilege_escalation";
        strArr[18] = "commercial_spyware";
        strArr[19] = "spam";
        strArr[20] = "ddos";
        strArr[21] = "data_collection";
    }

    public aanc(Context context, zzw zzw) {
        this.d = context;
        this.e = zzw;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(java.lang.String r23) {
        /*
            r0 = r23
            r1 = 11
            if (r0 == 0) goto L_0x0142
            int r2 = r23.hashCode()
            r3 = 8
            r4 = 17
            r5 = 7
            r6 = 10
            r7 = 12
            r8 = 15
            r9 = 16
            r10 = 4
            r11 = 6
            r12 = 19
            r13 = 20
            r14 = 13
            r15 = 3
            r16 = 18
            r17 = 14
            r18 = 2
            r19 = 5
            r20 = 1
            r21 = 9
            r22 = 21
            switch(r2) {
                case -2055109037: goto L_0x011e;
                case -1989406151: goto L_0x0113;
                case -1447167332: goto L_0x0109;
                case -1017676355: goto L_0x00fe;
                case -956146080: goto L_0x00f4;
                case -865292602: goto L_0x00ea;
                case -751650404: goto L_0x00df;
                case -593393084: goto L_0x00d4;
                case -468311612: goto L_0x00ca;
                case -409221222: goto L_0x00bf;
                case 3078756: goto L_0x00b3;
                case 3536713: goto L_0x00a7;
                case 348820427: goto L_0x009c;
                case 544331407: goto L_0x0091;
                case 1090102270: goto L_0x0086;
                case 1230603862: goto L_0x007a;
                case 1380111296: goto L_0x006e;
                case 1559814681: goto L_0x0062;
                case 1574942061: goto L_0x0056;
                case 1919142211: goto L_0x004b;
                case 1984028899: goto L_0x003f;
                case 2121424149: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0129
        L_0x0033:
            java.lang.String r2 = "backdoor"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 8
            goto L_0x012a
        L_0x003f:
            java.lang.String r2 = "privilege_escalation"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 17
            goto L_0x012a
        L_0x004b:
            java.lang.String r2 = "call_fraud"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 7
            goto L_0x012a
        L_0x0056:
            java.lang.String r2 = "generic_malware"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 10
            goto L_0x012a
        L_0x0062:
            java.lang.String r2 = "windows_malware"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 12
            goto L_0x012a
        L_0x006e:
            java.lang.String r2 = "rooting"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 15
            goto L_0x012a
        L_0x007a:
            java.lang.String r2 = "rooting_malware"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 16
            goto L_0x012a
        L_0x0086:
            java.lang.String r2 = "sms_fraud"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 4
            goto L_0x012a
        L_0x0091:
            java.lang.String r2 = "ransomware"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 0
            goto L_0x012a
        L_0x009c:
            java.lang.String r2 = "wap_fraud"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 6
            goto L_0x012a
        L_0x00a7:
            java.lang.String r2 = "spam"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 19
            goto L_0x012a
        L_0x00b3:
            java.lang.String r2 = "ddos"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 20
            goto L_0x012a
        L_0x00bf:
            java.lang.String r2 = "hostile_downloader"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 13
            goto L_0x012a
        L_0x00ca:
            java.lang.String r2 = "uncommon"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 3
            goto L_0x012a
        L_0x00d4:
            java.lang.String r2 = "commercial_spyware"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 18
            goto L_0x012a
        L_0x00df:
            java.lang.String r2 = "non_android_threat"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 14
            goto L_0x012a
        L_0x00ea:
            java.lang.String r2 = "trojan"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 2
            goto L_0x012a
        L_0x00f4:
            java.lang.String r2 = "toll_fraud"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 5
            goto L_0x012a
        L_0x00fe:
            java.lang.String r2 = "harmful_site"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 11
            goto L_0x012a
        L_0x0109:
            java.lang.String r2 = "phishing"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 1
            goto L_0x012a
        L_0x0113:
            java.lang.String r2 = "spyware"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 9
            goto L_0x012a
        L_0x011e:
            java.lang.String r2 = "data_collection"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0129
            r0 = 21
            goto L_0x012a
        L_0x0129:
            r0 = -1
        L_0x012a:
            switch(r0) {
                case 0: goto L_0x0141;
                case 1: goto L_0x0140;
                case 2: goto L_0x013f;
                case 3: goto L_0x013e;
                case 4: goto L_0x013d;
                case 5: goto L_0x013c;
                case 6: goto L_0x013b;
                case 7: goto L_0x013a;
                case 8: goto L_0x0139;
                case 9: goto L_0x0138;
                case 10: goto L_0x012d;
                case 11: goto L_0x0137;
                case 12: goto L_0x0136;
                case 13: goto L_0x0135;
                case 14: goto L_0x0134;
                case 15: goto L_0x0133;
                case 16: goto L_0x0133;
                case 17: goto L_0x0132;
                case 18: goto L_0x0131;
                case 19: goto L_0x0130;
                case 20: goto L_0x012f;
                case 21: goto L_0x012e;
                default: goto L_0x012d;
            }
        L_0x012d:
            return r1
        L_0x012e:
            return r22
        L_0x012f:
            return r13
        L_0x0130:
            return r12
        L_0x0131:
            return r16
        L_0x0132:
            return r4
        L_0x0133:
            return r9
        L_0x0134:
            return r8
        L_0x0135:
            return r17
        L_0x0136:
            return r14
        L_0x0137:
            return r7
        L_0x0138:
            return r6
        L_0x0139:
            return r21
        L_0x013a:
            return r3
        L_0x013b:
            return r5
        L_0x013c:
            return r11
        L_0x013d:
            return r19
        L_0x013e:
            return r10
        L_0x013f:
            return r15
        L_0x0140:
            return r18
        L_0x0141:
            return r20
        L_0x0142:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aanc.a(java.lang.String):int");
    }

    /* access modifiers changed from: package-private */
    public final void a(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        zzw zzw = this.e;
        if (zzw != null && !this.b) {
            try {
                zzw.a(status, harmfulAppsInfo);
                SafetyNetClientChimeraService.a(harmfulAppsInfo);
            } catch (RemoteException e2) {
            } finally {
                this.b = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        defpackage.jca.a().a(r11.d, (android.content.ServiceConnection) r11.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        throw r12;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x0005, B:5:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r12, byte[] r13) {
        /*
            r11 = this;
            r0 = 12004(0x2ee4, float:1.6821E-41)
            r1 = 0
            if (r12 != 0) goto L_0x000f
            com.google.android.gms.common.api.Status r12 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0062 }
            r12.<init>(r0)     // Catch:{ all -> 0x0062 }
            r11.a((com.google.android.gms.common.api.Status) r12, (com.google.android.gms.safetynet.HarmfulAppsInfo) r1)     // Catch:{ all -> 0x0062 }
            goto L_0x0079
        L_0x000f:
            r12 = 0
            aana r2 = defpackage.aana.e     // Catch:{ auda -> 0x0064 }
            aucj r13 = defpackage.aucj.a((defpackage.aucj) r2, (byte[]) r13)     // Catch:{ auda -> 0x0064 }
            aana r13 = (defpackage.aana) r13     // Catch:{ auda -> 0x0064 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0062 }
            r2.<init>()     // Catch:{ all -> 0x0062 }
            aucx r3 = r13.a     // Catch:{ all -> 0x0062 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0062 }
        L_0x0023:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0062 }
            if (r4 != 0) goto L_0x0045
            com.google.android.gms.safetynet.HarmfulAppsInfo r3 = new com.google.android.gms.safetynet.HarmfulAppsInfo     // Catch:{ all -> 0x0062 }
            long r6 = r13.b     // Catch:{ all -> 0x0062 }
            com.google.android.gms.safetynet.HarmfulAppsData[] r4 = new com.google.android.gms.safetynet.HarmfulAppsData[r12]     // Catch:{ all -> 0x0062 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ all -> 0x0062 }
            r8 = r2
            com.google.android.gms.safetynet.HarmfulAppsData[] r8 = (com.google.android.gms.safetynet.HarmfulAppsData[]) r8     // Catch:{ all -> 0x0062 }
            boolean r10 = r13.c     // Catch:{ all -> 0x0062 }
            if (r10 == 0) goto L_0x003e
            int r13 = r13.d     // Catch:{ all -> 0x0062 }
            r9 = r13
            goto L_0x0040
        L_0x003e:
            r13 = -1
            r9 = -1
        L_0x0040:
            r5 = r3
            r5.<init>(r6, r8, r9, r10)     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0045:
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0062 }
            aamz r4 = (defpackage.aamz) r4     // Catch:{ all -> 0x0062 }
            com.google.android.gms.safetynet.HarmfulAppsData r5 = new com.google.android.gms.safetynet.HarmfulAppsData     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = r4.a     // Catch:{ all -> 0x0062 }
            auay r7 = r4.b     // Catch:{ all -> 0x0062 }
            byte[] r7 = r7.k()     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x0062 }
            int r4 = a(r4)     // Catch:{ all -> 0x0062 }
            r5.<init>(r6, r7, r4)     // Catch:{ all -> 0x0062 }
            r2.add(r5)     // Catch:{ all -> 0x0062 }
            goto L_0x0023
        L_0x0062:
            r12 = move-exception
            goto L_0x0085
        L_0x0064:
            r13 = move-exception
            r3 = r1
        L_0x0066:
            if (r3 == 0) goto L_0x0071
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0062 }
            r13.<init>(r12)     // Catch:{ all -> 0x0062 }
            r11.a((com.google.android.gms.common.api.Status) r13, (com.google.android.gms.safetynet.HarmfulAppsInfo) r3)     // Catch:{ all -> 0x0062 }
            goto L_0x0079
        L_0x0071:
            com.google.android.gms.common.api.Status r12 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0062 }
            r12.<init>(r0)     // Catch:{ all -> 0x0062 }
            r11.a((com.google.android.gms.common.api.Status) r12, (com.google.android.gms.safetynet.HarmfulAppsInfo) r1)     // Catch:{ all -> 0x0062 }
        L_0x0079:
            jca r12 = defpackage.jca.a()
            android.content.Context r13 = r11.d
            aanb r0 = r11.c
            r12.a((android.content.Context) r13, (android.content.ServiceConnection) r0)
            return
        L_0x0085:
            jca r13 = defpackage.jca.a()
            android.content.Context r0 = r11.d
            aanb r1 = r11.c
            r13.a((android.content.Context) r0, (android.content.ServiceConnection) r1)
            goto L_0x0092
        L_0x0091:
            throw r12
        L_0x0092:
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aanc.a(boolean, byte[]):void");
    }
}
