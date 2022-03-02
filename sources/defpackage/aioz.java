package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: aioz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aioz extends airh {
    private ActivityTransitionEvent i;
    private Bundle j;
    private ahmb k;

    public aioz(ikh ikh) {
        super("ActivityTransitionListeners", -1, ikh);
        this.i = null;
        this.j = null;
        this.k = null;
        this.k = new ahmb(this.i);
    }

    private static final void a(Context context, int i2) {
        iby a = rcd.a(context);
        StringBuilder sb = new StringBuilder(43);
        sb.append("set activity recognition mode = ");
        sb.append(i2);
        sb.toString();
        acwa a2 = a.a((ihb) new rci(i2));
        a2.a((acvv) new aiow());
        a2.a((acvs) new aiox());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void c(aipr aipr) {
        aioy aioy = (aioy) aipr;
        this.a.a(aico.AR_TRANSITION_REQUEST_REMOVED, aioy.h.hashCode(), aioy.j);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void d(aipr aipr) {
        aioy aioy = (aioy) aipr;
        int i2 = aioy.b;
        for (ActivityTransition activityTransition : aioy.a.b) {
            aicn aicn = this.a;
            int hashCode = aioy.h.hashCode();
            String str = aioy.j;
            String str2 = aioy.m;
            int i3 = activityTransition.a;
            int i4 = activityTransition.b;
            aioy aioy2 = aioy;
            aiqu aiqu = r6;
            aiqu aiqu2 = new aiqu(aico.AR_TRANSITION_REQUEST_ADDED, aicn.b(), aicn.a(str), hashCode, i3, i4, hashCode, str, str2, i3, i4);
            aicn.a((aicl) aiqu);
            aioy = aioy2;
        }
    }

    /* access modifiers changed from: protected */
    public final String g() {
        if (!axxa.d()) {
            return "requestActivityTransitionUpdates is not implemented!!";
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final int h() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ Object i() {
        TreeSet treeSet = new TreeSet(ActivityTransitionRequest.a);
        for (aioy aioy : this.h.values()) {
            int i2 = aioy.b;
            treeSet.addAll(aioy.a.b);
        }
        if (!treeSet.isEmpty()) {
            return new ActivityTransitionRequest(new ArrayList(treeSet), (String) null, (List) null);
        }
        return null;
    }

    protected static final boolean a(List list, Bundle bundle, aioy aioy, Intent intent) {
        int i2 = aioy.b;
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) it.next();
            Iterator it2 = aioy.a.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ActivityTransition activityTransition = (ActivityTransition) it2.next();
                if (activityTransitionEvent.a == activityTransition.a && activityTransitionEvent.b == activityTransition.b) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(activityTransitionEvent);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        ivy.a((SafeParcelable) new ActivityTransitionResult(arrayList, bundle), intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ aipr a(PendingIntent pendingIntent, Object obj, boolean z, ajrb ajrb, String str, ajbg ajbg) {
        return new aioy((ActivityTransitionRequest) obj, pendingIntent, ajbg, ajrb, z, str);
    }

    /* access modifiers changed from: protected */
    public final Intent a(aipr aipr) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_PENDING_INTENT", aipr.h);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void b(aioy aioy) {
        this.a.a(aico.AR_TRANSITION_REQUEST_DROPPED, aioy.h.hashCode(), aioy.j);
    }

    public final void a(PendingIntent pendingIntent, aixc aixc) {
        String str;
        if (aixc != null && axxa.b()) {
            String valueOf = String.valueOf(pendingIntent.getTargetPackage());
            if (valueOf.length() == 0) {
                new String("Logging remove request for package = ");
            } else {
                "Logging remove request for package = ".concat(valueOf);
            }
            aipr aipr = (aipr) this.h.get(pendingIntent);
            Context context = aixc.a;
            if (context != null) {
                ahol a = ahol.a(context);
                String targetPackage = pendingIntent.getTargetPackage();
                if (aipr != null) {
                    str = aipr.m;
                } else {
                    str = null;
                }
                a.a(targetPackage, str, 3, System.currentTimeMillis());
            }
        }
        super.a(pendingIntent, aixc);
        if (this.h.values().isEmpty()) {
            this.i = null;
            this.j = null;
            this.k.a = null;
        }
        if (axxd.c() && aixc != null) {
            for (aioy aioy : this.h.values()) {
                if (ahjj.a(aioy.j, aioy.m)) {
                    return;
                }
            }
            a(aixc.a, 0);
        }
    }

    public final /* bridge */ /* synthetic */ void a(Context context, ajbg ajbg, PendingIntent pendingIntent, Object obj, boolean z, ajrb ajrb, String str, ifu ifu, aixc aixc) {
        ActivityTransitionEvent activityTransitionEvent;
        aioy aioy;
        int i2;
        String str2;
        Context context2 = context;
        PendingIntent pendingIntent2 = pendingIntent;
        super.a(context, ajbg, pendingIntent, (ActivityTransitionRequest) obj, z, ajrb, str, ifu, aixc);
        if (!ahjk.a(context, pendingIntent2)) {
            if (axxa.a.a().arReportTransitionOnClientAdded() && (activityTransitionEvent = this.i) != null && activityTransitionEvent.b == 0 && (aioy = (aioy) this.h.get(pendingIntent2)) != null) {
                String valueOf = String.valueOf(this.i);
                Bundle bundle = this.j;
                if (bundle != null) {
                    i2 = bundle.getInt("location:key:transition_result_source", 0);
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unidentified" : "chre_cc_test_gesture" : "chre_audio_fusion" : "gms_transition_filter" : "chre_transition_filter";
                } else {
                    str2 = "unknown";
                }
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75 + str2.length());
                sb.append("Reporting the currently running activity transition to client = ");
                sb.append(valueOf);
                sb.append(", source = ");
                sb.append(str2);
                sb.toString();
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.i);
                if (axwr.b() && DetectedActivity.b(this.i.a)) {
                    ActivityTransitionEvent activityTransitionEvent2 = this.i;
                    arrayList.add(new ActivityTransitionEvent(0, activityTransitionEvent2.b, activityTransitionEvent2.c));
                }
                int a = a(context, (Object) arrayList, this.j, (aipr) aioy);
                StringBuilder sb2 = new StringBuilder(63);
                sb2.append("status of returning result to newly added request = ");
                sb2.append(a);
                sb2.toString();
            }
            if (axxa.b()) {
                String valueOf2 = String.valueOf(pendingIntent.getTargetPackage());
                if (valueOf2.length() == 0) {
                    new String("Logging request added for package = ");
                } else {
                    "Logging request added for package = ".concat(valueOf2);
                }
                ahol.a(context).a(pendingIntent.getTargetPackage(), str, 2, System.currentTimeMillis());
            }
            if (axxd.c() && z && ahjj.a(ajqw.a(pendingIntent), str)) {
                a(context, 1);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(android.content.Context r17, java.lang.Object r18, android.os.Bundle r19, defpackage.aixc r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r18
            java.util.List r4 = (java.util.List) r4
            boolean r5 = defpackage.axxd.c()
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 != 0) goto L_0x0017
            goto L_0x0151
        L_0x0017:
            if (r4 == 0) goto L_0x0151
            int r5 = r4.size()
            if (r5 > r7) goto L_0x0151
            java.lang.Object r5 = r4.get(r8)
            com.google.android.gms.location.ActivityTransitionEvent r5 = (com.google.android.gms.location.ActivityTransitionEvent) r5
            int r5 = r5.a
            r9 = 20
            if (r5 != r9) goto L_0x0151
            ahmb r5 = r0.k
            java.lang.Object r4 = r4.get(r8)
            com.google.android.gms.location.ActivityTransitionEvent r4 = (com.google.android.gms.location.ActivityTransitionEvent) r4
            int r10 = r4.a
            r11 = 0
            if (r10 != r9) goto L_0x0076
            int r9 = r4.b
            if (r9 != 0) goto L_0x005e
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            com.google.android.gms.location.ActivityTransitionEvent r9 = r5.a
            if (r9 == 0) goto L_0x0051
            com.google.android.gms.location.ActivityTransitionEvent r10 = new com.google.android.gms.location.ActivityTransitionEvent
            int r9 = r9.a
            long r12 = r4.c
            r10.<init>(r9, r7, r12)
            r11.add(r10)
        L_0x0051:
            com.google.android.gms.location.ActivityTransitionEvent r9 = new com.google.android.gms.location.ActivityTransitionEvent
            long r12 = r4.c
            r9.<init>(r8, r8, r12)
            r11.add(r9)
            r5.b = r7
            goto L_0x0077
        L_0x005e:
            boolean r9 = r5.b
            if (r9 == 0) goto L_0x0076
            boolean r9 = defpackage.axxd.b()
            if (r9 == 0) goto L_0x0076
            r5.b = r8
            com.google.android.gms.location.ActivityTransitionEvent r5 = new com.google.android.gms.location.ActivityTransitionEvent
            long r9 = r4.c
            r5.<init>(r8, r7, r9)
            java.util.List r11 = java.util.Collections.singletonList(r5)
            goto L_0x0077
        L_0x0076:
        L_0x0077:
            if (r11 == 0) goto L_0x02c2
            java.util.Map r4 = r0.h
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x0084:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x02c2
            java.lang.Object r9 = r4.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getValue()
            aioy r9 = (defpackage.aioy) r9
            boolean r10 = r9.p
            java.lang.String r12 = r9.j
            java.lang.String r13 = r9.m
            java.lang.String r14 = java.lang.String.valueOf(r12)
            int r14 = r14.length()
            java.lang.String r15 = java.lang.String.valueOf(r13)
            int r15 = r15.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r14 = r14 + 44
            int r14 = r14 + r15
            r7.<init>(r14)
            java.lang.String r14 = "isFromFirstParty = "
            r7.append(r14)
            r7.append(r10)
            java.lang.String r10 = ", package = "
            r7.append(r10)
            r7.append(r12)
            java.lang.String r10 = ", tag = "
            r7.append(r10)
            r7.append(r13)
            r7.toString()
            boolean r7 = r9.p
            if (r7 == 0) goto L_0x014e
            java.lang.String r7 = r9.j
            java.lang.String r10 = r9.m
            boolean r7 = defpackage.ahjj.a(r7, r10)
            if (r7 == 0) goto L_0x014e
            boolean r7 = r11.isEmpty()
            if (r7 != 0) goto L_0x0141
            int r7 = r11.size()
            int r7 = r7 + -1
            java.lang.Object r7 = r11.get(r7)
            com.google.android.gms.location.ActivityTransitionEvent r7 = (com.google.android.gms.location.ActivityTransitionEvent) r7
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            int r7 = r7.b
            if (r7 != 0) goto L_0x00fa
            r7 = 0
            goto L_0x00fb
        L_0x00fa:
            r7 = 1
        L_0x00fb:
            java.lang.String r12 = "AR_AUDIO_FUSION_RESULT"
            r10.putExtra(r12, r7)
            boolean r7 = a((java.util.List) r11, (android.os.Bundle) r2, (defpackage.aioy) r9, (android.content.Intent) r10)
            if (r7 == 0) goto L_0x0141
            boolean r7 = r9.a(r1, r10)
            if (r7 != 0) goto L_0x013f
            java.lang.String r7 = java.lang.String.valueOf(r9)
            java.lang.String r10 = java.lang.String.valueOf(r7)
            int r10 = r10.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r10 = r10 + 24
            r12.<init>(r10)
            java.lang.String r10 = "Dropping intent receiver"
            r12.append(r10)
            r12.append(r7)
            r12.toString()
            android.content.Intent r7 = r0.a((defpackage.aipr) r9)
            ikh r10 = r0.g
            r10.b((android.os.Parcelable) r7)
            aicn r7 = r0.a
            if (r7 == 0) goto L_0x013d
            r0.b((defpackage.aioy) r9)
            r7 = 0
            goto L_0x0142
        L_0x013d:
            r7 = 0
            goto L_0x0142
        L_0x013f:
            r7 = 2
            goto L_0x0142
        L_0x0141:
            r7 = 1
        L_0x0142:
            if (r7 == 0) goto L_0x0145
            goto L_0x0149
        L_0x0145:
            r4.remove()
            r5 = 1
        L_0x0149:
            if (r5 == 0) goto L_0x014e
            r0.b((defpackage.aixc) r3)
        L_0x014e:
            r7 = 1
            goto L_0x0084
        L_0x0151:
            super.a((android.content.Context) r1, (java.lang.Object) r4, (android.os.Bundle) r2, (defpackage.aixc) r3)
            boolean r3 = defpackage.axyl.b()
            if (r3 == 0) goto L_0x0172
            java.util.Iterator r3 = r4.iterator()
        L_0x015e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0172
            java.lang.Object r5 = r3.next()
            com.google.android.gms.location.ActivityTransitionEvent r5 = (com.google.android.gms.location.ActivityTransitionEvent) r5
            int r5 = r5.a
            r7 = 22
            if (r5 != r7) goto L_0x015e
            goto L_0x02c2
        L_0x0172:
            if (r4 == 0) goto L_0x02c2
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x02c2
            boolean r3 = defpackage.axwr.b()
            if (r3 == 0) goto L_0x0189
            java.util.List r3 = defpackage.ahpi.b(r4)
            com.google.android.gms.location.ActivityTransitionEvent r3 = defpackage.ahpi.a((java.util.List) r3)
            goto L_0x0195
        L_0x0189:
            int r3 = r4.size()
            int r3 = r3 + -1
            java.lang.Object r3 = r4.get(r3)
            com.google.android.gms.location.ActivityTransitionEvent r3 = (com.google.android.gms.location.ActivityTransitionEvent) r3
        L_0x0195:
            int r4 = r3.b
            if (r4 != 0) goto L_0x02a3
            com.google.android.gms.location.ActivityTransitionEvent r4 = r0.i
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 25
            r7.<init>(r5)
            java.lang.String r5 = "Current Activity Event = "
            r7.append(r5)
            r7.append(r4)
            r7.toString()
            com.google.android.gms.location.ActivityTransitionEvent r4 = r0.i
            if (r4 != 0) goto L_0x01bf
            goto L_0x029a
        L_0x01bf:
            boolean r4 = defpackage.axwx.e()
            if (r4 == 0) goto L_0x029a
            ahol r1 = defpackage.ahol.a((android.content.Context) r17)
            com.google.android.gms.location.ActivityTransitionEvent r4 = r0.i
            int r4 = r4.a
            int r5 = r3.a
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r9 = r3.c
            long r9 = r7.toMillis(r9)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            com.google.android.gms.location.ActivityTransitionEvent r11 = r0.i
            long r11 = r11.c
            long r11 = r7.toMillis(r11)
            long r9 = r9 - r11
            arec r7 = defpackage.arec.q
            aucd r7 = r7.o()
            aret r11 = defpackage.aret.d
            aucd r11 = r11.o()
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x01f3
            goto L_0x01f8
        L_0x01f3:
            r11.c()
            r11.c = r8
        L_0x01f8:
            aucj r12 = r11.b
            aret r12 = (defpackage.aret) r12
            int r13 = r12.a
            r13 = r13 | 4
            r12.a = r13
            r12.c = r4
            r4 = r13 | 2
            r12.a = r4
            r4 = 1120403456(0x42c80000, float:100.0)
            r12.b = r4
            aucj r11 = r11.i()
            aret r11 = (defpackage.aret) r11
            aret r12 = defpackage.aret.d
            aucd r12 = r12.o()
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x021d
            goto L_0x0222
        L_0x021d:
            r12.c()
            r12.c = r8
        L_0x0222:
            aucj r13 = r12.b
            aret r13 = (defpackage.aret) r13
            int r14 = r13.a
            r14 = r14 | 4
            r13.a = r14
            r13.c = r5
            r5 = r14 | 2
            r13.a = r5
            r13.b = r4
            aucj r4 = r12.i()
            aret r4 = (defpackage.aret) r4
            arek r5 = defpackage.arek.e
            aucd r5 = r5.o()
            boolean r12 = r5.c
            if (r12 != 0) goto L_0x0245
            goto L_0x024a
        L_0x0245:
            r5.c()
            r5.c = r8
        L_0x024a:
            aucj r12 = r5.b
            arek r12 = (defpackage.arek) r12
            r11.getClass()
            r12.b = r11
            int r11 = r12.a
            r13 = 1
            r11 = r11 | r13
            r12.a = r11
            r4.getClass()
            r12.c = r4
            r4 = r11 | 2
            r12.a = r4
            r4 = r4 | 4
            r12.a = r4
            r12.d = r9
            aucj r4 = r5.i()
            arek r4 = (defpackage.arek) r4
            boolean r5 = r7.c
            if (r5 != 0) goto L_0x0273
            goto L_0x0278
        L_0x0273:
            r7.c()
            r7.c = r8
        L_0x0278:
            aucj r5 = r7.b
            arec r5 = (defpackage.arec) r5
            r4.getClass()
            r5.e = r4
            int r4 = r5.a
            r4 = r4 | 8
            r5.a = r4
            aucj r4 = r7.i()
            arec r4 = (defpackage.arec) r4
            hol r1 = r1.a
            hoi r1 = r1.a((defpackage.audx) r4)
            r4 = 5
            r1.b((int) r4)
            r1.b()
        L_0x029a:
            r0.i = r3
            r0.j = r2
            ahmb r1 = r0.k
            r1.a = r3
            return
        L_0x02a3:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 74
            r3.<init>(r2)
            java.lang.String r2 = "Received a transition without an activity enter state. Transition Event = "
            r3.append(r2)
            r3.append(r1)
            r3.toString()
            return
        L_0x02c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aioz.a(android.content.Context, java.lang.Object, android.os.Bundle, aixc):void");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Bundle bundle, aipr aipr, Intent intent) {
        return a((List) obj, bundle, (aioy) aipr, intent);
    }
}
