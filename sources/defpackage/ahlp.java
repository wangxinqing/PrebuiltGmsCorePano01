package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: ahlp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahlp extends ahlr {
    public int a = 0;
    public int b = 0;
    public boolean c;
    final /* synthetic */ ahlw d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahlp(ahlw ahlw, boolean z) {
        super(ahlw);
        this.d = ahlw;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.d.c.a(0, false);
        ahix ahix = this.d.c;
        ArrayList arrayList = new ArrayList(ahix.D);
        arrayList.add(this);
        ahix.D = arrayList;
        ahlw ahlw = this.d;
        aizy aizy = ahlw.a;
        ahlw.a(SystemClock.elapsedRealtime() + 90000);
    }

    public final String b() {
        return "MaybeLeavingVehicleState";
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.c = true;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        ahlw ahlw = this.d;
        ahlw.a((ahlr) new ahlo(ahlw));
    }

    /* access modifiers changed from: protected */
    public final void a(ahlr ahlr) {
        super.a(ahlr);
        this.d.c.c(0);
        ahix ahix = this.d.c;
        ArrayList arrayList = new ArrayList(ahix.D);
        arrayList.remove(this);
        ahix.D = arrayList;
    }
}
