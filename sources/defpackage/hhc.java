package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.container.zapp.WaitDownloadCompleteOperation;
import com.google.android.gms.net.PlayServicesCronetProvider;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhc implements cqe {
    private static hhc f;
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Context b;
    final File c;
    public final hhb d;
    final hhd e = new hhd(this.c);
    private final agab g;

    private hhc(Context context) {
        agab agab = new agab(c(context), context, jfb.a((int) awxo.a.a().n(), 10));
        this.b = context;
        this.c = context.getDir("chimeradlm", 0);
        this.g = agab;
        hhb hhb = new hhb(this);
        this.d = hhb;
        agab.a((afzz) hhb);
    }

    public static synchronized hhc b(Context context) {
        hhc hhc;
        synchronized (hhc.class) {
            if (f == null) {
                f = new hhc(context.getApplicationContext());
            }
            hhc = f;
        }
        return hhc;
    }

    private static agac c(Context context) {
        try {
            wiz.a(context);
            return new afzj(new PlayServicesCronetProvider(context).createBuilder().build());
        } catch (hxw | hxx | UnsatisfiedLinkError e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
            sb.append("Cronet not available. fall back to okhttp transport: ");
            sb.append(valueOf);
            Log.i("ChimeraDLM", sb.toString());
            return new agad(new avze());
        }
    }

    public final boolean a(Context context) {
        return true;
    }

    public final long a(Uri uri, String str, String str2, boolean z, boolean z2, String str3, String str4, int i) {
        boolean z3;
        long j;
        long j2;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(i);
        sb.append(".apk");
        String sb2 = sb.toString();
        String uri2 = uri.toString();
        hhe a2 = this.e.a(sb2);
        if (a2 != null) {
            if (new File(this.c, sb2).exists()) {
                j2 = a2.j;
            } else {
                j2 = 0;
            }
            this.e.d(a2.b);
            j = j2;
            z3 = true;
        } else {
            j = 0;
            z3 = false;
        }
        hhe a3 = this.e.a(uri2, sb2, z, hhk.b(this.b), j, SystemClock.elapsedRealtime(), z3, i);
        if (a3 == null) {
            return 0;
        }
        long j3 = a3.b;
        a(j3, uri2, sb2, z);
        return j3;
    }

    public final void b(long... jArr) {
        for (long j : jArr) {
            hhe a2 = this.e.a(j);
            if (a2 != null) {
                this.g.a(this.c, a2.d);
                if (!awxo.g()) {
                    this.e.d(j);
                }
            }
            this.a.remove(Long.valueOf(j));
        }
    }

    public final ParcelFileDescriptor a(long j) {
        return this.e.c(j);
    }

    public final Map a(long... jArr) {
        return this.e.a(this.a, jArr);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j, long j2, int i) {
        long j3 = j;
        hhe a2 = this.e.a(j3);
        if (a2 == null) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Completing noexistent download: ");
            sb.append(j3);
            Log.e("ChimeraDLM", sb.toString());
            return;
        }
        aucd o = aogn.k.o();
        boolean z = true;
        boolean z2 = i == 8;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aogn aogn = (aogn) o.b;
        aogn.a |= 64;
        aogn.h = z2;
        int h = (int) awxo.a.a().h();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aogn aogn2 = (aogn) o.b;
        int i2 = aogn2.a | 128;
        aogn2.a = i2;
        aogn2.i = h;
        long j4 = a2.j;
        int i3 = 4;
        int i4 = i2 | 4;
        aogn2.a = i4;
        aogn2.d = j2 - j4;
        if (a2.g == 0 && !a2.l) {
            z = false;
        }
        aogn2.a = i4 | 32;
        aogn2.g = z;
        long elapsedRealtime = SystemClock.elapsedRealtime() - a2.h;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aogn aogn3 = (aogn) o.b;
        aogn3.a |= 16;
        aogn3.f = elapsedRealtime;
        int a3 = aogl.a(a2.k);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aogn aogn4 = (aogn) o.b;
        int i5 = a3 - 1;
        if (a3 != 0) {
            aogn4.j = i5;
            int i6 = aogn4.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aogn4.a = i6;
            if (a2.i) {
                i3 = 3;
            }
            aogn4.e = i3 - 1;
            aogn4.a = i6 | 8;
            this.e.a(j, i, j2);
            hhk.a(this.b).a(j3, o);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j, String str, String str2, boolean z) {
        this.a.add(Long.valueOf(j));
        agab agab = this.g;
        File file = this.c;
        afzs afzs = new afzs(agab, str, file, str2, new hha(this, j, str2), new afzn(file, str2));
        afzs.a(!z ? afzr.WIFI_ONLY : afzr.WIFI_OR_CELLULAR);
        hem.a().a(this.b, 55, str2);
        if (this.d.a()) {
            Intent startIntent = IntentOperation.getStartIntent(this.b, WaitDownloadCompleteOperation.class, "com.google.android.gms.chimera.action.WAIT_DOWNLOAD_COMPLETE");
            if (startIntent != null) {
                this.b.startService(startIntent);
            } else {
                Log.w("ChimeraDLM", "Unable to start WDCOperation");
            }
        }
        afzs.c();
    }
}
