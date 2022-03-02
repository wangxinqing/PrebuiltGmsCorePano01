package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aijx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aijx extends jip {
    static final String[] a = {"android:monitor_location"};
    public boolean b = false;
    public final aijs g;
    public final aijv h;
    public final aikk i;
    public final nz j = new nz();
    private final aijw k;
    private final Context l;
    private final ArrayList m = new ArrayList();

    public aijx(Context context, Handler handler, aijw aijw, aijv aijv, aikk aikk) {
        super(a, context, handler);
        this.g = new aikd(aikk);
        this.k = aijw;
        this.l = context;
        this.h = aijv;
        this.i = aikk;
    }

    public final aikb a(aijy aijy) {
        aikb aikb = (aikb) b((Object) aijy);
        if (aikb != null) {
            return aikb;
        }
        try {
            int i2 = jni.b(this.l).a(aijy.a, 0).uid;
            aikb aikb2 = new aikb(i2, aijy, new ArrayList(), this.h);
            a((Object) aijy, (jio) aikb2);
            return aikb2;
        } catch (PackageManager.NameNotFoundException e) {
            if (!Log.isLoggable("GeofenceStateStore", 6)) {
                return null;
            }
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Package not found: \n");
            sb.append(valueOf);
            aikq.b("GeofenceStateStore", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(jio jio) {
        aikb aikb = (aikb) jio;
    }

    public final void g() {
        int i2;
        this.b = true;
        for (aikb b2 : e()) {
            b2.b();
        }
        a();
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            aikb aikb = (aikb) arrayList.get(i3);
            a((Object) aikb.b, (jio) aikb);
            ArrayList arrayList2 = aikb.c;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (true) {
                i2 = i3 + 1;
                if (i4 >= size2) {
                    break;
                }
                aijt aijt = (aijt) arrayList2.get(i4);
                aikb.a.a(aijt.j, aijt);
                i4++;
            }
            i3 = i2;
        }
        this.m.clear();
        this.b = false;
        a(1);
    }

    public final void h() {
        this.m.clear();
    }

    public final void i() {
        for (aikb clone : e()) {
            this.m.add(clone.clone());
        }
    }

    public final int j() {
        int i2 = 0;
        for (aikb a2 : c()) {
            i2 += a2.a();
        }
        return i2;
    }

    public final List a(aijy aijy, List list) {
        this.b = true;
        aikb aikb = (aikb) b((Object) aijy);
        List list2 = null;
        if (!(aikb == null || list == null || list.size() <= 0)) {
            list2 = aikb.a(list);
            if (aikb.a() == 0) {
                a((Object) aijy);
            }
        }
        this.b = false;
        if (list2 != null && !list2.isEmpty()) {
            a(2);
        }
        return list2;
    }

    public final void a(int i2) {
        if (!this.b) {
            if ((i2 & 2) != 0) {
                this.g.a(c(), j());
            }
            aioa aioa = (aioa) this.k;
            aioa.b(Message.obtain(aioa.K, 16, i2 & 1, 0));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(jio jio) {
        aikb aikb = (aikb) jio;
    }
}
