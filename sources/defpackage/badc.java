package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: badc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class badc extends azzt {
    static final long a = TimeUnit.MINUTES.toMillis(30);
    public static final long b = TimeUnit.SECONDS.toMillis(1);
    private static final Logger o = Logger.getLogger(badc.class.getName());
    private static final bajz p = ball.a(bagt.l);
    private static final azyi q = azyi.b;
    private static final azxy r = azxy.a;
    bajz c;
    final bajz d;
    final baax e;
    public baan f;
    final String g;
    public String h;
    final String i;
    final azyi j;
    final azxy k;
    public long l;
    final azyv m;
    protected final balt n;
    private final List s = new ArrayList();

    protected badc(String str) {
        bajz bajz = p;
        this.c = bajz;
        this.d = bajz;
        baax a2 = baax.a();
        this.e = a2;
        this.f = a2.a;
        this.i = "pick_first";
        this.j = q;
        this.k = r;
        this.l = a;
        this.m = azyv.b;
        this.n = balu.a;
        amrl.a((Object) str, (Object) "target");
        this.g = str;
    }

    static String a(SocketAddress socketAddress) {
        try {
            String valueOf = String.valueOf(socketAddress);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
            sb.append("/");
            sb.append(valueOf);
            return new URI("directaddress", "", sb.toString(), (String) null).toString();
        } catch (URISyntaxException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract baek a();

    public final azzs b() {
        azxm azxm;
        baek a2 = a();
        ball a3 = ball.a(bagt.l);
        amsv amsv = bagt.n;
        ArrayList arrayList = new ArrayList(this.s);
        azxm azxm2 = null;
        try {
            azxm = (azxm) Class.forName("bach").getDeclaredMethod("getClientInterceptor", new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}).invoke((Object) null, new Object[]{true, true, false});
        } catch (ClassNotFoundException e2) {
            o.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", e2);
            azxm = null;
        } catch (NoSuchMethodException e3) {
            o.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", e3);
            azxm = null;
        } catch (IllegalAccessException e4) {
            o.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", e4);
            azxm = null;
        } catch (InvocationTargetException e5) {
            o.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", e5);
            azxm = null;
        }
        if (azxm != null) {
            arrayList.add(0, azxm);
        }
        try {
            azxm2 = (azxm) Class.forName("baci").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ClassNotFoundException e6) {
            o.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", e6);
        } catch (NoSuchMethodException e7) {
            o.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", e7);
        } catch (IllegalAccessException e8) {
            o.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", e8);
        } catch (InvocationTargetException e9) {
            o.logp(Level.FINE, "io.grpc.internal.AbstractManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", e9);
        }
        if (azxm2 != null) {
            arrayList.add(0, azxm2);
        }
        return new bajk(new baji(this, a2, a3, amsv, arrayList, balq.a));
    }

    /* access modifiers changed from: protected */
    public int c() {
        return 443;
    }

    public final void a(Executor executor) {
        if (executor != null) {
            this.c = new bagg(executor);
        } else {
            this.c = p;
        }
    }

    protected badc(SocketAddress socketAddress, String str) {
        bajz bajz = p;
        this.c = bajz;
        this.d = bajz;
        baax a2 = baax.a();
        this.e = a2;
        this.f = a2.a;
        this.i = "pick_first";
        this.j = q;
        this.k = r;
        this.l = a;
        this.m = azyv.b;
        this.n = balu.a;
        this.g = a(socketAddress);
        this.f = new badb(socketAddress, str);
    }
}
