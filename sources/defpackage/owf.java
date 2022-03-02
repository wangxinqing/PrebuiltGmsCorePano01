package defpackage;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.CRC32;

/* renamed from: owf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owf implements owg {
    public final owe a;
    public final qwq b;
    private final Context c;
    private final orf d;
    private final ppp e;
    private final ozi f;
    private final ozb g;
    private final NativeIndex h;
    private final oyq i;
    private final AtomicBoolean j = new AtomicBoolean(false);

    public owf(Context context, orf orf, ppp ppp, owe owe, ozi ozi, ozb ozb, NativeIndex nativeIndex, oyq oyq) {
        this.c = context;
        this.d = orf;
        this.e = ppp;
        this.a = owe;
        this.f = ozi;
        this.g = ozb;
        this.h = nativeIndex;
        this.i = oyq;
        this.b = qwq.a(context);
    }

    public final void a() {
        try {
            owe owe = this.a;
            if (owe.i != null) {
                synchronized (owe.g) {
                    if (owe.i != null) {
                        Iterator it = owe.a().iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (str.compareTo(owe.i) > 0) {
                                break;
                            }
                            File file = new File(owe.a, str);
                            if (!file.delete()) {
                                oso.e("Failed to delete file %s", (Object) file);
                                owe.a(aonh.SHARD_DELETE_FAILED);
                                z = true;
                            }
                        }
                        owe.i = null;
                        if (z) {
                            throw new IOException("failed to delete some shards");
                        }
                    }
                }
            }
        } catch (IOException e2) {
            oso.a((Throwable) e2, "Failed to prune from request queue");
        }
    }

    public final void b() {
        this.e.d(new pak(this.c, this, this.d, this.f, this.g, this.i, this.h, this.j));
    }

    public final void a(ora ora) {
        boolean z;
        owe owe = this.a;
        byte[] k = ora.k();
        CRC32 crc32 = new CRC32();
        crc32.update(k);
        long value = crc32.getValue();
        synchronized (owe.d) {
            if (owe.f == null) {
                String format = String.format(Locale.ROOT, "%016x", new Object[]{Long.valueOf(owe.e)});
                owe.e++;
                owe.j = format;
                owe.f = new owd(new File(owe.a, format));
                owe.f.b.e(1);
            }
            owe.f.b.c(value);
            owe.f.b.c(k);
            owe.f.b.c();
            owe.f.a.flush();
            owd owd = owe.f;
            int i2 = owd.c + 1;
            owd.c = i2;
            if (((long) i2) >= owe.c.a) {
                owd.close();
                owe.f = null;
                owe.j = null;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            synchronized (owe.k) {
                aucd aucd = owe.k;
                int i3 = ((aokz) aucd.b).c + 1;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                aokz aokz = (aokz) aucd.b;
                aokz aokz2 = aokz.f;
                aokz.a |= 1;
                aokz.c = i3;
            }
        }
        if (this.j.compareAndSet(false, true)) {
            aoiz a2 = pxm.a(this.c);
            aucd aucd2 = (aucd) a2.c(5);
            aucd2.a((aucj) a2);
            if (((aoiz) aucd2.b).g) {
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                aoiz aoiz = (aoiz) aucd2.b;
                aoiz aoiz2 = aoiz.h;
                aoiz.b = aolj.a(9);
                aoiz.a |= 1;
                this.i.a((aoiz) aucd2.i());
            }
            if (axsj.a.a().g()) {
                b();
                return;
            }
            qwq qwq = this.b;
            qxf qxf = new qxf();
            qxf.i = "com.google.android.gms.icing.service.IcingGcmTaskService";
            qxf.k = "drain-request-queue";
            qxf.b(0);
            qxf.a(axsm.a.a().e(), axsm.a.a().d());
            qxf.a(false);
            qxf.a(0, axcc.b() ? 1 : 0);
            qxf.a(2);
            qwq.a((qxx) qxf.b());
        }
    }
}
