package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: agzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzs {
    private final Map a;
    private final Map b;
    private final List c;

    public agzs(List list) {
        this(list, Collections.emptyList(), Collections.emptyList());
    }

    private final agzq a(Uri uri, agzk... agzkArr) {
        amzy i = i(uri);
        agzp agzp = new agzp();
        agzp.a = this;
        agzp.b = a(uri.getScheme());
        agzp.d = this.c;
        agzp.c = i;
        agzp.e = uri;
        if (!i.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = i.listIterator(i.size());
                while (listIterator.hasPrevious()) {
                    ((ahcs) listIterator.previous()).c();
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment((String) null).build();
            }
        }
        agzp.f = uri;
        agzp.g = Arrays.asList(agzkArr);
        return new agzq(agzp);
    }

    public static final Uri g(Uri uri) {
        return uri.buildUpon().fragment((String) null).build();
    }

    private final amzy i(Uri uri) {
        amzt j = amzy.j();
        amzt j2 = amzy.j();
        anhk i = ahbw.a(uri).listIterator();
        while (i.hasNext()) {
            j2.c(ahbw.a((String) i.next()));
        }
        anhk i2 = j2.a().listIterator();
        while (i2.hasNext()) {
            String str = (String) i2.next();
            ahcs ahcs = (ahcs) this.b.get(str);
            if (ahcs != null) {
                j.c(ahcs);
            } else {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(valueOf).length());
                sb.append("No such transform: ");
                sb.append(str);
                sb.append(": ");
                sb.append(valueOf);
                throw new ahbp(sb.toString());
            }
        }
        return j.a().g();
    }

    public final void b(Uri uri) {
        a(uri.getScheme()).f(g(uri));
    }

    public final boolean c(Uri uri) {
        agzq a2 = a(uri, new agzk[0]);
        return a2.b.a(a2.f);
    }

    public final boolean d(Uri uri) {
        return a(uri.getScheme()).g(g(uri));
    }

    public final long e(Uri uri) {
        agzq a2 = a(uri, new agzk[0]);
        return a2.b.i(a2.f);
    }

    public final Iterable f(Uri uri) {
        ahcn a2 = a(uri.getScheme());
        amzy i = i(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        for (Uri buildUpon : a2.j(g(uri))) {
            Uri build = buildUpon.buildUpon().encodedFragment(encodedFragment).build();
            if (!i.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(build.getPathSegments());
                if (!arrayList2.isEmpty() && !build.getPath().endsWith("/")) {
                    String str = (String) anbs.d(arrayList2);
                    int size = i.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((ahcs) i.get(i2)).b();
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    build = build.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(build);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List, java.lang.Iterable] */
    @Deprecated
    public final void h(Uri uri) {
        if (!c(uri)) {
            return;
        }
        if (!d(uri)) {
            a(uri);
            return;
        }
        ? f = f(uri);
        int size = f.size();
        for (int i = 0; i < size; i++) {
            h((Uri) f.get(i));
        }
        b(uri);
    }

    public agzs(List list, List list2, List list3) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ahcn ahcn = (ahcn) it.next();
            if (TextUtils.isEmpty(ahcn.a())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                ahcn ahcn2 = (ahcn) this.a.put(ahcn.a(), ahcn);
                if (ahcn2 != null) {
                    String canonicalName = ahcn2.getClass().getCanonicalName();
                    String canonicalName2 = ahcn.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb.append("Cannot override Backend ");
                    sb.append(canonicalName);
                    sb.append(" with ");
                    sb.append(canonicalName2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ahcs ahcs = (ahcs) it2.next();
            if (TextUtils.isEmpty(ahcs.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                ahcs ahcs2 = (ahcs) this.b.put(ahcs.a(), ahcs);
                if (ahcs2 != null) {
                    String canonicalName3 = ahcs2.getClass().getCanonicalName();
                    String canonicalName4 = ahcs.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length());
                    sb2.append("Cannot to override Transform ");
                    sb2.append(canonicalName3);
                    sb2.append(" with ");
                    sb2.append(canonicalName4);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        this.c.addAll(list3);
    }

    public final ahcn a(String str) {
        ahcn ahcn = (ahcn) this.a.get(str);
        if (ahcn != null) {
            return ahcn;
        }
        throw new ahbp(String.format("Cannot open, unregistered backend: %s", new Object[]{str}));
    }

    public final Object a(Uri uri, agzr agzr, agzk... agzkArr) {
        return agzr.a(a(uri, agzkArr));
    }

    public final void a(Uri uri) {
        agzq a2 = a(uri, new agzk[0]);
        a2.b.d(a2.f);
    }

    public final void a(Uri uri, Uri uri2) {
        agzq a2 = a(uri, new agzk[0]);
        agzq a3 = a(uri2, new agzk[0]);
        ahcn ahcn = a2.b;
        if (ahcn == a3.b) {
            ahcn.a(a2.f, a3.f);
            return;
        }
        throw new ahbp("Cannot rename file across backends");
    }
}
