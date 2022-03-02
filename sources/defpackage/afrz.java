package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: afrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afrz {
    final HashMap a = new HashMap();
    private final Context b;
    private final amsv c;
    private final agzs d;
    private final afsz e;
    private final amri f;
    private final Executor g;

    public afrz(Context context, amsv amsv, agzs agzs, afsz afsz, amri amri, Executor executor) {
        this.b = context;
        this.c = amsv;
        this.d = agzs;
        this.e = afsz;
        this.f = amri;
        this.g = executor;
    }

    public final aorr a(aflf aflf, int i, Uri uri, String str, int i2, aflb aflb, afry afry, int i3, List list) {
        aorr aorr;
        long j;
        int a2;
        aflf aflf2 = aflf;
        Uri uri2 = uri;
        String str2 = str;
        aflb aflb2 = aflb;
        afry afry2 = afry;
        int i4 = i3;
        if (this.a.containsKey(uri2)) {
            return (aorr) this.a.get(uri2);
        }
        if (!axss.a.a().d() || str2.startsWith("https")) {
            try {
                j = this.d.e(uri2);
            } catch (IOException e2) {
                j = 0;
            }
            if (axss.a.a().f()) {
                StatFs statFs = new StatFs(this.b.getFilesDir().getAbsolutePath());
                int blockCount = statFs.getBlockCount();
                int blockSize = statFs.getBlockSize();
                double availableBlocks = (double) ((((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) - (((long) i2) - j));
                double d2 = (double) (((long) blockCount) * ((long) blockSize));
                double c2 = axss.c();
                Double.isNaN(d2);
                double min = Math.min(c2 * d2, (double) axss.a.a().a());
                if (aflb2 != null) {
                    int a3 = afla.a(aflb2.b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i5 = a3 - 1;
                    if (i5 == 1) {
                        double c3 = axss.c();
                        Double.isNaN(d2);
                        min = Math.min(d2 * c3, (double) axss.a.a().c());
                    } else if (i5 == 2) {
                        double c4 = axss.c();
                        Double.isNaN(d2);
                        min = Math.min(d2 * c4, (double) axss.a.a().b());
                    }
                }
                if (availableBlocks <= min) {
                    afsh.a("%s: Not enough space to download file %s", (Object) "MddFileDownloader", (Object) str2);
                    afkd a4 = afkf.a();
                    a4.a = afke.LOW_DISK_ERROR;
                    aorr = aorl.a((Throwable) a4.a());
                }
            }
            afsz afsz = this.e;
            String str3 = aflf2.c;
            String str4 = aflf2.b;
            synchronized (afsz.class) {
                afsz.c.put(uri2, afsz.a(str3, str4, i));
            }
            if (this.f.a()) {
                afsx afsx = (afsx) this.f.b();
                String str5 = aflf2.b;
                synchronized (afsx.class) {
                    afsx.c.put(uri2, str5);
                }
            }
            afmu afmu = new afmu();
            afmu.a(-1);
            afmu.a(amzy.h());
            afmu.a = uri2;
            if (str2 != null) {
                afmu.b = str2;
                if (aflb2 == null || (a2 = afky.a(aflb2.c)) == 0 || a2 != 2) {
                    afmu.a(afmt.a);
                } else {
                    afmu.a(afmt.b);
                }
                if (i4 > 0) {
                    afmu.a(i4);
                }
                amzt j2 = amzy.j();
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    aflc aflc = (aflc) list.get(i6);
                    j2.c(Pair.create(aflc.a, aflc.b));
                }
                afmu.a(j2.a());
                afmw afmw = (afmw) this.c.a();
                String str6 = afmu.a == null ? " fileUri" : "";
                if (afmu.b == null) {
                    str6 = str6.concat(" urlToDownload");
                }
                if (afmu.c == null) {
                    str6 = String.valueOf(str6).concat(" downloadConstraints");
                }
                if (afmu.d == null) {
                    str6 = String.valueOf(str6).concat(" trafficTag");
                }
                if (afmu.e == null) {
                    str6 = String.valueOf(str6).concat(" extraHttpHeaders");
                }
                if (!str6.isEmpty()) {
                    String valueOf = String.valueOf(str6);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                }
                aorr = afmw.a(new afmq(afmu.a, afmu.b, afmu.c, afmu.d.intValue(), afmu.e));
            } else {
                throw new NullPointerException("Null urlToDownload");
            }
        } else {
            afsh.a("%s: File url = %s is not secure", (Object) "MddFileDownloader", (Object) str2);
            afkd a5 = afkf.a();
            a5.a = afke.INSECURE_URL_ERROR;
            aorr = aorl.a((Throwable) a5.a());
        }
        aorr a6 = aooz.a(aopr.a((aorr) aoqw.c(aorr), (aoqb) new afrv(afry2, uri2), this.g), afkf.class, (aoqb) new afrw(afry2), this.g);
        this.a.put(uri2, a6);
        ((aoqw) a6).a((Runnable) new afrx(this, uri2), this.g);
        return a6;
    }

    public final void a(Uri uri) {
        aorr aorr = (aorr) this.a.get(uri);
        if (aorr != null) {
            this.a.remove(uri);
            aorr.cancel(true);
        } else if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", afsh.a("%s: stopDownloading on non-existent download", "MddFileDownloader"));
        }
    }
}
