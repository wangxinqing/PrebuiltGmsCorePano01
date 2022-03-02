package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bacd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bacd extends azxe {
    public static final Logger a;
    private static final bacb e;
    private static final Class f;
    final ammq b;
    public baaf c;
    public Map d;
    private final boolean g;

    static {
        bacb bacb;
        NoSuchMethodException noSuchMethodException;
        Class<bacd> cls = bacd.class;
        a = Logger.getLogger(cls.getName());
        ClassLoader classLoader = cls.getClassLoader();
        Class<? extends U> cls2 = null;
        try {
            try {
                bacb = new bacb(Class.forName("com.google.auth.oauth2.ServiceAccountCredentials", false, classLoader), classLoader);
            } catch (ClassNotFoundException e2) {
                noSuchMethodException = e2;
            } catch (NoSuchMethodException e3) {
                noSuchMethodException = e3;
            }
        } catch (ClassNotFoundException e4) {
            bacb = null;
        }
        e = bacb;
        try {
            cls2 = Class.forName("ammt").asSubclass(ammq.class);
        } catch (ClassNotFoundException e5) {
            a.logp(Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", e5);
        }
        f = cls2;
        a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "createJwtHelperOrNull", "Failed to create JWT helper. This is unexpected", noSuchMethodException);
        bacb = null;
        e = bacb;
        cls2 = Class.forName("ammt").asSubclass(ammq.class);
        f = cls2;
    }

    public bacd(ammq ammq) {
        boolean z;
        InvocationTargetException invocationTargetException;
        bacb bacb = e;
        amrl.a((Object) ammq, (Object) "creds");
        Class cls = f;
        if (cls != null) {
            z = cls.isInstance(ammq);
        } else {
            z = false;
        }
        if (bacb != null && bacb.a.isInstance(ammq)) {
            try {
                ammq ammq2 = (ammq) bacb.a.cast(ammq);
                try {
                    if (((Collection) bacb.d.invoke(ammq2, new Object[0])).size() == 0) {
                        Object invoke = bacb.b.invoke((Object) null, new Object[0]);
                        for (bacc bacc : bacb.e) {
                            bacc.b.invoke(invoke, new Object[]{bacc.a.invoke(ammq2, new Object[0])});
                        }
                        ammq = (ammq) bacb.c.invoke(invoke, new Object[0]);
                    } else {
                        ammq = ammq2;
                    }
                } catch (IllegalAccessException e2) {
                    e = e2;
                    ammq = ammq2;
                    invocationTargetException = e;
                    a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", invocationTargetException);
                    this.g = z;
                    this.b = ammq;
                } catch (InvocationTargetException e3) {
                    invocationTargetException = e3;
                    ammq = ammq2;
                    a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", invocationTargetException);
                    this.g = z;
                    this.b = ammq;
                }
            } catch (IllegalAccessException e4) {
                e = e4;
                invocationTargetException = e;
                a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", invocationTargetException);
                this.g = z;
                this.b = ammq;
            } catch (InvocationTargetException e5) {
                invocationTargetException = e5;
                a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", invocationTargetException);
                this.g = z;
                this.b = ammq;
            }
        }
        this.g = z;
        this.b = ammq;
    }

    private static URI a(String str, baaj baaj) {
        String valueOf = String.valueOf(baaj.c);
        try {
            URI uri = new URI("https", str, valueOf.length() == 0 ? new String("/") : "/".concat(valueOf), (String) null, (String) null);
            return uri.getPort() == 443 ? a(uri) : uri;
        } catch (URISyntaxException e2) {
            throw babj.j.a("Unable to construct service URI for auth").b((Throwable) e2).c();
        }
    }

    private static URI a(URI uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e2) {
            throw babj.j.a("Unable to construct service URI after removing port").b((Throwable) e2).c();
        }
    }

    public final void a(azxc azxc, Executor executor, azxd azxd) {
        babc babc = (babc) amrh.a((babc) azxc.b.a.a().a(bagm.a), babc.NONE);
        if (this.g && babc != babc.PRIVACY_AND_INTEGRITY) {
            babj babj = babj.j;
            String valueOf = String.valueOf(babc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 96);
            sb.append("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ");
            sb.append(valueOf);
            azxd.a(babj.a(sb.toString()));
            return;
        }
        String str = (String) amrh.a((Object) null, azxc.b.b);
        amrl.a((Object) str, (Object) "authority");
        try {
            a(str, azxc.a);
            this.b.a(executor, new baca(this, azxd));
        } catch (babk e2) {
            azxd.a(e2.a);
        }
    }
}
