package defpackage;

import android.net.Uri;
import java.net.URI;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: hjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjj extends hjg {
    private static final hmf e;

    public hjj() {
        super(true, 2, (auef) hmj.m.c(7), (auef) aqpe.f.c(7));
    }

    protected static final String a(hmj hmj) {
        return hjl.a(e, hmj.c, hmj.d, hmj.e, hmj.f, hmj.b);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx b(audx audx, amri amri) {
        aqpe aqpe = (aqpe) audx;
        try {
            hiv hiv = (hiv) amri.b();
            hme hme = aqpe.d;
            if (hme == null) {
                hme = hme.d;
            }
            return (hmj) aucj.a((aucj) hmj.m, hiv.a(hme), aubs.c());
        } catch (auda e2) {
            throw new hjm(769, "Invalid proto bytes.", e2);
        } catch (hiu e3) {
            throw new hjm(hjn.a(e3), "Unable to decrypt the data.", e3);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx c(audx audx) {
        hmj hmj = (hmj) audx;
        aucd aucd = (aucd) hmj.c(5);
        aucd.a((aucj) hmj);
        Uri parse = Uri.parse(((hmj) aucd.b).c);
        String a = hiq.a(((hmj) aucd.b).c);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        hmj hmj2 = (hmj) aucd.b;
        hmj hmj3 = hmj.m;
        a.getClass();
        hmj2.a |= 4;
        hmj2.c = a;
        String uri = parse.buildUpon().path("/").clearQuery().fragment("").build().toString();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        hmj hmj4 = (hmj) aucd.b;
        uri.getClass();
        hmj4.a |= 2;
        hmj4.b = uri;
        return (hmj) aucd.i();
    }

    public final /* bridge */ /* synthetic */ anax d(audx audx) {
        hmj hmj = (hmj) audx;
        HashSet hashSet = new HashSet();
        hashSet.add(a(hmj));
        if (hiq.b(hmj.c)) {
            URI create = URI.create(hmj.c);
            aucd aucd = (aucd) hmj.c(5);
            aucd.a((aucj) hmj);
            String scheme = create.getScheme();
            String authority = create.getAuthority();
            StringBuilder sb = new StringBuilder(String.valueOf(scheme).length() + 3 + String.valueOf(authority).length());
            sb.append(scheme);
            sb.append("://");
            sb.append(authority);
            String sb2 = sb.toString();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hmj hmj2 = (hmj) aucd.b;
            hmj hmj3 = hmj.m;
            sb2.getClass();
            hmj2.a |= 4;
            hmj2.c = sb2;
            String scheme2 = create.getScheme();
            String authority2 = create.getAuthority();
            StringBuilder sb3 = new StringBuilder(String.valueOf(scheme2).length() + 3 + String.valueOf(authority2).length());
            sb3.append(scheme2);
            sb3.append("://");
            sb3.append(authority2);
            String sb4 = sb3.toString();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hmj hmj4 = (hmj) aucd.b;
            sb4.getClass();
            hmj4.a |= 2;
            hmj4.b = sb4;
            hashSet.add(a((hmj) aucd.i()));
            aucd aucd2 = (aucd) hmj.c(5);
            aucd2.a((aucj) hmj);
            String scheme3 = create.getScheme();
            String authority3 = create.getAuthority();
            StringBuilder sb5 = new StringBuilder(String.valueOf(scheme3).length() + 4 + String.valueOf(authority3).length());
            sb5.append(scheme3);
            sb5.append("://");
            sb5.append(authority3);
            sb5.append("/");
            String sb6 = sb5.toString();
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            hmj hmj5 = (hmj) aucd2.b;
            sb6.getClass();
            hmj5.a |= 4;
            hmj5.c = sb6;
            String scheme4 = create.getScheme();
            String authority4 = create.getAuthority();
            StringBuilder sb7 = new StringBuilder(String.valueOf(scheme4).length() + 3 + String.valueOf(authority4).length());
            sb7.append(scheme4);
            sb7.append("://");
            sb7.append(authority4);
            String sb8 = sb7.toString();
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            hmj hmj6 = (hmj) aucd2.b;
            sb8.getClass();
            hmj6.a |= 2;
            hmj6.b = sb8;
            hashSet.add(a((hmj) aucd2.i()));
            aucd aucd3 = (aucd) hmj.c(5);
            aucd3.a((aucj) hmj);
            String scheme5 = create.getScheme();
            String authority5 = create.getAuthority();
            StringBuilder sb9 = new StringBuilder(String.valueOf(scheme5).length() + 3 + String.valueOf(authority5).length());
            sb9.append(scheme5);
            sb9.append("://");
            sb9.append(authority5);
            String sb10 = sb9.toString();
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            hmj hmj7 = (hmj) aucd3.b;
            sb10.getClass();
            hmj7.a |= 4;
            hmj7.c = sb10;
            String scheme6 = create.getScheme();
            String authority6 = create.getAuthority();
            StringBuilder sb11 = new StringBuilder(String.valueOf(scheme6).length() + 4 + String.valueOf(authority6).length());
            sb11.append(scheme6);
            sb11.append("://");
            sb11.append(authority6);
            sb11.append("/");
            String sb12 = sb11.toString();
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            hmj hmj8 = (hmj) aucd3.b;
            sb12.getClass();
            hmj8.a |= 2;
            hmj8.b = sb12;
            hashSet.add(a((hmj) aucd3.i()));
        }
        return anax.a((Collection) hashSet);
    }

    public final /* bridge */ /* synthetic */ void e(audx audx) {
        hmj hmj = (hmj) audx;
        if (!hmj.i || hmj.e.isEmpty()) {
            a("origin", hmj.c);
            a("signon_realm", hmj.b);
            return;
        }
        throw new hji("username_value", "should be empty if the password is blacklisted");
    }

    static {
        aucd o = hmf.e.o();
        hmi hmi = hmi.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmf hmf = (hmf) o.b;
        hmi.getClass();
        hmf.b = hmi;
        hmf.a |= 2;
        e = (hmf) o.i();
    }

    private static void a(String str, String str2) {
        if (!amrk.a(str2)) {
            try {
                URI create = URI.create(str2);
                if (hiq.b(str2)) {
                    String authority = create.getAuthority();
                    if (authority == null || !authority.matches(".+@.+")) {
                        throw new hji(str, String.format(Locale.US, "invalid Android URI \"%s\"", new Object[]{str2}));
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw new hji(str, String.format(Locale.US, "invalid URI \"%s\"", new Object[]{str2}));
            }
        } else {
            throw new hji(str, "cannot be empty");
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx a(audx audx, amri amri) {
        hmj hmj = (hmj) audx;
        aucd o = aqpe.f.o();
        aucd o2 = aqpf.b.o();
        String str = hmj.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        str.getClass();
        ((aqpf) o2.b).a = str;
        aqpf aqpf = (aqpf) o2.i();
        String a = a(hmj);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqpe aqpe = (aqpe) o.b;
        a.getClass();
        aqpe.b = a;
        aqpf.getClass();
        aqpe.e = aqpf;
        try {
            hme a2 = ((hiv) amri.b()).a(hmj.k());
            if (o.c) {
                o.c();
                o.c = false;
            }
            a2.getClass();
            ((aqpe) o.b).d = a2;
            return (aqpe) o.i();
        } catch (hiu e2) {
            throw new hjm(hjn.a(e2), "Unable to encrypt the data.", e2);
        }
    }

    public final /* bridge */ /* synthetic */ hjc b(audx audx) {
        hmj hmj = (hmj) audx;
        return new hjd(a(hmj), hmj);
    }

    public final /* bridge */ /* synthetic */ String a(audx audx) {
        return a((hmj) audx);
    }
}
