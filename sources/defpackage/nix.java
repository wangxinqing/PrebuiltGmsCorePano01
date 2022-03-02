package defpackage;

import android.content.Context;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: nix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nix implements LifecycleSynchronizer.Callback {
    public static final List a;
    public static final List b;
    public static final aoru c;
    public Context d;
    public LifecycleSynchronizer e;
    public List f;
    public List g;
    private ExecutorService h;
    private boolean i;
    private nkn j;

    @Deprecated
    private nix() {
        this.f = amzy.h();
        this.g = amzy.h();
        this.i = false;
    }

    @Deprecated
    public static nix a() {
        return new nix();
    }

    public final void onServiceDestroy() {
        List list = this.f;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((qbq) list.get(i2)).a();
        }
        for (njb a2 : this.g) {
            a2.a();
        }
        if (!this.i || !axbb.a.a().a()) {
            List list2 = a;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((qbq) list2.get(i3)).a();
            }
            List list3 = b;
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((njb) list3.get(i4)).a();
            }
        }
    }

    static {
        amzy h2 = amzy.h();
        amzy h3 = amzy.h();
        aoru a2 = jfb.a(4, 10);
        a = h2;
        b = h3;
        c = a2;
    }

    public static nix a(Context context, LifecycleSynchronizer lifecycleSynchronizer, ExecutorService executorService) {
        return new nix(context, lifecycleSynchronizer, executorService);
    }

    public nix(Context context, LifecycleSynchronizer lifecycleSynchronizer, ExecutorService executorService) {
        this.f = amzy.h();
        this.g = amzy.h();
        boolean z = false;
        this.i = false;
        this.d = context;
        this.e = lifecycleSynchronizer;
        this.h = executorService;
        lifecycleSynchronizer.registerCallback(this);
        int i2 = 1;
        if (context instanceof nio) {
            this.i = ((nio) context).i[0] == 40 ? true : z;
            i2 = 2;
        }
        this.j = new nkn(context, context.getClass(), i2);
    }

    @Deprecated
    public final void a(nio nio, nis nis) {
        this.d = nio;
        this.e = nio.e;
        this.h = nio.f;
        this.e.registerCallback(this);
        List list = nio.c;
        if (list != null) {
            this.f = list;
        }
        List list2 = nio.d;
        if (list2 != null) {
            this.g = list2;
        }
        this.j = new nkn(nio, nio.getClass(), 2);
        a(nis);
    }

    public final void a(nis nis) {
        ExecutorService j2 = nis.j();
        if (j2 == null) {
            j2 = this.h;
        }
        amsv amsv = niu.a;
        nkn nkn = this.j;
        int i2 = nis.n;
        String str = nis.m;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i2);
        sb.append("-");
        sb.append(str);
        amky a2 = nkn.a(sb.toString(), amsv);
        try {
            j2.execute(amll.a((Runnable) new niw(this, nis)));
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
