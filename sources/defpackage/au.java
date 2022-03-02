package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: au  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class au extends aw {
    private final n a = new n();

    /* access modifiers changed from: protected */
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((at) ((Map.Entry) it.next()).getValue()).a();
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((at) ((Map.Entry) it.next()).getValue()).b();
        }
    }

    public final void a(as asVar) {
        at atVar = (at) this.a.b(asVar);
        if (atVar != null) {
            atVar.b();
        }
    }

    public final void a(as asVar, ax axVar) {
        at atVar = new at(asVar, axVar);
        at atVar2 = (at) this.a.a(asVar, atVar);
        if (atVar2 != null && atVar2.b != axVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (atVar2 == null && d()) {
            atVar.a();
        }
    }
}
