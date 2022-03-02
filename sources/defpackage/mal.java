package defpackage;

import android.content.Context;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: mal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mal {
    private static WeakReference e = null;
    public final maj a;
    public final mau b;
    public final mbi c;
    public final lyp d;

    public mal(maj maj, mau mau, mbi mbi, lyp lyp) {
        this.a = maj;
        this.b = mau;
        this.c = mbi;
        this.d = lyp;
    }

    public static synchronized mal a(Context context) {
        mbd mbd;
        synchronized (mal.class) {
            if (e != null) {
                if (e.get() != null) {
                    mal mal = (mal) e.get();
                    return mal;
                }
            }
            lyp a2 = lyp.a(context);
            if (axfc.a.a().b()) {
                mbd = new mbd();
            } else {
                mbd = new map(context);
            }
            maw maw = new maw(context);
            Context context2 = context;
            mbi mbi = new mbi(context2, new mbe(context), mbd, a2, new lzu());
            mal mal2 = new mal(new maj(context, maw), new mau(context), mbi, a2);
            e = new WeakReference(mal2);
            return mal2;
        }
    }

    public final mbj a(String str, String str2, max max, opp opp, DroidGuardResultsRequest droidGuardResultsRequest) {
        mas mas;
        mav mav = new mav(str2);
        try {
            mas = this.b.a(mav);
        } catch (mah e2) {
            this.d.a((Throwable) e2);
            mas = null;
        }
        if (mas == null) {
            mai a2 = this.a.a(str2);
            lyj lyj = ((lyd) a2.a.b).b;
            if (lyj == null) {
                lyj = lyj.d;
            }
            aucd aucd = (aucd) lyj.c(5);
            aucd.a((aucj) lyj);
            if (str != null) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                lyj lyj2 = (lyj) aucd.b;
                str.getClass();
                lyj2.a |= 2;
                lyj2.c = str;
            }
            aucd aucd2 = a2.a;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            lyd lyd = (lyd) aucd2.b;
            lyj lyj3 = (lyj) aucd.i();
            lyd lyd2 = lyd.p;
            lyj3.getClass();
            lyd.b = lyj3;
            lyd.a |= 1;
            a2.a(this.c);
            mar a3 = this.a.a(a2.a(), opp);
            a(a3);
            mas = a3.b;
            try {
                this.b.a(mav, mas);
            } catch (mah e3) {
                this.d.a((Throwable) e3);
            }
        }
        return this.c.a(str2, mas, max, droidGuardResultsRequest);
    }

    public final mbj a(String str, max max, DroidGuardResultsRequest droidGuardResultsRequest) {
        mas a2 = this.b.a(new mav("fast"));
        if (a2 != null) {
            return this.c.a(str, a2, max, droidGuardResultsRequest);
        }
        throw new mak();
    }

    public final void a(mar mar) {
        FileOutputStream fileOutputStream;
        byte[] bArr = mar.c;
        if (bArr != null) {
            mbi mbi = this.c;
            mbh mbh = mar.a;
            File a2 = mbe.a(mbi.b);
            try {
                fileOutputStream = new FileOutputStream(a2);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                mbi.c.a(mbh, mbg.a(a2));
                a2.delete();
                return;
            } catch (Exception e2) {
                try {
                    throw new mbk("VM couldn't be stored", e2);
                } catch (Throwable th) {
                    a2.delete();
                    throw th;
                }
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }
}
