package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* renamed from: bacr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bacr extends bacz {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);
    @Deprecated
    static final azxg b = azxg.a("cronet-annotation");
    static final azxg c = azxg.a("cronet-annotations");
    private static volatile boolean t;
    private static volatile Method u;
    public final String d;
    public final String e;
    public final balm f;
    public final Executor g;
    public final baaf h;
    public final bacu i;
    public final Runnable j;
    public BidirectionalStream k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public final bacq o;
    public back p;
    private final bacp v = new bacp(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bacr(String str, String str2, Executor executor, baaf baaf, bacu bacu, Runnable runnable, Object obj, baaj baaj, balm balm, azxh azxh, balu balu) {
        super(new bacw(), balm, balu, baaf, azxh);
        String str3 = str;
        String str4 = str2;
        Executor executor2 = executor;
        baaf baaf2 = baaf;
        bacu bacu2 = bacu;
        Runnable runnable2 = runnable;
        balm balm2 = balm;
        azxh azxh2 = azxh;
        amrl.a((Object) str3, (Object) "url");
        this.d = str3;
        amrl.a((Object) str4, (Object) "userAgent");
        this.e = str4;
        amrl.a((Object) balm2, (Object) "statsTraceCtx");
        this.f = balm2;
        amrl.a((Object) executor2, (Object) "executor");
        this.g = executor2;
        amrl.a((Object) baaf2, (Object) "headers");
        this.h = baaf2;
        amrl.a((Object) bacu2, (Object) "transport");
        this.i = bacu2;
        amrl.a((Object) runnable2, (Object) "startCallback");
        this.j = runnable2;
        this.l = baaj.a == baai.UNARY;
        this.m = azxh2.a(b);
        this.n = (Collection) azxh2.a(c);
        this.o = new bacq(this, balm2, obj, balu);
    }

    /* JADX INFO: finally extract failed */
    public static void a(ExperimentalBidirectionalStream.Builder builder, Object obj) {
        if (!t) {
            synchronized (bacr.class) {
                if (!t) {
                    try {
                        u = ExperimentalBidirectionalStream.Builder.class.getMethod("addRequestAnnotation", new Class[]{Object.class});
                        t = true;
                    } catch (NoSuchMethodException e2) {
                        try {
                            Log.w("grpc-java-cronet", "Failed to load method ExperimentalBidirectionalStream.Builder.addRequestAnnotation", e2);
                            t = true;
                        } catch (Throwable th) {
                            t = true;
                            throw th;
                        }
                    }
                }
            }
        }
        if (u != null) {
            try {
                u.invoke(builder, new Object[]{obj});
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause() != null ? e3.getCause() : e3.getTargetException());
            } catch (IllegalAccessException e4) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Failed to add request annotation: ");
                sb.append(valueOf);
                Log.w("grpc-java-cronet", sb.toString(), e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ bacx b() {
        return this.v;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ bade c() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ bade d() {
        return this.o;
    }

    public final azxa a() {
        return azxa.b;
    }

    public final void a(babj babj) {
        this.i.a(this, babj);
    }

    public final void a(ByteBuffer byteBuffer, boolean z, boolean z2) {
        BidirectionalStream bidirectionalStream = this.k;
        if (bidirectionalStream != null) {
            bidirectionalStream.write(byteBuffer, z);
            if (z2) {
                this.k.flush();
            }
        }
    }
}
