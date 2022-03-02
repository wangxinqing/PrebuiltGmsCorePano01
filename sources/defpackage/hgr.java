package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: hgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hgr extends bjx {
    private static hgr h;
    public final boolean e;
    public final UserManager f;
    public long g = 0;

    private hgr(Context context) {
        super(context, "shared_module_provider.pb");
        int i = Build.VERSION.SDK_INT;
        this.f = (UserManager) context.getSystemService("user");
        this.e = bmz.a(context);
        this.g = bmz.b(context);
    }

    public static hgr a(Context context) {
        if (h == null) {
            synchronized (hgr.class) {
                if (h == null) {
                    h = new hgr(context);
                }
            }
        }
        return h;
    }

    public final hgv d() {
        FileInputStream fileInputStream;
        File a = bjx.a(this.b, "shared_module_provider.pb");
        if (!a.exists()) {
            return hgv.b;
        }
        try {
            fileInputStream = new FileInputStream(a);
            hgv hgv = (hgv) aucj.a((aucj) hgv.b, (InputStream) fileInputStream, aubs.b());
            fileInputStream.close();
            return hgv;
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("SharedModuleManager", valueOf.length() == 0 ? new String("Error reading user update request map: ") : "Error reading user update request map: ".concat(valueOf));
            return hgv.b;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final hgt a(hgt hgt, long j) {
        hgv hgv;
        int i = Build.VERSION.SDK_INT;
        synchronized (this) {
            hgv d = d();
            if (this.f != null) {
                aucd o = hgv.b.o();
                for (Map.Entry entry : Collections.unmodifiableMap(d.a).entrySet()) {
                    if (this.f.getUserForSerialNumber(((Long) entry.getKey()).longValue()) == null) {
                        long j2 = this.g;
                        StringBuilder sb = new StringBuilder(53);
                        sb.append("Removing record for deleted user ");
                        sb.append(j2);
                        Log.i("SharedModuleManager", sb.toString());
                    } else if (entry.getValue() != null) {
                        o.a(this.g, (hgt) entry.getValue());
                    }
                }
                d = (hgv) o.i();
            }
            aucd aucd = (aucd) d.c(5);
            aucd.a((aucj) d);
            aucd.a(j, hgt);
            hgv = (hgv) aucd.i();
            bkq.a(hgv.k(), bjx.a(this.b, "shared_module_provider.pb.tmp"), bjx.a(this.b, "shared_module_provider.pb"), false);
        }
        ob obVar = new ob();
        ob obVar2 = new ob();
        ob obVar3 = new ob();
        for (Map.Entry entry2 : Collections.unmodifiableMap(hgv.a).entrySet()) {
            if (entry2.getValue() != null) {
                obVar.addAll(((hgt) entry2.getValue()).a);
                obVar2.addAll(((hgt) entry2.getValue()).b);
                obVar3.addAll(((hgt) entry2.getValue()).c);
            }
        }
        aucd o2 = hgt.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        hgt hgt2 = (hgt) o2.b;
        hgt2.a();
        auab.a((Iterable) obVar, (List) hgt2.a);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        hgt hgt3 = (hgt) o2.b;
        hgt3.b();
        auab.a((Iterable) obVar2, (List) hgt3.b);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        hgt hgt4 = (hgt) o2.b;
        hgt4.c();
        auab.a((Iterable) obVar3, (List) hgt4.c);
        return (hgt) o2.i();
    }
}
