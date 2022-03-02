package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: afqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afqr {
    public final Context a;
    public final afmh b;
    public final afqu c;
    public final afrz d;
    public final agzs e;
    public final amri f;
    public final amri g;
    public final afsb h;
    public final afpi i;
    public final amri j;
    public final Executor k;

    public afqr(Context context, afmh afmh, afqu afqu, agzs agzs, afrz afrz, amri amri, amri amri2, afsb afsb, afpi afpi, amri amri3, Executor executor) {
        this.a = context;
        this.b = afmh;
        this.c = afqu;
        this.e = agzs;
        this.d = afrz;
        this.f = amri;
        this.g = amri2;
        this.h = afsb;
        this.i = afpi;
        this.j = amri3;
        this.k = executor;
    }

    public final aorr a() {
        afst.a(this.a, "gms_icing_mdd_shared_file_manager_metadata", this.j).edit().clear().commit();
        try {
            this.e.h(afsp.a(this.a, this.j));
        } catch (IOException e2) {
            this.b.a("Failure while deleting mdd storage during clear", e2);
        }
        return aorl.a((Object) null);
    }

    public final aorr b(aflh aflh) {
        afli a2 = this.c.a(aflh);
        if (a2 != null) {
            Context context = this.a;
            int a3 = afkq.a(aflh.e);
            if (a3 == 0) {
                a3 = 1;
            }
            return aorl.a((Object) afsp.a(context, a3, a2.b, this.b, this.j));
        }
        afsh.a("%s: getOnDeviceUri called on file that doesn't exists. Key = %s!", (Object) "SharedFileManager", (Object) aflh);
        throw new afqs();
    }

    public final aorr c(aflh aflh) {
        afli a2 = this.c.a(aflh);
        if (a2 != null) {
            afle a3 = afle.a(a2.c);
            if (a3 == null) {
                a3 = afle.NONE;
            }
            if (a3 != afle.DOWNLOAD_COMPLETE) {
                Context context = this.a;
                int a4 = afkq.a(aflh.e);
                if (a4 == 0) {
                    a4 = 1;
                }
                Uri a5 = afsp.a(context, a4, a2.b, this.b, this.j);
                if (a5 != null) {
                    this.d.a(a5);
                }
            }
            return aorl.a((Object) null);
        }
        afsh.a("%s: Unable to read sharedFile from shared preferences.", (Object) "SharedFileManager");
        throw new afqs();
    }

    /* access modifiers changed from: package-private */
    public final aorr a(aflh aflh) {
        afli a2 = this.c.a(aflh);
        if (a2 != null) {
            afle a3 = afle.a(a2.c);
            if (a3 == null) {
                a3 = afle.NONE;
            }
            return aorl.a((Object) a3);
        }
        afsh.a("%s: getFileStatus called on file that doesn't exists! Key = %s", (Object) "SharedFileManager", (Object) aflh);
        throw new afqs();
    }

    public final void a(aflf aflf, Uri uri) {
        if (this.g.a()) {
            try {
                long e2 = this.e.e(uri);
                if (e2 > 0) {
                    ((afsx) this.g.b()).a(aflf.b, e2);
                }
            } catch (IOException e3) {
            }
        }
    }
}
