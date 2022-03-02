package com.google.android.gms.platformconfigurator;

import android.content.Intent;
import android.net.Uri;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PackageUpdateIntentOperation extends hed {
    public PackageUpdateIntentOperation() {
        super(false);
    }

    private static amzy a() {
        amzt amzt = new amzt();
        amzt.b((Iterable) azdd.j().a);
        if (azdd.d()) {
            amzt.b((Iterable) azdd.i().a);
        }
        return amzt.a();
    }

    static final amzy f(String str) {
        if (str.isEmpty()) {
            return amzy.h();
        }
        amzt amzt = new amzt();
        anhk i = a().listIterator();
        while (i.hasNext()) {
            String str2 = (String) i.next();
            if (str.equals(yke.b(str2))) {
                amzt.c(yke.a(str2));
            }
        }
        return amzt.a();
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        anhk i = f(str).listIterator();
        while (i.hasNext()) {
            yke.a((String) i.next(), str, this);
        }
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if (azdd.c() && azdd.e() && ykh.a() && !amrk.a(str)) {
            anhk i = a().listIterator();
            while (i.hasNext()) {
                if (str.equals(yke.b((String) i.next()))) {
                    super.onHandleIntent(intent);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        anhk i = f(str).listIterator();
        while (i.hasNext()) {
            yke.a((String) i.next(), str, this);
        }
    }
}
