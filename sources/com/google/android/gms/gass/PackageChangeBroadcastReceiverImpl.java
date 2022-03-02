package com.google.android.gms.gass;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PackageChangeBroadcastReceiverImpl extends nnz {
    /* access modifiers changed from: protected */
    public final int a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final byte[] a(Intent intent, Context context) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
            if (str == null || str.isEmpty()) {
                new Object[1][0] = data;
                return null;
            }
        } else {
            str = null;
        }
        if (!axjp.a.a().b() || intent.getIntExtra("android.content.pm.extra.DATA_LOADER_TYPE", -1) != 2) {
            aucd o = nqg.c.o();
            if (str != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                nqg nqg = (nqg) o.b;
                str.getClass();
                nqg.a |= 1;
                nqg.b = str;
            }
            return ((nqg) o.i()).k();
        }
        new Object[1][0] = data;
        if (axjp.a.a().a()) {
            noa.a(context).a(5013, -1);
        }
        return null;
    }
}
