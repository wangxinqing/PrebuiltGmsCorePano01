package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: afme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afme implements aflk {
    public final Context a;
    public final afsb b;
    public final afqn c;
    public final agzs d;
    public final Executor e;
    public final amri f;
    private final aoqu g = aoqu.a();

    public afme(Context context, afsb afsb, afqn afqn, Executor executor, agzs agzs, amri amri) {
        new HashMap();
        this.a = context;
        this.b = afsb;
        this.e = executor;
        this.c = afqn;
        this.d = agzs;
        this.f = amri;
    }

    public static afjf a(String str, int i, int i2, String str2) {
        aucd o = afjf.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        afjf afjf = (afjf) o.b;
        str.getClass();
        int i3 = afjf.a | 1;
        afjf.a = i3;
        afjf.b = str;
        int i4 = i3 | 4;
        afjf.a = i4;
        afjf.d = i;
        if (i2 > 0) {
            i4 |= 8;
            afjf.a = i4;
            afjf.e = i2;
        }
        if (str2 != null) {
            str2.getClass();
            afjf.a = i4 | 2;
            afjf.c = str2;
        }
        return (afjf) o.i();
    }

    public final aorr a() {
        aoqu aoqu = this.g;
        afqn afqn = this.c;
        afqn.getClass();
        return aoqu.a(new aflm(afqn), this.e);
    }

    public final aorr a(afjp afjp) {
        return this.g.a(new afll(this, afjp), this.e);
    }

    public final aorr a(afkh afkh) {
        afjs afjs = (afjs) afkh;
        String str = afjs.a;
        aucd o = aflf.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aflf aflf = (aflf) o.b;
        str.getClass();
        aflf.a |= 1;
        aflf.b = str;
        String packageName = this.a.getPackageName();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aflf aflf2 = (aflf) o.b;
        packageName.getClass();
        aflf2.a |= 2;
        aflf2.c = packageName;
        if (afjs.b.a()) {
            String a2 = afmj.a((Account) afjs.b.b());
            if (o.c) {
                o.c();
                o.c = false;
            }
            aflf aflf3 = (aflf) o.b;
            a2.getClass();
            aflf3.a |= 4;
            aflf3.d = a2;
        }
        aorr a3 = aopr.a(aorl.a((aoqa) new afmb(this, afkh, str, (aflf) o.i()), this.e), (amqy) new afmc(this, afkh, str), this.e);
        aorl.a(a3, new afmd(this, afkh, str), this.e);
        return a3;
    }

    public final aorr a(afkj afkj) {
        return this.g.a(new afma(this, afkj), this.e);
    }

    public final aorr a(afkr afkr, String str, int i) {
        if (afkr == null) {
            return aorl.a((Object) null);
        }
        aucd o = afjh.h.o();
        String str2 = afkr.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        afjh afjh = (afjh) o.b;
        str2.getClass();
        int i2 = afjh.a | 1;
        afjh.a = i2;
        afjh.b = str2;
        String str3 = afkr.d;
        str3.getClass();
        int i3 = i2 | 2;
        afjh.a = i3;
        afjh.c = str3;
        int i4 = afkr.e;
        int i5 = i3 | 8;
        afjh.a = i5;
        afjh.e = i4;
        afjh.f = i - 1;
        int i6 = i5 | 16;
        afjh.a = i6;
        if (str != null) {
            str.getClass();
            afjh.a = i6 | 4;
            afjh.d = str;
        }
        aorr a2 = aorl.a((Object) o);
        aucx aucx = afkr.j;
        int size = aucx.size();
        for (int i7 = 0; i7 < size; i7++) {
            a2 = aopr.a(a2, (aoqb) new aflx(this, i, (afkn) aucx.get(i7), afkr), this.e);
        }
        return aooz.a(aopr.a((aorr) aoqw.c(a2), afly.a, this.e), afkf.class, aflz.a, this.e);
    }

    public final aorr a(afmg afmg) {
        return this.g.a(new afln(this, afmg), this.e);
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [java.util.List, java.lang.Iterable] */
    public final List a(Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        ? f2 = this.d.f(uri);
        int size = f2.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) f2.get(i);
            if (this.d.d(uri2)) {
                arrayList.addAll(a(uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    aucd o = afjf.f.o();
                    String replaceFirst = path.replaceFirst(str, "");
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    afjf afjf = (afjf) o.b;
                    replaceFirst.getClass();
                    afjf.a |= 1;
                    afjf.b = replaceFirst;
                    int e2 = (int) this.d.e(uri2);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    afjf afjf2 = (afjf) o.b;
                    afjf2.a |= 4;
                    afjf2.d = e2;
                    String uri3 = uri2.toString();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    afjf afjf3 = (afjf) o.b;
                    uri3.getClass();
                    afjf3.a |= 2;
                    afjf3.c = uri3;
                    arrayList.add((afjf) o.i());
                }
            }
        }
        return arrayList;
    }
}
