package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.internal.ContentRating;
import com.google.android.gms.instantapps.internal.VisitedApplication;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: qiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qiz {
    public static final qfn a = new qfn("MetadataDatastore");
    public final qex b;
    public final qgy c;
    public final String d;
    public final Map e = new nz(1);
    private final Context f;
    private final aoru g;

    public qiz(Context context, qex qex, qgy qgy, String str, aoru aoru) {
        this.f = context;
        this.b = qex;
        this.d = String.valueOf(str).concat("/appIcons");
        this.c = qgy;
        this.g = aoru;
    }

    private static List a(List list, String str) {
        if (list.isEmpty() || (list.size() == 1 && ((String) list.get(0)).equals(str))) {
            return Collections.emptyList();
        }
        int indexOf = list.indexOf(str);
        if (indexOf == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(indexOf);
        return arrayList;
    }

    private final aorr p(String str) {
        synchronized (this.e) {
            aorr aorr = (aorr) this.e.get(str);
            if (aorr != null) {
                return aorr;
            }
            aorr b2 = this.g.b(new qiy(this, str));
            this.e.put(str, b2);
            return b2;
        }
    }

    public final qhb b(String str) {
        b();
        byte[] a2 = this.c.a(l(str));
        if (a2 == null) {
            return null;
        }
        return (qhb) aucj.a((aucj) qhb.j, a2, aubs.b());
    }

    public final String c(String str) {
        qio d2 = d(str);
        if (d2 != null) {
            return d2.a;
        }
        return null;
    }

    public final qio d(String str) {
        b();
        byte[] a2 = this.c.a(e(str));
        if (a2 == null) {
            return null;
        }
        return (qio) aucj.a((aucj) qio.e, a2, aubs.b());
    }

    public final byte[] e(String str) {
        return String.valueOf(str).concat("-as").getBytes(qfb.b);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File f(java.lang.String r8) {
        /*
            r7 = this;
            java.util.Map r0 = r7.e
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x004f }
            java.lang.String r2 = r7.d     // Catch:{ all -> 0x004f }
            r1.<init>(r2, r8)     // Catch:{ all -> 0x004f }
            boolean r2 = r1.isFile()     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x0032
            long r2 = r1.lastModified()     // Catch:{ all -> 0x004f }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x004f }
            axuy r5 = defpackage.axuy.a     // Catch:{ all -> 0x004f }
            axuz r5 = r5.a()     // Catch:{ all -> 0x004f }
            long r5 = r5.e()     // Catch:{ all -> 0x004f }
            long r4 = r4.toMillis(r5)     // Catch:{ all -> 0x004f }
            long r2 = r2 + r4
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004f }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0030
            r7.p(r8)     // Catch:{ all -> 0x004f }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return r1
        L_0x0032:
            aorr r8 = r7.p(r8)     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            java.lang.Object r8 = r8.get()     // Catch:{ InterruptedException -> 0x0045, ExecutionException -> 0x003e }
            java.io.File r8 = (java.io.File) r8     // Catch:{ InterruptedException -> 0x0045, ExecutionException -> 0x003e }
            return r8
        L_0x003e:
            r8 = move-exception
            qfn r0 = a
            r0.a(r8)
            goto L_0x004d
        L_0x0045:
            r8 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            r8.interrupt()
        L_0x004d:
            r8 = 0
            return r8
        L_0x004f:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qiz.f(java.lang.String):java.io.File");
    }

    public final Bitmap g(String str) {
        File f2 = f(str);
        if (f2 != null) {
            return BitmapFactory.decodeFile(f2.getAbsolutePath());
        }
        return null;
    }

    public final qik h(String str) {
        b();
        byte[] a2 = this.c.a(m(str));
        if (a2 == null) {
            return null;
        }
        return (qik) aucj.a((aucj) qik.m, a2, aubs.b());
    }

    public final boolean i(String str) {
        b();
        byte[] a2 = this.c.a(n(str));
        if (!(a2 == null || a2.length == 0)) {
            qil qil = (qil) aucj.a((aucj) qil.b, a2, aubs.b());
            if (qil.a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                qip qip = qil.a;
                if (qip == null) {
                    qip = qip.b;
                }
                if (currentTimeMillis < qip.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final byte[] j(String str) {
        return String.valueOf(str).concat("-perm").getBytes(qfb.b);
    }

    public final byte[] k(String str) {
        return String.valueOf(str).concat("-sigs").getBytes(qfb.b);
    }

    public final byte[] l(String str) {
        return String.valueOf(str).concat("-m").getBytes(qfb.b);
    }

    public final byte[] m(String str) {
        return String.valueOf(str).concat("-info").getBytes(qfb.b);
    }

    public final byte[] n(String str) {
        return String.valueOf(str).concat("-ao").getBytes(qfb.b);
    }

    public final void o(String str) {
        InputStream inputStream;
        try {
            qik h = h(str);
            if (h != null) {
                String str2 = h.f;
                if (!TextUtils.isEmpty(str2)) {
                    File file = new File(this.d);
                    if (file.exists() || file.mkdir()) {
                        Uri parse = Uri.parse(str2);
                        if (!"content".equals(parse.getScheme())) {
                            try {
                                Context context = this.f;
                                iva.b(!TextUtils.isEmpty(str2));
                                Resources resources = context.getResources();
                                int max = Math.max(resources.getDimensionPixelSize(17104902), resources.getDimensionPixelSize(17104901));
                                URL url = new URL(iqk.a("s" + max + "-v1-rw", str2).toString());
                                HttpURLConnection httpURLConnection = null;
                                try {
                                    izj.b(13824);
                                    qev a2 = this.b.a();
                                    httpURLConnection = new opl(this.f).a(url);
                                    try {
                                        if (httpURLConnection.getResponseCode() != 200) {
                                            a2.a("MetadataDatastore.appIconFetchFailed");
                                            a.c("Failed to fetch app icon (HTTP %d): %s", Integer.valueOf(httpURLConnection.getResponseCode()), url);
                                        } else {
                                            inputStream = httpURLConnection.getInputStream();
                                            a(inputStream, str, (Object) url);
                                            jjt.a((Closeable) inputStream);
                                            a2.a("MetadataDatastore.appIconFetchSuccess");
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        try {
                                            a.a(e, "Error fetching app icon %s", url);
                                            jlk.a(httpURLConnection);
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        jlk.a(httpURLConnection);
                                        throw th;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    a.a(e, "Error fetching app icon %s", url);
                                    jlk.a(httpURLConnection);
                                } catch (Throwable th3) {
                                    th = th3;
                                    jlk.a(httpURLConnection);
                                    throw th;
                                }
                                jlk.a(httpURLConnection);
                            } catch (MalformedURLException e4) {
                                a.b("Bad app icon URL: %s", str2);
                            }
                        } else {
                            try {
                                InputStream openInputStream = this.f.getContentResolver().openInputStream(parse);
                                try {
                                    a(openInputStream, str, (Object) str2);
                                } finally {
                                    jjt.a((Closeable) openInputStream);
                                }
                            } catch (FileNotFoundException e5) {
                                a.b("Error opening content URI %s", parse);
                            }
                        }
                    } else {
                        a.b("Unable to create icon dir: %s", this.d);
                    }
                }
            }
        } catch (IOException e6) {
            a.a(e6, "getAppLaunchInfo failed", new Object[0]);
        }
    }

    private final void a(InputStream inputStream, String str, Object obj) {
        File file = new File(this.d, String.valueOf(str).concat(".download"));
        try {
            try {
                Object[] objArr = {Long.valueOf(jjt.a(inputStream, new FileOutputStream(file), true)), obj};
                File file2 = new File(this.d, str);
                if ((!file2.exists() || file2.delete()) && !file.renameTo(file2)) {
                    a.b("Failed to rename %s to %s", file.getAbsolutePath(), file2.getAbsolutePath());
                }
            } catch (IOException e2) {
                a.a(e2, "Error fetching app icon %s", obj);
                file.delete();
            }
        } catch (FileNotFoundException e3) {
            a.a(e3, "Error writing app icon to %s", file.getAbsolutePath());
        }
    }

    public final void b() {
        if (!this.c.a()) {
            throw new IOException("Metadata DB not loaded.");
        }
    }

    public final VisitedApplication a(String str, qio qio, qik qik) {
        BitmapTeleporter bitmapTeleporter;
        ContentRating contentRating;
        Bitmap g2 = g(str);
        if (g2 != null) {
            BitmapTeleporter bitmapTeleporter2 = new BitmapTeleporter(g2);
            bitmapTeleporter2.a(this.f.getCacheDir());
            bitmapTeleporter = bitmapTeleporter2;
        } else {
            bitmapTeleporter = null;
        }
        HashSet hashSet = new HashSet();
        if (qik != null) {
            aucx aucx = qik.a;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                qiv qiv = (qiv) aucx.get(i);
                if (!qiv.c.isEmpty()) {
                    hashSet.add(qiv.c);
                }
            }
        }
        qir qir = qio.d;
        if (qir != null) {
            contentRating = new ContentRating(qir.a, qir.b);
        } else {
            contentRating = null;
        }
        return new VisitedApplication(bitmapTeleporter, qio.a, qio.b, qio.c, str, hashSet, contentRating);
    }

    public final String a(byte[] bArr) {
        String str = new String(bArr, qfb.b);
        if (str.endsWith("-ao")) {
            return str.substring(0, str.length() - 3);
        }
        return null;
    }

    public final qit a(String str) {
        b();
        byte[] a2 = this.c.a(j(str));
        if (a2 == null) {
            return null;
        }
        return (qit) aucj.a((aucj) qit.d, a2, aubs.b());
    }

    public final void a() {
        b();
        this.c.d();
    }

    public final synchronized void a(String str, String str2, int i) {
        aucd aucd;
        b();
        qit a2 = a(str);
        if (a2 == null) {
            aucd = qit.d.o();
        } else {
            aucd aucd2 = (aucd) a2.c(5);
            aucd2.a((aucj) a2);
            aucd = aucd2;
        }
        if (i == 0) {
            if (!Collections.unmodifiableList(((qit) aucd.b).a).contains(str2)) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                qit qit = (qit) aucd.b;
                str2.getClass();
                qit.a();
                qit.a.add(str2);
            }
            List a3 = a(Collections.unmodifiableList(((qit) aucd.b).b), str2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((qit) aucd.b).b = aucj.s();
            aucd.R(a3);
            List a4 = a(Collections.unmodifiableList(((qit) aucd.b).c), str2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((qit) aucd.b).c = aucj.s();
            aucd.S(a4);
        } else if (i != 1) {
            List a5 = a(Collections.unmodifiableList(((qit) aucd.b).a), str2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((qit) aucd.b).a = aucj.s();
            aucd.T(a5);
            if (!Collections.unmodifiableList(((qit) aucd.b).b).contains(str2)) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                qit qit2 = (qit) aucd.b;
                str2.getClass();
                qit2.b();
                qit2.b.add(str2);
            }
            List a6 = a(Collections.unmodifiableList(((qit) aucd.b).c), str2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((qit) aucd.b).c = aucj.s();
            aucd.S(a6);
        } else {
            List a7 = a(Collections.unmodifiableList(((qit) aucd.b).a), str2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((qit) aucd.b).a = aucj.s();
            aucd.T(a7);
            List a8 = a(Collections.unmodifiableList(((qit) aucd.b).b), str2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((qit) aucd.b).b = aucj.s();
            aucd.R(a8);
            if (!Collections.unmodifiableList(((qit) aucd.b).c).contains(str2)) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                qit qit3 = (qit) aucd.b;
                str2.getClass();
                qit3.c();
                qit3.c.add(str2);
            }
        }
        this.c.a(j(str), ((qit) aucd.i()).k());
    }

    public final void a(String str, qim qim) {
        b();
        byte[] bytes = String.valueOf(str).concat("-open-browser").getBytes(qfb.b);
        if (this.c.a(bytes) != null) {
            this.c.b(bytes);
        }
        byte[] n = n(str);
        iva.a((Object) qim);
        if (qim.a != null && qim.b != null) {
            if (!qim.c) {
                byte[] a2 = this.c.a(n);
                aucd o = qil.b.o();
                if (a2 != null && a2.length > 0) {
                    o.b(a2, aubs.b());
                }
                qin qin = qim.a;
                if (qin == null) {
                    qin = qin.b;
                }
                qil qil = qim.b;
                if (qil == null) {
                    qil = qil.b;
                }
                if (qin.a) {
                    qip qip = qil.a;
                    if (qip == null) {
                        qip = qip.b;
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    qip.getClass();
                    ((qil) o.b).a = qip;
                }
                this.c.a(n, ((qil) o.i()).k());
                return;
            }
            this.c.b(n);
        }
    }
}
