package defpackage;

import java.util.HashSet;
import java.util.Map;

/* renamed from: alxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alxh {
    public final alsg a;
    public final StringBuilder b = new StringBuilder();
    public final alzd c = new alzd(this.b);
    private final HashSet d = new HashSet();

    public alxh(alsg alsg) {
        this.a = alsg;
    }

    private final void a(amjf amjf) {
        amii amii = amii.SHIFT_AFTER_DELETE;
        amje amje = amje.KIND_NOT_SET;
        int ordinal = amjf.b.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                a((alsk) ((alul) this.a).a(amjf.b()));
                return;
            }
            throw new alrv("Unknown value type.", amjf.getClass().getCanonicalName());
        } else if (amjf.a().b == amib.NULL_VALUE) {
            this.c.e();
        } else {
            this.c.c();
            this.c.a("json");
            alsc.a(amjf.a(), this.c);
            this.c.d();
        }
    }

    public final void a(alsk alsk) {
        if (alsk != null) {
            String d2 = alsk.d();
            if (this.d.contains(d2)) {
                String d3 = alsk.d();
                this.c.c();
                this.c.a("ref");
                this.c.b(d3);
                this.c.d();
                return;
            }
            this.d.add(d2);
            this.c.c();
            this.c.a("id");
            this.c.b(alsk.d());
            this.c.a("type");
            this.c.b(alsk.f());
            this.c.a("value");
            if (alsk instanceof alsl) {
                this.c.b(((alsl) alsk).toString());
            } else if (alsk instanceof alsj) {
                this.c.c();
                for (Map.Entry entry : ((alsj) alsk).c()) {
                    this.c.a((String) entry.getKey());
                    a((amjf) entry.getValue());
                }
                this.c.d();
            } else if (alsk instanceof alsi) {
                this.c.a();
                for (amjf a2 : ((alsi) alsk).b()) {
                    a(a2);
                }
                this.c.b();
            } else if (alsk instanceof alsp) {
                alsp alsp = (alsp) alsk;
                amii n = alsp.n();
                amii amii = amii.SHIFT_AFTER_DELETE;
                amje amje = amje.KIND_NOT_SET;
                int ordinal = n.ordinal();
                String str = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? "unknown" : "shift_to_invalid" : "shift_before_delete" : "shift_after_delete";
                this.c.c();
                this.c.a("objectId");
                this.c.b(alsp.a());
                this.c.a("index");
                this.c.a(alsp.b());
                this.c.a("canBeDeleted");
                this.c.a(alsp.c());
                this.c.a("deleteMode");
                this.c.b(str);
                this.c.d();
            } else {
                String valueOf = String.valueOf(alsk);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unknown object type: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            this.c.d();
            return;
        }
        this.c.e();
    }
}
