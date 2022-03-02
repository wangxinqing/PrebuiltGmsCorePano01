package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.List;

/* renamed from: yxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class yxw extends LinearLayout {
    protected final boolean a;
    protected zea b;
    protected yxv c;

    public yxw(Context context, boolean z) {
        super(context);
        this.a = z;
        LayoutInflater.from(context).inflate(a(), this, true);
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    public final String a(int i) {
        return getResources().getString(i);
    }

    public abstract boolean b();

    public abstract zea c();

    /* access modifiers changed from: protected */
    public final boolean d() {
        return this.b.k() && this.b.j();
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        return this.b.e() && this.b.d();
    }

    /* access modifiers changed from: protected */
    public FavaDiagnosticsEntity g() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final zdq h() {
        zdq zdq = new zdq();
        zdq.a = this.b.f();
        zdq.d.add(4);
        zdq.b = this.b.n();
        zdq.d.add(9);
        zdq.c = this.b.q();
        zdq.d.add(11);
        return zdq;
    }

    /* access modifiers changed from: protected */
    public final CharSequence i() {
        if (!this.b.g() || !this.b.i() || !this.b.h().d()) {
            return null;
        }
        return yze.a(this.c, this.b.h().c(), this.b.f(), this.b.h().b(), (List) null, (List) null);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    public final String toString() {
        Object obj;
        Object obj2;
        Object[] objArr = new Object[4];
        objArr[0] = getClass().getSimpleName();
        zea zea = this.b;
        Object obj3 = "";
        if (zea != null) {
            obj = zea.f();
        } else {
            obj = obj3;
        }
        objArr[1] = obj;
        zea zea2 = this.b;
        if (zea2 != null) {
            obj2 = zea2.n();
        } else {
            obj2 = obj3;
        }
        objArr[2] = obj2;
        zea zea3 = this.b;
        if (zea3 != null) {
            obj3 = Boolean.valueOf(zea3.d());
        }
        objArr[3] = obj3;
        return String.format("%s<id=\"%s\" type=\"%s\" hidden=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    public void a(zea zea, yxv yxv) {
        irk.b(zea);
        irk.b(yxv);
        this.b = zea;
        this.c = yxv;
    }

    /* access modifiers changed from: protected */
    public final boolean f() {
        return !d() || e();
    }
}
