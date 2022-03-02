package defpackage;

import android.content.Context;
import java.io.IOException;

/* renamed from: kiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kiz extends kit {
    private static final ith h = new ith("ThumbnailDownloadTask", "");
    private final khx i;
    private final kkf j;
    private final knc k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kiz(kin kin, khq khq, String str, Context context, khw khw, khx khx, kkf kkf, kmp kmp, lht lht) {
        super(kin, khq, str, context, khw, lht);
        this.i = khx;
        this.j = kkf;
        this.k = kmp.a();
    }

    public final boolean a() {
        kin kin;
        kin kin2;
        int i2;
        kin kin3;
        this.d.a(1);
        int i3 = 5;
        try {
            kmp a = this.j.a(this.c, this.k);
            if (this.j.a(a, false) == null) {
                a((kie) null).a(new kif(this.j, a));
                kin = this.d;
                i3 = 2;
            } else {
                kin = this.d;
                i3 = 3;
            }
        } catch (kcs e) {
            h.a("ThumbnailDownloadTask", "File is no longer available or permission was denied: %s", this);
            kin = this.d;
        } catch (lhp e2) {
            if (!this.e.e()) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            kin2 = this.d;
        } catch (eif e3) {
            h.c("ThumbnailDownloadTask", String.format("Authentication error: %s", new Object[]{this}), e3);
            kin3 = this.d;
            i3 = 7;
        } catch (kio e4) {
            h.c("ThumbnailDownloadTask", String.format("Error starting a download: %s", new Object[]{this}), e4);
            i2 = kit.a(e4);
            kin2 = this.d;
        } catch (IOException e5) {
            h.c("ThumbnailDownloadTask", String.format("Error downloading: %s", new Object[]{this}), e5);
            kin3 = this.d;
        } catch (Throwable th) {
            this.d.a(5);
            throw th;
        }
        kin.a(i3);
        return true;
        kin3.a(i3);
        return false;
        kin2.a(i2);
        return false;
    }

    public final kie c() {
        return this.i.a();
    }

    public final long d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.k.equals(((kiz) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    public final String toString() {
        return String.format("ThumbnailDownloadTask[%s]", new Object[]{this.k});
    }
}
