package defpackage;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: akum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akum {
    public final Context a;
    public final akjc b;
    public final ExecutorService c;
    public final akma d;
    public final Handler e;
    public aklf f;
    public final akuo g;

    public akum(Context context, akjc akjc, ExecutorService executorService, Handler handler) {
        this.a = context;
        this.b = akjc;
        this.c = executorService;
        this.e = handler;
        akuj akuj = (akuj) akjc;
        this.g = akuj.h;
        this.d = akuj.d;
    }

    public final File a() {
        return this.a.getDir("place_inference_data_index", 0);
    }
}
