package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.SleepClassifyEvent;
import com.google.android.gms.location.SleepSegmentEvent;
import com.google.android.gms.location.SleepSegmentRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: airi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airi extends airh {
    public airi(ikh ikh) {
        super("SleepSegmentListeners", -1, ikh);
    }

    protected static final aipr a(PendingIntent pendingIntent, boolean z, ajrb ajrb, String str, ajbg ajbg) {
        return new aipr(pendingIntent, 0, ajbg, ajrb, z, false, str);
    }

    /* access modifiers changed from: protected */
    public final void b(aipr aipr) {
        this.a.a(aico.SLEEP_SEGMENT_REQUEST_DROPPED, aipr.h.hashCode(), aipr.j);
    }

    /* access modifiers changed from: protected */
    public final void c(aipr aipr) {
        this.a.a(aico.SLEEP_SEGMENT_REQUEST_REMOVED, aipr.h.hashCode(), ajqw.a(aipr.h));
    }

    /* access modifiers changed from: protected */
    public final void d(aipr aipr) {
        aicn aicn = this.a;
        int hashCode = aipr.h.hashCode();
        String a = ajqw.a(aipr.h);
        aicn.a((aicl) new aiqt(aico.SLEEP_SEGMENT_REQUEST_ADDED, aicn.b(), aicn.a(a), hashCode, hashCode, a, aipr.m));
    }

    /* access modifiers changed from: protected */
    public final int h() {
        return 3;
    }

    public final /* bridge */ /* synthetic */ Object i() {
        if (this.h.isEmpty()) {
            return null;
        }
        return SleepSegmentRequest.a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ aipr a(PendingIntent pendingIntent, Object obj, boolean z, ajrb ajrb, String str, ajbg ajbg) {
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return a(pendingIntent, z, ajrb, str, ajbg);
    }

    /* access modifiers changed from: protected */
    public final Intent a(aipr aipr) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_PENDING_INTENT", aipr.h);
        return intent;
    }

    public final void a(PendingIntent pendingIntent, aixc aixc) {
        if (ayfc.b()) {
            b(pendingIntent, this.b);
        } else {
            super.a(pendingIntent, aixc);
        }
        if (aixc != null && aixc.a != null && ayfc.e()) {
            ahol a = ahol.a(aixc.a);
            aucd o = arfw.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arfw arfw = (arfw) o.b;
            arfw.b = 2;
            arfw.a |= 1;
            String a2 = ajqw.a(pendingIntent);
            if (o.c) {
                o.c();
                o.c = false;
            }
            arfw arfw2 = (arfw) o.b;
            a2.getClass();
            arfw2.a |= 2;
            arfw2.c = a2;
            a.a((arfw) o.i());
        }
    }

    public final /* bridge */ /* synthetic */ void a(Context context, ajbg ajbg, PendingIntent pendingIntent, Object obj, boolean z, ajrb ajrb, String str, ifu ifu, aixc aixc) {
        PendingIntent pendingIntent2 = pendingIntent;
        String str2 = str;
        aixc aixc2 = aixc;
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        if (!ayfc.b()) {
            super.a(context, ajbg, pendingIntent, sleepSegmentRequest, z, ajrb, str, ifu, aixc);
        } else {
            this.b = aixc2;
            String hexString = Integer.toHexString(pendingIntent.hashCode());
            String targetPackage = pendingIntent.getTargetPackage();
            int length = String.valueOf(hexString).length();
            StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(targetPackage).length() + String.valueOf(str).length());
            sb.append("adding SleepSegmentListeners pendingIntent=");
            sb.append(hexString);
            sb.append(", packageName=");
            sb.append(targetPackage);
            sb.append(", tag=");
            sb.append(str2);
            sb.toString();
            ajbg ajbg2 = ajbg;
            aipr a = a(pendingIntent, z, ajrb, str2, ajbg);
            this.h.put(pendingIntent, a);
            if (this.a != null) {
                d(a);
            }
            b(aixc2);
            a(ifu, Status.a);
        }
        if (ayfc.e()) {
            String a2 = ajqw.a(pendingIntent);
            ahol a3 = ahol.a(context);
            aucd o = arfw.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arfw arfw = (arfw) o.b;
            arfw.b = 1;
            int i = 1 | arfw.a;
            arfw.a = i;
            a2.getClass();
            arfw.a = i | 2;
            arfw.c = a2;
            a3.a((arfw) o.i());
        }
    }

    public final /* bridge */ /* synthetic */ void a(Context context, Object obj, Bundle bundle, aixc aixc) {
        Iterator it;
        aibj aibj;
        ahnj ahnj;
        Context context2 = context;
        aixc aixc2 = aixc;
        aibj aibj2 = (aibj) obj;
        Iterator it2 = this.h.entrySet().iterator();
        boolean z = false;
        boolean z2 = false;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!ayfc.b() && axwu.f()) {
                ahjk.b(context2, (PendingIntent) entry.getKey());
            }
            int a = a(context2, (Object) aibj2, bundle, (aipr) entry.getValue());
            int i = 2;
            if (a == 0) {
                it2.remove();
                if (ayfc.e()) {
                    String a2 = ajqw.a((PendingIntent) entry.getKey());
                    ahol a3 = ahol.a(context);
                    aucd o = arfw.g.o();
                    if (o.c) {
                        o.c();
                        o.c = z;
                    }
                    arfw arfw = (arfw) o.b;
                    arfw.b = 9;
                    int i2 = arfw.a | 1;
                    arfw.a = i2;
                    a2.getClass();
                    arfw.a = i2 | 2;
                    arfw.c = a2;
                    a3.a((arfw) o.i());
                    z2 = true;
                } else {
                    z2 = true;
                }
            } else if (!(a == 1 || a == 2)) {
                StringBuilder sb = new StringBuilder(76);
                sb.append("Invalid return value received while reporting result to client = ");
                sb.append(a);
                sb.toString();
            }
            aipr aipr = (aipr) entry.getValue();
            if (aibj2.a == null) {
                aibj = aibj2;
                it = it2;
            } else if (ayfc.e()) {
                List<SleepSegmentEvent> list = aibj2.a;
                if (aixc2 != null) {
                    ahnj = aixc.bk();
                } else {
                    ahnj = null;
                }
                String a4 = ajqw.a(aipr.h);
                long currentTimeMillis = System.currentTimeMillis();
                aucd o2 = arfw.g.o();
                if (o2.c) {
                    o2.c();
                    o2.c = z;
                }
                arfw arfw2 = (arfw) o2.b;
                a4.getClass();
                arfw2.a |= 2;
                arfw2.c = a4;
                int i3 = 7;
                for (SleepSegmentEvent sleepSegmentEvent : list) {
                    int i4 = sleepSegmentEvent.c;
                    if (i4 == i) {
                        i3 = 8;
                    } else if (i4 == 1) {
                        i3 = 9;
                    }
                    aucd o3 = arfx.d.o();
                    aibj aibj3 = aibj2;
                    Iterator it3 = it2;
                    aufc a5 = augk.a(sleepSegmentEvent.a);
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    arfx arfx = (arfx) o3.b;
                    a5.getClass();
                    arfx.b = a5;
                    arfx.a |= 1;
                    aufc a6 = augk.a(sleepSegmentEvent.b);
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    arfx arfx2 = (arfx) o3.b;
                    a6.getClass();
                    arfx2.c = a6;
                    arfx2.a |= 2;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    arfw arfw3 = (arfw) o2.b;
                    arfx arfx3 = (arfx) o3.i();
                    arfx3.getClass();
                    if (!arfw3.d.a()) {
                        arfw3.d = aucj.a(arfw3.d);
                    }
                    arfw3.d.add(arfx3);
                    aibj2 = aibj3;
                    it2 = it3;
                    i = 2;
                }
                aibj = aibj2;
                it = it2;
                if (ahnj != null) {
                    aiba a7 = ahnj.a(currentTimeMillis);
                    aucd o4 = arfx.d.o();
                    aufc a8 = augk.a(((Long) a7.a).longValue());
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    arfx arfx4 = (arfx) o4.b;
                    a8.getClass();
                    arfx4.b = a8;
                    arfx4.a |= 1;
                    aufc a9 = augk.a(((Long) a7.b).longValue());
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    arfx arfx5 = (arfx) o4.b;
                    a9.getClass();
                    arfx5.c = a9;
                    arfx5.a |= 2;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    arfw arfw4 = (arfw) o2.b;
                    arfx arfx6 = (arfx) o4.i();
                    arfx6.getClass();
                    arfw4.e = arfx6;
                    arfw4.a |= 4;
                }
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                arfw arfw5 = (arfw) o2.b;
                arfw5.b = i3 - 1;
                arfw5.a |= 1;
                aufc a10 = augk.a(System.currentTimeMillis());
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                arfw arfw6 = (arfw) o2.b;
                a10.getClass();
                arfw6.f = a10;
                arfw6.a |= 8;
                ahol.a(context).a((arfw) o2.i());
            } else {
                aibj = aibj2;
                it = it2;
            }
            aibj2 = aibj;
            it2 = it;
            z = false;
        }
        if (z2) {
            b(aixc2);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Bundle bundle, aipr aipr, Intent intent) {
        aibj aibj = (aibj) obj;
        List<SleepSegmentEvent> list = aibj.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (SleepSegmentEvent a : list) {
                arrayList.add(ivy.a(a));
            }
            intent.putExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT", arrayList);
            return true;
        }
        List list2 = aibj.b;
        if (list2 == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList(list2.size());
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(ivy.a((SleepClassifyEvent) list2.get(i)));
        }
        intent.putExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT", arrayList2);
        return true;
    }
}
