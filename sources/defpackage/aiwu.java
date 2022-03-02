package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;

/* renamed from: aiwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiwu implements ajaa {
    public final Context a;
    public final ExecutorService b = qvj.b.b(2);
    private final aicn c;
    private final int d;

    public aiwu(Context context, aicn aicn, int i) {
        this.a = context;
        this.c = aicn;
        this.d = i;
    }

    public static File a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return new File(cacheDir, "nlp_s");
        }
        return null;
    }

    public static File b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return new File(filesDir, "nlp_ioh");
        }
        return null;
    }

    public final File c() {
        a(aico.NLP_PARAMS_STATE_DIR);
        return this.a.getFilesDir();
    }

    public final File d() {
        return a(this.a);
    }

    public final File e() {
        return b(this.a);
    }

    public final ExecutorService f() {
        return this.b;
    }

    public final int g() {
        return this.d;
    }

    public final File h() {
        a(aico.COLLECTOR_STATE_DIR);
        return this.a.getFilesDir();
    }

    public final File i() {
        a(aico.COLLECTION_POLICY_STATE_DIR);
        return this.a.getFilesDir();
    }

    private final void a(aico aico) {
        this.c.a(aico);
    }

    public final File b() {
        a(aico.PERSISTENT_STATE_DIR);
        return this.a.getCacheDir();
    }

    public final File a() {
        a(aico.SEEN_DEVICES_DIR);
        return this.a.getCacheDir();
    }

    public final InputStream a(String str) {
        try {
            return this.a.getAssets().openFd(str.length() == 0 ? new String("location/") : "location/".concat(str)).createInputStream();
        } catch (IOException e) {
            if (str.length() == 0) {
                new String("Could not load asset: ");
                return null;
            }
            "Could not load asset: ".concat(str);
            return null;
        }
    }

    public final ByteBuffer a(ahna ahna) {
        Context context = this.a;
        String valueOf = String.valueOf(ahna.u);
        return ajrd.a(context, valueOf.length() == 0 ? new String("location/") : "location/".concat(valueOf), ahna.s, ahna.t);
    }
}
