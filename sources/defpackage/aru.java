package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: aru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aru extends arn {
    int o;
    boolean p;
    private ArrayList q;
    private boolean r;
    private int s;

    public aru() {
        this.q = new ArrayList();
        this.r = true;
        this.p = false;
        this.s = 0;
    }

    private final void b(arn arn) {
        this.q.add(arn);
        arn.h = this;
    }

    public final arn a(int i) {
        if (i < 0 || i >= this.q.size()) {
            return null;
        }
        return (arn) this.q.get(i);
    }

    public final void b(int i) {
        this.r = i == 0;
    }

    public final /* bridge */ /* synthetic */ void b(long j) {
        this.a = j;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (!this.q.isEmpty()) {
            art art = new art(this);
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((arn) arrayList.get(i)).a((arm) art);
            }
            this.o = this.q.size();
            if (this.r) {
                ArrayList arrayList2 = this.q;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((arn) arrayList2.get(i2)).c();
                }
                return;
            }
            for (int i3 = 1; i3 < this.q.size(); i3++) {
                ((arn) this.q.get(i3 - 1)).a((arm) new ars((arn) this.q.get(i3)));
            }
            arn arn = (arn) this.q.get(0);
            if (arn != null) {
                arn.c();
                return;
            }
            return;
        }
        d();
        e();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    public final /* bridge */ /* synthetic */ void d(View view) {
        for (int i = 0; i < this.q.size(); i++) {
            ((arn) this.q.get(i)).d(view);
        }
        super.d(view);
    }

    public final /* bridge */ /* synthetic */ void e(View view) {
        for (int i = 0; i < this.q.size(); i++) {
            ((arn) this.q.get(i)).e(view);
        }
        super.e(view);
    }

    /* access modifiers changed from: protected */
    public final void f() {
        super.f();
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((arn) this.q.get(i)).f();
        }
    }

    public final arn g() {
        aru aru = (aru) super.clone();
        aru.q = new ArrayList();
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            aru.b(((arn) this.q.get(i)).clone());
        }
        return aru;
    }

    public final void h() {
        this.s |= 2;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((arn) this.q.get(i)).h();
        }
    }

    public final int i() {
        return this.q.size();
    }

    public aru(byte[] bArr) {
        this();
        b(1);
        a((arn) new aqz(2));
        a((arn) new aqw());
        a((arn) new aqz(1));
    }

    public final String a(String str) {
        String a = super.a(str);
        for (int i = 0; i < this.q.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            sb.append(((arn) this.q.get(i)).a(str + "  "));
            a = sb.toString();
        }
        return a;
    }

    /* renamed from: b */
    public final void a(TimeInterpolator timeInterpolator) {
        this.s |= 1;
        ArrayList arrayList = this.q;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((arn) this.q.get(i)).a(timeInterpolator);
            }
        }
        this.c = timeInterpolator;
    }

    /* access modifiers changed from: protected */
    public final void a(ViewGroup viewGroup, arx arx, arx arx2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.a;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            arn arn = (arn) this.q.get(i);
            if (j > 0 && (this.r || i == 0)) {
                long j2 = arn.a;
                if (j2 <= 0) {
                    arn.b(j);
                } else {
                    arn.b(j2 + j);
                }
            }
            arn.a(viewGroup, arx, arx2, arrayList, arrayList2);
        }
    }

    public final void b(View view) {
        super.b(view);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((arn) this.q.get(i)).b(view);
        }
    }

    public final void b(arw arw) {
        if (a(arw.b)) {
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arn arn = (arn) arrayList.get(i);
                if (arn.a(arw.b)) {
                    arn.b(arw);
                    arw.c.add(arn);
                }
            }
        }
    }

    /* renamed from: c */
    public final void a(long j) {
        ArrayList arrayList;
        this.b = j;
        if (this.b >= 0 && (arrayList = this.q) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((arn) this.q.get(i)).a(j);
            }
        }
    }

    public final void a(arg arg) {
        super.a(arg);
        this.s |= 4;
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                ((arn) this.q.get(i)).a(arg);
            }
        }
    }

    public final void c(View view) {
        super.c(view);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((arn) this.q.get(i)).c(view);
        }
    }

    public final void a(arl arl) {
        this.m = arl;
        this.s |= 8;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((arn) this.q.get(i)).a(arl);
        }
    }

    public final void c(arw arw) {
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((arn) this.q.get(i)).c(arw);
        }
    }

    public final void a(arn arn) {
        b(arn);
        long j = this.b;
        if (j >= 0) {
            arn.a(j);
        }
        if ((this.s & 1) != 0) {
            arn.a(this.c);
        }
        if ((this.s & 2) != 0) {
            arn.h();
        }
        if ((this.s & 4) != 0) {
            arn.a(this.n);
        }
        if ((this.s & 8) != 0) {
            arn.a(this.m);
        }
    }

    public final void a(arw arw) {
        if (a(arw.b)) {
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arn arn = (arn) arrayList.get(i);
                if (arn.a(arw.b)) {
                    arn.a(arw);
                    arw.c.add(arn);
                }
            }
        }
    }
}
