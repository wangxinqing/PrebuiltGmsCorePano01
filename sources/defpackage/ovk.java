package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;

/* renamed from: ovk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ovk {
    public final File a;
    public final long b;
    private final Context c;
    private long d = 0;
    private long e = 0;
    private long f = 0;
    private boolean g = false;

    public ovk(Context context, File file, String str) {
        if (file != null) {
            File a2 = a(file);
            if (!a2.exists()) {
                if (!a2.mkdirs()) {
                    throw new IOException("The index path could not be created");
                }
            } else if (!a2.isDirectory()) {
                throw new IOException("The index path is not a directory");
            }
            this.c = context;
            File file2 = new File(a2, str);
            this.a = file2;
            if (file2.exists() || this.a.mkdirs()) {
                long totalSpace = this.a.getTotalSpace();
                this.b = totalSpace;
                if (totalSpace == 0) {
                    oso.b("There is no storage capacity, icing will not index");
                }
                oso.d("Storage manager: low %s usage %s avail %s capacity %s", Boolean.valueOf(a()), plc.a(f()), plc.a(e()), plc.a(this.b));
                return;
            }
            String valueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Cannot create directory ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
        throw new NullPointerException("Index file directory must be set");
    }

    public static File a(File file) {
        return new File(file, "AppDataSearch");
    }

    private static long b(File file) {
        long j = 0;
        if (file == null) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File b2 : listFiles) {
                j += b(b2);
            }
        }
        return j;
    }

    private final void g() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.d >= 10000) {
            this.d = elapsedRealtime;
            this.e = f();
            boolean a2 = a();
            this.g = a2;
            if (!a2) {
                long longValue = ((Long) ozx.h.c()).longValue();
                long longValue2 = ((Long) ozx.i.c()).longValue();
                long e2 = e() + this.e;
                this.f = Math.min(Long.MAX_VALUE, Math.max((Math.max(e2 - longValue, e2 - ((this.b * longValue2) / 100)) - 20971520) / 2, 0));
                return;
            }
            this.f = 0;
        }
    }

    public final long c() {
        g();
        return this.e;
    }

    public final long d() {
        g();
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final long e() {
        return this.a.getUsableSpace();
    }

    public final long f() {
        return b(this.a);
    }

    public static String a(int i) {
        try {
            return ovj.a[aolr.a(i)];
        } catch (IndexOutOfBoundsException e2) {
            return "unknown";
        }
    }

    public static final boolean a(ove ove) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < ove.a.size(); i++) {
            ovd ovd = (ovd) ove.a.get(i);
            j += ovd.d;
            j2 += ovd.e;
        }
        long j3 = j + j2;
        if (j3 != 0) {
            double d2 = (double) j2;
            double d3 = (double) j3;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double longValue = (double) ((Long) ozx.j.c()).longValue();
            Double.isNaN(longValue);
            if (d2 / d3 >= Math.min(1.0d, longValue / 100.0d)) {
                return true;
            }
        }
        return false;
    }

    public final double b() {
        g();
        long j = this.e;
        long j2 = this.f;
        if (j >= j2) {
            return 0.0d;
        }
        double d2 = (double) (j2 - j);
        double d3 = (double) j2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return d2 / d3;
    }

    public final int a(double d2) {
        if (d2 > 0.05d) {
            g();
            if (this.e < this.f) {
                return 2;
            }
            g();
            if (!this.g) {
                oso.c("Not enough disk space for indexing trimmable");
                return 3;
            }
            oso.b("Not enough disk space for indexing");
            return 4;
        }
        oso.c("Design limits for indexing reached");
        return 5;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return oyo.a(this.c);
    }
}
