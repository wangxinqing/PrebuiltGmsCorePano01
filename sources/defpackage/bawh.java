package defpackage;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* renamed from: bawh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bawh extends ExperimentalUrlRequest.Builder {
    private static final String a = bawh.class.getSimpleName();
    private final baul b;
    private final String c;
    private final UrlRequest.Callback d;
    private final Executor e;
    private String f;
    private final ArrayList g = new ArrayList();
    private Collection h;
    private UploadDataProvider i;
    private Executor j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private int o;

    public bawh(String str, UrlRequest.Callback callback, Executor executor, baul baul) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        } else if (callback == null) {
            throw new NullPointerException("Callback is required.");
        } else if (executor != null) {
            this.c = str;
            this.d = callback;
            this.e = executor;
            this.b = baul;
        } else {
            throw new NullPointerException("Executor is required.");
        }
    }

    /* renamed from: a */
    public final bawg build() {
        bawg a2 = this.b.a(this.c, this.d, this.e, this.k, this.l, this.m, this.n, this.o);
        String str = this.f;
        if (str != null) {
            a2.a(str);
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList.get(i2);
            a2.a((String) pair.first, (String) pair.second);
        }
        UploadDataProvider uploadDataProvider = this.i;
        if (uploadDataProvider != null) {
            a2.a(uploadDataProvider, this.j);
        }
        return a2;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    public final void b() {
        this.k = true;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder disableConnectionMigration() {
        return this;
    }

    public final ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        if (str != null) {
            this.f = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        return this;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsTag(int i2) {
        this.l = true;
        this.m = i2;
        return this;
    }

    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setTrafficStatsUid(int i2) {
        this.n = true;
        this.o = i2;
        return this;
    }

    public final void a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        } else if ("Accept-Encoding".equalsIgnoreCase(str)) {
            Log.w(a, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
        } else {
            this.g.add(Pair.create(str, str2));
        }
    }

    public final void a(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        } else if (executor != null) {
            if (this.f == null) {
                this.f = "POST";
            }
            this.i = uploadDataProvider;
            this.j = executor;
        } else {
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
    }
}
