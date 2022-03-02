package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.config.FeatureRequestExtras;
import com.google.android.gms.auth.uiflows.controller.Controller;
import java.util.UUID;

/* renamed from: gnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class gnx extends gmz {
    private static final fzk a = fzk.a("ControlledActivity.controller");
    private static final fzk b = fzk.a("ControlledActivity.id");
    private static final fzk c = fzk.a("ControlledActivity.indirection_key");
    public static final fzk n = fzk.a("ControlledActivity.session_id");
    public static final fzk o = fzk.a("ControlledActivity.session_index");
    private Controller d;
    private int e;

    public static Intent a(Intent intent, Controller controller, int i) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        fzl fzl = new fzl();
        fzl.b(a, controller);
        fzl.b(b, Integer.valueOf(i));
        Bundle bundle = fzl.a;
        bundle.putAll(extras);
        fzl fzl2 = new fzl();
        fzl2.b(c, bundle);
        return intent.addFlags(33554432).putExtras(fzl2.a);
    }

    private final long c() {
        return ((anoi) this.l.b.b).d;
    }

    public static boolean k() {
        return hda.a >= 107;
    }

    /* access modifiers changed from: protected */
    public final void h() {
        super.h();
        if (this.d != null) {
            anou anou = i().l;
            if (anou == null) {
                anou = anou.k;
            }
            aucd aucd = (aucd) anou.c(5);
            aucd.a((aucj) anou);
            anuw anuw = ((anou) aucd.b).h;
            if (anuw == null) {
                anuw = anuw.f;
            }
            aucd aucd2 = (aucd) anuw.c(5);
            aucd2.a((aucj) anuw);
            long c2 = c();
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            anuw anuw2 = (anuw) aucd2.b;
            anuw2.a |= 16;
            anuw2.e = c2;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anou anou2 = (anou) aucd.b;
            anuw anuw3 = (anuw) aucd2.i();
            anuw3.getClass();
            anou2.h = anuw3;
            anou2.a |= 64;
            aucd j = j();
            anou anou3 = (anou) aucd.i();
            if (j.c) {
                j.c();
                j.c = false;
            }
            anon anon = (anon) j.b;
            anon anon2 = anon.v;
            anou3.getClass();
            anon.l = anou3;
            anon.a |= 32768;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = (Controller) f().a(a);
        this.e = ((Integer) f().a(b, 0)).intValue();
        if (this.d != null) {
            if (!f().b(n)) {
                f().b(n, UUID.randomUUID().toString());
            }
            if (!f().b(o)) {
                f().b(o, 0);
            }
            aucd o2 = anou.k.o();
            aucd o3 = anuw.f.o();
            if ((i().a & 32768) != 0) {
                anou anou = i().l;
                if (anou == null) {
                    anou = anou.k;
                }
                aucd aucd = (aucd) anou.c(5);
                aucd.a((aucj) anou);
                if ((anou.a & 64) != 0) {
                    anuw anuw = anou.h;
                    if (anuw == null) {
                        anuw = anuw.f;
                    }
                    o3 = (aucd) anuw.c(5);
                    o3.a((aucj) anuw);
                    o2 = aucd;
                } else {
                    o2 = aucd;
                }
            }
            int intValue = ((Integer) f().a(o, 0)).intValue();
            String b2 = this.d.b();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anou anou2 = (anou) o2.b;
            b2.getClass();
            anou2.a |= 4;
            anou2.d = b2;
            String str = (String) f().a(n);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anou anou3 = (anou) o2.b;
            str.getClass();
            int i = anou3.a | 1;
            anou3.a = i;
            anou3.b = str;
            int i2 = i | 2;
            anou3.a = i2;
            anou3.c = intValue;
            int i3 = this.e;
            anou3.a = i2 | 8;
            anou3.e = i3;
            String b3 = this.d.b();
            int i4 = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(b3).length() + 11);
            sb.append(b3);
            sb.append(i4);
            String sb2 = sb.toString();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            anuw anuw2 = (anuw) o3.b;
            sb2.getClass();
            anuw2.a |= 4;
            anuw2.c = sb2;
            long c2 = c();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            anuw anuw3 = (anuw) o3.b;
            int i5 = anuw3.a | 16;
            anuw3.a = i5;
            anuw3.e = c2;
            anuw3.a = i5 | 2;
            anuw3.b = (long) intValue;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anou anou4 = (anou) o2.b;
            anuw anuw4 = (anuw) o3.i();
            anuw4.getClass();
            anou4.h = anuw4;
            anou4.a |= 64;
            aucd j = j();
            anou anou5 = (anou) o2.i();
            if (j.c) {
                j.c();
                j.c = false;
            }
            anon anon = (anon) j.b;
            anon anon2 = anon.v;
            anou5.getClass();
            anon.l = anou5;
            anon.a |= 32768;
        }
    }

    public static void a(Activity activity, Controller controller, gnw gnw) {
        int i;
        if (gnw.a()) {
            alht.a(activity.getIntent(), gnw.b);
            activity.startActivity(a(gnw.b, controller, gnw.a));
        } else {
            activity.setResult(gnw.c, gnw.d);
        }
        activity.finish();
        int i2 = gnw.e;
        if (i2 != -1 && (i = gnw.f) != -1) {
            activity.overridePendingTransition(i2, i);
        }
    }

    public void a(int i, Intent intent) {
        int i2;
        FeatureRequestExtras.ResultReader fromIntent;
        if (this.d != null) {
            if (!k() || (fromIntent = FeatureRequestExtras.ResultReader.fromIntent(intent)) == null || i != 0) {
                i2 = i;
            } else {
                i2 = fromIntent.getDownloadResultCode();
            }
            this.l.a(i2);
            gnw a2 = this.d.a(new gny(this.e, i, intent));
            if (a2.a()) {
                Intent intent2 = a2.b;
                fzl fzl = new fzl();
                fzl.b(n, (String) f().a(n));
                fzl.b(o, Integer.valueOf(((Integer) f().a(o, 0)).intValue() + 1));
                intent2.putExtras(fzl.a);
            }
            a((Activity) this, this.d, a2);
            anou anou = i().l;
            if (anou == null) {
                anou = anou.k;
            }
            aucd aucd = (aucd) anou.c(5);
            aucd.a((aucj) anou);
            if (a2.a()) {
                int i3 = a2.a;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                anou anou2 = (anou) aucd.b;
                anou2.a |= 16;
                anou2.f = i3;
                anuw anuw = anou2.h;
                if (anuw == null) {
                    anuw = anuw.f;
                }
                aucd aucd2 = (aucd) anuw.c(5);
                aucd2.a((aucj) anuw);
                String b2 = this.d.b();
                StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 11);
                sb.append(b2);
                sb.append(i3);
                String sb2 = sb.toString();
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                anuw anuw2 = (anuw) aucd2.b;
                sb2.getClass();
                anuw2.a |= 8;
                anuw2.d = sb2;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                anou anou3 = (anou) aucd.b;
                anuw anuw3 = (anuw) aucd2.i();
                anuw3.getClass();
                anou3.h = anuw3;
                anou3.a |= 64;
            } else {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                anou anou4 = (anou) aucd.b;
                int i4 = anou4.a | 128;
                anou4.a = i4;
                anou4.i = true;
                int i5 = a2.c;
                anou4.a = i4 | 32;
                anou4.g = i5;
            }
            aucd j = j();
            anou anou5 = (anou) aucd.i();
            if (j.c) {
                j.c();
                j.c = false;
            }
            anon anon = (anon) j.b;
            anon anon2 = anon.v;
            anou5.getClass();
            anon.l = anou5;
            anon.a |= 32768;
            return;
        }
        super.a(i, intent);
    }
}
