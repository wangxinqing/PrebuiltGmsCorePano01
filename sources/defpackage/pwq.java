package defpackage;

import android.app.usage.UsageEvents;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: pwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwq extends amvu implements pws {
    final Queue a;
    final osz b;
    private final PackageManager c;
    private final UsageEvents d;
    private final HashMap e = new HashMap();
    private final HashMap f = new HashMap();
    private final HashSet g = new HashSet();
    private String h = null;
    private int i = 0;
    private final oyq j;

    public pwq(PackageManager packageManager, osz osz, UsageEvents usageEvents, String str, oyq oyq) {
        this.c = packageManager;
        this.b = osz;
        this.d = usageEvents;
        this.a = new LinkedList();
        this.g.add(str);
        this.j = oyq;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        List<String> list;
        pxu pxu = (pxu) this.a.poll();
        if (pxu == null) {
            UsageEvents.Event event = new UsageEvents.Event();
            while (true) {
                if (this.d.getNextEvent(event)) {
                    if (event.getEventType() == 1 && !TextUtils.isEmpty(event.getPackageName()) && !event.getPackageName().equals(this.h) && !this.g.contains(event.getPackageName())) {
                        String packageName = event.getPackageName();
                        this.h = packageName;
                        list = (List) this.f.get(packageName);
                        if (list != null) {
                            break;
                        }
                        list = plw.a((Iterable) plw.b(this.c, packageName));
                        if (!list.isEmpty()) {
                            this.f.put(packageName, list);
                            break;
                        }
                        this.g.add(packageName);
                    }
                } else {
                    break;
                }
            }
            for (String str : list) {
                String str2 = (String) this.e.get(str);
                if (str2 == null) {
                    str2 = plo.a(ComponentName.unflattenFromString(str));
                    this.e.put(str, str2);
                }
                long timeStamp = event.getTimeStamp();
                int i2 = pwr.a;
                aucd o = ovc.m.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ovc ovc = (ovc) o.b;
                str2.getClass();
                int i3 = ovc.a | 16;
                ovc.a = i3;
                ovc.f = str2;
                ovc.a = i3 | 32;
                ovc.g = timeStamp;
                ovg ovg = ovg.GENERAL_USE;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                ovc ovc2 = (ovc) o.b;
                ovc2.h = ovg.g;
                int i4 = ovc2.a | 64;
                ovc2.a = i4;
                ovc2.a = i4 | 512;
                ovc2.k = true;
                this.i++;
                this.a.offer(new pxu((ovc) o.i(), this.b, (ozc) null));
            }
            pxu = (pxu) this.a.poll();
            if (pxu == null) {
                return (pxu) d();
            }
        }
        return pxu;
    }

    public final void close() {
        int i2 = this.i;
        if (i2 > 0) {
            oso.d("App usage reports: %d", (Object) Integer.valueOf(i2));
            oyq oyq = this.j;
            int i3 = this.i;
            long d2 = axrp.a.a().d();
            if (oyq.a(d2)) {
                aucd o = aoix.c.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aoix aoix = (aoix) o.b;
                aoix.a |= 1;
                aoix.b = i3;
                aoix aoix2 = (aoix) o.i();
                aucd o2 = aoji.R.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoji aoji = (aoji) o2.b;
                aoix2.getClass();
                aoji.l = aoix2;
                aoji.a |= 1024;
                oyq.a(3002, o2, d2);
            }
        }
    }
}
