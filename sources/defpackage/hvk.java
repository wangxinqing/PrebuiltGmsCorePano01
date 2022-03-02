package defpackage;

import android.content.Context;
import java.util.Arrays;

/* renamed from: hvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hvk implements hvh {
    protected static volatile hvk a;
    private static final Object d = new Object();
    private static int e = 0;
    public volatile hvj b;
    public volatile hvj c;
    private final Context f = ihs.b();
    private final ahei g;

    private hvk() {
        ahej ahej = new ahej();
        ahej.a(ahfi.a);
        ahej.a = aoqm.a;
        ahej.b = new agzs(Arrays.asList(new ahcn[]{new aham()}));
        this.g = ahej.a();
        d();
    }

    public static hvk c() {
        hvk hvk;
        synchronized (d) {
            e++;
            if (a == null) {
                a = new hvk();
            }
            hvk = a;
        }
        return hvk;
    }

    public final hvg a() {
        hvj hvj;
        boolean a2 = aekv.a(this.f);
        d();
        if (!a2) {
            hvj = this.c;
        } else if (this.b == null) {
            return null;
        } else {
            hvj = this.b;
        }
        return hvj.b;
    }

    public final amzy b() {
        d();
        amzt j = amzy.j();
        if (this.b != null) {
            j.b((Iterable) this.b.a());
        }
        if (this.c != null) {
            j.b((Iterable) this.c.a());
        }
        return j.a();
    }

    public final void close() {
        synchronized (d) {
            if (e > 0) {
                e--;
            }
            if (e == 0) {
                if (this.b != null) {
                    this.b.b();
                }
                this.b = null;
                if (this.c != null) {
                    this.c.b();
                }
                this.c = null;
                a = null;
            }
        }
    }

    public final void d() {
        synchronized (d) {
            if (aekv.a()) {
                if (this.b == null) {
                    Context createDeviceProtectedStorageContext = this.f.createDeviceProtectedStorageContext();
                    if (!awtf.b()) {
                        hvn hvn = new hvn(createDeviceProtectedStorageContext, this.g);
                        this.b = new hvj(createDeviceProtectedStorageContext, hvn, new hvs(hvn, awtf.e(), this.g, createDeviceProtectedStorageContext), new huv(createDeviceProtectedStorageContext, this.g));
                    } else {
                        createDeviceProtectedStorageContext.deleteDatabase("playlog.db");
                        this.b = new hvj(createDeviceProtectedStorageContext, (hvn) null, (hvs) null, new huv(createDeviceProtectedStorageContext, this.g));
                    }
                }
            }
            if (!aekv.a(this.f) && this.c == null) {
                if (!awtf.b()) {
                    hvn hvn2 = new hvn(this.f, this.g);
                    this.c = new hvj(this.f, hvn2, new hvs(hvn2, awtf.e(), this.g, this.f), new huv(this.f, this.g));
                } else {
                    this.f.deleteDatabase("playlog.db");
                    Context context = this.f;
                    this.c = new hvj(context, (hvn) null, (hvs) null, new huv(context, this.g));
                }
            }
        }
    }
}
