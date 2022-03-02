package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimeZone;

/* renamed from: hoi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hoi {
    public final hol a;
    public ArrayList b;
    public boolean c;
    public String d;
    public int e;
    public avsd f;
    public String g;
    boolean h;
    public final aucf i;
    private final hok j;
    private ArrayList k;
    private ArrayList l;
    private ArrayList m;
    private String n;

    public hoi(hol hol, auay auay, hok hok) {
        this.k = null;
        this.l = null;
        this.m = null;
        this.b = null;
        this.c = true;
        this.i = (aucf) avrm.t.o();
        this.h = false;
        this.a = hol;
        this.e = hol.h;
        this.d = hol.g;
        this.n = hol.i;
        this.g = hol.j;
        this.f = hol.m;
        aucf aucf = this.i;
        long currentTimeMillis = System.currentTimeMillis();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrm avrm = (avrm) aucf.b;
        avrm.a = 1 | avrm.a;
        avrm.b = currentTimeMillis;
        aucf aucf2 = this.i;
        long offset = (long) (TimeZone.getDefault().getOffset(((avrm) aucf2.b).b) / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        if (aucf2.c) {
            aucf2.c();
            aucf2.c = false;
        }
        avrm avrm2 = (avrm) aucf2.b;
        avrm2.a |= 65536;
        avrm2.k = offset;
        if (aekv.a(hol.e)) {
            aucf aucf3 = this.i;
            boolean a2 = aekv.a(hol.e);
            if (aucf3.c) {
                aucf3.c();
                aucf3.c = false;
            }
            avrm avrm3 = (avrm) aucf3.b;
            avrm3.a |= 8388608;
            avrm3.s = a2;
        }
        if (SystemClock.elapsedRealtime() != 0) {
            aucf aucf4 = this.i;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (aucf4.c) {
                aucf4.c();
                aucf4.c = false;
            }
            avrm avrm4 = (avrm) aucf4.b;
            avrm4.a |= 2;
            avrm4.c = elapsedRealtime;
        }
        if (auay != null) {
            aucf aucf5 = this.i;
            if (aucf5.c) {
                aucf5.c();
                aucf5.c = false;
            }
            avrm avrm5 = (avrm) aucf5.b;
            auay.getClass();
            avrm5.a |= 1024;
            avrm5.j = auay;
        }
        this.j = hok;
    }

    public final LogEventParcelable a() {
        String[] strArr;
        byte[][] bArr;
        hol hol = this.a;
        ibq ibq = hol.a;
        String str = hol.f;
        Context context = hol.e;
        if (hol.d == -1) {
            synchronized (hol.class) {
                if (hol.d == -1) {
                    try {
                        hol.d = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.wtf("ClearcutLogger", "This can't happen.", e2);
                    }
                }
            }
        }
        int i2 = hol.d;
        int i3 = this.e;
        String str2 = this.d;
        String str3 = this.n;
        String str4 = this.g;
        hol hol2 = this.a;
        boolean z = hol2.k;
        avsd avsd = this.f;
        atzz atzz = hol2.l;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(str, i2, i3, str2, str3, str4, z, avsd);
        avrm avrm = (avrm) this.i.i();
        hok hok = this.j;
        int[] a2 = hol.a(this.k);
        ArrayList arrayList = this.l;
        if (arrayList != null) {
            strArr = (String[]) arrayList.toArray(hol.b);
        } else {
            strArr = null;
        }
        int[] a3 = hol.a(this.m);
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null) {
            bArr = (byte[][]) arrayList2.toArray(hol.c);
        } else {
            bArr = null;
        }
        return new LogEventParcelable(playLoggerContext, avrm, hok, a2, strArr, a3, bArr, this.c);
    }

    @Deprecated
    public final icf b() {
        if (!this.h) {
            this.h = true;
            return this.a.n.a(this);
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }

    public final void c(String str) {
        hol hol = this.a;
        ibq ibq = hol.a;
        if (!hol.k) {
            this.n = str;
            return;
        }
        throw new IllegalStateException("setUploadAccountName forbidden on anonymous logger");
    }

    public final String toString() {
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[");
        sb.append("uploadAccount: ");
        sb.append(this.n);
        sb.append(", logSourceName: ");
        sb.append(this.d);
        sb.append(", logSource#: ");
        sb.append(this.e);
        sb.append(", qosTier: ");
        sb.append(this.f);
        sb.append(", loggingId: ");
        sb.append(this.g);
        sb.append(", MessageProducer: ");
        sb.append(this.j);
        sb.append(", veMessageProducer: ");
        sb.append((Object) null);
        sb.append(", testCodes: ");
        sb.append(hol.a((Iterable) this.k));
        sb.append(", dimensions: ");
        sb.append(hol.a((Iterable) null));
        sb.append(", mendelPackages: ");
        sb.append(hol.a((Iterable) this.l));
        sb.append(", experimentIds: ");
        sb.append(hol.a((Iterable) this.m));
        sb.append(", experimentTokens: ");
        sb.append(hol.a((Iterable) null));
        sb.append(", experimentTokensBytes: ");
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(Arrays.toString((byte[]) arrayList2.get(i2)));
            }
        } else {
            arrayList = null;
        }
        sb.append(hol.a((Iterable) arrayList));
        sb.append(", addPhenotype: ");
        sb.append(this.c);
        sb.append(", collectionBasis: ");
        sb.append((Object) null);
        sb.append("]");
        return sb.toString();
    }

    public final void b(int i2) {
        aucf aucf = this.i;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrm avrm = (avrm) aucf.b;
        avrm avrm2 = avrm.t;
        avrm.a |= 16;
        avrm.f = i2;
    }

    @Deprecated
    public final void b(String str) {
        aucf aucf = this.i;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrm avrm = (avrm) aucf.b;
        avrm avrm2 = avrm.t;
        str.getClass();
        avrm.a |= 8;
        avrm.e = str;
    }

    public final void a(int i2) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(Integer.valueOf(i2));
    }

    public final void a(long j2) {
        aucf aucf = this.i;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        avrm avrm = (avrm) aucf.b;
        avrm avrm2 = avrm.t;
        avrm.a |= 64;
        avrm.h = j2;
    }

    public final void a(String str) {
        hol hol = this.a;
        ibq ibq = hol.a;
        if (hol.k) {
            Log.e("ClearcutLogger", "addMendelPackage forbidden on anonymous logger");
        }
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(str);
    }

    public hoi(hol hol, hok hok) {
        this(hol, (auay) null, hok);
    }

    public final void a(int[] iArr) {
        hol hol = this.a;
        ibq ibq = hol.a;
        if (hol.k) {
            Log.e("ClearcutLogger", "addExperimentIds forbidden on anonymous logger");
        }
        if (r0 != 0) {
            if (this.m == null) {
                this.m = new ArrayList();
            }
            for (int valueOf : iArr) {
                this.m.add(Integer.valueOf(valueOf));
            }
        }
    }
}
