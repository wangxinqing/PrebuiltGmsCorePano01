package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: aajh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aajh extends aafb {
    private final osf a;

    public aajh(osf osf, GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, ozc ozc) {
        super(aonk.GET_GLOBAL_SEARCH_SOURCES, 1, 2, osf.b, getGlobalSearchSourcesCall$Request, ozc);
        this.a = osf;
    }

    private static final void a(Map map, String str, osz osz) {
        if (!map.containsKey(str)) {
            map.put(str, new ArrayList());
        }
        GetGlobalSearchSourcesCall$CorpusInfo getGlobalSearchSourcesCall$CorpusInfo = new GetGlobalSearchSourcesCall$CorpusInfo();
        getGlobalSearchSourcesCall$CorpusInfo.a = osz.c;
        getGlobalSearchSourcesCall$CorpusInfo.b = ozq.g(osz);
        getGlobalSearchSourcesCall$CorpusInfo.c = ozq.f(osz);
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = new Bundle();
        bundle.putParcelable("USER_HANDLE_KEY", Process.myUserHandle());
        getGlobalSearchSourcesCall$CorpusInfo.d = bundle;
        ((List) map.get(str)).add(getGlobalSearchSourcesCall$CorpusInfo);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x004c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        /*
            r16 = this;
            r1 = r16
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response r0 = new com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response
            r0.<init>()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.a
            r0.a = r2
            osf r2 = r1.a
            ozb r3 = r2.m
            ozs r2 = r2.a()
            java.lang.Object r2 = r2.a()
            monitor-enter(r2)
            osf r4 = r1.a     // Catch:{ all -> 0x031a }
            ozc r5 = r1.o     // Catch:{ all -> 0x031a }
            r6 = 0
            r7 = 1
            java.util.List r4 = r4.a((defpackage.ozc) r5, (com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification) r6, (boolean) r7)     // Catch:{ all -> 0x031a }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x031a }
            r5.<init>()     // Catch:{ all -> 0x031a }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x031a }
            r6.<init>()     // Catch:{ all -> 0x031a }
            oza r8 = r3.a     // Catch:{ all -> 0x031a }
            boolean r8 = r8.a()     // Catch:{ all -> 0x031a }
            java.lang.String r9 = "com.google.android.googlequicksearchbox"
            ozc r10 = r1.o     // Catch:{ all -> 0x031a }
            java.lang.String r10 = r10.f     // Catch:{ all -> 0x031a }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x031a }
            if (r9 == 0) goto L_0x0047
            osf r9 = r1.a     // Catch:{ all -> 0x031a }
            ozb r9 = r9.m     // Catch:{ all -> 0x031a }
            int r9 = r9.c()     // Catch:{ all -> 0x031a }
            goto L_0x0048
        L_0x0047:
            r9 = 0
        L_0x0048:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x031a }
        L_0x004c:
            boolean r11 = r4.hasNext()     // Catch:{ all -> 0x031a }
            if (r11 != 0) goto L_0x014c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x031a }
            r4.<init>()     // Catch:{ all -> 0x031a }
            java.util.Set r5 = r5.entrySet()     // Catch:{ all -> 0x031a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x031a }
        L_0x005f:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x031a }
            if (r7 != 0) goto L_0x00e1
            java.lang.String r5 = "com.google.android.gms"
            oyz r3 = r3.d(r5)     // Catch:{ all -> 0x031a }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ all -> 0x031a }
            java.util.Set r5 = r3.h()     // Catch:{ all -> 0x031a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x031a }
        L_0x0076:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x031a }
            if (r7 != 0) goto L_0x008c
            int r3 = r4.size()     // Catch:{ all -> 0x031a }
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource[] r3 = new com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource[r3]     // Catch:{ all -> 0x031a }
            java.lang.Object[] r3 = r4.toArray(r3)     // Catch:{ all -> 0x031a }
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource[] r3 = (com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource[]) r3     // Catch:{ all -> 0x031a }
            r0.b = r3     // Catch:{ all -> 0x031a }
            monitor-exit(r2)     // Catch:{ all -> 0x031a }
            return r0
        L_0x008c:
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x031a }
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r7 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r7     // Catch:{ all -> 0x031a }
            java.lang.String r8 = r7.b     // Catch:{ all -> 0x031a }
            boolean r8 = r6.containsKey(r8)     // Catch:{ all -> 0x031a }
            if (r8 == 0) goto L_0x0076
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource r8 = new com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource     // Catch:{ all -> 0x031a }
            r8.<init>()     // Catch:{ all -> 0x031a }
            java.lang.String r9 = "com.google.android.gms"
            r8.a = r9     // Catch:{ all -> 0x031a }
            java.lang.String r9 = r7.b     // Catch:{ all -> 0x031a }
            r8.b = r9     // Catch:{ all -> 0x031a }
            int r9 = r7.c     // Catch:{ all -> 0x031a }
            r8.c = r9     // Catch:{ all -> 0x031a }
            int r9 = r7.d     // Catch:{ all -> 0x031a }
            r8.d = r9     // Catch:{ all -> 0x031a }
            int r9 = r7.e     // Catch:{ all -> 0x031a }
            r8.e = r9     // Catch:{ all -> 0x031a }
            java.lang.String r9 = r7.f     // Catch:{ all -> 0x031a }
            r8.f = r9     // Catch:{ all -> 0x031a }
            java.lang.String r9 = r7.g     // Catch:{ all -> 0x031a }
            r8.g = r9     // Catch:{ all -> 0x031a }
            java.lang.String r9 = r7.h     // Catch:{ all -> 0x031a }
            r8.h = r9     // Catch:{ all -> 0x031a }
            java.lang.String r9 = r7.b     // Catch:{ all -> 0x031a }
            java.lang.Object r9 = r6.get(r9)     // Catch:{ all -> 0x031a }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x031a }
            int r10 = r9.size()     // Catch:{ all -> 0x031a }
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo[] r10 = new com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo[r10]     // Catch:{ all -> 0x031a }
            java.lang.Object[] r9 = r9.toArray(r10)     // Catch:{ all -> 0x031a }
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo[] r9 = (com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo[]) r9     // Catch:{ all -> 0x031a }
            r8.i = r9     // Catch:{ all -> 0x031a }
            java.lang.String r7 = r7.b     // Catch:{ all -> 0x031a }
            boolean r7 = r3.a((java.lang.String) r7)     // Catch:{ all -> 0x031a }
            r8.j = r7     // Catch:{ all -> 0x031a }
            r4.add(r8)     // Catch:{ all -> 0x031a }
            goto L_0x0076
        L_0x00e1:
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x031a }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x031a }
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource r9 = new com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource     // Catch:{ all -> 0x031a }
            r9.<init>()     // Catch:{ all -> 0x031a }
            java.lang.Object r10 = r7.getKey()     // Catch:{ all -> 0x031a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x031a }
            r9.a = r10     // Catch:{ all -> 0x031a }
            java.lang.Object r10 = r7.getKey()     // Catch:{ all -> 0x031a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x031a }
            oyz r10 = r3.d(r10)     // Catch:{ all -> 0x031a }
            defpackage.iva.a((java.lang.Object) r10)     // Catch:{ all -> 0x031a }
            ozv r11 = r10.g()     // Catch:{ all -> 0x031a }
            java.lang.Object r11 = r11.c()     // Catch:{ all -> 0x031a }
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r11 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r11     // Catch:{ all -> 0x031a }
            java.lang.String r12 = r11.b     // Catch:{ all -> 0x031a }
            r9.b = r12     // Catch:{ all -> 0x031a }
            int r12 = r11.c     // Catch:{ all -> 0x031a }
            r9.c = r12     // Catch:{ all -> 0x031a }
            int r12 = r11.d     // Catch:{ all -> 0x031a }
            r9.d = r12     // Catch:{ all -> 0x031a }
            int r12 = r11.e     // Catch:{ all -> 0x031a }
            r9.e = r12     // Catch:{ all -> 0x031a }
            java.lang.String r12 = r11.f     // Catch:{ all -> 0x031a }
            r9.f = r12     // Catch:{ all -> 0x031a }
            java.lang.String r12 = r11.g     // Catch:{ all -> 0x031a }
            r9.g = r12     // Catch:{ all -> 0x031a }
            java.lang.String r11 = r11.h     // Catch:{ all -> 0x031a }
            r9.h = r11     // Catch:{ all -> 0x031a }
            java.lang.Object r11 = r7.getValue()     // Catch:{ all -> 0x031a }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x031a }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x031a }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x031a }
            int r7 = r7.size()     // Catch:{ all -> 0x031a }
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo[] r7 = new com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo[r7]     // Catch:{ all -> 0x031a }
            java.lang.Object[] r7 = r11.toArray(r7)     // Catch:{ all -> 0x031a }
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo[] r7 = (com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo[]) r7     // Catch:{ all -> 0x031a }
            r9.i = r7     // Catch:{ all -> 0x031a }
            boolean r7 = r10.a((boolean) r8)     // Catch:{ all -> 0x031a }
            r9.j = r7     // Catch:{ all -> 0x031a }
            r4.add(r9)     // Catch:{ all -> 0x031a }
            goto L_0x005f
        L_0x014c:
            java.lang.Object r11 = r4.next()     // Catch:{ all -> 0x031a }
            osz r11 = (defpackage.osz) r11     // Catch:{ all -> 0x031a }
            java.lang.String r12 = r11.e     // Catch:{ all -> 0x031a }
            java.lang.String r13 = r11.c     // Catch:{ all -> 0x031a }
            java.lang.String r14 = "GetGlobalSearchSourcesTask: package=%s corpus=%s"
            defpackage.oso.a((java.lang.String) r14, (java.lang.Object) r12, (java.lang.Object) r13)     // Catch:{ all -> 0x031a }
            java.lang.String r14 = "com.google.android.googlequicksearchbox"
            ozc r15 = r1.o     // Catch:{ all -> 0x031a }
            java.lang.String r15 = r15.f     // Catch:{ all -> 0x031a }
            boolean r14 = r14.equals(r15)     // Catch:{ all -> 0x031a }
            if (r14 == 0) goto L_0x01d1
            agvx r14 = defpackage.ozx.ae     // Catch:{ all -> 0x031a }
            java.lang.Object r14 = r14.c()     // Catch:{ all -> 0x031a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x031a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x031a }
            if (r9 < r14) goto L_0x0176
            goto L_0x018d
        L_0x0176:
            boolean r14 = defpackage.ozq.e((defpackage.osz) r11)     // Catch:{ all -> 0x031a }
            if (r14 == 0) goto L_0x018d
            java.lang.String r11 = "shouldIncludeSourceForGsaVersion gsaVersion:%d minVersion:%d"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x031a }
            agvx r13 = defpackage.ozx.ae     // Catch:{ all -> 0x031a }
            java.lang.Object r13 = r13.c()     // Catch:{ all -> 0x031a }
            defpackage.oso.a((java.lang.String) r11, (java.lang.Object) r12, (java.lang.Object) r13)     // Catch:{ all -> 0x031a }
            goto L_0x004c
        L_0x018d:
            java.lang.String r14 = "com.google.android.gms"
            java.lang.String r10 = r11.e     // Catch:{ all -> 0x031a }
            boolean r10 = r14.equals(r10)     // Catch:{ all -> 0x031a }
            if (r10 != 0) goto L_0x0198
        L_0x0197:
            goto L_0x01d1
        L_0x0198:
            java.lang.String r10 = r11.c     // Catch:{ all -> 0x031a }
            int r14 = r10.hashCode()
            r15 = -645665530(0xffffffffd983ed06, float:-4.641729E15)
            if (r14 == r15) goto L_0x01b3
            r15 = 3000946(0x2dca72, float:4.205221E-39)
            if (r14 == r15) goto L_0x01a9
            goto L_0x01bd
        L_0x01a9:
            java.lang.String r14 = "apps"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x01bd
            r10 = 0
            goto L_0x01be
        L_0x01b3:
            java.lang.String r14 = "contacts_contact_id"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x01bd
            r10 = 1
            goto L_0x01be
        L_0x01bd:
            r10 = -1
        L_0x01be:
            if (r10 == 0) goto L_0x01c3
            if (r10 == r7) goto L_0x01c3
            goto L_0x0197
        L_0x01c3:
            agvx r10 = defpackage.ozx.ad     // Catch:{ all -> 0x031a }
            java.lang.Object r10 = r10.c()     // Catch:{ all -> 0x031a }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x031a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x031a }
            if (r9 < r10) goto L_0x004c
        L_0x01d1:
            java.lang.String r10 = "com.google.android.gms"
            java.lang.String r14 = r11.e     // Catch:{ all -> 0x031a }
            boolean r10 = r10.equals(r14)     // Catch:{ all -> 0x031a }
            if (r10 != 0) goto L_0x0207
            java.lang.String r10 = "com.google.android.gm"
            java.lang.String r14 = r11.e     // Catch:{ all -> 0x031a }
            boolean r10 = r10.equals(r14)     // Catch:{ all -> 0x031a }
            if (r10 != 0) goto L_0x01e7
            goto L_0x02dd
        L_0x01e7:
            java.lang.String r10 = r11.c     // Catch:{ all -> 0x031a }
            java.lang.String r14 = "messages"
            boolean r10 = r10.startsWith(r14)     // Catch:{ all -> 0x031a }
            if (r10 == 0) goto L_0x02dd
            ozc r10 = r1.o     // Catch:{ all -> 0x031a }
            int r10 = r10.b()     // Catch:{ all -> 0x031a }
            agvx r14 = defpackage.ozx.bN     // Catch:{ all -> 0x031a }
            java.lang.Object r14 = r14.c()     // Catch:{ all -> 0x031a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x031a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x031a }
            if (r10 < r14) goto L_0x004c
            goto L_0x02dd
        L_0x0207:
            java.lang.String r10 = r11.c     // Catch:{ all -> 0x031a }
            int r14 = r10.hashCode()
            r15 = 2
            switch(r14) {
                case -1837328862: goto L_0x0244;
                case -1233788050: goto L_0x023a;
                case -815233528: goto L_0x0230;
                case 114009: goto L_0x0226;
                case 2068688884: goto L_0x021c;
                case 2072087515: goto L_0x0212;
                default: goto L_0x0211;
            }
        L_0x0211:
            goto L_0x024e
        L_0x0212:
            java.lang.String r14 = "internal.3p:Message"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x024e
            r10 = 3
            goto L_0x024f
        L_0x021c:
            java.lang.String r14 = "internal.3p:Contact"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x024e
            r10 = 1
            goto L_0x024f
        L_0x0226:
            java.lang.String r14 = "sms"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x024e
            r10 = 0
            goto L_0x024f
        L_0x0230:
            java.lang.String r14 = "internal.3p:Photograph"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x024e
            r10 = 4
            goto L_0x024f
        L_0x023a:
            java.lang.String r14 = "internal.3p:Event"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x024e
            r10 = 2
            goto L_0x024f
        L_0x0244:
            java.lang.String r14 = "internal.3p:MobileApplication"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x024e
            r10 = 5
            goto L_0x024f
        L_0x024e:
            r10 = -1
        L_0x024f:
            if (r10 == 0) goto L_0x02c9
            if (r10 == r7) goto L_0x02b4
            if (r10 == r15) goto L_0x029f
            r14 = 3
            if (r10 == r14) goto L_0x028a
            r14 = 4
            if (r10 == r14) goto L_0x0275
            r14 = 5
            if (r10 == r14) goto L_0x0260
            goto L_0x02dd
        L_0x0260:
            ozc r10 = r1.o     // Catch:{ all -> 0x031a }
            int r10 = r10.b()     // Catch:{ all -> 0x031a }
            agvx r14 = defpackage.ozx.bH     // Catch:{ all -> 0x031a }
            java.lang.Object r14 = r14.c()     // Catch:{ all -> 0x031a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x031a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x031a }
            if (r10 < r14) goto L_0x004c
            goto L_0x02dd
        L_0x0275:
            ozc r10 = r1.o     // Catch:{ all -> 0x031a }
            int r10 = r10.b()     // Catch:{ all -> 0x031a }
            agvx r14 = defpackage.ozx.bK     // Catch:{ all -> 0x031a }
            java.lang.Object r14 = r14.c()     // Catch:{ all -> 0x031a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x031a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x031a }
            if (r10 < r14) goto L_0x004c
            goto L_0x02dd
        L_0x028a:
            ozc r10 = r1.o     // Catch:{ all -> 0x031a }
            int r10 = r10.b()     // Catch:{ all -> 0x031a }
            agvx r14 = defpackage.ozx.bJ     // Catch:{ all -> 0x031a }
            java.lang.Object r14 = r14.c()     // Catch:{ all -> 0x031a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x031a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x031a }
            if (r10 < r14) goto L_0x004c
            goto L_0x02dd
        L_0x029f:
            ozc r10 = r1.o     // Catch:{ all -> 0x031a }
            int r10 = r10.b()     // Catch:{ all -> 0x031a }
            agvx r14 = defpackage.ozx.bL     // Catch:{ all -> 0x031a }
            java.lang.Object r14 = r14.c()     // Catch:{ all -> 0x031a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x031a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x031a }
            if (r10 < r14) goto L_0x004c
            goto L_0x02dd
        L_0x02b4:
            ozc r10 = r1.o     // Catch:{ all -> 0x031a }
            int r10 = r10.b()     // Catch:{ all -> 0x031a }
            agvx r14 = defpackage.ozx.bM     // Catch:{ all -> 0x031a }
            java.lang.Object r14 = r14.c()     // Catch:{ all -> 0x031a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x031a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x031a }
            if (r10 < r14) goto L_0x004c
            goto L_0x02dd
        L_0x02c9:
            ozc r10 = r1.o     // Catch:{ all -> 0x031a }
            int r10 = r10.b()     // Catch:{ all -> 0x031a }
            agvx r14 = defpackage.ozx.bI     // Catch:{ all -> 0x031a }
            java.lang.Object r14 = r14.c()     // Catch:{ all -> 0x031a }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x031a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x031a }
            if (r10 < r14) goto L_0x004c
        L_0x02dd:
            oyz r10 = r3.d(r12)     // Catch:{ all -> 0x031a }
            defpackage.iva.a((java.lang.Object) r10)     // Catch:{ all -> 0x031a }
            java.lang.Object r14 = r1.n     // Catch:{ all -> 0x031a }
            com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request r14 = (com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request) r14     // Catch:{ all -> 0x031a }
            boolean r14 = r14.a     // Catch:{ all -> 0x031a }
            if (r14 == 0) goto L_0x02ed
            goto L_0x02f3
        L_0x02ed:
            boolean r10 = r10.a((java.lang.String) r13, (boolean) r8)     // Catch:{ all -> 0x031a }
            if (r10 == 0) goto L_0x004c
        L_0x02f3:
            java.lang.String r10 = "com.google.android.gms"
            boolean r10 = r10.equals(r12)     // Catch:{ all -> 0x031a }
            if (r10 == 0) goto L_0x0315
            anaf r10 = defpackage.oyz.a     // Catch:{ all -> 0x031a }
            boolean r10 = r10.containsKey(r13)     // Catch:{ all -> 0x031a }
            if (r10 == 0) goto L_0x0310
            anaf r10 = defpackage.oyz.a     // Catch:{ all -> 0x031a }
            java.lang.Object r10 = r10.get(r13)     // Catch:{ all -> 0x031a }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x031a }
            a(r6, r10, r11)     // Catch:{ all -> 0x031a }
            goto L_0x004c
        L_0x0310:
            a(r6, r13, r11)     // Catch:{ all -> 0x031a }
            goto L_0x004c
        L_0x0315:
            a(r5, r12, r11)     // Catch:{ all -> 0x031a }
            goto L_0x004c
        L_0x031a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x031a }
            goto L_0x031e
        L_0x031d:
            throw r0
        L_0x031e:
            goto L_0x031d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aajh.a():java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object a(Status status) {
        GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response = new GetGlobalSearchSourcesCall$Response();
        getGlobalSearchSourcesCall$Response.a = status;
        return getGlobalSearchSourcesCall$Response;
    }
}
