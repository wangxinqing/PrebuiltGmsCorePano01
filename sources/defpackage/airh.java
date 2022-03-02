package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: airh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class airh extends jip implements aiph {
    protected aicn a = null;
    protected aixc b;
    protected final ikh g;
    protected final Map h = new HashMap();
    private final String i;
    private final int j;
    private ajrb k = new ajrc();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public airh(java.lang.String r6, int r7, defpackage.ikh r8) {
        /*
            r5 = this;
            ihs r0 = defpackage.ihs.b()
            qvr r1 = new qvr
            android.os.Looper r2 = android.os.Looper.myLooper()
            r1.<init>((android.os.Looper) r2)
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = defpackage.axwu.b()
            r4 = 0
            r2[r4] = r3
            r5.<init>(r2, r0, r1)
            r0 = 0
            r5.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.h = r0
            ajrc r0 = new ajrc
            r0.<init>()
            r5.k = r0
            r5.i = r6
            r5.j = r7
            r5.g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airh.<init>(java.lang.String, int, ikh):void");
    }

    protected static final void a(ifu ifu, Status status) {
        if (ifu != null) {
            try {
                ifu.a(status);
            } catch (RemoteException e) {
            }
        }
    }

    private final void b(Context context, ajbg ajbg, PendingIntent pendingIntent, Object obj, boolean z, ajrb ajrb, String str, ifu ifu, aixc aixc) {
        PendingIntent pendingIntent2 = pendingIntent;
        ifu ifu2 = ifu;
        Context context2 = context;
        if (ahjk.a(context, pendingIntent)) {
            a(ifu2, Status.a);
            return;
        }
        String str2 = this.i;
        String hexString = Integer.toHexString(pendingIntent.hashCode());
        String targetPackage = pendingIntent.getTargetPackage();
        int length = str2.length();
        int length2 = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 42 + length2 + String.valueOf(targetPackage).length() + String.valueOf(str).length());
        sb.append("adding ");
        sb.append(str2);
        sb.append(" pendingIntent=");
        sb.append(hexString);
        sb.append(", packageName=");
        sb.append(targetPackage);
        sb.append(", tag=");
        sb.append(str);
        sb.toString();
        String g2 = g();
        if (g2 != null) {
            if (g2.length() == 0) {
                new String("This feature is not supported on this device: ");
            } else {
                "This feature is not supported on this device: ".concat(g2);
            }
            a(ifu2, new Status(13, g2));
            return;
        }
        aipr a2 = a(pendingIntent, obj, z, ajrb, str, ajbg);
        this.h.put(pendingIntent, a2);
        if (this.a != null) {
            d(a2);
        }
        b(aixc);
        a(ifu2, Status.a);
    }

    /* access modifiers changed from: protected */
    public abstract aipr a(PendingIntent pendingIntent, Object obj, boolean z, ajrb ajrb, String str, ajbg ajbg);

    /* access modifiers changed from: protected */
    public abstract Intent a(aipr aipr);

    public final void a(aicn aicn) {
        this.a = aicn;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(Object obj, Bundle bundle, aipr aipr, Intent intent);

    /* access modifiers changed from: protected */
    public abstract void b(aipr aipr);

    /* access modifiers changed from: protected */
    public abstract void c(aipr aipr);

    /* access modifiers changed from: protected */
    public abstract void d(aipr aipr);

    /* access modifiers changed from: protected */
    public String g() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract int h();

    /* access modifiers changed from: protected */
    public final int a(Context context, Object obj, Bundle bundle, aipr aipr) {
        Intent intent = new Intent();
        int i2 = this.j;
        if (i2 >= 0) {
            intent.putExtra("com.google.android.location.internal.EXTRA_RELEASE_VERSION", i2);
        }
        if (!a(obj, bundle, aipr, intent)) {
            return 1;
        }
        if (aipr.a(context, intent)) {
            return 2;
        }
        String valueOf = String.valueOf(aipr);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Dropping intent receiver");
        sb.append(valueOf);
        sb.toString();
        this.g.b((Parcelable) a(aipr));
        if (this.a == null) {
            return 0;
        }
        b(aipr);
        return 0;
    }

    public final PendingIntent a(String str) {
        for (PendingIntent pendingIntent : this.h.keySet()) {
            if (str.equals(pendingIntent.getTargetPackage())) {
                return pendingIntent;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("onListenersChanged flags ");
        sb.append(i2);
        sb.toString();
        b(this.b);
    }

    public final void a(aixc aixc) {
        if (aixc != null) {
            aixc.c.a(39, 0, new aivi(h(), i(), this.k), true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(aixc aixc) {
        this.k = new ajrc();
        for (aipr aipr : this.h.values()) {
            ajrb ajrb = aipr.n;
            if (ajrb != null) {
                this.k.a(ajrb);
            }
        }
        a(aixc);
    }

    public void a(PendingIntent pendingIntent, aixc aixc) {
        a((Object) pendingIntent);
        b(pendingIntent, aixc);
    }

    /* access modifiers changed from: protected */
    public final void b(PendingIntent pendingIntent, aixc aixc) {
        String str = this.i;
        String hexString = Integer.toHexString(pendingIntent.hashCode());
        StringBuilder sb = new StringBuilder(str.length() + 24 + String.valueOf(hexString).length());
        sb.append("removing ");
        sb.append(str);
        sb.append(" pendingIntent ");
        sb.append(hexString);
        sb.toString();
        aipr aipr = (aipr) this.h.remove(pendingIntent);
        if (aipr == null) {
            String valueOf = String.valueOf(pendingIntent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb2.append("Unable to find the pendingIntent to remove: ");
            sb2.append(valueOf);
            sb2.toString();
            return;
        }
        if (this.a != null) {
            c(aipr);
        }
        aipr.a();
        b(aixc);
    }

    public void a(Context context, ajbg ajbg, PendingIntent pendingIntent, Object obj, boolean z, ajrb ajrb, String str, ifu ifu, aixc aixc) {
        this.b = aixc;
        if (ahjk.a()) {
            if (!axwu.d()) {
                if (!ahjk.b(context, ajqw.b(pendingIntent), pendingIntent.getTargetPackage())) {
                    PendingIntent pendingIntent2 = pendingIntent;
                }
            } else {
                Context context2 = context;
            }
            PendingIntent pendingIntent3 = pendingIntent;
            a((Object) pendingIntent3, (jio) new ahma(context, ajqw.b(pendingIntent), pendingIntent.getTargetPackage(), z, false, pendingIntent, obj, ajrb, ajbg));
        } else {
            Context context3 = context;
            PendingIntent pendingIntent4 = pendingIntent;
        }
        b(context, ajbg, pendingIntent, obj, z, ajrb, str, ifu, aixc);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(jio jio) {
        ahma ahma = (ahma) jio;
        String valueOf = String.valueOf(ahma);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("onListenerActive listenerData ");
        sb.append(valueOf);
        sb.toString();
        b(ahma.g, ahma.e, ahma.c, ahma.d, ahma.a, ahma.f, this.i, (ifu) null, (aixc) null);
    }

    public void a(Context context, Object obj, Bundle bundle, aixc aixc) {
        Iterator it = this.h.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (axwu.f()) {
                ahjk.b(context, (PendingIntent) entry.getKey());
            }
            if (a(context, obj, bundle, (aipr) entry.getValue()) == 0) {
                it.remove();
                z = true;
            }
        }
        if (z) {
            b(aixc);
        }
    }

    public final void a(PrintWriter printWriter) {
        printWriter.printf("####%s Stats Start\n", new Object[]{this.i});
        String valueOf = String.valueOf(this.k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Overall work source=");
        sb.append(valueOf);
        printWriter.println(sb.toString());
        printWriter.println("Clients:");
        for (aipr aipr : this.h.values()) {
            StringBuilder sb2 = new StringBuilder();
            long elapsedRealtime = SystemClock.elapsedRealtime() - aipr.k;
            sb2.append("  Duration: ");
            sb2.append(String.format(Locale.ENGLISH, "%d:%02d:%02d", new Object[]{Long.valueOf(elapsedRealtime / 3600000), Long.valueOf((elapsedRealtime % 3600000) / 60000), Long.valueOf((elapsedRealtime % 60000) / 1000)}));
            sb2.append(", Package: ");
            sb2.append(aipr.j);
            sb2.append(", Tag: ");
            sb2.append(aipr.m);
            sb2.append(", WorkSource: ");
            sb2.append(aipr.n);
            printWriter.println(sb2.toString());
        }
        printWriter.printf("####%s Stats End\n", new Object[]{this.i});
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(jio jio) {
        ahma ahma = (ahma) jio;
        String valueOf = String.valueOf(ahma);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("onListenerInactive listenerData ");
        sb.append(valueOf);
        sb.toString();
        b(ahma.c, (aixc) null);
    }
}
