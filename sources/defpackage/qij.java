package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: qij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qij {
    public static final qfn a = new qfn("InstantAppsMetadataMethods");
    static final int b = jhg.a;
    public final Context c;
    public final qhj d;
    public final qiz e;
    public final qfl f;
    private final File g;

    public qij(Context context, qhj qhj, qiz qiz, qfl qfl, File file) {
        this.c = context;
        this.d = qhj;
        this.e = qiz;
        this.f = qfl;
        this.g = file;
    }

    public final int a() {
        return Settings.Global.getInt(this.c.getContentResolver(), "ephemeral_cookie_max_size_bytes", 16384);
    }

    public final File a(String str) {
        if (this.g.exists() && !this.g.isDirectory() && !this.g.delete()) {
            a.b("Unable to delete non-directory %s", this.g);
            return null;
        } else if (this.g.exists() || this.g.mkdirs()) {
            return new File(this.g, str);
        } else {
            a.b("Unable to mkdirs for %s", this.g);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(qfc qfc, String str) {
        if (qfc.a == b || this.f.a(qfc.a) || TextUtils.equals(qfc.b.packageName, str)) {
            return true;
        }
        if (qfc.c) {
            return false;
        }
        try {
            ApplicationInfo a2 = this.d.a(str, 128);
            if (a2 == null || a2.uid == 0 || this.e.h(str) == null) {
                return false;
            }
            return true;
        } catch (IOException e2) {
            a.a(e2, "Exception checking application info", new Object[0]);
            return false;
        }
    }
}
