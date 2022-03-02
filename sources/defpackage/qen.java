package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: qen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qen implements qei {
    public static final qfn a = new qfn("RouterBackendClient");
    public final Context b;
    public final qex c;
    public final qfa d;
    public final qeo e;
    public final ClientContext f;
    public final qed g;
    private final aoru h;
    private final qfk i;
    private final izd j;

    public qen(Context context, qex qex, qfa qfa, izd izd, qeo qeo, qed qed, aoru aoru, qfk qfk) {
        this.b = context;
        this.c = qex;
        this.d = qfa;
        this.j = izd;
        this.e = qeo;
        this.h = aoru;
        this.g = qed;
        this.i = qfk;
        ClientContext clientContext = new ClientContext();
        this.f = clientContext;
        clientContext.f = "com.google.android.gms";
    }

    public final aorr a(Account account, Collection collection) {
        qes qes = new qes(new qek(this, collection, account));
        qes.a(this.h);
        return qes;
    }

    public final boolean b() {
        return qfe.a() == 0 || this.i.a();
    }

    public final void c() {
        if (axuj.a.a().a()) {
            aucd o = aral.b.o();
            String a2 = axvk.a.a().a();
            if (!amrk.a(a2)) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aral aral = (aral) o.b;
                a2.getClass();
                if (!aral.a.a()) {
                    aral.a = aucj.a(aral.a);
                }
                aral.a.add(a2);
            }
            izd izd = this.j;
            if (izd.a != null) {
                synchronized (izd) {
                    izd.a.d(baab.a("x-goog-ext-181495481-bin", baaf.e));
                }
            }
            izd izd2 = this.j;
            byte[] k = ((aral) o.i()).k();
            if (izd2.a == null) {
                synchronized (izd2) {
                    if (izd2.a == null) {
                        izd2.a = new baaf();
                    }
                }
            }
            synchronized (izd2) {
                izd2.a.a(baab.a("x-goog-ext-181495481-bin", baaf.e), (Object) k);
            }
        }
    }

    public final aorr a(avwo avwo, Account account) {
        qes qes = new qes(new qem(this, avwo, account));
        qes.a(this.h);
        return qes;
    }

    public final aorr a(String str, int i2, int i3, List list) {
        qes qes = new qes(new qel(this, list, str, i2, i3));
        qes.a(this.h);
        return qes;
    }

    public final aorr a(byte[] bArr, Account account, avwm avwm, Collection collection) {
        qes qes = new qes(new qej(this, bArr, avwm, collection, account));
        qes.a(this.h);
        return qes;
    }

    public final arbd a(qez qez, List list) {
        aucd o = arbd.k.o();
        Integer num = qez.c;
        if (!(num == null || qez.d == null)) {
            int intValue = num.intValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((arbd) o.b).b = intValue;
            int intValue2 = qez.d.intValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((arbd) o.b).c = intValue2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        arbd arbd = (arbd) o.b;
        if (!arbd.e.a()) {
            arbd.e = aucj.a(arbd.e);
        }
        auab.a((Iterable) list, (List) arbd.e);
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arbd) o.b).f = true;
        boolean a2 = axus.a.a().a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arbd) o.b).d = a2;
        if (!axuy.a.a().c() || Build.VERSION.SDK_INT < 23 || Build.VERSION.PREVIEW_SDK_INT <= 0) {
            int i2 = Build.VERSION.SDK_INT;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((arbd) o.b).a = i2;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((arbd) o.b).a = 10000;
        }
        long a3 = jhg.a(this.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((arbd) o.b).g = a3;
        String[] strArr = qez.b;
        if (strArr != null) {
            List asList = Arrays.asList(strArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            arbd arbd2 = (arbd) o.b;
            if (!arbd2.i.a()) {
                arbd2.i = aucj.a(arbd2.i);
            }
            auab.a((Iterable) asList, (List) arbd2.i);
        }
        String str = Build.MODEL;
        if (o.c) {
            o.c();
            o.c = false;
        }
        str.getClass();
        ((arbd) o.b).j = str;
        String string = Settings.Secure.getString(this.b.getContentResolver(), "android_id");
        if (string != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            string.getClass();
            ((arbd) o.b).h = string;
        }
        return (arbd) o.i();
    }

    public final boolean a() {
        if (axuy.a.a().z()) {
            return false;
        }
        if (axuy.a.a().y() || qfe.a() == 0 || qfk.a(this.i.a, "usesIntentExtrasForPrelaunchCheck")) {
            return true;
        }
        return false;
    }
}
