package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

/* renamed from: afrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afrr implements afry {
    private final Context a;
    private final afqu b;
    private final agzs c;
    private final afmh d;
    private final afkn e;
    private final afmo f;
    private final afku g;
    private final afsb h;
    private final aflf i;
    private final int j;
    private final amri k;
    private final int l;

    public afrr(Context context, afqu afqu, agzs agzs, afmh afmh, afkn afkn, int i2, afmo afmo, afku afku, afsb afsb, aflf aflf, int i3, amri amri) {
        this.a = context;
        this.b = afqu;
        this.c = agzs;
        this.d = afmh;
        this.e = afkn;
        this.l = i2;
        this.f = afmo;
        this.g = afku;
        this.h = afsb;
        this.i = aflf;
        this.j = i3;
        this.k = amri;
    }

    public final void a() {
        afrs.a(afle.DOWNLOAD_FAILED, this.e, this.l, this.b);
    }

    public final void a(Uri uri) {
        int i2;
        Uri uri2 = uri;
        if (afru.a(this.c, uri2, this.g.d, 1)) {
            Uri a2 = afrt.a(uri);
            aucd o = aflh.g.o();
            afkk afkk = this.g.f;
            if (afkk == null) {
                afkk = afkk.b;
            }
            String str = afkk.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aflh aflh = (aflh) o.b;
            str.getClass();
            int i3 = aflh.a | 4;
            aflh.a = i3;
            aflh.d = str;
            aflh.e = this.l - 1;
            aflh.a = i3 | 8;
            afli a3 = this.b.a((aflh) o.i());
            Uri uri3 = null;
            if (a3 != null) {
                afle a4 = afle.a(a3.c);
                if (a4 == null) {
                    a4 = afle.NONE;
                }
                if (a4 == afle.DOWNLOAD_COMPLETE) {
                    uri3 = afsp.a(this.a, this.l, a3.b, this.d, this.k);
                }
            }
            if (uri3 != null) {
                try {
                    if (this.c.c(a2)) {
                        this.c.a(a2);
                    }
                    this.f.a();
                    this.c.a(uri2);
                    aucd o2 = aojg.g.o();
                    String str2 = this.i.b;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aojg aojg = (aojg) o2.b;
                    str2.getClass();
                    int i4 = aojg.a | 1;
                    aojg.a = i4;
                    aojg.b = str2;
                    int i5 = this.j;
                    int i6 = 2 | i4;
                    aojg.a = i6;
                    aojg.c = i5;
                    String str3 = this.i.c;
                    str3.getClass();
                    aojg.a = i6 | 4;
                    aojg.d = str3;
                    aojg aojg2 = (aojg) o2.i();
                    afsb afsb = this.h;
                    afkn afkn = this.e;
                    long j2 = (long) afkn.d;
                    long j3 = (long) this.g.c;
                    String str4 = afkn.b;
                    int i7 = 0;
                    while (true) {
                        if (i7 < this.e.k.size()) {
                            if (ampw.a(((afku) this.e.k.get(i7)).d, this.g.d)) {
                                i2 = i7 + 1;
                                break;
                            }
                            i7++;
                        } else {
                            i2 = 0;
                            break;
                        }
                    }
                    afsb.a(aojg2, 4, j2, j3, str4, i2);
                    if (afru.a(this.c, a2, this.e.f, 1)) {
                        afrs.a(afle.DOWNLOAD_COMPLETE, this.e, this.l, this.b);
                        return;
                    }
                    afsh.a("%s: Final file checksum verification failed. %s.", (Object) "DeltaFileDownloaderCallbackImpl", (Object) a2);
                    afkd a5 = afkf.a();
                    a5.a = afke.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                    throw a5.a();
                } catch (IOException e2) {
                    afsh.a((Throwable) e2, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", this.g.b, this.e.f);
                    this.d.a("Failed to decode delta file.", e2);
                    afkd a6 = afkf.a();
                    a6.a = afke.DELTA_DOWNLOAD_DECODE_IO_ERROR;
                    a6.c = e2;
                    throw a6.a();
                }
            } else {
                afkd a7 = afkf.a();
                a7.a = afke.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
                throw a7.a();
            }
        } else {
            afsh.b("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri2, this.g.d);
            afkd a8 = afkf.a();
            a8.a = afke.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            throw a8.a();
        }
    }
}
